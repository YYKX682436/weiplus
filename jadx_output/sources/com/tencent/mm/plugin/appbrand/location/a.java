package com.tencent.mm.plugin.appbrand.location;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.location.a f85499a = new com.tencent.mm.plugin.appbrand.location.a();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f85500b = "";

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f85501c = "";

    /* renamed from: d, reason: collision with root package name */
    public static int f85502d;

    /* renamed from: e, reason: collision with root package name */
    public static double f85503e;

    /* renamed from: f, reason: collision with root package name */
    public static double f85504f;

    /* renamed from: g, reason: collision with root package name */
    public static int f85505g;

    /* renamed from: h, reason: collision with root package name */
    public static double f85506h;

    /* renamed from: i, reason: collision with root package name */
    public static double f85507i;

    /* renamed from: j, reason: collision with root package name */
    public static double f85508j;

    /* renamed from: k, reason: collision with root package name */
    public static long f85509k;

    /* renamed from: l, reason: collision with root package name */
    public static boolean f85510l;

    public final void a(com.tencent.mm.autogen.events.SaveLocationForAppBrandReportEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        am.ns nsVar = event.f54724g;
        java.lang.String str = nsVar.f7451a;
        f85500b = str;
        java.lang.String str2 = nsVar.f7452b;
        f85501c = str2;
        int i17 = nsVar.f7453c;
        f85502d = i17;
        f85503e = nsVar.f7455e;
        f85504f = nsVar.f7454d;
        f85505g = nsVar.f7456f;
        f85506h = nsVar.f7457g;
        f85507i = nsVar.f7458h;
        f85508j = nsVar.f7459i;
        f85509k = nsVar.f7460j;
        f85510l = true;
        java.lang.Object[] objArr = {str, str2, java.lang.Integer.valueOf(i17), java.lang.Double.valueOf(f85503e), java.lang.Double.valueOf(f85504f), java.lang.Integer.valueOf(f85505g), java.lang.Double.valueOf(f85507i), java.lang.Double.valueOf(f85508j)};
        int i18 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLocationInfoTemporaryStorage", "saveLocationInfo appId:%s, username:%s, scene:%d, longitude:%f, latitude:%f, locType:%d, accuracy:%f, altitude:%f", objArr);
    }
}
