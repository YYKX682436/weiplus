package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd;

/* renamed from: androidx.camera.core.internal.CameraUseCaseAdapter */
/* loaded from: classes14.dex */
public final class C0831xfaa2a09d implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0465x77deaf45 {
    private static final java.lang.String TAG = "CameraUseCaseAdapter";

    /* renamed from: mAdapterCameraControl */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0747xdc1301bd f2057xa37ab776;

    /* renamed from: mAdapterCameraInfo */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0748x1bf2244e f2058x908ff135;

    /* renamed from: mAdapterSecondaryCameraInfo */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0748x1bf2244e f2059xc63bb885;

    /* renamed from: mAppUseCases */
    private final java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> f2060xc42ed090;

    /* renamed from: mAttached */
    private boolean f2061x451a2531;

    /* renamed from: mCameraConfig */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0665xb691d6e7 f2062x445b9bd4;

    /* renamed from: mCameraCoordinator */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p035xa7ffe5b7.InterfaceC0584xe74c66ab f2063x9969adde;

    /* renamed from: mCameraDeviceSurfaceManager */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0670x512d391b f2064xb8b15b48;

    /* renamed from: mCameraInternal */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 f2065xe07802cf;

    /* renamed from: mCameraUseCases */
    private final java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> f2066xac05ce0e;

    /* renamed from: mEffects */
    private java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0468xb9790d36> f2067x30c92bd5;
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.C0831xfaa2a09d.CameraId mId;

    /* renamed from: mInteropConfig */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 f2068x435a1f2;

    /* renamed from: mLayoutSettings */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0543xcd8e1d8d f2069xffa5b3a;

    /* renamed from: mLock */
    private final java.lang.Object f2070x6243b38;

    /* renamed from: mPlaceholderForExtensions */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 f2071x6cc27897;

    /* renamed from: mSecondaryCameraInternal */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 f2072xfe194869;

    /* renamed from: mSecondaryLayoutSettings */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0543xcd8e1d8d f2073x2d9ba0d4;

    /* renamed from: mStreamSharing */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0959xc642f91c f2074xf1b1d1cf;

    /* renamed from: mUseCaseConfigFactory */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771 f2075x1567ef5e;

    /* renamed from: mViewPort */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0582x4b1fd0e6 f2076x6c431453;

    /* renamed from: androidx.camera.core.internal.CameraUseCaseAdapter$CameraException */
    /* loaded from: classes14.dex */
    public static final class CameraException extends java.lang.Exception {
        public CameraException() {
        }

        public CameraException(java.lang.String str) {
            super(str);
        }

        public CameraException(java.lang.Throwable th6) {
            super(th6);
        }
    }

    /* renamed from: androidx.camera.core.internal.CameraUseCaseAdapter$CameraId */
    /* loaded from: classes14.dex */
    public static abstract class CameraId {
        /* renamed from: create */
        public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.C0831xfaa2a09d.CameraId m6098xaf65a0fc(java.lang.String str, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0711x165a88c9 abstractC0711x165a88c9) {
            return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.C0827xf1fb7e05(str, abstractC0711x165a88c9);
        }

        /* renamed from: getCameraConfigId */
        public abstract p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0711x165a88c9 mo6042x83c8c338();

        /* renamed from: getCameraIdString */
        public abstract java.lang.String mo6043x7fe1d847();
    }

    /* renamed from: androidx.camera.core.internal.CameraUseCaseAdapter$ConfigPair */
    /* loaded from: classes14.dex */
    public static class ConfigPair {

        /* renamed from: mCameraConfig */
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> f2077x445b9bd4;

        /* renamed from: mExtendedConfig */
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> f2078x2c0c57a8;

        public ConfigPair(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> interfaceC0768x83509b59, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> interfaceC0768x83509b592) {
            this.f2078x2c0c57a8 = interfaceC0768x83509b59;
            this.f2077x445b9bd4 = interfaceC0768x83509b592;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0831xfaa2a09d(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 r11, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p035xa7ffe5b7.InterfaceC0584xe74c66ab r12, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0670x512d391b r13, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771 r14) {
        /*
            r10 = this;
            r2 = 0
            androidx.camera.core.impl.RestrictedCameraInfo r3 = new androidx.camera.core.impl.RestrictedCameraInfo
            androidx.camera.core.impl.CameraInfoInternal r0 = r11.mo3091xbefeb46()
            androidx.camera.core.impl.CameraConfig r1 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0668x1ba9066c.m5276x1e74d0e3()
            r3.<init>(r0, r1)
            r4 = 0
            androidx.camera.core.LayoutSettings r6 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0543xcd8e1d8d.f1127x86df6221
            r0 = r10
            r1 = r11
            r5 = r6
            r7 = r12
            r8 = r13
            r9 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.C0831xfaa2a09d.<init>(androidx.camera.core.impl.CameraInternal, androidx.camera.core.concurrent.CameraCoordinator, androidx.camera.core.impl.CameraDeviceSurfaceManager, androidx.camera.core.impl.UseCaseConfigFactory):void");
    }

    /* renamed from: cacheInteropConfig */
    private void m6050x469adcfd() {
        synchronized (this.f2070x6243b38) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0669xec29d935 mo3090x8af45b9f = this.f2065xe07802cf.mo3090x8af45b9f();
            this.f2068x435a1f2 = mo3090x8af45b9f.mo2971x668755a9();
            mo3090x8af45b9f.mo2959x844e7812();
        }
    }

    /* renamed from: calculateCameraUseCases */
    public static java.util.Collection<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> m6051x1e01a947(java.util.Collection<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> collection, p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 abstractC0580x5a5e3137, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0959xc642f91c c0959xc642f91c) {
        java.util.ArrayList arrayList = new java.util.ArrayList(collection);
        if (abstractC0580x5a5e3137 != null) {
            arrayList.add(abstractC0580x5a5e3137);
        }
        if (c0959xc642f91c != null) {
            arrayList.add(c0959xc642f91c);
            arrayList.removeAll(c0959xc642f91c.m6576xdec49b75());
        }
        return arrayList;
    }

    /* renamed from: calculatePlaceholderForExtensions */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 m6052xacd46090(java.util.Collection<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> collection, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0959xc642f91c c0959xc642f91c) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 abstractC0580x5a5e3137;
        synchronized (this.f2070x6243b38) {
            java.util.ArrayList arrayList = new java.util.ArrayList(collection);
            if (c0959xc642f91c != null) {
                arrayList.add(c0959xc642f91c);
                arrayList.removeAll(c0959xc642f91c.m6576xdec49b75());
            }
            if (m6070x45050691()) {
                if (m6072xbbfbb5a1(arrayList)) {
                    abstractC0580x5a5e3137 = m6075xca7a2b3e(this.f2071x6cc27897) ? this.f2071x6cc27897 : m6057xaf5990b4();
                } else if (m6071x21663450(arrayList)) {
                    abstractC0580x5a5e3137 = m6073x17377bb5(this.f2071x6cc27897) ? this.f2071x6cc27897 : m6056x888b0fff();
                }
            }
            abstractC0580x5a5e3137 = null;
        }
        return abstractC0580x5a5e3137;
    }

    /* renamed from: calculateSensorToBufferTransformMatrix */
    private static android.graphics.Matrix m6053x8f371752(android.graphics.Rect rect, android.util.Size size) {
        m3.h.b(rect.width() > 0 && rect.height() > 0, "Cannot compute viewport crop rects zero sized sensor rect.");
        android.graphics.RectF rectF = new android.graphics.RectF(rect);
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setRectToRect(new android.graphics.RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), rectF, android.graphics.Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    /* renamed from: calculateSuggestedStreamSpecs */
    private java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b> m6054x19a3b1db(int i17, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0675x66574570 interfaceC0675x66574570, java.util.Collection<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> collection, java.util.Collection<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> collection2, java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.C0831xfaa2a09d.ConfigPair> map) {
        android.graphics.Rect rect;
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String mo3161x72efd496 = interfaceC0675x66574570.mo3161x72efd496();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> it = collection2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 next = it.next();
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f mo3270x501b1a43 = this.f2064xb8b15b48.mo3270x501b1a43(i17, mo3161x72efd496, next.m4816x450a23fc(), next.m4810x59ee93f());
            int m4816x450a23fc = next.m4816x450a23fc();
            android.util.Size m4810x59ee93f = next.m4810x59ee93f();
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b m4809xfdddfa15 = next.m4809xfdddfa15();
            m4809xfdddfa15.getClass();
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0643xfc6b6a97 m5092xaf65a0fc = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0643xfc6b6a97.m5092xaf65a0fc(mo3270x501b1a43, m4816x450a23fc, m4810x59ee93f, m4809xfdddfa15.mo5188x82dbcab4(), p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0959xc642f91c.m6560x8e12cf49(next), next.m4809xfdddfa15().mo5190xca0018d6(), next.m4814x27802a65().m5754x871a9f26(null));
            arrayList.add(m5092xaf65a0fc);
            hashMap2.put(m5092xaf65a0fc, next);
            hashMap.put(next, next.m4809xfdddfa15());
        }
        if (!collection.isEmpty()) {
            java.util.HashMap hashMap3 = new java.util.HashMap();
            java.util.HashMap hashMap4 = new java.util.HashMap();
            try {
                rect = this.f2065xe07802cf.mo3090x8af45b9f().mo2976x54436cb4();
            } catch (java.lang.NullPointerException unused) {
                rect = null;
            }
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.C0838x392b74e c0838x392b74e = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.C0838x392b74e(interfaceC0675x66574570, rect != null ? p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0801x6002c4c5.m5960x1b5f820(rect) : null);
            loop1: while (true) {
                z17 = false;
                for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 abstractC0580x5a5e3137 : collection) {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.C0831xfaa2a09d.ConfigPair configPair = map.get(abstractC0580x5a5e3137);
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> m4833xcdb2a19 = abstractC0580x5a5e3137.m4833xcdb2a19(interfaceC0675x66574570, configPair.f2078x2c0c57a8, configPair.f2077x445b9bd4);
                    hashMap3.put(m4833xcdb2a19, abstractC0580x5a5e3137);
                    hashMap4.put(m4833xcdb2a19, c0838x392b74e.m6128x340adcd6(m4833xcdb2a19));
                    if (abstractC0580x5a5e3137.m4814x27802a65() instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0739x29b48d0a) {
                        if (((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0739x29b48d0a) abstractC0580x5a5e3137.m4814x27802a65()).m5748x732bab0() == 2) {
                            z17 = true;
                        }
                    }
                }
            }
            android.util.Pair<java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?>, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b>, java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0643xfc6b6a97, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b>> mo3269xd8dae5cb = this.f2064xb8b15b48.mo3269xd8dae5cb(i17, mo3161x72efd496, arrayList, hashMap4, z17, m6069x5cfe2a05(collection));
            for (java.util.Map.Entry entry : hashMap3.entrySet()) {
                hashMap.put((p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137) entry.getValue(), (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b) ((java.util.Map) mo3269xd8dae5cb.first).get(entry.getKey()));
            }
            for (java.util.Map.Entry entry2 : ((java.util.Map) mo3269xd8dae5cb.second).entrySet()) {
                if (hashMap2.containsKey(entry2.getKey())) {
                    hashMap.put((p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137) hashMap2.get(entry2.getKey()), (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b) entry2.getValue());
                }
            }
        }
        return hashMap;
    }

    /* renamed from: checkUnsupportedFeatureCombinationAndThrow */
    private void m6055xc2099e55(java.util.Collection<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> collection) {
        if (m6065x9abff6c5()) {
            if (m6067xc7315250(collection)) {
                throw new java.lang.IllegalArgumentException("Extensions are only supported for use with standard dynamic range.");
            }
            if (m6068xed3f77ef(collection)) {
                throw new java.lang.IllegalArgumentException("Extensions are not supported for use with Ultra HDR image capture.");
            }
        }
        synchronized (this.f2070x6243b38) {
            if (!this.f2067x30c92bd5.isEmpty() && m6068xed3f77ef(collection)) {
                throw new java.lang.IllegalArgumentException("Ultra HDR image capture does not support for use with CameraEffect.");
            }
        }
    }

    /* renamed from: createExtraImageCapture */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b m6056x888b0fff() {
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.Builder().mo4355x396335be("ImageCapture-Extra").mo2888x59bc66e();
    }

    /* renamed from: createExtraPreview */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0551x50417ba8 m6057xaf5990b4() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0551x50417ba8 mo2888x59bc66e = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0551x50417ba8.Builder().mo4355x396335be("Preview-Extra").mo2888x59bc66e();
        mo2888x59bc66e.m4721x2553c4fc(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.C0833xb3214a25());
        return mo2888x59bc66e;
    }

    /* renamed from: createOrReuseStreamSharing */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0959xc642f91c m6058x3d75a587(java.util.Collection<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> collection, boolean z17) {
        synchronized (this.f2070x6243b38) {
            java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> m6064x314561a5 = m6064x314561a5(collection, z17);
            if (m6064x314561a5.size() < 2 && (!m6065x9abff6c5() || !m6069x5cfe2a05(m6064x314561a5))) {
                return null;
            }
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0959xc642f91c c0959xc642f91c = this.f2074xf1b1d1cf;
            if (c0959xc642f91c != null && c0959xc642f91c.m6576xdec49b75().equals(m6064x314561a5)) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0959xc642f91c c0959xc642f91c2 = this.f2074xf1b1d1cf;
                java.util.Objects.requireNonNull(c0959xc642f91c2);
                return c0959xc642f91c2;
            }
            if (!m6076xbd31e0de(m6064x314561a5)) {
                return null;
            }
            return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0959xc642f91c(this.f2065xe07802cf, this.f2072xfe194869, this.f2069xffa5b3a, this.f2073x2d9ba0d4, m6064x314561a5, this.f2075x1567ef5e);
        }
    }

    /* renamed from: generateCameraId */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.C0831xfaa2a09d.CameraId m6059x5f39cbb5(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0748x1bf2244e c0748x1bf2244e, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0748x1bf2244e c0748x1bf2244e2) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(c0748x1bf2244e.mo3161x72efd496());
        sb6.append(c0748x1bf2244e2 == null ? "" : c0748x1bf2244e2.mo3161x72efd496());
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.C0831xfaa2a09d.CameraId.m6098xaf65a0fc(sb6.toString(), c0748x1bf2244e.m5581xdb9153d().mo5258x9fd40475());
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.camera.core.impl.UseCaseConfig, androidx.camera.core.impl.UseCaseConfig<?>] */
    /* renamed from: generateExtendedStreamSharingConfigFromPreview */
    private static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> m6060xa41c5fae(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771 interfaceC0769xb8476771, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0959xc642f91c c0959xc642f91c) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> mo4420xdbd48d2d = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0551x50417ba8.Builder().mo2888x59bc66e().mo4420xdbd48d2d(false, interfaceC0769xb8476771);
        if (mo4420xdbd48d2d == null) {
            return null;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0731x74f1ef5a m5525x3017aa = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0731x74f1ef5a.m5525x3017aa((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62) mo4420xdbd48d2d);
        m5525x3017aa.mo5522xc616fa19(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.InterfaceC0840xcdfd0453.f2094x7271dcb4);
        return c0959xc642f91c.mo4427xa926ae58(m5525x3017aa).mo4446x111127c3();
    }

    /* renamed from: getCameraMode */
    private int m6061x764f0e5e() {
        synchronized (this.f2070x6243b38) {
            return this.f2063x9969adde.mo4121x7ef94829() == 2 ? 1 : 0;
        }
    }

    /* renamed from: getConfigs */
    private static java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.C0831xfaa2a09d.ConfigPair> m6062x767e213b(java.util.Collection<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> collection, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771 interfaceC0769xb8476771, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771 interfaceC0769xb84767712) {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 abstractC0580x5a5e3137 : collection) {
            hashMap.put(abstractC0580x5a5e3137, new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.C0831xfaa2a09d.ConfigPair(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0959xc642f91c.m6570x17e32032(abstractC0580x5a5e3137) ? m6060xa41c5fae(interfaceC0769xb8476771, (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0959xc642f91c) abstractC0580x5a5e3137) : abstractC0580x5a5e3137.mo4420xdbd48d2d(false, interfaceC0769xb8476771), abstractC0580x5a5e3137.mo4420xdbd48d2d(true, interfaceC0769xb84767712)));
        }
        return hashMap;
    }

    /* renamed from: getSharingTargets */
    private int m6063x3d43c57c(boolean z17) {
        int i17;
        synchronized (this.f2070x6243b38) {
            java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0468xb9790d36> it = this.f2067x30c92bd5.iterator();
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0468xb9790d36 abstractC0468xb9790d36 = null;
            while (true) {
                i17 = 0;
                if (!it.hasNext()) {
                    break;
                }
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0468xb9790d36 next = it.next();
                if (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0927xe69ca980.m6385xee1f13ac(next.m4264xe21cfccc()) > 1) {
                    m3.h.e(abstractC0468xb9790d36 == null, "Can only have one sharing effect.");
                    abstractC0468xb9790d36 = next;
                }
            }
            if (abstractC0468xb9790d36 != null) {
                i17 = abstractC0468xb9790d36.m4264xe21cfccc();
            }
            if (z17) {
                i17 |= 3;
            }
        }
        return i17;
    }

    /* renamed from: getStreamSharingChildren */
    private java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> m6064x314561a5(java.util.Collection<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> collection, boolean z17) {
        java.util.HashSet hashSet = new java.util.HashSet();
        int m6063x3d43c57c = m6063x3d43c57c(z17);
        for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 abstractC0580x5a5e3137 : collection) {
            m3.h.b(!p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0959xc642f91c.m6570x17e32032(abstractC0580x5a5e3137), "Only support one level of sharing for now.");
            if (abstractC0580x5a5e3137.m4831x47740f47(m6063x3d43c57c)) {
                hashSet.add(abstractC0580x5a5e3137);
            }
        }
        return hashSet;
    }

    /* renamed from: hasExtension */
    private boolean m6065x9abff6c5() {
        boolean z17;
        synchronized (this.f2070x6243b38) {
            z17 = this.f2062x445b9bd4.m5260xf033da12(null) != null;
        }
        return z17;
    }

    /* renamed from: hasImplementationOptionChanged */
    private static boolean m6066x4e770ef3(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b abstractC0756x2f9ad77b, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 c0750xb915958) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 mo5190xca0018d6 = abstractC0756x2f9ad77b.mo5190xca0018d6();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 m5592xca0018d6 = c0750xb915958.m5592xca0018d6();
        if (mo5190xca0018d6.mo5378xc8202020().size() != c0750xb915958.m5592xca0018d6().mo5378xc8202020().size()) {
            return true;
        }
        for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<?> option : mo5190xca0018d6.mo5378xc8202020()) {
            if (!m5592xca0018d6.mo5374xdccd9774(option) || !java.util.Objects.equals(m5592xca0018d6.mo5379x77ba97d1(option), mo5190xca0018d6.mo5379x77ba97d1(option))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: hasNonSdrConfig */
    private static boolean m6067xc7315250(java.util.Collection<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> collection) {
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> it = collection.iterator();
        while (it.hasNext()) {
            if (m6074xea343638(it.next().m4814x27802a65().m5475x82dbcab4())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: hasUltraHdrImageCapture */
    private static boolean m6068xed3f77ef(java.util.Collection<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> collection) {
        for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 abstractC0580x5a5e3137 : collection) {
            if (m6073x17377bb5(abstractC0580x5a5e3137)) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> m4814x27802a65 = abstractC0580x5a5e3137.m4814x27802a65();
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<?> option = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0713xaaf0b8ad.f1678xd71146ab;
                if (m4814x27802a65.mo5374xdccd9774(option)) {
                    java.lang.Integer num = (java.lang.Integer) m4814x27802a65.mo5379x77ba97d1(option);
                    num.getClass();
                    if (num.intValue() == 1) {
                        return true;
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    /* renamed from: hasVideoCapture */
    private static boolean m6069x5cfe2a05(java.util.Collection<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> collection) {
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> it = collection.iterator();
        while (it.hasNext()) {
            if (m6077xeac94c95(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: isCoexistingPreviewImageCaptureRequired */
    private boolean m6070x45050691() {
        boolean z17;
        synchronized (this.f2070x6243b38) {
            z17 = true;
            if (this.f2062x445b9bd4.m5261x721fed49() != 1) {
                z17 = false;
            }
        }
        return z17;
    }

    /* renamed from: isExtraImageCaptureRequired */
    private static boolean m6071x21663450(java.util.Collection<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> collection) {
        boolean z17 = false;
        boolean z18 = false;
        for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 abstractC0580x5a5e3137 : collection) {
            if (m6075xca7a2b3e(abstractC0580x5a5e3137) || p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0959xc642f91c.m6570x17e32032(abstractC0580x5a5e3137)) {
                z17 = true;
            } else if (m6073x17377bb5(abstractC0580x5a5e3137)) {
                z18 = true;
            }
        }
        return z17 && !z18;
    }

    /* renamed from: isExtraPreviewRequired */
    private static boolean m6072xbbfbb5a1(java.util.Collection<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> collection) {
        boolean z17 = false;
        boolean z18 = false;
        for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 abstractC0580x5a5e3137 : collection) {
            if (m6075xca7a2b3e(abstractC0580x5a5e3137) || p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0959xc642f91c.m6570x17e32032(abstractC0580x5a5e3137)) {
                z18 = true;
            } else if (m6073x17377bb5(abstractC0580x5a5e3137)) {
                z17 = true;
            }
        }
        return z17 && !z18;
    }

    /* renamed from: isImageCapture */
    private static boolean m6073x17377bb5(p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 abstractC0580x5a5e3137) {
        return abstractC0580x5a5e3137 instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b;
    }

    /* renamed from: isNotSdr */
    private static boolean m6074xea343638(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e) {
        return (c0491x2bb48c5e.m4385xbc5bbb2c() == 10) || (c0491x2bb48c5e.m4386xe1d96ac9() != 1 && c0491x2bb48c5e.m4386xe1d96ac9() != 0);
    }

    /* renamed from: isPreview */
    private static boolean m6075xca7a2b3e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 abstractC0580x5a5e3137) {
        return abstractC0580x5a5e3137 instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0551x50417ba8;
    }

    /* renamed from: isStreamSharingChildrenCombinationValid */
    public static boolean m6076xbd31e0de(java.util.Collection<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> collection) {
        int[] iArr = {1, 2, 4};
        java.util.HashSet hashSet = new java.util.HashSet();
        for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 abstractC0580x5a5e3137 : collection) {
            for (int i17 = 0; i17 < 3; i17++) {
                int i18 = iArr[i17];
                if (abstractC0580x5a5e3137.m4831x47740f47(i18)) {
                    if (hashSet.contains(java.lang.Integer.valueOf(i18))) {
                        return false;
                    }
                    hashSet.add(java.lang.Integer.valueOf(i18));
                }
            }
        }
        return true;
    }

    /* renamed from: isVideoCapture */
    private static boolean m6077xeac94c95(p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 abstractC0580x5a5e3137) {
        if (abstractC0580x5a5e3137 != null) {
            if (abstractC0580x5a5e3137.m4814x27802a65().mo5374xdccd9774(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.f1829x7803883d)) {
                return abstractC0580x5a5e3137.m4814x27802a65().mo3493xe38cfe6a() == p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType.VIDEO_CAPTURE;
            }
            abstractC0580x5a5e3137.toString();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$createExtraPreview$0 */
    public static /* synthetic */ void m6078x9b7b5cfd(android.view.Surface surface, android.graphics.SurfaceTexture surfaceTexture, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42.Result result) {
        surface.release();
        surfaceTexture.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$createExtraPreview$1 */
    public static /* synthetic */ void m6079x9b7b5cfe(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42 c0569x83ae3d42) {
        final android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(c0569x83ae3d42.m4793x8ee230a2().getWidth(), c0569x83ae3d42.m4793x8ee230a2().getHeight());
        surfaceTexture.detachFromGLContext();
        final android.view.Surface surface = new android.view.Surface(surfaceTexture);
        c0569x83ae3d42.m4797xc462ecc(surface, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5978x5ebfffdc(), new m3.a() { // from class: androidx.camera.core.internal.CameraUseCaseAdapter$$a
            @Override // m3.a
            /* renamed from: accept */
            public final void mo3938xab27b508(java.lang.Object obj) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.C0831xfaa2a09d.m6078x9b7b5cfd(surface, surfaceTexture, (p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42.Result) obj);
            }
        });
    }

    /* renamed from: restoreInteropConfig */
    private void m6080xec070d71() {
        synchronized (this.f2070x6243b38) {
            if (this.f2068x435a1f2 != null) {
                this.f2065xe07802cf.mo3090x8af45b9f().mo2955xa5641e3e(this.f2068x435a1f2);
            }
        }
    }

    /* renamed from: setEffectsOnUseCases */
    private static java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0468xb9790d36> m6081x713ac35b(java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0468xb9790d36> list, java.util.Collection<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> collection) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list);
        for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 abstractC0580x5a5e3137 : collection) {
            abstractC0580x5a5e3137.m4840xa731093(null);
            for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0468xb9790d36 abstractC0468xb9790d36 : list) {
                if (abstractC0580x5a5e3137.m4831x47740f47(abstractC0468xb9790d36.m4264xe21cfccc())) {
                    m3.h.e(abstractC0580x5a5e3137.m4815x173ddc87() == null, abstractC0580x5a5e3137 + " already has effect" + abstractC0580x5a5e3137.m4815x173ddc87());
                    abstractC0580x5a5e3137.m4840xa731093(abstractC0468xb9790d36);
                    arrayList.remove(abstractC0468xb9790d36);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: updateEffects */
    public static void m6082x398613f9(java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0468xb9790d36> list, java.util.Collection<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> collection, java.util.Collection<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> collection2) {
        java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0468xb9790d36> m6081x713ac35b = m6081x713ac35b(list, collection);
        java.util.ArrayList arrayList = new java.util.ArrayList(collection2);
        arrayList.removeAll(collection);
        java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0468xb9790d36> m6081x713ac35b2 = m6081x713ac35b(m6081x713ac35b, arrayList);
        if (m6081x713ac35b2.size() > 0) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.w(TAG, "Unused effects: " + m6081x713ac35b2);
        }
    }

    /* renamed from: updateViewPortAndSensorToBufferMatrix */
    private void m6083x9b882b5e(java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b> map, java.util.Collection<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> collection) {
        synchronized (this.f2070x6243b38) {
            if (this.f2076x6c431453 != null && !collection.isEmpty()) {
                java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f2065xe07802cf.mo3091xbefeb46().mo3168x5f62de6e());
                boolean z17 = true;
                if (valueOf == null) {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.w(TAG, "The lens facing is null, probably an external.");
                } else if (valueOf.intValue() != 0) {
                    z17 = false;
                }
                java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137, android.graphics.Rect> m6143x84cdf423 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.C0842x18da4c4d.m6143x84cdf423(this.f2065xe07802cf.mo3090x8af45b9f().mo2976x54436cb4(), z17, this.f2076x6c431453.m4860x1aef895d(), this.f2065xe07802cf.mo3091xbefeb46().mo3173x3b4734f9(this.f2076x6c431453.m4862x79734cf4()), this.f2076x6c431453.m4863x8f7ec8ee(), this.f2076x6c431453.m4861x6fcfed3f(), map);
                for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 abstractC0580x5a5e3137 : collection) {
                    android.graphics.Rect rect = m6143x84cdf423.get(abstractC0580x5a5e3137);
                    rect.getClass();
                    abstractC0580x5a5e3137.mo4437x8c0c67fc(rect);
                }
            }
            for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 abstractC0580x5a5e31372 : collection) {
                android.graphics.Rect mo2976x54436cb4 = this.f2065xe07802cf.mo3090x8af45b9f().mo2976x54436cb4();
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b abstractC0756x2f9ad77b = map.get(abstractC0580x5a5e31372);
                abstractC0756x2f9ad77b.getClass();
                abstractC0580x5a5e31372.mo4435x6864fd6(m6053x8f371752(mo2976x54436cb4, abstractC0756x2f9ad77b.mo5191x8ee230a2()));
            }
        }
    }

    /* renamed from: addUseCases */
    public void m6084xb37b3dbd(java.util.Collection<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> collection) {
        synchronized (this.f2070x6243b38) {
            this.f2065xe07802cf.mo3108xdbe782dd(this.f2062x445b9bd4);
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 interfaceC0677x9e0bc522 = this.f2072xfe194869;
            if (interfaceC0677x9e0bc522 != null) {
                interfaceC0677x9e0bc522.mo3108xdbe782dd(this.f2062x445b9bd4);
            }
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(this.f2060xc42ed090);
            linkedHashSet.addAll(collection);
            try {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 interfaceC0677x9e0bc5222 = this.f2072xfe194869;
                boolean z17 = true;
                boolean z18 = interfaceC0677x9e0bc5222 != null;
                if (interfaceC0677x9e0bc5222 == null) {
                    z17 = false;
                }
                m6097x216b55e5(linkedHashSet, z18, z17);
            } catch (java.lang.IllegalArgumentException e17) {
                throw new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.C0831xfaa2a09d.CameraException(e17);
            }
        }
    }

    /* renamed from: attachUseCases */
    public void m6085x352acf61() {
        synchronized (this.f2070x6243b38) {
            if (!this.f2061x451a2531) {
                if (!this.f2066xac05ce0e.isEmpty()) {
                    this.f2065xe07802cf.mo3108xdbe782dd(this.f2062x445b9bd4);
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 interfaceC0677x9e0bc522 = this.f2072xfe194869;
                    if (interfaceC0677x9e0bc522 != null) {
                        interfaceC0677x9e0bc522.mo3108xdbe782dd(this.f2062x445b9bd4);
                    }
                }
                this.f2065xe07802cf.mo3082x352acf61(this.f2066xac05ce0e);
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 interfaceC0677x9e0bc5222 = this.f2072xfe194869;
                if (interfaceC0677x9e0bc5222 != null) {
                    interfaceC0677x9e0bc5222.mo3082x352acf61(this.f2066xac05ce0e);
                }
                m6080xec070d71();
                java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> it = this.f2066xac05ce0e.iterator();
                while (it.hasNext()) {
                    it.next().m4837x977862c8();
                }
                this.f2061x451a2531 = true;
            }
        }
    }

    /* renamed from: detachUseCases */
    public void m6086xe116caaf() {
        synchronized (this.f2070x6243b38) {
            if (this.f2061x451a2531) {
                this.f2065xe07802cf.mo3086xe116caaf(new java.util.ArrayList(this.f2066xac05ce0e));
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 interfaceC0677x9e0bc522 = this.f2072xfe194869;
                if (interfaceC0677x9e0bc522 != null) {
                    interfaceC0677x9e0bc522.mo3086xe116caaf(new java.util.ArrayList(this.f2066xac05ce0e));
                }
                m6050x469adcfd();
                this.f2061x451a2531 = false;
            }
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0465x77deaf45
    /* renamed from: getCameraControl */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0467x1baf8658 mo4252xa97012c2() {
        return this.f2057xa37ab776;
    }

    /* renamed from: getCameraId */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.C0831xfaa2a09d.CameraId m6087x72efd496() {
        return this.mId;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0465x77deaf45
    /* renamed from: getCameraInfo */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93 mo4253x764d3969() {
        return this.f2058x908ff135;
    }

    /* renamed from: getCameraUseCases */
    public java.util.Collection<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> m6088x93ea9137() {
        java.util.ArrayList arrayList;
        synchronized (this.f2070x6243b38) {
            arrayList = new java.util.ArrayList(this.f2066xac05ce0e);
        }
        return arrayList;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0465x77deaf45
    /* renamed from: getExtendedConfig */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0665xb691d6e7 mo3093x13f11ad1() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0665xb691d6e7 interfaceC0665xb691d6e7;
        synchronized (this.f2070x6243b38) {
            interfaceC0665xb691d6e7 = this.f2062x445b9bd4;
        }
        return interfaceC0665xb691d6e7;
    }

    /* renamed from: getSecondaryCameraInfo */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93 m6089x4bda6ad1() {
        return this.f2059xc63bb885;
    }

    /* renamed from: getUseCases */
    public java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> m6090x6967cf72() {
        java.util.ArrayList arrayList;
        synchronized (this.f2070x6243b38) {
            arrayList = new java.util.ArrayList(this.f2060xc42ed090);
        }
        return arrayList;
    }

    /* renamed from: isEquivalent */
    public boolean m6091x4fd6cf34(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.C0831xfaa2a09d c0831xfaa2a09d) {
        return m6087x72efd496().equals(c0831xfaa2a09d.m6087x72efd496());
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0465x77deaf45
    /* renamed from: isUseCasesCombinationSupported */
    public boolean mo4254xb7fe8105(boolean z17, p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137... abstractC0580x5a5e3137Arr) {
        java.util.Collection<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> asList = java.util.Arrays.asList(abstractC0580x5a5e3137Arr);
        if (z17) {
            asList = m6051x1e01a947(asList, null, m6058x3d75a587(asList, true));
        }
        java.util.Collection<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> collection = asList;
        synchronized (this.f2070x6243b38) {
            try {
                try {
                    m6054x19a3b1db(m6061x764f0e5e(), this.f2065xe07802cf.mo3091xbefeb46(), collection, java.util.Collections.emptyList(), m6062x767e213b(collection, this.f2062x445b9bd4.m5262x5a4defc7(), this.f2075x1567ef5e));
                } catch (java.lang.IllegalArgumentException unused) {
                    return false;
                }
            } catch (java.lang.Throwable th6) {
                throw th6;
            }
        }
        return true;
    }

    /* renamed from: removeUseCases */
    public void m6092x8e842aa0(java.util.Collection<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> collection) {
        synchronized (this.f2070x6243b38) {
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(this.f2060xc42ed090);
            linkedHashSet.removeAll(collection);
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 interfaceC0677x9e0bc522 = this.f2072xfe194869;
            boolean z17 = true;
            boolean z18 = interfaceC0677x9e0bc522 != null;
            if (interfaceC0677x9e0bc522 == null) {
                z17 = false;
            }
            m6097x216b55e5(linkedHashSet, z18, z17);
        }
    }

    /* renamed from: setActiveResumingMode */
    public void m6093x2bcb495(boolean z17) {
        this.f2065xe07802cf.mo3107x2bcb495(z17);
    }

    /* renamed from: setEffects */
    public void m6094x43ef0240(java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0468xb9790d36> list) {
        synchronized (this.f2070x6243b38) {
            this.f2067x30c92bd5 = list;
        }
    }

    /* renamed from: setViewPort */
    public void m6095xbdd80b48(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0582x4b1fd0e6 c0582x4b1fd0e6) {
        synchronized (this.f2070x6243b38) {
            this.f2076x6c431453 = c0582x4b1fd0e6;
        }
    }

    /* renamed from: updateUseCases */
    public void m6096x216b55e5(java.util.Collection<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> collection) {
        m6097x216b55e5(collection, false, false);
    }

    /* renamed from: updateUseCases */
    public void m6097x216b55e5(java.util.Collection<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> collection, boolean z17, boolean z18) {
        java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b> map;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b abstractC0756x2f9ad77b;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 mo5190xca0018d6;
        synchronized (this.f2070x6243b38) {
            m6055xc2099e55(collection);
            if (!z17 && m6065x9abff6c5() && m6069x5cfe2a05(collection)) {
                m6097x216b55e5(collection, true, z18);
                return;
            }
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0959xc642f91c m6058x3d75a587 = m6058x3d75a587(collection, z17);
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 m6052xacd46090 = m6052xacd46090(collection, m6058x3d75a587);
            java.util.Collection<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> m6051x1e01a947 = m6051x1e01a947(collection, m6052xacd46090, m6058x3d75a587);
            java.util.ArrayList arrayList = new java.util.ArrayList(m6051x1e01a947);
            arrayList.removeAll(this.f2066xac05ce0e);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(m6051x1e01a947);
            arrayList2.retainAll(this.f2066xac05ce0e);
            java.util.ArrayList arrayList3 = new java.util.ArrayList(this.f2066xac05ce0e);
            arrayList3.removeAll(m6051x1e01a947);
            java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.C0831xfaa2a09d.ConfigPair> m6062x767e213b = m6062x767e213b(arrayList, this.f2062x445b9bd4.m5262x5a4defc7(), this.f2075x1567ef5e);
            java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b> emptyMap = java.util.Collections.emptyMap();
            try {
                java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.C0831xfaa2a09d.ConfigPair> map2 = m6062x767e213b;
                java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b> m6054x19a3b1db = m6054x19a3b1db(m6061x764f0e5e(), this.f2065xe07802cf.mo3091xbefeb46(), arrayList, arrayList2, map2);
                if (this.f2072xfe194869 != null) {
                    int m6061x764f0e5e = m6061x764f0e5e();
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 interfaceC0677x9e0bc522 = this.f2072xfe194869;
                    java.util.Objects.requireNonNull(interfaceC0677x9e0bc522);
                    map = m6054x19a3b1db;
                    emptyMap = m6054x19a3b1db(m6061x764f0e5e, interfaceC0677x9e0bc522.mo3091xbefeb46(), arrayList, arrayList2, map2);
                } else {
                    map = m6054x19a3b1db;
                }
                java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b> map3 = emptyMap;
                m6083x9b882b5e(map, m6051x1e01a947);
                m6082x398613f9(this.f2067x30c92bd5, m6051x1e01a947, collection);
                java.util.Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    ((p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137) it.next()).m4843x51588665(this.f2065xe07802cf);
                }
                this.f2065xe07802cf.mo3086xe116caaf(arrayList3);
                if (this.f2072xfe194869 != null) {
                    java.util.Iterator it6 = arrayList3.iterator();
                    while (it6.hasNext()) {
                        p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 abstractC0580x5a5e3137 = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137) it6.next();
                        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 interfaceC0677x9e0bc5222 = this.f2072xfe194869;
                        java.util.Objects.requireNonNull(interfaceC0677x9e0bc5222);
                        abstractC0580x5a5e3137.m4843x51588665(interfaceC0677x9e0bc5222);
                    }
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 interfaceC0677x9e0bc5223 = this.f2072xfe194869;
                    java.util.Objects.requireNonNull(interfaceC0677x9e0bc5223);
                    interfaceC0677x9e0bc5223.mo3086xe116caaf(arrayList3);
                }
                if (arrayList3.isEmpty()) {
                    java.util.Iterator it7 = arrayList2.iterator();
                    while (it7.hasNext()) {
                        p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 abstractC0580x5a5e31372 = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137) it7.next();
                        if (map.containsKey(abstractC0580x5a5e31372) && (mo5190xca0018d6 = (abstractC0756x2f9ad77b = map.get(abstractC0580x5a5e31372)).mo5190xca0018d6()) != null && m6066x4e770ef3(abstractC0756x2f9ad77b, abstractC0580x5a5e31372.m4826x9951e5c2())) {
                            abstractC0580x5a5e31372.m4846x9b955a37(mo5190xca0018d6);
                            if (this.f2061x451a2531) {
                                this.f2065xe07802cf.mo3100xa9fa723(abstractC0580x5a5e31372);
                                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 interfaceC0677x9e0bc5224 = this.f2072xfe194869;
                                if (interfaceC0677x9e0bc5224 != null) {
                                    java.util.Objects.requireNonNull(interfaceC0677x9e0bc5224);
                                    interfaceC0677x9e0bc5224.mo3100xa9fa723(abstractC0580x5a5e31372);
                                }
                            }
                        }
                    }
                }
                java.util.Iterator it8 = arrayList.iterator();
                while (it8.hasNext()) {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 abstractC0580x5a5e31373 = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137) it8.next();
                    java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.C0831xfaa2a09d.ConfigPair> map4 = map2;
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.C0831xfaa2a09d.ConfigPair configPair = map4.get(abstractC0580x5a5e31373);
                    java.util.Objects.requireNonNull(configPair);
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 interfaceC0677x9e0bc5225 = this.f2072xfe194869;
                    if (interfaceC0677x9e0bc5225 != null) {
                        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 interfaceC0677x9e0bc5226 = this.f2065xe07802cf;
                        java.util.Objects.requireNonNull(interfaceC0677x9e0bc5225);
                        abstractC0580x5a5e31373.m4806x63adb0dd(interfaceC0677x9e0bc5226, interfaceC0677x9e0bc5225, configPair.f2078x2c0c57a8, configPair.f2077x445b9bd4);
                        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b abstractC0756x2f9ad77b2 = map.get(abstractC0580x5a5e31373);
                        abstractC0756x2f9ad77b2.getClass();
                        abstractC0580x5a5e31373.m4845xd1811355(abstractC0756x2f9ad77b2, map3.get(abstractC0580x5a5e31373));
                    } else {
                        abstractC0580x5a5e31373.m4806x63adb0dd(this.f2065xe07802cf, null, configPair.f2078x2c0c57a8, configPair.f2077x445b9bd4);
                        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b abstractC0756x2f9ad77b3 = map.get(abstractC0580x5a5e31373);
                        abstractC0756x2f9ad77b3.getClass();
                        abstractC0580x5a5e31373.m4845xd1811355(abstractC0756x2f9ad77b3, null);
                    }
                    map2 = map4;
                }
                if (this.f2061x451a2531) {
                    this.f2065xe07802cf.mo3082x352acf61(arrayList);
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 interfaceC0677x9e0bc5227 = this.f2072xfe194869;
                    if (interfaceC0677x9e0bc5227 != null) {
                        java.util.Objects.requireNonNull(interfaceC0677x9e0bc5227);
                        interfaceC0677x9e0bc5227.mo3082x352acf61(arrayList);
                    }
                }
                java.util.Iterator it9 = arrayList.iterator();
                while (it9.hasNext()) {
                    ((p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137) it9.next()).m4837x977862c8();
                }
                this.f2060xc42ed090.clear();
                this.f2060xc42ed090.addAll(collection);
                this.f2066xac05ce0e.clear();
                this.f2066xac05ce0e.addAll(m6051x1e01a947);
                this.f2071x6cc27897 = m6052xacd46090;
                this.f2074xf1b1d1cf = m6058x3d75a587;
            } catch (java.lang.IllegalArgumentException e17) {
                if (!z17 && !m6065x9abff6c5() && this.f2063x9969adde.mo4121x7ef94829() != 2) {
                    m6097x216b55e5(collection, true, z18);
                    return;
                }
                throw e17;
            }
        }
    }

    public C0831xfaa2a09d(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 interfaceC0677x9e0bc522, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 interfaceC0677x9e0bc5222, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0748x1bf2244e c0748x1bf2244e, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0748x1bf2244e c0748x1bf2244e2, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0543xcd8e1d8d c0543xcd8e1d8d, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0543xcd8e1d8d c0543xcd8e1d8d2, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p035xa7ffe5b7.InterfaceC0584xe74c66ab interfaceC0584xe74c66ab, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0670x512d391b interfaceC0670x512d391b, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771 interfaceC0769xb8476771) {
        this.f2060xc42ed090 = new java.util.ArrayList();
        this.f2066xac05ce0e = new java.util.ArrayList();
        this.f2067x30c92bd5 = java.util.Collections.emptyList();
        this.f2070x6243b38 = new java.lang.Object();
        this.f2061x451a2531 = true;
        this.f2068x435a1f2 = null;
        this.f2065xe07802cf = interfaceC0677x9e0bc522;
        this.f2072xfe194869 = interfaceC0677x9e0bc5222;
        this.f2069xffa5b3a = c0543xcd8e1d8d;
        this.f2073x2d9ba0d4 = c0543xcd8e1d8d2;
        this.f2063x9969adde = interfaceC0584xe74c66ab;
        this.f2064xb8b15b48 = interfaceC0670x512d391b;
        this.f2075x1567ef5e = interfaceC0769xb8476771;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0665xb691d6e7 m5581xdb9153d = c0748x1bf2244e.m5581xdb9153d();
        this.f2062x445b9bd4 = m5581xdb9153d;
        this.f2057xa37ab776 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0747xdc1301bd(interfaceC0677x9e0bc522.mo3090x8af45b9f(), m5581xdb9153d.m5260xf033da12(null));
        this.f2058x908ff135 = c0748x1bf2244e;
        this.f2059xc63bb885 = c0748x1bf2244e2;
        this.mId = m6059x5f39cbb5(c0748x1bf2244e, c0748x1bf2244e2);
    }
}
