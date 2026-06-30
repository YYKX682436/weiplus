package hi4;

/* loaded from: classes11.dex */
public final class a extends rj4.c {

    /* renamed from: x1, reason: collision with root package name */
    public static final l75.e0 f363072x1 = rj4.c.m162515x3593deb(hi4.a.class);

    /* renamed from: l1, reason: collision with root package name */
    public java.lang.String f363073l1;

    /* renamed from: p1, reason: collision with root package name */
    public java.lang.String f363074p1;

    /* renamed from: y0, reason: collision with root package name */
    public java.lang.CharSequence f363075y0;

    /* renamed from: equals */
    public boolean m133573xb2c87fbf(java.lang.Object obj) {
        return (obj instanceof hi4.a) && ((hi4.a) obj).f72763xa3c65b86 == this.f72763xa3c65b86;
    }

    @Override // rj4.c, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        l75.e0 info = f363072x1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(info, "info");
        return info;
    }

    /* renamed from: hashCode */
    public int m133574x8cdac1b() {
        return (int) this.f72763xa3c65b86;
    }

    public final void t0() {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f76582xbed8694c, "textstatussayhisessionholder")) {
            java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jw9);
            this.f363073l1 = string;
            this.f363075y0 = string;
            return;
        }
        mj4.w Ai = ((ki4.x) i95.n0.c(ki4.x.class)).Ai(this.f76582xbed8694c);
        this.f363073l1 = Ai != null ? Ai.f76640x21f9b213 : null;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.lang.String str = this.f363073l1;
        ((ke0.e) xVar).getClass();
        this.f363075y0 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str);
    }
}
