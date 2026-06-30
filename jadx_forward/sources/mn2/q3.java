package mn2;

/* loaded from: classes10.dex */
public class q3 extends mn2.a {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f411629e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90 f411630f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f411631g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f411632h;

    public q3(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90 mediaType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaType, "mediaType");
        this.f411629e = str;
        this.f411630f = mediaType;
        this.f411631g = jz5.h.b(new mn2.p3(this));
        this.f411632h = jz5.h.b(new mn2.o3(this));
    }

    @Override // mn2.h3
    /* renamed from: getMediaType */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90 mo148082x7f025288() {
        return this.f411630f;
    }

    @Override // mn2.h3
    /* renamed from: getPath */
    public java.lang.String mo148083xfb83cc9b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9 e9Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183665a;
        return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183672h + n();
    }

    @Override // mn2.h3
    /* renamed from: getUrl */
    public java.lang.String mo148084xb5887639() {
        java.lang.String str = this.f411629e;
        return str == null ? "" : str;
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
        java.lang.String str = this.f411629e;
        return str == null ? "" : str;
    }

    @Override // mn2.h3
    public java.lang.String m() {
        return "";
    }

    @Override // ip0.c
    public java.lang.String n() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f411630f.f209907d);
        sb6.append("_finder_");
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f411632h).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        sb6.append((java.lang.String) mo141623x754a37bb);
        return sb6.toString();
    }
}
