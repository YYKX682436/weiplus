package r52;

/* loaded from: classes15.dex */
public final class c {

    /* renamed from: h, reason: collision with root package name */
    public static final r52.b f474162h = new r52.b(null);

    /* renamed from: i, reason: collision with root package name */
    public static java.lang.String f474163i = "";

    /* renamed from: j, reason: collision with root package name */
    public static boolean f474164j;

    /* renamed from: a, reason: collision with root package name */
    public q52.e f474165a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f474166b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f474167c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f474168d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f474169e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f474170f = "";

    /* renamed from: g, reason: collision with root package name */
    public int f474171g;

    public final java.lang.String a() {
        r45.c45 e17;
        java.lang.String lastSessionId;
        int i17;
        if (!this.f474168d || (e17 = x52.c.e()) == null) {
            return null;
        }
        r52.b bVar = f474162h;
        if (bVar.a(e17.f452811o, e17.f452806g) && (i17 = e17.f452807h) != -1) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1391x46fdf567.ext.p1392x76508296.p1393xaf3f8342.c.f181316a.d(i17);
        }
        if (!bVar.b(e17.f452811o) || (lastSessionId = e17.f452818v) == null) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1391x46fdf567.ext.p1392x76508296.p1393xaf3f8342.c.f181316a.c();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1391x46fdf567.ext.p1392x76508296.p1393xaf3f8342.b bVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1391x46fdf567.ext.p1392x76508296.p1393xaf3f8342.c.f181316a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lastSessionId, "lastSessionId");
        return bVar2.a(lastSessionId);
    }

    public final q52.e b(r45.d45 d45Var, int i17) {
        q52.e eVar = new q52.e(null, null, 0L, 0L, 0L, null, null, 0, false, null, null, null, false, 0, false, 0, 0, null, 262143, null);
        eVar.f441697a = d45Var.f453630d;
        java.lang.String str = d45Var.f453631e;
        eVar.f441698b = str;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "FinderTopicFeedUI")) {
            p52.c cVar = p52.h.f433549a;
            int i18 = p52.h.f433571w;
            p52.f[] fVarArr = p52.f.f433542d;
            eVar.f441705i = i18 == 2;
        } else {
            eVar.f441705i = false;
        }
        eVar.f441699c = d45Var.f453633g;
        eVar.f441700d = d45Var.f453634h;
        eVar.f441701e = d45Var.f453635i;
        eVar.f441702f = d45Var.f453636m;
        eVar.f441703g = d45Var.f453637n;
        eVar.f441704h = i17;
        eVar.f441706j = d45Var.f453640q;
        eVar.f441707k = d45Var.f453641r;
        eVar.f441713q = d45Var.f453632f;
        return eVar;
    }
}
