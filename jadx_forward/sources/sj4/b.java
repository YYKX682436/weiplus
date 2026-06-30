package sj4;

/* loaded from: classes9.dex */
public final class b implements sj4.c {

    /* renamed from: a, reason: collision with root package name */
    public static final sj4.b f490357a = new sj4.b();

    @Override // sj4.c
    public void a(pj4.j0 reqInfo, yz5.a callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reqInfo, "reqInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        byte[] decode = android.util.Base64.decode(reqInfo.f436675g, 0);
        pj4.s1 s1Var = new pj4.s1();
        s1Var.mo11468x92b714fd(decode);
        long j17 = s1Var.f436819d;
        java.lang.String str = s1Var.f436820e;
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).ml(j17, str, 106, true, false, "", new sj4.a(j17, str, callback, reqInfo));
    }
}
