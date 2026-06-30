package mn2;

/* loaded from: classes2.dex */
public class c1 extends mn2.a implements ip0.d {

    /* renamed from: e, reason: collision with root package name */
    public final r45.mb4 f411456e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90 f411457f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f411458g;

    public c1(r45.mb4 mediaObj, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90 type, java.lang.String username, java.lang.String localThumbUrl, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        if ((i17 & 4) != 0) {
            username = c01.z1.r();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(username, "getUsernameFromUserInfo(...)");
        }
        localThumbUrl = (i17 & 8) != 0 ? "" : localThumbUrl;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaObj, "mediaObj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(localThumbUrl, "localThumbUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c01.z1.r(), "getUsernameFromUserInfo(...)");
        this.f411456e = mediaObj;
        this.f411457f = type;
        this.f411458g = localThumbUrl;
        if (mediaObj.m75945x2fec8307(0) == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mediaObj.url == null ");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            sb6.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            java.lang.String sb7 = sb6.toString();
            int i18 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderImage", sb7, null);
        }
    }

    @Override // ip0.d
    public android.graphics.Matrix a(float f17, float f18) {
        if (this.f411457f == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f) {
            return null;
        }
        r45.mb4 mb4Var = this.f411456e;
        r45.bb1 bb1Var = (r45.bb1) mb4Var.m75936x14adae67(34);
        if (bb1Var == null) {
            return null;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        android.graphics.Rect rect = new android.graphics.Rect((int) bb1Var.m75938x746dc8a6(0), (int) bb1Var.m75938x746dc8a6(1), (int) bb1Var.m75938x746dc8a6(2), (int) bb1Var.m75938x746dc8a6(3));
        float max = java.lang.Math.max(f17 / rect.width(), f18 / rect.height());
        mb4Var.m75938x746dc8a6(4);
        mb4Var.m75938x746dc8a6(5);
        int i17 = -rect.left;
        int i18 = -rect.top;
        matrix.postScale(max, max);
        matrix.postTranslate(i17 * max, i18 * max);
        return matrix;
    }

    @Override // mn2.h3
    /* renamed from: getMediaType */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90 mo148082x7f025288() {
        return this.f411457f;
    }

    @Override // mn2.h3
    /* renamed from: getPath */
    public java.lang.String mo148083xfb83cc9b() {
        java.lang.String str = this.f411458g;
        if (!(str.length() == 0)) {
            return str;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9 e9Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183665a;
        return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183672h + n();
    }

    @Override // mn2.h3
    /* renamed from: getUrl */
    public java.lang.String mo148084xb5887639() {
        java.lang.String m75945x2fec8307 = this.f411456e.m75945x2fec8307(0);
        return m75945x2fec8307 == null ? "" : m75945x2fec8307;
    }

    @Override // mn2.h3
    public java.lang.String h() {
        java.lang.String m75945x2fec8307 = this.f411456e.m75945x2fec8307(17);
        return m75945x2fec8307 == null ? "" : m75945x2fec8307;
    }

    @Override // mn2.h3
    public java.lang.String i() {
        java.lang.String m75945x2fec8307 = this.f411456e.m75945x2fec8307(18);
        return m75945x2fec8307 == null ? "" : m75945x2fec8307;
    }

    @Override // mn2.h3
    public java.lang.String l() {
        java.lang.String str = this.f411458g;
        if ((str.length() == 0) && (str = this.f411456e.m75945x2fec8307(1)) == null) {
            str = "";
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        return str;
    }

    @Override // mn2.h3
    public java.lang.String m() {
        java.lang.String m75945x2fec8307;
        return (!(this.f411458g.length() == 0) || (m75945x2fec8307 = this.f411456e.m75945x2fec8307(19)) == null) ? "" : m75945x2fec8307;
    }

    @Override // ip0.c
    public java.lang.String n() {
        java.lang.String m75945x2fec8307;
        java.lang.String m75945x2fec83072;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90 y90Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f;
        r45.mb4 mb4Var = this.f411456e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90 y90Var2 = this.f411457f;
        if (y90Var2 != y90Var ? (m75945x2fec8307 = mb4Var.m75945x2fec8307(47)) == null : (m75945x2fec8307 = mb4Var.m75945x2fec8307(46)) == null) {
            m75945x2fec8307 = "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("finder_image_");
        sb6.append(y90Var2.f209907d);
        sb6.append('_');
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mb4Var.m75945x2fec8307(9))) {
            java.lang.String m75945x2fec83073 = mb4Var.m75945x2fec8307(0);
            java.lang.String str = m75945x2fec83073 != null ? m75945x2fec83073 : "";
            char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
            m75945x2fec83072 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(str.getBytes());
        } else {
            m75945x2fec83072 = mb4Var.m75945x2fec8307(9);
        }
        sb6.append(m75945x2fec83072);
        sb6.append('_');
        sb6.append(m75945x2fec8307);
        return sb6.toString();
    }
}
