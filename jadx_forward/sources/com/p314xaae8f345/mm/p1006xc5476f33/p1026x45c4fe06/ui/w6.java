package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes9.dex */
public class w6 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f171834a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f171835b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f171836c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f171837d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f171838e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f171839f;

    /* renamed from: g, reason: collision with root package name */
    public int f171840g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u6 f171841h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Runnable f171842i = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.v6(this);

    public w6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12662x7403fcf1 activityC12662x7403fcf1, android.content.Context context) {
        this.f171834a = context;
    }

    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u6 u6Var = this.f171841h;
        if (u6Var != null) {
            boolean z17 = this.f171838e;
            java.lang.String str = this.f171839f;
            int i17 = this.f171840g;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.o6 o6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.o6) u6Var;
            o6Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandProcessShareMessageProxyUI", "onProcessDone, result:%b", java.lang.Boolean.valueOf(z17));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.t6 t6Var = o6Var.f171433c.f170933e;
            if (t6Var != null) {
                t6Var.a(z17, str, i17);
            }
            ((ij1.j) ((k01.u0) i95.n0.c(k01.u0.class))).Ui(o6Var.f171431a, o6Var.f171432b);
        }
    }

    public void b(boolean z17, java.lang.String str, int i17) {
        this.f171836c = true;
        this.f171838e = z17;
        this.f171839f = str;
        this.f171840g = i17;
        if (this.f171837d) {
            a();
        } else if (z17) {
            android.content.Context context = this.f171834a;
            this.f171835b = db5.e1.Q(context, "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572085yb), false, true, null);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(this.f171842i, 5000L);
        }
    }
}
