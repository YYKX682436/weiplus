package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public class v2 implements k70.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f266990a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m f266991b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266992c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266993d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266994e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266995f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266996g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266997h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266998i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f266999j;

    public v2(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var, long j17, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
        this.f266999j = c1Var;
        this.f266990a = j17;
        this.f266991b = mVar;
        this.f266992c = str;
        this.f266993d = str2;
        this.f266994e = str3;
        this.f266995f = str4;
        this.f266996g = str5;
        this.f266997h = str6;
        this.f266998i = str7;
    }

    @Override // k70.u
    public void a(android.graphics.Bitmap bitmap, byte[] bArr) {
        this.f266999j.getClass();
        if (this.f266990a >= 0) {
            s01.h z07 = r01.q3.Ui().z0(this.f266990a);
            java.lang.Object obj = s01.r.f483460d;
            synchronized (obj) {
                java.lang.String i17 = s01.r.i();
                s01.r.j(z07);
                this.f266999j.Q5(this.f266991b, this.f266992c, this.f266993d, this.f266994e, this.f266995f, this.f266996g, this.f266997h, this.f266998i);
                synchronized (obj) {
                    s01.r.f483457a = i17;
                }
            }
        } else {
            this.f266999j.Q5(this.f266991b, this.f266992c, this.f266993d, this.f266994e, this.f266995f, this.f266996g, this.f266997h, this.f266998i);
        }
        android.content.Context context = this.f266999j.f266508d;
        if (context != null) {
            db5.e1.T(context, j65.q.a(context).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572473bb2));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var = this.f266999j;
        c1Var.i5(c1Var.f266509e, "send_app_msg:ok", null);
    }
}
