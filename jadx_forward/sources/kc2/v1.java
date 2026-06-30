package kc2;

/* loaded from: classes15.dex */
public final class v1 {

    /* renamed from: a, reason: collision with root package name */
    public final kc2.g1 f388032a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f388033b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f388034c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f388035d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f388036e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f388037f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f388038g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f388039h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.u3 f388040i;

    /* renamed from: j, reason: collision with root package name */
    public int f388041j;

    /* renamed from: k, reason: collision with root package name */
    public int f388042k;

    /* renamed from: l, reason: collision with root package name */
    public int f388043l;

    public v1(kc2.g1 manager, com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 handler, java.lang.String findTabPreferenceKey, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        findTabPreferenceKey = (i17 & 4) != 0 ? "album_dyna_photo_ui_title" : findTabPreferenceKey;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(manager, "manager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handler, "handler");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(findTabPreferenceKey, "findTabPreferenceKey");
        this.f388032a = manager;
        this.f388033b = handler;
        this.f388034c = findTabPreferenceKey;
        this.f388035d = jz5.h.b(kc2.q1.f388013d);
        this.f388036e = "FinderKaraInfoManager.Sns";
        this.f388037f = jz5.h.b(kc2.o1.f387999d);
        this.f388038g = jz5.h.b(kc2.p1.f388002d);
        this.f388039h = jz5.h.b(kc2.u1.f388028d);
        this.f388040i = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_KARA_SNS_LAST_EXIT_STRING_SYNC;
        handler.mo50293x3498a0(new kc2.n1(this));
    }

    public final kc2.a2 a() {
        return (kc2.a2) ((jz5.n) this.f388037f).mo141623x754a37bb();
    }

    public final kc2.a2 b() {
        return (kc2.a2) ((jz5.n) this.f388038g).mo141623x754a37bb();
    }

    public final kc2.a2 c() {
        return (kc2.a2) ((jz5.n) this.f388039h).mo141623x754a37bb();
    }

    public java.lang.String d() {
        java.lang.Object l17 = gm0.j1.u().c().l(68377, null);
        if (l17 instanceof java.lang.String) {
            return (java.lang.String) l17;
        }
        return null;
    }

    public boolean e() {
        return (c01.z1.n() & 32768) == 0;
    }
}
