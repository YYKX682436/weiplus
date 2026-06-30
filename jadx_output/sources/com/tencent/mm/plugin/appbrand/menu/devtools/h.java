package com.tencent.mm.plugin.appbrand.menu.devtools;

/* loaded from: classes7.dex */
public class h implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.n7 f85901d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f85902e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f85903f;

    public h(com.tencent.mm.plugin.appbrand.menu.devtools.k kVar, com.tencent.mm.plugin.appbrand.page.n7 n7Var, java.lang.String str, android.content.Context context) {
        this.f85901d = n7Var;
        this.f85902e = str;
        this.f85903f = context;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.a(1, com.tencent.mm.R.string.f490034j3);
        g4Var.a(2, com.tencent.mm.R.string.f490031j0);
        g4Var.a(7, com.tencent.mm.R.string.f490033j2);
        g4Var.a(9, com.tencent.mm.R.string.f490029iy);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("appID: ");
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = this.f85901d;
        sb6.append(n7Var.getAppId());
        g4Var.f(3, sb6.toString());
        g4Var.f(8, "username: " + n7Var.getRuntime().u0().f47278x);
        java.lang.String str = this.f85902e;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = "UNKNOWN PROCESS NAME";
        }
        g4Var.f(5, str);
        g4Var.f(6, this.f85903f.getString(com.tencent.mm.R.string.f490030iz) + java.lang.String.format("(cur:%b)", java.lang.Boolean.valueOf(com.tencent.mm.plugin.appbrand.task.d.a())));
        g4Var.f(10, "JAVA ASSERT");
        g4Var.f(11, "JNI ASSERT");
        g4Var.f(13, "ANR ASSERT");
        g4Var.f(12, "Watch Dog Memory Report");
    }
}
