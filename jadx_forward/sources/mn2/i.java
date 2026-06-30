package mn2;

/* loaded from: classes2.dex */
public final class i extends mn2.j4 {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f411550e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.mb4 f411551f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f411552g;

    public i(java.lang.String audioUrl) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(audioUrl, "audioUrl");
        this.f411550e = audioUrl;
        r45.mb4 mb4Var = new r45.mb4();
        mb4Var.set(0, audioUrl);
        java.lang.String m75945x2fec8307 = mb4Var.m75945x2fec8307(0);
        m75945x2fec8307 = m75945x2fec8307 == null ? "" : m75945x2fec8307;
        char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
        mb4Var.set(9, com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(m75945x2fec8307.getBytes()));
        this.f411551f = mb4Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9 e9Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183665a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90 y90Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e;
        this.f411552g = e9Var.k("img_bgm", mb4Var.m75945x2fec8307(9), mb4Var.m75945x2fec8307(0));
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        xy2.c.e(context);
    }

    @Override // mn2.j4
    public int b() {
        return -1;
    }

    @Override // mn2.j4
    public int c() {
        return -1;
    }

    @Override // mn2.j4
    public boolean d() {
        return false;
    }

    @Override // mn2.j4
    public r45.mb4 e() {
        return this.f411551f;
    }

    @Override // mn2.j4
    public r45.vf2 f() {
        return null;
    }

    @Override // mn2.j4
    public java.lang.String g() {
        return "audio";
    }

    @Override // mn2.h3
    /* renamed from: getMediaType */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90 mo148082x7f025288() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.Y;
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
        return this.f411550e;
    }

    @Override // mn2.h3
    public java.lang.String h() {
        return "";
    }

    @Override // mn2.h3
    public java.lang.String i() {
        return "";
    }

    @Override // mn2.h3
    public java.lang.String l() {
        return "";
    }

    @Override // mn2.h3
    public java.lang.String m() {
        return "";
    }

    @Override // ip0.c
    public java.lang.String n() {
        return this.f411552g;
    }
}
