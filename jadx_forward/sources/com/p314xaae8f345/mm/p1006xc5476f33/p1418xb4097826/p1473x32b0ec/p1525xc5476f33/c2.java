package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class c2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ km2.b f193628d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v3 f193629e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(km2.b bVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v3 v3Var) {
        super(0);
        this.f193628d = bVar;
        this.f193629e = v3Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        km2.b bVar = this.f193628d;
        r45.nw1 nw1Var = bVar.f390603t;
        if (nw1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.LiveAnchorAfterPlugin", "handleUserActionForReplayStatusAuditing:liveInfo is null");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveAnchorAfterPlugin", "replayStatus:" + java.lang.Integer.valueOf(nw1Var.m75939xb282bd08(31)));
            r45.nw1 nw1Var2 = bVar.f390603t;
            java.lang.Integer valueOf = nw1Var2 != null ? java.lang.Integer.valueOf(nw1Var2.m75939xb282bd08(31)) : null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v3 v3Var = this.f193629e;
            if (valueOf != null && valueOf.intValue() == 3) {
                if (v3Var.W == null) {
                    android.content.Context context = v3Var.f446856d.getContext();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                    v3Var.W = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.wt(context, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.k3(v3Var));
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveAnchorAfterPlugin", "showReplayCancelTipWidget");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.wt wtVar = v3Var.W;
                if (wtVar != null) {
                    wtVar.w();
                }
            } else if (valueOf != null && valueOf.intValue() == 1) {
                v3Var.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(v3Var, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.b2(v3Var, bVar, null), 3, null);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.LiveAnchorAfterPlugin", "handleUserActionForReplayStatusAuditing,but replay_status is unexpected");
            }
        }
        return jz5.f0.f384359a;
    }
}
