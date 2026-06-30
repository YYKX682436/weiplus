package mn2;

/* loaded from: classes2.dex */
public class r3 extends mn2.a {

    /* renamed from: e, reason: collision with root package name */
    public final r45.mb4 f411637e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90 f411638f;

    public r3(r45.mb4 mediaObj, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90 type, java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaObj, "mediaObj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c01.z1.r(), "getUsernameFromUserInfo(...)");
        this.f411637e = mediaObj;
        this.f411638f = type;
        if (mediaObj.m75945x2fec8307(0) == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mediaObj.url == null ");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            sb6.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            java.lang.String sb7 = sb6.toString();
            int i17 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderVideoCover", sb7, null);
        }
    }

    @Override // mn2.h3
    /* renamed from: getMediaType */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90 mo148082x7f025288() {
        return this.f411638f;
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
        java.lang.String m75945x2fec8307 = this.f411637e.m75945x2fec8307(16);
        return m75945x2fec8307 == null ? "" : m75945x2fec8307;
    }

    @Override // mn2.h3
    public java.lang.String h() {
        java.lang.String m75945x2fec8307 = this.f411637e.m75945x2fec8307(17);
        return m75945x2fec8307 == null ? "" : m75945x2fec8307;
    }

    @Override // mn2.h3
    public java.lang.String i() {
        java.lang.String m75945x2fec8307 = this.f411637e.m75945x2fec8307(20);
        return m75945x2fec8307 == null ? "" : m75945x2fec8307;
    }

    @Override // mn2.h3
    public java.lang.String l() {
        java.lang.String m75945x2fec8307 = this.f411637e.m75945x2fec8307(16);
        return m75945x2fec8307 == null ? "" : m75945x2fec8307;
    }

    @Override // mn2.h3
    public java.lang.String m() {
        java.lang.String m75945x2fec8307 = this.f411637e.m75945x2fec8307(20);
        return m75945x2fec8307 == null ? "" : m75945x2fec8307;
    }

    @Override // ip0.c
    public java.lang.String n() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("finder_video_cover_");
        sb6.append(this.f411638f.f209907d);
        sb6.append('_');
        java.lang.String m75945x2fec8307 = this.f411637e.m75945x2fec8307(16);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(m75945x2fec8307.getBytes()));
        return sb6.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ r3(r45.mb4 r1, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90 r2, java.lang.String r3, int r4, p3321xbce91901.jvm.p3324x21ffc6bd.i r5) {
        /*
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            java.lang.String r3 = c01.z1.r()
            java.lang.String r4 = "getUsernameFromUserInfo(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r3, r4)
        Ld:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mn2.r3.<init>(r45.mb4, com.tencent.mm.plugin.finder.storage.y90, java.lang.String, int, kotlin.jvm.internal.i):void");
    }
}
