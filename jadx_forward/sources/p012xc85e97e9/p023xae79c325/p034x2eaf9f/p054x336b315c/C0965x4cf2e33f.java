package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.core.streamsharing.VirtualCameraAdapter */
/* loaded from: classes14.dex */
public class C0965x4cf2e33f implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137.StateChangeCallback {

    /* renamed from: mChildren */
    final java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> f2356x87e8058c;

    /* renamed from: mChildrenConfigs */
    private final java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?>> f2358x14066245;

    /* renamed from: mChildrenConfigsMap */
    private final java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?>> f2359x52e6e8d7;

    /* renamed from: mParentCamera */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 f2362xba9c297c;

    /* renamed from: mResolutionsMerger */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0958x27ec5b41 f2364xda09a274;

    /* renamed from: mSecondaryParentCamera */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 f2365xd3260d96;

    /* renamed from: mSecondaryResolutionsMerger */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0958x27ec5b41 f2366xec6c3e9a;

    /* renamed from: mUseCaseConfigFactory */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771 f2367x1567ef5e;

    /* renamed from: mChildrenEdges */
    final java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea> f2360xa434ec2a = new java.util.HashMap();

    /* renamed from: mChildrenVirtualCameras */
    private final java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0964x2f9849f0> f2361xc26a550f = new java.util.HashMap();

    /* renamed from: mChildrenActiveState */
    final java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137, java.lang.Boolean> f2357xc88fbbff = new java.util.HashMap();

    /* renamed from: mParentMetadataCallback */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6 f2363xfe3d062b = m6596x2278b02a();

    public C0965x4cf2e33f(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 interfaceC0677x9e0bc522, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 interfaceC0677x9e0bc5222, java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> set, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771 interfaceC0769xb8476771, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0959xc642f91c.Control control) {
        this.f2362xba9c297c = interfaceC0677x9e0bc522;
        this.f2365xd3260d96 = interfaceC0677x9e0bc5222;
        this.f2367x1567ef5e = interfaceC0769xb8476771;
        this.f2356x87e8058c = set;
        java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?>> m6594xe390cf65 = m6594xe390cf65(interfaceC0677x9e0bc522, set, interfaceC0769xb8476771);
        this.f2359x52e6e8d7 = m6594xe390cf65;
        java.util.HashSet hashSet = new java.util.HashSet(m6594xe390cf65.values());
        this.f2358x14066245 = hashSet;
        this.f2364xda09a274 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0958x27ec5b41(interfaceC0677x9e0bc522, hashSet);
        if (interfaceC0677x9e0bc5222 != null) {
            this.f2366xec6c3e9a = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0958x27ec5b41(interfaceC0677x9e0bc5222, hashSet);
        }
        for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 abstractC0580x5a5e3137 : set) {
            this.f2357xc88fbbff.put(abstractC0580x5a5e3137, java.lang.Boolean.FALSE);
            this.f2361xc26a550f.put(abstractC0580x5a5e3137, new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0964x2f9849f0(interfaceC0677x9e0bc522, this, control));
        }
    }

    /* renamed from: calculateOutConfig */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0951xabff0c10 m6584xc6b87b6a(p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 abstractC0580x5a5e3137, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0958x27ec5b41 c0958x27ec5b41, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 interfaceC0677x9e0bc522, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea c0905xfc457ea, int i17, boolean z17) {
        int mo3173x3b4734f9 = interfaceC0677x9e0bc522.mo4253x764d3969().mo3173x3b4734f9(i17);
        boolean m5959x87092be8 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0801x6002c4c5.m5959x87092be8(c0905xfc457ea.m6339x65554241());
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> interfaceC0768x83509b59 = this.f2359x52e6e8d7.get(abstractC0580x5a5e3137);
        java.util.Objects.requireNonNull(interfaceC0768x83509b59);
        android.util.Pair<android.graphics.Rect, android.util.Size> m6553x9dd3ffac = c0958x27ec5b41.m6553x9dd3ffac(interfaceC0768x83509b59, c0905xfc457ea.m6334xfa2ffe0a(), p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0801x6002c4c5.m5954x2a7ffb93(c0905xfc457ea.m6339x65554241()), z17);
        android.graphics.Rect rect = (android.graphics.Rect) m6553x9dd3ffac.first;
        android.util.Size size = (android.util.Size) m6553x9dd3ffac.second;
        int m6587x9dc44d83 = m6587x9dc44d83(abstractC0580x5a5e3137, this.f2362xba9c297c);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0964x2f9849f0 c0964x2f9849f0 = this.f2361xc26a550f.get(abstractC0580x5a5e3137);
        java.util.Objects.requireNonNull(c0964x2f9849f0);
        c0964x2f9849f0.m6583x61569507(m6587x9dc44d83);
        int m5974x36f045e2 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0801x6002c4c5.m5974x36f045e2((c0905xfc457ea.m6338x2a7ffb93() + m6587x9dc44d83) - mo3173x3b4734f9);
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0951xabff0c10.of(m6589x362e3471(abstractC0580x5a5e3137), m6586x76e1dafd(abstractC0580x5a5e3137), rect, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0801x6002c4c5.m5966xfb4e0bfc(size, m5974x36f045e2), m5974x36f045e2, abstractC0580x5a5e3137.m4832x7e0b2878(interfaceC0677x9e0bc522) ^ m5959x87092be8);
    }

    /* renamed from: forceSetProvider */
    private static void m6585x4fe75088(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea c0905xfc457ea, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293 abstractC0697x654a0293, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 c0750xb915958) {
        c0905xfc457ea.m6344x92d0313b();
        try {
            c0905xfc457ea.m6348x3bb6a473(abstractC0697x654a0293);
        } catch (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293.SurfaceClosedException unused) {
            if (c0750xb915958.m5590xd86d2f26() != null) {
                c0750xb915958.m5590xd86d2f26().mo3491xaf8aa769(c0750xb915958, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.SessionError.SESSION_ERROR_SURFACE_NEEDS_RESET);
            }
        }
    }

    /* renamed from: getChildFormat */
    private static int m6586x76e1dafd(p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 abstractC0580x5a5e3137) {
        return abstractC0580x5a5e3137 instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b ? 256 : 34;
    }

    /* renamed from: getChildRotationDegrees */
    private int m6587x9dc44d83(p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 abstractC0580x5a5e3137, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 interfaceC0677x9e0bc522) {
        return interfaceC0677x9e0bc522.mo4253x764d3969().mo3173x3b4734f9(((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e) abstractC0580x5a5e3137.m4814x27802a65()).m5495x8d4b9125(0));
    }

    /* renamed from: getChildSurface */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293 m6588x1f446a67(p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 abstractC0580x5a5e3137) {
        java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293> m5601x1b8de6dc = abstractC0580x5a5e3137 instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b ? abstractC0580x5a5e3137.m4826x9951e5c2().m5601x1b8de6dc() : abstractC0580x5a5e3137.m4826x9951e5c2().m5597x57482ff7().m5335x1b8de6dc();
        m3.h.e(m5601x1b8de6dc.size() <= 1, null);
        if (m5601x1b8de6dc.size() == 1) {
            return m5601x1b8de6dc.get(0);
        }
        return null;
    }

    /* renamed from: getChildTargetType */
    private static int m6589x362e3471(p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 abstractC0580x5a5e3137) {
        if (abstractC0580x5a5e3137 instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0551x50417ba8) {
            return 1;
        }
        return abstractC0580x5a5e3137 instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b ? 4 : 2;
    }

    /* renamed from: getHighestSurfacePriority */
    private static int m6590xbe3bef23(java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?>> set) {
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?>> it = set.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            i17 = java.lang.Math.max(i17, it.next().m5752xb7c2e55a(0));
        }
        return i17;
    }

    /* renamed from: getUseCaseEdge */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea m6591x27723e7e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 abstractC0580x5a5e3137) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea c0905xfc457ea = this.f2360xa434ec2a.get(abstractC0580x5a5e3137);
        java.util.Objects.requireNonNull(c0905xfc457ea);
        return c0905xfc457ea;
    }

    /* renamed from: isUseCaseActive */
    private boolean m6592xd0e0be33(p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 abstractC0580x5a5e3137) {
        java.lang.Boolean bool = this.f2357xc88fbbff.get(abstractC0580x5a5e3137);
        java.util.Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    /* renamed from: sendCameraCaptureResultToChild */
    public static void m6593x4e2c1f4b(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be interfaceC0663xe081a7be, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 c0750xb915958, int i17) {
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6> it = c0750xb915958.m5596x26db407e().iterator();
        while (it.hasNext()) {
            it.next().mo3016x34cad1a4(i17, new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0966x87d7faf3(c0750xb915958.m5597x57482ff7().m5336x4aa7b206(), interfaceC0663xe081a7be));
        }
    }

    /* renamed from: toChildrenConfigsMap */
    private static java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?>> m6594xe390cf65(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 interfaceC0677x9e0bc522, java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> set, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771 interfaceC0769xb8476771) {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 abstractC0580x5a5e3137 : set) {
            hashMap.put(abstractC0580x5a5e3137, abstractC0580x5a5e3137.m4833xcdb2a19(interfaceC0677x9e0bc522.mo3091xbefeb46(), null, abstractC0580x5a5e3137.mo4420xdbd48d2d(true, interfaceC0769xb8476771)));
        }
        return hashMap;
    }

    /* renamed from: bindChildren */
    public void m6595x4cdd595c() {
        for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 abstractC0580x5a5e3137 : this.f2356x87e8058c) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0964x2f9849f0 c0964x2f9849f0 = this.f2361xc26a550f.get(abstractC0580x5a5e3137);
            java.util.Objects.requireNonNull(c0964x2f9849f0);
            abstractC0580x5a5e3137.m4806x63adb0dd(c0964x2f9849f0, null, null, abstractC0580x5a5e3137.mo4420xdbd48d2d(true, this.f2367x1567ef5e));
        }
    }

    /* renamed from: createCameraCaptureCallback */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6 m6596x2278b02a() {
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6() { // from class: androidx.camera.core.streamsharing.VirtualCameraAdapter.1
            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6
            /* renamed from: onCaptureCompleted */
            public void mo3016x34cad1a4(int i17, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be interfaceC0663xe081a7be) {
                super.mo3016x34cad1a4(i17, interfaceC0663xe081a7be);
                java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> it = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0965x4cf2e33f.this.f2356x87e8058c.iterator();
                while (it.hasNext()) {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0965x4cf2e33f.m6593x4e2c1f4b(interfaceC0663xe081a7be, it.next().m4826x9951e5c2(), i17);
                }
            }
        };
    }

    /* renamed from: getChildren */
    public java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> m6597xdec49b75() {
        return this.f2356x87e8058c;
    }

    /* renamed from: getChildrenOutConfigs */
    public java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0951xabff0c10> m6598x92670398(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea c0905xfc457ea, int i17, boolean z17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 abstractC0580x5a5e3137 : this.f2356x87e8058c) {
            hashMap.put(abstractC0580x5a5e3137, m6584xc6b87b6a(abstractC0580x5a5e3137, this.f2364xda09a274, this.f2362xba9c297c, c0905xfc457ea, i17, z17));
        }
        return hashMap;
    }

    /* renamed from: getParentMetadataCallback */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6 m6600xa1a49054() {
        return this.f2363xfe3d062b;
    }

    /* renamed from: mergeChildrenConfigs */
    public void m6601xc8e74f1a(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0730x35b9a1e8 interfaceC0730x35b9a1e8) {
        interfaceC0730x35b9a1e8.mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.f1690x228c71, this.f2364xda09a274.m6550x801375c5(interfaceC0730x35b9a1e8));
        interfaceC0730x35b9a1e8.mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.f1835x80437872, java.lang.Integer.valueOf(m6590xbe3bef23(this.f2358x14066245)));
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e m6512x782d8c4a = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0957x908e9ef3.m6512x782d8c4a(this.f2358x14066245);
        if (m6512x782d8c4a == null) {
            throw new java.lang.IllegalArgumentException("Failed to merge child dynamic ranges, can not find a dynamic range that satisfies all children.");
        }
        interfaceC0730x35b9a1e8.mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0716x5f72b371.f1686x1d477a5e, m6512x782d8c4a);
        for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 abstractC0580x5a5e3137 : this.f2356x87e8058c) {
            if (abstractC0580x5a5e3137.m4814x27802a65().m5755x96948bdd() != 0) {
                interfaceC0730x35b9a1e8.mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.f1837x7f07e711, java.lang.Integer.valueOf(abstractC0580x5a5e3137.m4814x27802a65().m5755x96948bdd()));
            }
            if (abstractC0580x5a5e3137.m4814x27802a65().m5748x732bab0() != 0) {
                interfaceC0730x35b9a1e8.mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.f1833xf56d3424, java.lang.Integer.valueOf(abstractC0580x5a5e3137.m4814x27802a65().m5748x732bab0()));
            }
        }
    }

    /* renamed from: notifyStateAttached */
    public void m6602xcb63fc8c() {
        for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 abstractC0580x5a5e3137 : this.f2356x87e8058c) {
            abstractC0580x5a5e3137.mo4839x934f69b6();
            abstractC0580x5a5e3137.mo4543xec538e4a();
        }
    }

    /* renamed from: notifyStateDetached */
    public void m6603xe98a0a5a() {
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> it = this.f2356x87e8058c.iterator();
        while (it.hasNext()) {
            it.next().mo4544xb1757784();
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137.StateChangeCallback
    /* renamed from: onUseCaseActive */
    public void mo3097x82b04b9e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 abstractC0580x5a5e3137) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        if (m6592xd0e0be33(abstractC0580x5a5e3137)) {
            return;
        }
        this.f2357xc88fbbff.put(abstractC0580x5a5e3137, java.lang.Boolean.TRUE);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293 m6588x1f446a67 = m6588x1f446a67(abstractC0580x5a5e3137);
        if (m6588x1f446a67 != null) {
            m6585x4fe75088(m6591x27723e7e(abstractC0580x5a5e3137), m6588x1f446a67, abstractC0580x5a5e3137.m4826x9951e5c2());
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137.StateChangeCallback
    /* renamed from: onUseCaseInactive */
    public void mo3098xfbf86303(p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 abstractC0580x5a5e3137) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        if (m6592xd0e0be33(abstractC0580x5a5e3137)) {
            this.f2357xc88fbbff.put(abstractC0580x5a5e3137, java.lang.Boolean.FALSE);
            m6591x27723e7e(abstractC0580x5a5e3137).m6333x1f9d589c();
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137.StateChangeCallback
    /* renamed from: onUseCaseReset */
    public void mo3099xdbdd5db7(p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 abstractC0580x5a5e3137) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293 m6588x1f446a67;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea m6591x27723e7e = m6591x27723e7e(abstractC0580x5a5e3137);
        if (m6592xd0e0be33(abstractC0580x5a5e3137) && (m6588x1f446a67 = m6588x1f446a67(abstractC0580x5a5e3137)) != null) {
            m6585x4fe75088(m6591x27723e7e, m6588x1f446a67, abstractC0580x5a5e3137.m4826x9951e5c2());
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137.StateChangeCallback
    /* renamed from: onUseCaseUpdated */
    public void mo3100xa9fa723(p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 abstractC0580x5a5e3137) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        if (m6592xd0e0be33(abstractC0580x5a5e3137)) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea m6591x27723e7e = m6591x27723e7e(abstractC0580x5a5e3137);
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293 m6588x1f446a67 = m6588x1f446a67(abstractC0580x5a5e3137);
            if (m6588x1f446a67 != null) {
                m6585x4fe75088(m6591x27723e7e, m6588x1f446a67, abstractC0580x5a5e3137.m4826x9951e5c2());
            } else {
                m6591x27723e7e.m6333x1f9d589c();
            }
        }
    }

    /* renamed from: resetChildren */
    public void m6604x18ec206e() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> it = this.f2356x87e8058c.iterator();
        while (it.hasNext()) {
            mo3099xdbdd5db7(it.next());
        }
    }

    /* renamed from: setChildrenEdges */
    public void m6605x995d0655(java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea> map) {
        this.f2360xa434ec2a.clear();
        this.f2360xa434ec2a.putAll(map);
        for (java.util.Map.Entry<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea> entry : this.f2360xa434ec2a.entrySet()) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 key = entry.getKey();
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea value = entry.getValue();
            key.mo4437x8c0c67fc(value.m6334xfa2ffe0a());
            key.mo4435x6864fd6(value.m6339x65554241());
            key.m4845xd1811355(value.m6340xa709b351(), null);
            key.m4837x977862c8();
        }
    }

    /* renamed from: unbindChildren */
    public void m6606x3874a75() {
        for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 abstractC0580x5a5e3137 : this.f2356x87e8058c) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0964x2f9849f0 c0964x2f9849f0 = this.f2361xc26a550f.get(abstractC0580x5a5e3137);
            java.util.Objects.requireNonNull(c0964x2f9849f0);
            abstractC0580x5a5e3137.m4843x51588665(c0964x2f9849f0);
        }
    }

    /* renamed from: getChildrenOutConfigs */
    public java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p051xa7ffe5b7.AbstractC0931x4a0cef4> m6599x92670398(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea c0905xfc457ea, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea c0905xfc457ea2, int i17, boolean z17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 abstractC0580x5a5e3137 : this.f2356x87e8058c) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0951xabff0c10 m6584xc6b87b6a = m6584xc6b87b6a(abstractC0580x5a5e3137, this.f2364xda09a274, this.f2362xba9c297c, c0905xfc457ea, i17, z17);
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p054x336b315c.C0958x27ec5b41 c0958x27ec5b41 = this.f2366xec6c3e9a;
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 interfaceC0677x9e0bc522 = this.f2365xd3260d96;
            java.util.Objects.requireNonNull(interfaceC0677x9e0bc522);
            hashMap.put(abstractC0580x5a5e3137, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p051xa7ffe5b7.AbstractC0931x4a0cef4.of(m6584xc6b87b6a, m6584xc6b87b6a(abstractC0580x5a5e3137, c0958x27ec5b41, interfaceC0677x9e0bc522, c0905xfc457ea2, i17, z17)));
        }
        return hashMap;
    }
}
