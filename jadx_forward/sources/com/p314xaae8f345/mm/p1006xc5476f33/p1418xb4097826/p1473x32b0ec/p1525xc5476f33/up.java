package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes.dex */
public final class up extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f196142d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dq f196143e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public up(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dq dqVar) {
        super(0);
        this.f196142d = str;
        this.f196143e = dqVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str = this.f196142d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftSendPlugin", "showConsumeFailDialog, errMsg".concat(str == null ? "null" : str));
        android.content.Context context = this.f196143e.f446856d.getContext();
        if (str == null || str.length() == 0) {
            str = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ek7);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context);
        u1Var.g(str);
        u1Var.n(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dhn));
        u1Var.q(false);
        return jz5.f0.f384359a;
    }
}
