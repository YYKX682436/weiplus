package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p051xa7ffe5b7;

/* renamed from: androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode */
/* loaded from: classes14.dex */
public class C0943xe9eb54c3 implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0900x252222<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p051xa7ffe5b7.C0943xe9eb54c3.In, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p051xa7ffe5b7.C0943xe9eb54c3.Out> {
    private static final java.lang.String TAG = "DualSurfaceProcessorNode";

    /* renamed from: mInput */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p051xa7ffe5b7.C0943xe9eb54c3.In f2242xbe38a35d;

    /* renamed from: mOutput */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p051xa7ffe5b7.C0943xe9eb54c3.Out f2243x137d3fce;

    /* renamed from: mPrimaryCameraInternal */
    final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 f2244x83e0ed37;

    /* renamed from: mSecondaryCameraInternal */
    final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 f2245xfe194869;

    /* renamed from: mSurfaceProcessor */
    final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0919xe4c88c62 f2246x3eca3cf2;

    /* renamed from: androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode$In */
    /* loaded from: classes14.dex */
    public static abstract class In {
        public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p051xa7ffe5b7.C0943xe9eb54c3.In of(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea c0905xfc457ea, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea c0905xfc457ea2, java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p051xa7ffe5b7.AbstractC0931x4a0cef4> list) {
            return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p051xa7ffe5b7.C0929x5633cc64(c0905xfc457ea, c0905xfc457ea2, list);
        }

        /* renamed from: getOutConfigs */
        public abstract java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p051xa7ffe5b7.AbstractC0931x4a0cef4> mo6393x4b515239();

        /* renamed from: getPrimarySurfaceEdge */
        public abstract p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea mo6394x4432369e();

        /* renamed from: getSecondarySurfaceEdge */
        public abstract p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea mo6395x6249f26c();
    }

    /* renamed from: androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode$Out */
    /* loaded from: classes14.dex */
    public static class Out extends java.util.HashMap<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p051xa7ffe5b7.AbstractC0931x4a0cef4, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea> {
    }

    public C0943xe9eb54c3(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 interfaceC0677x9e0bc522, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 interfaceC0677x9e0bc5222, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0919xe4c88c62 interfaceC0919xe4c88c62) {
        this.f2244x83e0ed37 = interfaceC0677x9e0bc522;
        this.f2245xfe194869 = interfaceC0677x9e0bc5222;
        this.f2246x3eca3cf2 = interfaceC0919xe4c88c62;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createAndSendSurfaceOutput, reason: merged with bridge method [inline-methods] */
    public void m6420x309ebdd6(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 interfaceC0677x9e0bc522, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 interfaceC0677x9e0bc5222, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea c0905xfc457ea, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea c0905xfc457ea2, java.util.Map.Entry<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p051xa7ffe5b7.AbstractC0931x4a0cef4, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea> entry) {
        final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea value = entry.getValue();
        android.util.Size mo5191x8ee230a2 = c0905xfc457ea.m6340xa709b351().mo5191x8ee230a2();
        android.graphics.Rect mo6437xfa2ffe0a = entry.getKey().mo6388xe7fd07c4().mo6437xfa2ffe0a();
        if (!c0905xfc457ea.m6342x459dfcd()) {
            interfaceC0677x9e0bc522 = null;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee.CameraInputInfo of6 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee.CameraInputInfo.of(mo5191x8ee230a2, mo6437xfa2ffe0a, interfaceC0677x9e0bc522, entry.getKey().mo6388xe7fd07c4().mo6439x2a7ffb93(), entry.getKey().mo6388xe7fd07c4().mo6444x5a1c61b9());
        android.util.Size mo5191x8ee230a22 = c0905xfc457ea2.m6340xa709b351().mo5191x8ee230a2();
        android.graphics.Rect mo6437xfa2ffe0a2 = entry.getKey().mo6389xf8cd5f12().mo6437xfa2ffe0a();
        if (!c0905xfc457ea2.m6342x459dfcd()) {
            interfaceC0677x9e0bc5222 = null;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6007xbba9cc06(value.m6330x68f2e0d5(entry.getKey().mo6388xe7fd07c4().mo6438x19771aed(), of6, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee.CameraInputInfo.of(mo5191x8ee230a22, mo6437xfa2ffe0a2, interfaceC0677x9e0bc5222, entry.getKey().mo6389xf8cd5f12().mo6439x2a7ffb93(), entry.getKey().mo6389xf8cd5f12().mo6444x5a1c61b9())), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0813x8ed66b48<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee>() { // from class: androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode.1
            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0813x8ed66b48
            /* renamed from: onFailure */
            public void mo3120xee232ab(java.lang.Throwable th6) {
                if (value.m6341xe21cfccc() == 2 && (th6 instanceof java.util.concurrent.CancellationException)) {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p051xa7ffe5b7.C0943xe9eb54c3.TAG, "Downstream VideoCapture failed to provide Surface.");
                    return;
                }
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.w(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p051xa7ffe5b7.C0943xe9eb54c3.TAG, "Downstream node failed to provide Surface. Target: " + p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0927xe69ca980.m6383x8dc88bb2(value.m6341xe21cfccc()), th6);
            }

            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0813x8ed66b48
            /* renamed from: onSuccess, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public void mo3121xe05b4124(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0567x42142bee interfaceC0567x42142bee) {
                interfaceC0567x42142bee.getClass();
                try {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p051xa7ffe5b7.C0943xe9eb54c3.this.f2246x3eca3cf2.mo4775x43e35ccd(interfaceC0567x42142bee);
                } catch (p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0557x4dc3ce5c e17) {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p051xa7ffe5b7.C0943xe9eb54c3.TAG, "Failed to send SurfaceOutput to SurfaceProcessor.", e17);
                }
            }
        }, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5982x891c9b16());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$release$1 */
    public /* synthetic */ void m6419x7afbb637() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p051xa7ffe5b7.C0943xe9eb54c3.Out out = this.f2243x137d3fce;
        if (out != null) {
            java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea> it = out.values().iterator();
            while (it.hasNext()) {
                it.next().m6329x5a5ddf8();
            }
        }
    }

    /* renamed from: sendSurfaceOutputs */
    private void m6421x276153cd(final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 interfaceC0677x9e0bc522, final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 interfaceC0677x9e0bc5222, final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea c0905xfc457ea, final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea c0905xfc457ea2, java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p051xa7ffe5b7.AbstractC0931x4a0cef4, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea> map) {
        for (final java.util.Map.Entry<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p051xa7ffe5b7.AbstractC0931x4a0cef4, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea> entry : map.entrySet()) {
            m6420x309ebdd6(interfaceC0677x9e0bc522, interfaceC0677x9e0bc5222, c0905xfc457ea, c0905xfc457ea2, entry);
            entry.getValue().m6327xeb3c13dd(new java.lang.Runnable() { // from class: androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode$$b
                @Override // java.lang.Runnable
                public final void run() {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p051xa7ffe5b7.C0943xe9eb54c3.this.m6420x309ebdd6(interfaceC0677x9e0bc522, interfaceC0677x9e0bc5222, c0905xfc457ea, c0905xfc457ea2, entry);
                }
            });
        }
    }

    /* renamed from: sendSurfaceRequest */
    private void m6422xaa9e3eca(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 interfaceC0677x9e0bc522, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea c0905xfc457ea, java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p051xa7ffe5b7.AbstractC0931x4a0cef4, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea> map, boolean z17) {
        try {
            this.f2246x3eca3cf2.mo4774x41974102(c0905xfc457ea.m6332x74b8753e(interfaceC0677x9e0bc522, z17));
        } catch (p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0557x4dc3ce5c e17) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "Failed to send SurfaceRequest to SurfaceProcessor.", e17);
        }
    }

    /* renamed from: transformSingleOutput */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea m6423xe38430f5(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea c0905xfc457ea, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0951xabff0c10 abstractC0951xabff0c10) {
        android.graphics.Rect mo6437xfa2ffe0a = abstractC0951xabff0c10.mo6437xfa2ffe0a();
        int mo6439x2a7ffb93 = abstractC0951xabff0c10.mo6439x2a7ffb93();
        boolean mo6444x5a1c61b9 = abstractC0951xabff0c10.mo6444x5a1c61b9();
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        m3.h.a(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0801x6002c4c5.m5957xe14b5628(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0801x6002c4c5.m5953x492f0cd4(mo6437xfa2ffe0a, mo6439x2a7ffb93), abstractC0951xabff0c10.mo6440xfb854877()));
        android.graphics.Rect m5967x82ce2e60 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0801x6002c4c5.m5967x82ce2e60(abstractC0951xabff0c10.mo6440xfb854877());
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea(abstractC0951xabff0c10.mo6441xe21cfccc(), abstractC0951xabff0c10.mo6438x19771aed(), c0905xfc457ea.m6340xa709b351().mo5194xaaa148a0().mo5200xbd067eae(abstractC0951xabff0c10.mo6440xfb854877()).mo5196x59bc66e(), matrix, false, m5967x82ce2e60, c0905xfc457ea.m6338x2a7ffb93() - mo6439x2a7ffb93, -1, c0905xfc457ea.m6346x5a1c61b9() != mo6444x5a1c61b9);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0900x252222
    /* renamed from: release */
    public void mo4945x41012807() {
        this.f2246x3eca3cf2.mo6289x41012807();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5944xc851d2a3(new java.lang.Runnable() { // from class: androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode$$a
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p051xa7ffe5b7.C0943xe9eb54c3.this.m6419x7afbb637();
            }
        });
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0900x252222
    /* renamed from: transform, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p051xa7ffe5b7.C0943xe9eb54c3.Out mo4948x3ebe6b6c(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p051xa7ffe5b7.C0943xe9eb54c3.In in6) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        this.f2242xbe38a35d = in6;
        this.f2243x137d3fce = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p051xa7ffe5b7.C0943xe9eb54c3.Out();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea mo6394x4432369e = this.f2242xbe38a35d.mo6394x4432369e();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea mo6395x6249f26c = this.f2242xbe38a35d.mo6395x6249f26c();
        for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p051xa7ffe5b7.AbstractC0931x4a0cef4 abstractC0931x4a0cef4 : this.f2242xbe38a35d.mo6393x4b515239()) {
            this.f2243x137d3fce.put(abstractC0931x4a0cef4, m6423xe38430f5(mo6394x4432369e, abstractC0931x4a0cef4.mo6388xe7fd07c4()));
        }
        m6422xaa9e3eca(this.f2244x83e0ed37, mo6394x4432369e, this.f2243x137d3fce, true);
        m6422xaa9e3eca(this.f2245xfe194869, mo6395x6249f26c, this.f2243x137d3fce, false);
        m6421x276153cd(this.f2244x83e0ed37, this.f2245xfe194869, mo6394x4432369e, mo6395x6249f26c, this.f2243x137d3fce);
        return this.f2243x137d3fce;
    }
}
