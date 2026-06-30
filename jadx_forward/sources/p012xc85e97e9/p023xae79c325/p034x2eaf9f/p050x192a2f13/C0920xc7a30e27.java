package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13;

/* renamed from: androidx.camera.core.processing.SurfaceProcessorNode */
/* loaded from: classes14.dex */
public class C0920xc7a30e27 implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0900x252222<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0920xc7a30e27.In, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0920xc7a30e27.Out> {
    private static final java.lang.String TAG = "SurfaceProcessorNode";

    /* renamed from: mCameraInternal */
    final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 f2213xe07802cf;

    /* renamed from: mInput */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0920xc7a30e27.In f2214xbe38a35d;

    /* renamed from: mOutput */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0920xc7a30e27.Out f2215x137d3fce;

    /* renamed from: mSurfaceProcessor */
    final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0919xe4c88c62 f2216x3eca3cf2;

    /* renamed from: androidx.camera.core.processing.SurfaceProcessorNode$In */
    /* loaded from: classes14.dex */
    public static abstract class In {
        public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0920xc7a30e27.In of(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea c0905xfc457ea, java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0951xabff0c10> list) {
            return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0877xc04d7200(c0905xfc457ea, list);
        }

        /* renamed from: getOutConfigs */
        public abstract java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0951xabff0c10> mo6265x4b515239();

        /* renamed from: getSurfaceEdge */
        public abstract p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea mo6266x8630f6d4();
    }

    /* renamed from: androidx.camera.core.processing.SurfaceProcessorNode$Out */
    /* loaded from: classes14.dex */
    public static class Out extends java.util.HashMap<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0951xabff0c10, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea> {
    }

    public C0920xc7a30e27(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 interfaceC0677x9e0bc522, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0919xe4c88c62 interfaceC0919xe4c88c62) {
        this.f2213xe07802cf = interfaceC0677x9e0bc522;
        this.f2216x3eca3cf2 = interfaceC0919xe4c88c62;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createAndSendSurfaceOutput, reason: merged with bridge method [inline-methods] */
    public void m6371x309ebdd6(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea c0905xfc457ea, java.util.Map.Entry<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0951xabff0c10, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea> entry) {
        final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea value = entry.getValue();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6007xbba9cc06(value.m6330x68f2e0d5(entry.getKey().mo6438x19771aed(), p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee.CameraInputInfo.of(c0905xfc457ea.m6340xa709b351().mo5191x8ee230a2(), entry.getKey().mo6437xfa2ffe0a(), c0905xfc457ea.m6342x459dfcd() ? this.f2213xe07802cf : null, entry.getKey().mo6439x2a7ffb93(), entry.getKey().mo6444x5a1c61b9()), null), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0813x8ed66b48<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee>() { // from class: androidx.camera.core.processing.SurfaceProcessorNode.1
            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0813x8ed66b48
            /* renamed from: onFailure */
            public void mo3120xee232ab(java.lang.Throwable th6) {
                if (value.m6341xe21cfccc() == 2 && (th6 instanceof java.util.concurrent.CancellationException)) {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0920xc7a30e27.TAG, "Downstream VideoCapture failed to provide Surface.");
                    return;
                }
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.w(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0920xc7a30e27.TAG, "Downstream node failed to provide Surface. Target: " + p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0927xe69ca980.m6383x8dc88bb2(value.m6341xe21cfccc()), th6);
            }

            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0813x8ed66b48
            /* renamed from: onSuccess, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public void mo3121xe05b4124(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee interfaceC0567x42142bee) {
                interfaceC0567x42142bee.getClass();
                try {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0920xc7a30e27.this.f2216x3eca3cf2.mo4775x43e35ccd(interfaceC0567x42142bee);
                } catch (p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0557x4dc3ce5c e17) {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0920xc7a30e27.TAG, "Failed to send SurfaceOutput to SurfaceProcessor.", e17);
                }
            }
        }, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5982x891c9b16());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$release$2 */
    public /* synthetic */ void m6370x7afbb638() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0920xc7a30e27.Out out = this.f2215x137d3fce;
        if (out != null) {
            java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea> it = out.values().iterator();
            while (it.hasNext()) {
                it.next().m6329x5a5ddf8();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setUpRotationUpdates$1 */
    public static /* synthetic */ void m6372xb388d959(java.util.Map map, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42.TransformationInfo transformationInfo) {
        for (java.util.Map.Entry entry : map.entrySet()) {
            int mo4245x2a7ffb93 = transformationInfo.mo4245x2a7ffb93() - ((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0951xabff0c10) entry.getKey()).mo6439x2a7ffb93();
            if (((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0951xabff0c10) entry.getKey()).mo6444x5a1c61b9()) {
                mo4245x2a7ffb93 = -mo4245x2a7ffb93;
            }
            ((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea) entry.getValue()).m6350x3b308432(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0801x6002c4c5.m5974x36f045e2(mo4245x2a7ffb93), -1);
        }
    }

    /* renamed from: sendSurfaceOutputs */
    private void m6373x276153cd(final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea c0905xfc457ea, java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0951xabff0c10, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea> map) {
        for (final java.util.Map.Entry<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0951xabff0c10, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea> entry : map.entrySet()) {
            m6371x309ebdd6(c0905xfc457ea, entry);
            entry.getValue().m6327xeb3c13dd(new java.lang.Runnable() { // from class: androidx.camera.core.processing.SurfaceProcessorNode$$b
                @Override // java.lang.Runnable
                public final void run() {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0920xc7a30e27.this.m6371x309ebdd6(c0905xfc457ea, entry);
                }
            });
        }
    }

    /* renamed from: sendSurfaceRequest */
    private void m6374xaa9e3eca(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea c0905xfc457ea) {
        try {
            this.f2216x3eca3cf2.mo4774x41974102(c0905xfc457ea.m6331x74b8753e(this.f2213xe07802cf));
        } catch (p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0557x4dc3ce5c e17) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "Failed to send SurfaceRequest to SurfaceProcessor.", e17);
        }
    }

    /* renamed from: transformSingleOutput */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea m6375xe38430f5(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea c0905xfc457ea, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0951xabff0c10 abstractC0951xabff0c10) {
        android.graphics.Rect m5967x82ce2e60;
        android.graphics.Rect mo6437xfa2ffe0a = abstractC0951xabff0c10.mo6437xfa2ffe0a();
        int mo6439x2a7ffb93 = abstractC0951xabff0c10.mo6439x2a7ffb93();
        boolean mo6444x5a1c61b9 = abstractC0951xabff0c10.mo6444x5a1c61b9();
        android.graphics.Matrix matrix = new android.graphics.Matrix(c0905xfc457ea.m6339x65554241());
        android.graphics.Matrix m5952xeff629f9 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0801x6002c4c5.m5952xeff629f9(new android.graphics.RectF(mo6437xfa2ffe0a), p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0801x6002c4c5.m5969xd6f79de6(abstractC0951xabff0c10.mo6440xfb854877()), mo6439x2a7ffb93, mo6444x5a1c61b9);
        matrix.postConcat(m5952xeff629f9);
        m3.h.a(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0801x6002c4c5.m5957xe14b5628(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0801x6002c4c5.m5953x492f0cd4(mo6437xfa2ffe0a, mo6439x2a7ffb93), abstractC0951xabff0c10.mo6440xfb854877()));
        if (abstractC0951xabff0c10.mo6445x33146cab()) {
            m3.h.b(abstractC0951xabff0c10.mo6437xfa2ffe0a().contains(c0905xfc457ea.m6334xfa2ffe0a()), java.lang.String.format("Output crop rect %s must contain input crop rect %s", abstractC0951xabff0c10.mo6437xfa2ffe0a(), c0905xfc457ea.m6334xfa2ffe0a()));
            m5967x82ce2e60 = new android.graphics.Rect();
            android.graphics.RectF rectF = new android.graphics.RectF(c0905xfc457ea.m6334xfa2ffe0a());
            m5952xeff629f9.mapRect(rectF);
            rectF.round(m5967x82ce2e60);
        } else {
            m5967x82ce2e60 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0801x6002c4c5.m5967x82ce2e60(abstractC0951xabff0c10.mo6440xfb854877());
        }
        android.graphics.Rect rect = m5967x82ce2e60;
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea(abstractC0951xabff0c10.mo6441xe21cfccc(), abstractC0951xabff0c10.mo6438x19771aed(), c0905xfc457ea.m6340xa709b351().mo5194xaaa148a0().mo5200xbd067eae(abstractC0951xabff0c10.mo6440xfb854877()).mo5196x59bc66e(), matrix, false, rect, c0905xfc457ea.m6338x2a7ffb93() - mo6439x2a7ffb93, -1, c0905xfc457ea.m6346x5a1c61b9() != mo6444x5a1c61b9);
    }

    /* renamed from: getSurfaceProcessor */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0919xe4c88c62 m6376xc08ad9db() {
        return this.f2216x3eca3cf2;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0900x252222
    /* renamed from: release */
    public void mo4945x41012807() {
        this.f2216x3eca3cf2.mo6289x41012807();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5944xc851d2a3(new java.lang.Runnable() { // from class: androidx.camera.core.processing.SurfaceProcessorNode$$c
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0920xc7a30e27.this.m6370x7afbb638();
            }
        });
    }

    /* renamed from: setUpRotationUpdates */
    public void m6377x5ccc730f(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea c0905xfc457ea, final java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0951xabff0c10, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea> map) {
        c0905xfc457ea.m6328x7a5b2547(new m3.a() { // from class: androidx.camera.core.processing.SurfaceProcessorNode$$a
            @Override // m3.a
            /* renamed from: accept */
            public final void mo3938xab27b508(java.lang.Object obj) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0920xc7a30e27.m6372xb388d959(map, (p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42.TransformationInfo) obj);
            }
        });
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0900x252222
    /* renamed from: transform, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0920xc7a30e27.Out mo4948x3ebe6b6c(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0920xc7a30e27.In in6) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        this.f2214xbe38a35d = in6;
        this.f2215x137d3fce = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0920xc7a30e27.Out();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea mo6266x8630f6d4 = in6.mo6266x8630f6d4();
        for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0951xabff0c10 abstractC0951xabff0c10 : in6.mo6265x4b515239()) {
            this.f2215x137d3fce.put(abstractC0951xabff0c10, m6375xe38430f5(mo6266x8630f6d4, abstractC0951xabff0c10));
        }
        m6374xaa9e3eca(mo6266x8630f6d4);
        m6373x276153cd(mo6266x8630f6d4, this.f2215x137d3fce);
        m6377x5ccc730f(mo6266x8630f6d4, this.f2215x137d3fce);
        return this.f2215x137d3fce;
    }
}
