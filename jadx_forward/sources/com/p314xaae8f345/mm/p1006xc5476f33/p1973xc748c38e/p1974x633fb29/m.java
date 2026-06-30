package com.p314xaae8f345.mm.p1006xc5476f33.p1973xc748c38e.p1974x633fb29;

/* loaded from: classes15.dex */
public class m implements l81.e1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1973xc748c38e.p1974x633fb29.o f236498a;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1973xc748c38e.p1974x633fb29.o oVar) {
        this.f236498a = oVar;
    }

    @Override // l81.e1
    public void a() {
    }

    @Override // l81.e1
    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.scanner.GetA8KeyRedirect", "onAppBrandPreconditionError");
        ((e04.p) ((com.p314xaae8f345.mm.p1006xc5476f33.p1973xc748c38e.p1974x633fb29.h) this.f236498a).f236494a).D(false);
    }

    @Override // l81.e1
    public void d(java.lang.String str) {
    }

    @Override // l81.e1
    public void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.scanner.GetA8KeyRedirect", "onAppBrandUIEnter");
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.C12573x6a664d3b> abstractC20980x9b9ad01d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.C12573x6a664d3b>(a0Var) { // from class: com.tencent.mm.plugin.qrcode.model.GetA8KeyRedirect$9$1
            {
                this.f39173x3fe91575 = 551436157;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.C12573x6a664d3b c12573x6a664d3b) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.scanner.GetA8KeyRedirect", "AppBrandUIEnterAnimationCompleteEvent callback");
                ((e04.p) ((com.p314xaae8f345.mm.p1006xc5476f33.p1973xc748c38e.p1974x633fb29.h) com.p314xaae8f345.mm.p1006xc5476f33.p1973xc748c38e.p1974x633fb29.m.this.f236498a).f236494a).D(false);
                com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d2 = com.p314xaae8f345.mm.p1006xc5476f33.p1973xc748c38e.p1974x633fb29.p.f236500b;
                if (abstractC20980x9b9ad01d2 == null) {
                    return true;
                }
                abstractC20980x9b9ad01d2.mo48814x2efc64();
                com.p314xaae8f345.mm.p1006xc5476f33.p1973xc748c38e.p1974x633fb29.p.f236500b = null;
                return true;
            }
        };
        com.p314xaae8f345.mm.p1006xc5476f33.p1973xc748c38e.p1974x633fb29.p.f236500b = abstractC20980x9b9ad01d;
        abstractC20980x9b9ad01d.mo48813x58998cd();
    }

    @Override // l81.e1
    public void f(boolean z17) {
    }
}
