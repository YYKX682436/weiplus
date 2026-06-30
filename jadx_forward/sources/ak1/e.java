package ak1;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final ak1.e f87105a = new ak1.e();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.ArrayList f87106b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.ArrayList f87107c = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f87108d = "";

    public final void a(java.lang.String appId, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b preferences, ak1.b callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(preferences, "preferences");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        f87106b.clear();
        f87107c.clear();
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.xd7();
        lVar.f152198b = new r45.yd7();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/wxaapp_getvoipdevicelist";
        lVar.f152200d = 4892;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        r45.xd7 xd7Var = new r45.xd7();
        xd7Var.f471533d = appId;
        lVar.f152197a = xd7Var;
        com.p314xaae8f345.mm.p944x882e457a.z2.e(lVar.a(), new ak1.d(preferences, appId, callback), true, preferences);
    }
}
