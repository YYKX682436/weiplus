package vo2;

/* loaded from: classes2.dex */
public final class c implements vo2.d {

    /* renamed from: a, reason: collision with root package name */
    public final r45.zi2 f520091a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd f520092b;

    public c(android.content.Context context, r45.zi2 musicInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicInfo, "musicInfo");
        this.f520091a = musicInfo;
        a();
    }

    public final void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = this.f520092b;
        if (c15188xd8bd4bd != null) {
            if (!(c15188xd8bd4bd.currentPlayState == 1 || c15188xd8bd4bd.currentPlayState == 11)) {
                return;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init musicId:");
        r45.zi2 zi2Var = this.f520091a;
        sb6.append(zi2Var.m75945x2fec8307(0));
        sb6.append(",musicName:");
        sb6.append(zi2Var.m75945x2fec8307(2));
        sb6.append(" mediaStreamingUrl:");
        sb6.append(zi2Var.m75945x2fec8307(5));
        sb6.append(' ');
        sb6.append(hashCode());
        sb6.append(' ');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMusicTPPlayer", sb6.toString());
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd(context);
        c15188xd8bd4bd2.m61419x6b94a948(true);
        c15188xd8bd4bd2.mo56708x764cf626(true);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34) pf5.u.f435469a.e(c61.l7.class).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34.class)).P6(c15188xd8bd4bd2);
        c15188xd8bd4bd2.mo56704x526554de(new vo2.a());
        this.f520092b = c15188xd8bd4bd2;
        java.lang.String m75945x2fec8307 = zi2Var.m75945x2fec8307(5);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd3 = this.f520092b;
        if (c15188xd8bd4bd3 != null) {
            mn2.i iVar = new mn2.i(m75945x2fec8307);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88();
            java.lang.String m75945x2fec83072 = zi2Var.m75945x2fec8307(2);
            c14989xf862ae88.m59157x9713e3a(m75945x2fec83072 != null ? m75945x2fec83072 : "");
            c15188xd8bd4bd3.n(iVar, false, c14989xf862ae88);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd4 = this.f520092b;
        if (c15188xd8bd4bd4 != null) {
            c15188xd8bd4bd4.F();
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("track player: ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd5 = this.f520092b;
        sb7.append(c15188xd8bd4bd5 != null ? java.lang.Integer.valueOf(c15188xd8bd4bd5.hashCode()) : null);
        sb7.append(", musicId=");
        sb7.append(zi2Var.m75945x2fec8307(0));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMusicTPPlayer", sb7.toString());
    }

    public boolean b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = this.f520092b;
        return c15188xd8bd4bd != null && c15188xd8bd4bd.mo58787xc00617a4();
    }

    public void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = this.f520092b;
        if (c15188xd8bd4bd != null) {
            c15188xd8bd4bd.mo56716x4121a19(false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd2 = this.f520092b;
        if (c15188xd8bd4bd2 != null) {
            c15188xd8bd4bd2.mo58788x65825f6();
        }
    }

    public void d() {
        a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = this.f520092b;
        if (c15188xd8bd4bd != null) {
            c15188xd8bd4bd.mo56716x4121a19(true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd2 = this.f520092b;
        if (c15188xd8bd4bd2 != null) {
            zy2.g5.u(c15188xd8bd4bd2, null, 1, null);
        }
    }

    public void e() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = this.f520092b;
        if (c15188xd8bd4bd != null) {
            c15188xd8bd4bd.d();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd2 = this.f520092b;
        if (c15188xd8bd4bd2 != null) {
            c15188xd8bd4bd2.b();
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34) pf5.u.f435469a.e(c61.l7.class).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34.class)).O6(new vo2.b(this));
        this.f520092b = null;
    }
}
