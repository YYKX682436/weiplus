package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public class j4 extends k75.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appcache.r4 f75606d;

    public j4(com.tencent.mm.plugin.appbrand.appcache.r4 r4Var) {
        this.f75606d = r4Var;
    }

    @Override // k75.c
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LibIncrementalTestCase[incremental]", "DownloadMockLibInfo enter");
        r45.fc7 fc7Var = new r45.fc7();
        java.util.Locale locale = java.util.Locale.US;
        java.lang.String str = com.tencent.mm.plugin.appbrand.appcache.r4.f75937r;
        com.tencent.mm.plugin.appbrand.appcache.r4 r4Var = this.f75606d;
        fc7Var.f374210d = java.lang.String.format(locale, str, java.lang.Integer.valueOf(r4Var.f75938g));
        fc7Var.f374212f = r4Var.f75938g;
        fc7Var.f374211e = r4Var.f75939h;
        fc7Var.f374214h = 1;
        com.tencent.mm.plugin.appbrand.appcache.r7.f75948a.b(fc7Var, new com.tencent.mm.pointers.PInt());
        com.tencent.mm.plugin.appbrand.appcache.l3.f75641a.run();
        com.tencent.mm.plugin.appbrand.appcache.ua.Ri("@LibraryAppId", 0, fc7Var.f374212f, fc7Var.f374210d, null, new com.tencent.mm.plugin.appbrand.appcache.i4(this));
    }
}
