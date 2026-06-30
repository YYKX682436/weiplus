package mn2;

/* loaded from: classes2.dex */
public final class u0 extends mn2.c1 {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f411658h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ u0(r45.mb4 r1, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90 r2, java.lang.String r3, int r4, p3321xbce91901.jvm.p3324x21ffc6bd.i r5) {
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
        throw new UnsupportedOperationException("Method not decompiled: mn2.u0.<init>(r45.mb4, com.tencent.mm.plugin.finder.storage.y90, java.lang.String, int, kotlin.jvm.internal.i):void");
    }

    @Override // mn2.c1, ip0.d
    public android.graphics.Matrix a(float f17, float f18) {
        return null;
    }

    @Override // mn2.c1, mn2.h3
    public java.lang.String l() {
        r45.mb4 mb4Var = this.f411456e;
        java.lang.String m75945x2fec8307 = mb4Var.m75945x2fec8307(25);
        if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
            return super.l();
        }
        java.lang.String m75945x2fec83072 = mb4Var.m75945x2fec8307(25);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m75945x2fec83072);
        return m75945x2fec83072;
    }

    @Override // mn2.c1, mn2.h3
    public java.lang.String m() {
        r45.mb4 mb4Var = this.f411456e;
        java.lang.String m75945x2fec8307 = mb4Var.m75945x2fec8307(26);
        if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
            return super.m();
        }
        java.lang.String m75945x2fec83072 = mb4Var.m75945x2fec8307(26);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m75945x2fec83072);
        return m75945x2fec83072;
    }

    @Override // mn2.c1, ip0.c
    public java.lang.String n() {
        return this.f411658h;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(r45.mb4 mediaObj, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90 type, java.lang.String username) {
        super(mediaObj, type, username, null, 8, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaObj, "mediaObj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("finder_image_");
        sb6.append(type.f209907d);
        sb6.append('_');
        java.lang.String l17 = l();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(l17.getBytes()));
        this.f411658h = sb6.toString();
    }
}
