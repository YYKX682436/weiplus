package k50;

/* loaded from: classes3.dex */
public final class f1 implements wf0.u1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f385742d;

    /* renamed from: e, reason: collision with root package name */
    public final t21.v2 f385743e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 f385744f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f385745g;

    public f1(java.util.List usernameList, t21.v2 videoInfo, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(usernameList, "usernameList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoInfo, "videoInfo");
        this.f385742d = usernameList;
        this.f385743e = videoInfo;
        this.f385744f = f9Var;
        this.f385745g = str;
    }

    @Override // wf0.u1
    public void h(wf0.r1 r1Var) {
        if (r1Var != null) {
            ((vf0.y1) ((wf0.x1) i95.n0.c(wf0.x1.class))).getClass();
            t21.v2 h17 = t21.d3.h(r1Var.f527062a);
            if (h17 == null || h17.f496544i != 199) {
                return;
            }
            java.lang.String d17 = h17.d();
            t21.v2 videoInfo = this.f385743e;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(d17, videoInfo.d())) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f385744f;
                java.lang.String str = this.f385745g;
                java.util.List usernameList = this.f385742d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(usernameList, "usernameList");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoInfo, "videoInfo");
                p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new k50.c1(usernameList, f9Var, videoInfo, str, null), 3, null);
            }
        }
    }
}
