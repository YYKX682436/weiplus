package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2;

/* loaded from: classes8.dex */
public class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f223509d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f223510e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f223511f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f223512g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f223513h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f223514i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ m33.h1 f223515m;

    public y0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0 p0Var, java.lang.String str, java.lang.String str2, java.lang.String str3, android.content.Context context, java.lang.String str4, java.lang.String str5, m33.h1 h1Var) {
        this.f223509d = str;
        this.f223510e = str2;
        this.f223511f = str3;
        this.f223512g = context;
        this.f223513h = str4;
        this.f223514i = str5;
        this.f223515m = h1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        r33.f fVar = new r33.f(this.f223509d, this.f223510e, this.f223511f);
        android.content.Context context = this.f223512g;
        java.lang.String str = this.f223513h;
        m33.h1 h1Var = this.f223515m;
        if (str == null || str.length() == 0) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("error", "appId is invalid");
            h1Var.b(hashMap);
            return;
        }
        java.lang.String str2 = fVar.f450510a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiGetLaunchGameInfo", "reportStartAction appId = %s, gameAppId = %s", str2, str);
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("pubappid", str2);
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.f(context, 103, 10301, 1, 41002, str, 0, com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.b(hashMap2));
        fVar.f450513d = this.f223514i;
        m53.h2 h2Var = new m53.h2();
        h2Var.f405280d = str;
        h2Var.f405281e = str2;
        h2Var.f405282f = fVar.f450511b;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = h2Var;
        lVar.f152198b = new m53.i2();
        lVar.f152199c = "/cgi-bin/mmgame-bin/getlaunchgameinfo";
        lVar.f152200d = 5060;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).wi(a17, new r33.b(fVar, h1Var, context));
    }
}
