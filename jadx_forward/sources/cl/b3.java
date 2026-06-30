package cl;

/* loaded from: classes7.dex */
public class b3 implements com.p159x477cd522.p160x333422.InterfaceC1456x656040a7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f124135a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.List f124136b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0 f124137c;

    public b3(cl.l3 l3Var, java.lang.ref.WeakReference weakReference, java.util.List list, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0 c0Var) {
        this.f124135a = weakReference;
        this.f124136b = list;
        this.f124137c = c0Var;
    }

    @Override // com.p159x477cd522.p160x333422.InterfaceC1456x656040a7
    /* renamed from: invoke */
    public java.lang.Object mo15014xb9724478(com.p159x477cd522.p160x333422.C1477x4679881 c1477x4679881, com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd7) {
        java.lang.String mo16298x2fec8307 = c1469x28b0ccd7.mo16298x2fec8307(0);
        java.lang.String mo16298x2fec83072 = c1469x28b0ccd7.mo16298x2fec8307(1);
        int mo16294xb282bd08 = c1469x28b0ccd7.mo16294xb282bd08(2);
        java.lang.String mo16298x2fec83073 = (c1469x28b0ccd7.mo16304xbe0e3ae6() < 4 || c1469x28b0ccd7.mo16302xfb85f7b0(3) != 4) ? "" : c1469x28b0ccd7.mo16298x2fec8307(3);
        java.lang.ref.WeakReference weakReference = this.f124135a;
        if (weakReference.get() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.V8EngineWorkerManager", "hy: component lost. stop dispatch");
            return "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m mVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m) weakReference.get();
        java.util.List list = this.f124136b;
        if (list != null && list.contains(mo16298x2fec8307)) {
            return mVar.q0(mo16298x2fec8307, mo16298x2fec83072, mo16298x2fec83073, mo16294xb282bd08, false, this.f124137c, -1);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.V8EngineWorkerManager", "hy: calling not permitted api: %s", mo16298x2fec8307);
        mVar.d0(mo16294xb282bd08, mVar.s0(mo16298x2fec8307, "fail:not supported"), this.f124137c);
        return "fail:not supported";
    }
}
