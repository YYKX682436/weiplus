package androidx.camera.camera2.internal.concurrent;

/* loaded from: classes14.dex */
public class Camera2CameraCoordinator implements androidx.camera.core.concurrent.CameraCoordinator {
    private static final java.lang.String TAG = "Camera2CameraCoordinator";
    private final androidx.camera.camera2.internal.compat.CameraManagerCompat mCameraManager;
    private int mCameraOperatingMode = 0;
    private final java.util.Map<java.lang.String, java.util.List<java.lang.String>> mConcurrentCameraIdMap = new java.util.HashMap();
    private java.util.Set<java.util.Set<java.lang.String>> mConcurrentCameraIds = new java.util.HashSet();
    private final java.util.List<androidx.camera.core.concurrent.CameraCoordinator.ConcurrentCameraModeListener> mConcurrentCameraModeListeners = new java.util.ArrayList();
    private java.util.List<androidx.camera.core.CameraInfo> mActiveConcurrentCameraInfos = new java.util.ArrayList();

    public Camera2CameraCoordinator(androidx.camera.camera2.internal.compat.CameraManagerCompat cameraManagerCompat) {
        this.mCameraManager = cameraManagerCompat;
        retrieveConcurrentCameraIds();
    }

    private static androidx.camera.core.CameraSelector createCameraSelectorById(androidx.camera.camera2.internal.compat.CameraManagerCompat cameraManagerCompat, final java.lang.String str) {
        androidx.camera.core.CameraSelector.Builder addCameraFilter = new androidx.camera.core.CameraSelector.Builder().addCameraFilter(new androidx.camera.core.CameraFilter() { // from class: u.a$$a
            @Override // androidx.camera.core.CameraFilter
            public final java.util.List filter(java.util.List list) {
                java.util.List lambda$createCameraSelectorById$0;
                lambda$createCameraSelectorById$0 = androidx.camera.camera2.internal.concurrent.Camera2CameraCoordinator.lambda$createCameraSelectorById$0(str, list);
                return lambda$createCameraSelectorById$0;
            }
        });
        try {
            addCameraFilter.requireLensFacing(((java.lang.Integer) cameraManagerCompat.getCameraCharacteristicsCompat(str).get(android.hardware.camera2.CameraCharacteristics.LENS_FACING)).intValue());
            return addCameraFilter.build();
        } catch (androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.util.List lambda$createCameraSelectorById$0(java.lang.String str, java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            androidx.camera.core.CameraInfo cameraInfo = (androidx.camera.core.CameraInfo) it.next();
            if (str.equals(androidx.camera.camera2.interop.Camera2CameraInfo.from(cameraInfo).getCameraId())) {
                return java.util.Collections.singletonList(cameraInfo);
            }
        }
        throw new java.lang.IllegalArgumentException("No camera can be find for id: " + str);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0071 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0017 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void retrieveConcurrentCameraIds() {
        /*
            r10 = this;
            java.lang.String r0 = "Camera2CameraCoordinator"
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            androidx.camera.camera2.internal.compat.CameraManagerCompat r2 = r10.mCameraManager     // Catch: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> Le
            java.util.Set r1 = r2.getConcurrentCameraIds()     // Catch: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat -> Le
            goto L13
        Le:
            java.lang.String r2 = "Failed to get concurrent camera ids"
            androidx.camera.core.Logger.e(r0, r2)
        L13:
            java.util.Iterator r1 = r1.iterator()
        L17:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lcb
            java.lang.Object r2 = r1.next()
            java.util.Set r2 = (java.util.Set) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r2)
            int r2 = r3.size()
            r4 = 2
            if (r2 < r4) goto L17
            r2 = 0
            java.lang.Object r4 = r3.get(r2)
            java.lang.String r4 = (java.lang.String) r4
            r5 = 1
            java.lang.Object r6 = r3.get(r5)
            java.lang.String r6 = (java.lang.String) r6
            androidx.camera.camera2.internal.compat.CameraManagerCompat r7 = r10.mCameraManager     // Catch: androidx.camera.core.InitializationException -> L4f
            boolean r7 = androidx.camera.camera2.internal.CameraIdUtil.isBackwardCompatible(r7, r4)     // Catch: androidx.camera.core.InitializationException -> L4f
            if (r7 == 0) goto L6d
            androidx.camera.camera2.internal.compat.CameraManagerCompat r7 = r10.mCameraManager     // Catch: androidx.camera.core.InitializationException -> L4f
            boolean r7 = androidx.camera.camera2.internal.CameraIdUtil.isBackwardCompatible(r7, r6)     // Catch: androidx.camera.core.InitializationException -> L4f
            if (r7 == 0) goto L6d
            r7 = r5
            goto L6e
        L4f:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Concurrent camera id pair: ("
            r7.<init>(r8)
            r7.append(r4)
            java.lang.String r8 = ", "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r8 = ") is not backward compatible"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            androidx.camera.core.Logger.d(r0, r7)
        L6d:
            r7 = r2
        L6e:
            if (r7 != 0) goto L71
            goto L17
        L71:
            java.util.Set<java.util.Set<java.lang.String>> r7 = r10.mConcurrentCameraIds
            java.util.HashSet r8 = new java.util.HashSet
            java.lang.String[] r9 = new java.lang.String[]{r4, r6}
            java.util.List r9 = java.util.Arrays.asList(r9)
            r8.<init>(r9)
            r7.add(r8)
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r7 = r10.mConcurrentCameraIdMap
            boolean r7 = r7.containsKey(r4)
            if (r7 != 0) goto L95
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r7 = r10.mConcurrentCameraIdMap
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r7.put(r4, r8)
        L95:
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r7 = r10.mConcurrentCameraIdMap
            boolean r7 = r7.containsKey(r6)
            if (r7 != 0) goto La7
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r7 = r10.mConcurrentCameraIdMap
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r7.put(r6, r8)
        La7:
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r7 = r10.mConcurrentCameraIdMap
            java.lang.Object r4 = r7.get(r4)
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r5 = r3.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r4.add(r5)
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r4 = r10.mConcurrentCameraIdMap
            java.lang.Object r4 = r4.get(r6)
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r2 = r3.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r4.add(r2)
            goto L17
        Lcb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.concurrent.Camera2CameraCoordinator.retrieveConcurrentCameraIds():void");
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public void addListener(androidx.camera.core.concurrent.CameraCoordinator.ConcurrentCameraModeListener concurrentCameraModeListener) {
        this.mConcurrentCameraModeListeners.add(concurrentCameraModeListener);
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public java.util.List<androidx.camera.core.CameraInfo> getActiveConcurrentCameraInfos() {
        return this.mActiveConcurrentCameraInfos;
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public int getCameraOperatingMode() {
        return this.mCameraOperatingMode;
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public java.util.List<java.util.List<androidx.camera.core.CameraSelector>> getConcurrentCameraSelectors() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Set<java.lang.String> set : this.mConcurrentCameraIds) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator<java.lang.String> it = set.iterator();
            while (it.hasNext()) {
                arrayList2.add(createCameraSelectorById(this.mCameraManager, it.next()));
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public java.lang.String getPairedConcurrentCameraId(java.lang.String str) {
        if (!this.mConcurrentCameraIdMap.containsKey(str)) {
            return null;
        }
        for (java.lang.String str2 : this.mConcurrentCameraIdMap.get(str)) {
            java.util.Iterator<androidx.camera.core.CameraInfo> it = this.mActiveConcurrentCameraInfos.iterator();
            while (it.hasNext()) {
                if (str2.equals(androidx.camera.camera2.interop.Camera2CameraInfo.from(it.next()).getCameraId())) {
                    return str2;
                }
            }
        }
        return null;
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public void removeListener(androidx.camera.core.concurrent.CameraCoordinator.ConcurrentCameraModeListener concurrentCameraModeListener) {
        this.mConcurrentCameraModeListeners.remove(concurrentCameraModeListener);
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public void setActiveConcurrentCameraInfos(java.util.List<androidx.camera.core.CameraInfo> list) {
        this.mActiveConcurrentCameraInfos = new java.util.ArrayList(list);
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public void setCameraOperatingMode(int i17) {
        if (i17 != this.mCameraOperatingMode) {
            java.util.Iterator<androidx.camera.core.concurrent.CameraCoordinator.ConcurrentCameraModeListener> it = this.mConcurrentCameraModeListeners.iterator();
            while (it.hasNext()) {
                it.next().onCameraOperatingModeUpdated(this.mCameraOperatingMode, i17);
            }
        }
        if (this.mCameraOperatingMode == 2 && i17 != 2) {
            this.mActiveConcurrentCameraInfos.clear();
        }
        this.mCameraOperatingMode = i17;
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator
    public void shutdown() {
        this.mConcurrentCameraModeListeners.clear();
        this.mConcurrentCameraIdMap.clear();
        this.mActiveConcurrentCameraInfos.clear();
        this.mConcurrentCameraIds.clear();
        this.mCameraOperatingMode = 0;
    }
}
