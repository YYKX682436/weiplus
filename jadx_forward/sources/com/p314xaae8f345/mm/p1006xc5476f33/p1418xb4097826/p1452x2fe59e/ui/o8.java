package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes8.dex */
public final class o8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13996x5a58c237 f191899d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f191900e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f191901f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o8(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13996x5a58c237 activityC13996x5a58c237, int i17, java.lang.String str) {
        super(0);
        this.f191899d = activityC13996x5a58c237;
        this.f191900e = i17;
        this.f191901f = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13996x5a58c237.S;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13996x5a58c237 activityC13996x5a58c237 = this.f191899d;
        boolean z17 = true;
        activityC13996x5a58c237.e7(true);
        if (this.f191900e == -200066) {
            java.lang.String str = this.f191901f;
            if (str != null && str.length() != 0) {
                z17 = false;
            }
            if (z17) {
                str = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dbk);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(activityC13996x5a58c237.mo55332x76847179());
            u1Var.g(str);
            java.lang.String string = activityC13996x5a58c237.mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d3z);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            u1Var.n(string);
            u1Var.l(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.a9(activityC13996x5a58c237));
            u1Var.q(false);
        } else {
            db5.t7.m123883x26a183b(activityC13996x5a58c237, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dbk), 0).show();
        }
        return jz5.f0.f384359a;
    }
}
