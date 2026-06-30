package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes5.dex */
public final class b6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f284989d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f284990e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f284991f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6(yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str) {
        super(0);
        this.f284989d = dVar;
        this.f284990e = f9Var;
        this.f284991f = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgEcsKFDynamicCardViewHolder", "get card height");
        yb5.d dVar = this.f284989d;
        if (dVar != null && (f9Var = this.f284990e) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgEcsKFDynamicCardViewHolder", "enable scrollToLastProtect");
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 q57 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().q5(this.f284991f);
            if (q57 != null && q57.m124847x74d37ac6() == f9Var.m124847x74d37ac6()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgEcsKFDynamicCardViewHolder", "is last item, scrollToLastProtect");
                dVar.M(true, true, true);
            }
        }
        return jz5.f0.f384359a;
    }
}
