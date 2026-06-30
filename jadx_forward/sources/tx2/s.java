package tx2;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public int f504178a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f504179b;

    /* renamed from: c, reason: collision with root package name */
    public android.app.Activity f504180c;

    /* renamed from: d, reason: collision with root package name */
    public r45.qt2 f504181d;

    /* renamed from: e, reason: collision with root package name */
    public r45.h32 f504182e;

    /* renamed from: f, reason: collision with root package name */
    public long f504183f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f504184g;

    /* renamed from: h, reason: collision with root package name */
    public int f504185h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.p f504186i;

    /* renamed from: j, reason: collision with root package name */
    public cl0.g f504187j;

    public s(int i17, java.lang.String username, android.app.Activity context, r45.qt2 contextObj, r45.h32 liveNoticeInfo, long j17, java.lang.String enterScene, int i18, yz5.p pVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveNoticeInfo, "liveNoticeInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enterScene, "enterScene");
        this.f504178a = i17;
        this.f504179b = username;
        this.f504180c = context;
        this.f504181d = contextObj;
        this.f504182e = liveNoticeInfo;
        this.f504183f = j17;
        this.f504184g = enterScene;
        this.f504185h = i18;
        this.f504186i = pVar;
    }

    public static final void a(tx2.s sVar, int i17) {
        sVar.getClass();
        i95.m c17 = i95.n0.c(c61.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        c61.zb zbVar = (c61.zb) c17;
        java.lang.String str = sVar.f504179b;
        java.lang.String m75945x2fec8307 = sVar.f504182e.m75945x2fec8307(4);
        gm0.j1.d().g(c61.zb.x3(zbVar, str, m75945x2fec8307 == null ? "" : m75945x2fec8307, i17, sVar.f504181d, sVar.f504180c.getIntent().getStringExtra("key_promotion_token"), java.lang.Integer.valueOf(sVar.f504185h), null, null, null, null, null, null, null, 8128, null));
        c61.zb zbVar2 = (c61.zb) i95.n0.c(c61.zb.class);
        java.lang.String str2 = sVar.f504179b;
        java.lang.String m75945x2fec83072 = sVar.f504182e.m75945x2fec8307(4);
        if (m75945x2fec83072 == null) {
            m75945x2fec83072 = "";
        }
        if (((b92.d1) zbVar2).bj(str2, m75945x2fec83072) == null) {
            c61.zb zbVar3 = (c61.zb) i95.n0.c(c61.zb.class);
            java.lang.String str3 = sVar.f504179b;
            java.lang.String m75945x2fec83073 = sVar.f504182e.m75945x2fec8307(4);
            if (m75945x2fec83073 == null) {
                m75945x2fec83073 = "";
            }
            ((b92.d1) zbVar3).Ai(str3, m75945x2fec83073, sVar.f504182e);
        } else {
            c61.zb zbVar4 = (c61.zb) i95.n0.c(c61.zb.class);
            java.lang.String str4 = sVar.f504179b;
            java.lang.String m75945x2fec83074 = sVar.f504182e.m75945x2fec8307(4);
            if (m75945x2fec83074 == null) {
                m75945x2fec83074 = "";
            }
            r45.h32 bj6 = ((b92.d1) zbVar4).bj(str4, m75945x2fec83074);
            if (bj6 != null) {
                bj6.set(1, java.lang.Integer.valueOf(sVar.f504182e.m75939xb282bd08(1)));
            }
        }
        android.app.Activity context = sVar.f504180c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((te2.e4) ((zy2.g8) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(zy2.g8.class))).f499507d.M0(sVar.f504179b);
    }
}
