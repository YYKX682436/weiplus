package mn2;

/* loaded from: classes2.dex */
public final class k0 extends mn2.a {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f411562e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f411563f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90 f411564g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f411565h;

    public k0(java.lang.String str, java.lang.String str2, java.lang.String str3, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90 mediaType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaType, "mediaType");
        this.f411562e = str;
        this.f411563f = str3;
        this.f411564g = mediaType;
        str2 = str2 == null ? "" : str2;
        char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
        this.f411565h = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(str2.getBytes());
    }

    @Override // mn2.h3
    /* renamed from: getMediaType */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90 mo148082x7f025288() {
        return this.f411564g;
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
        java.lang.String str = this.f411562e;
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
        java.lang.String str = this.f411562e;
        return str == null ? "" : str;
    }

    @Override // mn2.h3
    public java.lang.String m() {
        return "";
    }

    @Override // ip0.c
    public java.lang.String n() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f411564g.f209907d);
        sb6.append("_finder_");
        java.lang.String str2 = this.f411563f;
        if (str2 == null || str2.length() == 0) {
            str = "";
        } else {
            str = "_" + str2 + '_';
        }
        sb6.append(str);
        sb6.append(this.f411565h);
        return sb6.toString();
    }
}
