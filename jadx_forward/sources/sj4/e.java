package sj4;

/* loaded from: classes9.dex */
public final class e implements sj4.c {

    /* renamed from: a, reason: collision with root package name */
    public static final sj4.e f490367a = new sj4.e();

    @Override // sj4.c
    public void a(pj4.j0 reqInfo, yz5.a callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reqInfo, "reqInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        byte[] decode = android.util.Base64.decode(reqInfo.f436675g, 0);
        pj4.x1 x1Var = new pj4.x1();
        x1Var.mo11468x92b714fd(decode);
        java.lang.String str = x1Var.f436865f;
        ((k91.g4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6.class))).Ri(str, new sj4.d(str, x1Var, reqInfo, callback));
    }
}
