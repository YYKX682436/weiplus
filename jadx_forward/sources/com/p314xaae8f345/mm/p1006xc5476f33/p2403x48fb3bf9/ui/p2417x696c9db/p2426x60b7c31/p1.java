package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public class p1 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m f266855a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266856b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266857c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266858d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266859e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266860f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266861g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f266862h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266863i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266864j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f266865k;

    public p1(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, boolean z17, java.lang.String str7, java.lang.String str8) {
        this.f266865k = c1Var;
        this.f266855a = mVar;
        this.f266856b = str;
        this.f266857c = str2;
        this.f266858d = str3;
        this.f266859e = str4;
        this.f266860f = str5;
        this.f266861g = str6;
        this.f266862h = z17;
        this.f266863i = str7;
        this.f266864j = str8;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j
    public void a(boolean z17, java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var = this.f266865k;
        if (!z17) {
            c1Var.j7(1, 3);
            c1Var.i5(c1Var.f266509e, this.f266864j, null);
            return;
        }
        this.f266865k.Q5(this.f266855a, this.f266856b, this.f266857c, this.f266858d, this.f266859e, this.f266860f, str, this.f266861g);
        if (this.f266862h) {
            j45.l.u(c1Var.f266508d, ".ui.chatting.ChattingUI", new android.content.Intent().putExtra("Chat_User", this.f266857c), null);
        } else {
            android.content.Context context = c1Var.f266508d;
            if (context != null) {
                db5.e1.T(context, j65.q.a(context).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572093yi));
            }
        }
        c1Var.j7(1, 1);
        c1Var.i5(c1Var.f266509e, this.f266863i, null);
    }
}
