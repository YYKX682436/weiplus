package vd2;

/* loaded from: classes3.dex */
public final class v5 {

    /* renamed from: a, reason: collision with root package name */
    public int f517488a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f517489b;

    /* renamed from: c, reason: collision with root package name */
    public android.app.Activity f517490c;

    /* renamed from: d, reason: collision with root package name */
    public r45.qt2 f517491d;

    /* renamed from: e, reason: collision with root package name */
    public r45.h32 f517492e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f517493f;

    /* renamed from: g, reason: collision with root package name */
    public int f517494g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.l f517495h;

    public v5(int i17, java.lang.String username, android.app.Activity context, r45.qt2 contextObj, r45.h32 liveNoticeInfo, java.lang.String enterScene, int i18, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveNoticeInfo, "liveNoticeInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enterScene, "enterScene");
        this.f517488a = i17;
        this.f517489b = username;
        this.f517490c = context;
        this.f517491d = contextObj;
        this.f517492e = liveNoticeInfo;
        this.f517493f = enterScene;
        this.f517494g = i18;
        this.f517495h = lVar;
    }

    public static final void a(vd2.v5 v5Var, int i17) {
        v5Var.getClass();
        i95.m c17 = i95.n0.c(c61.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        c61.zb zbVar = (c61.zb) c17;
        java.lang.String str = v5Var.f517489b;
        java.lang.String m75945x2fec8307 = v5Var.f517492e.m75945x2fec8307(4);
        gm0.j1.d().g(c61.zb.x3(zbVar, str, m75945x2fec8307 == null ? "" : m75945x2fec8307, i17, v5Var.f517491d, v5Var.f517490c.getIntent().getStringExtra("key_promotion_token"), java.lang.Integer.valueOf(v5Var.f517494g), null, null, null, null, null, null, null, 8128, null));
        c61.zb zbVar2 = (c61.zb) i95.n0.c(c61.zb.class);
        java.lang.String str2 = v5Var.f517489b;
        java.lang.String m75945x2fec83072 = v5Var.f517492e.m75945x2fec8307(4);
        if (m75945x2fec83072 == null) {
            m75945x2fec83072 = "";
        }
        if (((b92.d1) zbVar2).bj(str2, m75945x2fec83072) == null) {
            c61.zb zbVar3 = (c61.zb) i95.n0.c(c61.zb.class);
            java.lang.String str3 = v5Var.f517489b;
            java.lang.String m75945x2fec83073 = v5Var.f517492e.m75945x2fec8307(4);
            if (m75945x2fec83073 == null) {
                m75945x2fec83073 = "";
            }
            ((b92.d1) zbVar3).Ai(str3, m75945x2fec83073, v5Var.f517492e);
        } else {
            c61.zb zbVar4 = (c61.zb) i95.n0.c(c61.zb.class);
            java.lang.String str4 = v5Var.f517489b;
            java.lang.String m75945x2fec83074 = v5Var.f517492e.m75945x2fec8307(4);
            if (m75945x2fec83074 == null) {
                m75945x2fec83074 = "";
            }
            r45.h32 bj6 = ((b92.d1) zbVar4).bj(str4, m75945x2fec83074);
            if (bj6 != null) {
                bj6.set(1, java.lang.Integer.valueOf(v5Var.f517492e.m75939xb282bd08(1)));
            }
        }
        android.app.Activity context = v5Var.f517490c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((te2.e4) ((zy2.g8) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(zy2.g8.class))).f499507d.M0(v5Var.f517489b);
    }
}
