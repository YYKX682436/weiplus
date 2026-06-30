package mn2;

/* loaded from: classes10.dex */
public final class g4 extends mn2.j4 {

    /* renamed from: e, reason: collision with root package name */
    public final r45.mb4 f411535e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90 f411536f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f411537g;

    /* renamed from: h, reason: collision with root package name */
    public final int f411538h;

    /* renamed from: i, reason: collision with root package name */
    public final int f411539i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f411540m;

    /* renamed from: n, reason: collision with root package name */
    public final r45.vf2 f411541n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f411542o;

    public g4(r45.mb4 mediaObj, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90 type, java.lang.String str, int i17, int i18, java.lang.String username, boolean z17, r45.vf2 vf2Var, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        if ((i19 & 8) != 0) {
            if (cw2.l5.f305368a.e()) {
                i17 = 3;
            } else {
                ((vf0.s1) ((wf0.o1) i95.n0.c(wf0.o1.class))).getClass();
                i17 = d11.s.Di(4) ? 2 : 1;
            }
        }
        i18 = (i19 & 16) != 0 ? 0 : i18;
        if ((i19 & 32) != 0) {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            username = xy2.c.e(context);
        }
        z17 = (i19 & 64) != 0 ? false : z17;
        vf2Var = (i19 & 128) != 0 ? null : vf2Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaObj, "mediaObj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        this.f411535e = mediaObj;
        this.f411536f = type;
        this.f411537g = str;
        this.f411538h = i17;
        this.f411539i = i18;
        this.f411540m = z17;
        this.f411541n = vf2Var;
    }

    @Override // mn2.j4
    public int b() {
        return this.f411538h;
    }

    @Override // mn2.j4
    public int c() {
        return this.f411539i;
    }

    @Override // mn2.j4
    public boolean d() {
        return this.f411540m;
    }

    @Override // mn2.j4
    public r45.mb4 e() {
        return this.f411535e;
    }

    @Override // mn2.j4
    public r45.vf2 f() {
        return this.f411541n;
    }

    @Override // mn2.j4
    public java.lang.String g() {
        java.lang.String str = this.f411537g;
        if (!android.text.TextUtils.isEmpty(str)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            return str;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderVideoLoadData", "invalid specFormat:" + str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90 y90Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e;
        return "xV99";
    }

    @Override // mn2.h3
    /* renamed from: getMediaType */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90 mo148082x7f025288() {
        return this.f411536f;
    }

    @Override // mn2.h3
    /* renamed from: getPath */
    public java.lang.String mo148083xfb83cc9b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9 e9Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183665a;
        return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183673i + n();
    }

    @Override // mn2.h3
    /* renamed from: getUrl */
    public java.lang.String mo148084xb5887639() {
        java.lang.String m75945x2fec8307 = this.f411535e.m75945x2fec8307(0);
        return m75945x2fec8307 == null ? "" : m75945x2fec8307;
    }

    @Override // mn2.h3
    public java.lang.String h() {
        java.lang.String m75945x2fec8307 = this.f411535e.m75945x2fec8307(17);
        return m75945x2fec8307 == null ? "" : m75945x2fec8307;
    }

    @Override // mn2.h3
    public java.lang.String i() {
        java.lang.String m75945x2fec8307 = this.f411535e.m75945x2fec8307(18);
        return m75945x2fec8307 == null ? "" : m75945x2fec8307;
    }

    public final java.lang.String j() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9 e9Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183665a;
        sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183673i);
        sb6.append('_');
        sb6.append(k());
        return sb6.toString();
    }

    public final java.lang.String k() {
        return n() + "_storage";
    }

    @Override // mn2.h3
    public java.lang.String l() {
        java.lang.String m75945x2fec8307 = this.f411535e.m75945x2fec8307(1);
        return m75945x2fec8307 == null ? "" : m75945x2fec8307;
    }

    @Override // mn2.h3
    public java.lang.String m() {
        java.lang.String m75945x2fec8307 = this.f411535e.m75945x2fec8307(19);
        return m75945x2fec8307 == null ? "" : m75945x2fec8307;
    }

    @Override // ip0.c
    public java.lang.String n() {
        java.lang.String str = this.f411542o;
        if (str != null) {
            return str;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9 e9Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183665a;
        java.lang.String g17 = g();
        r45.mb4 mb4Var = this.f411535e;
        java.lang.String k17 = e9Var.k(g17, mb4Var.m75945x2fec8307(9), mb4Var.m75945x2fec8307(0));
        this.f411542o = k17;
        return k17;
    }

    /* renamed from: toString */
    public java.lang.String m148094x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        r45.mb4 mb4Var = this.f411535e;
        sb6.append(mb4Var.m75945x2fec8307(9));
        sb6.append(" url=");
        sb6.append(mb4Var.m75945x2fec8307(0));
        return sb6.toString();
    }
}
