package q00;

/* loaded from: classes9.dex */
public final class h implements ip0.c {

    /* renamed from: d, reason: collision with root package name */
    public final bw5.c7 f440790d;

    public h(bw5.c7 ecsImg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ecsImg, "ecsImg");
        this.f440790d = ecsImg;
    }

    public final java.lang.String a() {
        boolean C = com.p314xaae8f345.mm.ui.bk.C();
        bw5.c7 c7Var = this.f440790d;
        if (C) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c7Var.f107492m[4] ? c7Var.f107489g : "", "getImgUrlDarkmode(...)");
            if (!r26.n0.N(r0)) {
                java.lang.String str = c7Var.f107492m[4] ? c7Var.f107489g : "";
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                return str;
            }
        }
        java.lang.String b17 = c7Var.b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b17);
        return b17;
    }

    @Override // ip0.c
    public java.lang.String n() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(a());
        sb6.append("::");
        bw5.c7 c7Var = this.f440790d;
        sb6.append(c7Var.f107488f);
        sb6.append("::");
        sb6.append(c7Var.f107487e);
        java.lang.String sb7 = sb6.toString();
        java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA-256");
        byte[] bytes = sb7.getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        byte[] digest = messageDigest.digest(bytes);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(digest);
        return kz5.z.a0(digest, "", null, null, 0, null, q00.g.f440789d, 30, null);
    }
}
