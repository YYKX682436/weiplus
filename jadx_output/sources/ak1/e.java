package ak1;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final ak1.e f5572a = new ak1.e();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.ArrayList f5573b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.ArrayList f5574c = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f5575d = "";

    public final void a(java.lang.String appId, com.tencent.mm.ui.base.preference.MMPreference preferences, ak1.b callback) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(preferences, "preferences");
        kotlin.jvm.internal.o.g(callback, "callback");
        f5573b.clear();
        f5574c.clear();
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.xd7();
        lVar.f70665b = new r45.yd7();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/wxaapp_getvoipdevicelist";
        lVar.f70667d = 4892;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        r45.xd7 xd7Var = new r45.xd7();
        xd7Var.f390000d = appId;
        lVar.f70664a = xd7Var;
        com.tencent.mm.modelbase.z2.e(lVar.a(), new ak1.d(preferences, appId, callback), true, preferences);
    }
}
