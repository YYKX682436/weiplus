package i13;

/* loaded from: classes10.dex */
public final class p extends i13.c {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f368846h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f368847i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f368848m;

    /* renamed from: n, reason: collision with root package name */
    public final long f368849n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f368850o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(java.lang.String forcePushId, java.lang.String username, java.lang.String nickname, java.lang.String wording, long j17, java.lang.String str) {
        super(forcePushId, 0L, 2, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(forcePushId, "forcePushId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nickname, "nickname");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wording, "wording");
        this.f368846h = username;
        this.f368847i = nickname;
        this.f368848m = wording;
        this.f368849n = j17;
        this.f368850o = str;
    }

    @Override // i13.c
    public java.lang.String c() {
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fes);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    @Override // i13.c
    public boolean e() {
        return true;
    }

    @Override // i13.c
    public boolean f() {
        return true;
    }

    @Override // i13.c
    public void g() {
        int i17;
        super.g();
        java.lang.String str = this.f368846h;
        i50.q qVar = (i50.q) i95.n0.c(i50.q.class);
        i95.m c17 = i95.n0.c(h13.l0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        if (h13.l0.Ui((h13.l0) c17, null, 1, null)) {
            i95.m c18 = i95.n0.c(h13.l0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            i17 = h13.l0.Vi((h13.l0) c18, null, 1, null) ? 1 : 4;
        } else {
            i95.m c19 = i95.n0.c(h13.l0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
            i17 = h13.l0.Vi((h13.l0) c19, null, 1, null) ? 3 : 2;
        }
        ((h13.c0) qVar).Di(str, i17, 1, this.f368808d, false, null);
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return 0L;
    }

    @Override // in5.c
    public int h() {
        return 0;
    }

    @Override // i13.c
    public void i() {
        int size = k13.l1.I.a().f384772q.size();
        ((h13.c0) ((i50.q) i95.n0.c(i50.q.class))).Ni(3, 1, this.f368846h, size, this.f368808d);
    }

    @Override // i13.c
    public void k(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        m13.d dVar = m13.d.f404398a;
        android.content.Context context = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        dVar.a(context, this, i13.n.f368830c.a().f368832a.size());
    }

    @Override // i13.c
    public void l(boolean z17) {
        super.l(z17);
        if (z17) {
            int size = k13.l1.I.a().f384772q.size();
            ((h13.c0) ((i50.q) i95.n0.c(i50.q.class))).Ni(2, 1, this.f368846h, size, this.f368808d);
        }
    }

    @Override // i13.c
    public void n(in5.s0 holder, android.view.View view, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        int size = k13.l1.I.a().f384772q.size();
        m13.d dVar = m13.d.f404398a;
        android.content.Context context = holder.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        dVar.a(context, this, size);
    }

    @Override // i13.c
    public void o() {
        super.o();
        i13.n a17 = i13.n.f368830c.a();
        a17.getClass();
        java.lang.String forcePushId = this.f368808d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(forcePushId, "forcePushId");
        a17.f368833b.remove(forcePushId);
        j13.a.f378710d.d(forcePushId);
    }
}
