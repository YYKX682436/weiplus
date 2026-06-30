package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p032xa7ffe5b7;

/* renamed from: androidx.camera.camera2.internal.concurrent.Camera2CameraCoordinator */
/* loaded from: classes14.dex */
public class C0436xafe7d8be implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p035xa7ffe5b7.InterfaceC0584xe74c66ab {
    private static final java.lang.String TAG = "Camera2CameraCoordinator";

    /* renamed from: mCameraManager */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0332x1ad8324a f769x4030095b;

    /* renamed from: mCameraOperatingMode */
    private int f770x116579b2 = 0;

    /* renamed from: mConcurrentCameraIdMap */
    private final java.util.Map<java.lang.String, java.util.List<java.lang.String>> f771xac466178 = new java.util.HashMap();

    /* renamed from: mConcurrentCameraIds */
    private java.util.Set<java.util.Set<java.lang.String>> f772x873d13af = new java.util.HashSet();

    /* renamed from: mConcurrentCameraModeListeners */
    private final java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p035xa7ffe5b7.InterfaceC0584xe74c66ab.ConcurrentCameraModeListener> f773x5a6d413 = new java.util.ArrayList();

    /* renamed from: mActiveConcurrentCameraInfos */
    private java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93> f768xbb212316 = new java.util.ArrayList();

    public C0436xafe7d8be(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0332x1ad8324a c0332x1ad8324a) {
        this.f769x4030095b = c0332x1ad8324a;
        m4118xf935cb80();
    }

    /* renamed from: createCameraSelectorById */
    private static p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0475xc311f244 m4116x999cda32(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0332x1ad8324a c0332x1ad8324a, final java.lang.String str) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0475xc311f244.Builder m4286x2d4fae3e = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0475xc311f244.Builder().m4286x2d4fae3e(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0471xbb5b1f1d() { // from class: u.a$$a
            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0471xbb5b1f1d
            /* renamed from: filter */
            public final java.util.List mo4272xb408cb78(java.util.List list) {
                java.util.List m4117xf220fd3b;
                m4117xf220fd3b = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p032xa7ffe5b7.C0436xafe7d8be.m4117xf220fd3b(str, list);
                return m4117xf220fd3b;
            }
        });
        try {
            m4286x2d4fae3e.m4288xb57049bd(((java.lang.Integer) c0332x1ad8324a.m3757xc2a5207f(str).get(android.hardware.camera2.CameraCharacteristics.LENS_FACING)).intValue());
            return m4286x2d4fae3e.m4287x59bc66e();
        } catch (p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0302x1aaa9468 e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$createCameraSelectorById$0 */
    public static /* synthetic */ java.util.List m4117xf220fd3b(java.lang.String str, java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93 interfaceC0472xfede5d93 = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93) it.next();
            if (str.equals(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p033x74b5abbd.C0446x27d8cae0.m4151x3017aa(interfaceC0472xfede5d93).m4154x72efd496())) {
                return java.util.Collections.singletonList(interfaceC0472xfede5d93);
            }
        }
        throw new java.lang.IllegalArgumentException("No camera can be find for id: " + str);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0071 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0017 A[SYNTHETIC] */
    /* renamed from: retrieveConcurrentCameraIds */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m4118xf935cb80() {
        /*
            r10 = this;
            java.lang.String r0 = "Camera2CameraCoordinator"
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            androidx.camera.camera2.internal.compat.CameraManagerCompat r2 = r10.f769x4030095b     // Catch: p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0302x1aaa9468 -> Le
            java.util.Set r1 = r2.m3759xf4d0e226()     // Catch: p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0302x1aaa9468 -> Le
            goto L13
        Le:
            java.lang.String r2 = "Failed to get concurrent camera ids"
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(r0, r2)
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
            androidx.camera.camera2.internal.compat.CameraManagerCompat r7 = r10.f769x4030095b     // Catch: p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0542x71a3036f -> L4f
            boolean r7 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0209xc028bf62.m3309xa5cad5e1(r7, r4)     // Catch: p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0542x71a3036f -> L4f
            if (r7 == 0) goto L6d
            androidx.camera.camera2.internal.compat.CameraManagerCompat r7 = r10.f769x4030095b     // Catch: p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0542x71a3036f -> L4f
            boolean r7 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0209xc028bf62.m3309xa5cad5e1(r7, r6)     // Catch: p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0542x71a3036f -> L4f
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
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(r0, r7)
        L6d:
            r7 = r2
        L6e:
            if (r7 != 0) goto L71
            goto L17
        L71:
            java.util.Set<java.util.Set<java.lang.String>> r7 = r10.f772x873d13af
            java.util.HashSet r8 = new java.util.HashSet
            java.lang.String[] r9 = new java.lang.String[]{r4, r6}
            java.util.List r9 = java.util.Arrays.asList(r9)
            r8.<init>(r9)
            r7.add(r8)
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r7 = r10.f771xac466178
            boolean r7 = r7.containsKey(r4)
            if (r7 != 0) goto L95
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r7 = r10.f771xac466178
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r7.put(r4, r8)
        L95:
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r7 = r10.f771xac466178
            boolean r7 = r7.containsKey(r6)
            if (r7 != 0) goto La7
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r7 = r10.f771xac466178
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r7.put(r6, r8)
        La7:
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r7 = r10.f771xac466178
            java.lang.Object r4 = r7.get(r4)
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r5 = r3.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r4.add(r5)
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r4 = r10.f771xac466178
            java.lang.Object r4 = r4.get(r6)
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r2 = r3.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r4.add(r2)
            goto L17
        Lcb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p032xa7ffe5b7.C0436xafe7d8be.m4118xf935cb80():void");
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p035xa7ffe5b7.InterfaceC0584xe74c66ab
    /* renamed from: addListener */
    public void mo4119x162a7075(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p035xa7ffe5b7.InterfaceC0584xe74c66ab.ConcurrentCameraModeListener concurrentCameraModeListener) {
        this.f773x5a6d413.add(concurrentCameraModeListener);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p035xa7ffe5b7.InterfaceC0584xe74c66ab
    /* renamed from: getActiveConcurrentCameraInfos */
    public java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93> mo4120xe2d68a8d() {
        return this.f768xbb212316;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p035xa7ffe5b7.InterfaceC0584xe74c66ab
    /* renamed from: getCameraOperatingMode */
    public int mo4121x7ef94829() {
        return this.f770x116579b2;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p035xa7ffe5b7.InterfaceC0584xe74c66ab
    /* renamed from: getConcurrentCameraSelectors */
    public java.util.List<java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0475xc311f244>> mo4122xa5910962() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Set<java.lang.String> set : this.f772x873d13af) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator<java.lang.String> it = set.iterator();
            while (it.hasNext()) {
                arrayList2.add(m4116x999cda32(this.f769x4030095b, it.next()));
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p035xa7ffe5b7.InterfaceC0584xe74c66ab
    /* renamed from: getPairedConcurrentCameraId */
    public java.lang.String mo4123xe5cebc46(java.lang.String str) {
        if (!this.f771xac466178.containsKey(str)) {
            return null;
        }
        for (java.lang.String str2 : this.f771xac466178.get(str)) {
            java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93> it = this.f768xbb212316.iterator();
            while (it.hasNext()) {
                if (str2.equals(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p033x74b5abbd.C0446x27d8cae0.m4151x3017aa(it.next()).m4154x72efd496())) {
                    return str2;
                }
            }
        }
        return null;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p035xa7ffe5b7.InterfaceC0584xe74c66ab
    /* renamed from: removeListener */
    public void mo4124xf1335d58(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p035xa7ffe5b7.InterfaceC0584xe74c66ab.ConcurrentCameraModeListener concurrentCameraModeListener) {
        this.f773x5a6d413.remove(concurrentCameraModeListener);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p035xa7ffe5b7.InterfaceC0584xe74c66ab
    /* renamed from: setActiveConcurrentCameraInfos */
    public void mo4125xeaee9601(java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93> list) {
        this.f768xbb212316 = new java.util.ArrayList(list);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p035xa7ffe5b7.InterfaceC0584xe74c66ab
    /* renamed from: setCameraOperatingMode */
    public void mo4126xcd3e079d(int i17) {
        if (i17 != this.f770x116579b2) {
            java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p035xa7ffe5b7.InterfaceC0584xe74c66ab.ConcurrentCameraModeListener> it = this.f773x5a6d413.iterator();
            while (it.hasNext()) {
                it.next().mo4867x24f4559b(this.f770x116579b2, i17);
            }
        }
        if (this.f770x116579b2 == 2 && i17 != 2) {
            this.f768xbb212316.clear();
        }
        this.f770x116579b2 = i17;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p035xa7ffe5b7.InterfaceC0584xe74c66ab
    /* renamed from: shutdown */
    public void mo4127xf5e80656() {
        this.f773x5a6d413.clear();
        this.f771xac466178.clear();
        this.f768xbb212316.clear();
        this.f772x873d13af.clear();
        this.f770x116579b2 = 0;
    }
}
