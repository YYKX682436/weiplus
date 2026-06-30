package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class df extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg f193819d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public df(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar) {
        super(1);
        this.f193819d = mgVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String msgId = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgId, "msgId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveCommentPlugin", "onHotCommentDismiss, ".concat(msgId));
        mm2.u0 u0Var = (mm2.u0) this.f193819d.P0(mm2.u0.class);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveCommentSlice", "onHotWordDismiss, id:".concat(msgId));
        pm0.v.X(new mm2.r0(u0Var, msgId));
        u0Var.f410986s = null;
        return jz5.f0.f384359a;
    }
}
