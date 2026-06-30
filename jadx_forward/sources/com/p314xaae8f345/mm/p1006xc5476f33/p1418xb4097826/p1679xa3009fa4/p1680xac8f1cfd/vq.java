package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class vq extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.hs f217796d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f217797e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.zk2 f217798f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vq(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.hs hsVar, in5.s0 s0Var, r45.zk2 zk2Var) {
        super(0);
        this.f217796d = hsVar;
        this.f217797e = s0Var;
        this.f217798f = zk2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.hs hsVar = this.f217796d;
        hsVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("popupSurveyLayout questionStyle=");
        r45.zk2 zk2Var = this.f217798f;
        sb6.append(zk2Var.m75939xb282bd08(3));
        sb6.append(" questionType=");
        sb6.append(zk2Var.m75939xb282bd08(4));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderNpsSurveyUIC", sb6.toString());
        int m75939xb282bd08 = zk2Var.m75939xb282bd08(4);
        in5.s0 s0Var = this.f217797e;
        if (m75939xb282bd08 == 2) {
            hsVar.m7(s0Var, zk2Var, null);
        } else if (zk2Var.m75939xb282bd08(4) == 1 && zk2Var.m75939xb282bd08(3) == 2) {
            hsVar.n7(s0Var, zk2Var, null);
        } else if (zk2Var.m75939xb282bd08(4) == 1 && zk2Var.m75939xb282bd08(3) == 1) {
            hsVar.l7(s0Var, zk2Var, null);
        }
        return jz5.f0.f384359a;
    }
}
