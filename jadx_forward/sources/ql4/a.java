package ql4;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final ql4.a f446119a = new ql4.a();

    public bw5.lp0 a() {
        jm4.u2 a17;
        jm4.g3 g3Var = (((ef0.l4) ((qk.i9) i95.n0.c(qk.i9.class))).bj() == null || (a17 = jm4.w2.f381968d.a()) == null) ? null : (jm4.g3) p3380x6a61f93.p3381xf512d0a5.C30458x21b3ff21.m169109x21ba2d75(((jm4.w2) a17).m105978x2737f10());
        if (g3Var == null) {
            return null;
        }
        byte[] m169374x21b81c55 = p3380x6a61f93.p3381xf512d0a5.C30495x21b91836.m169374x21b81c55(((jm4.h3) g3Var).m105978x2737f10());
        bw5.lp0 lp0Var = new bw5.lp0();
        if (m169374x21b81c55.length == 0) {
            rk4.k5.d("playingItem is empty", "MicroMsg.TingPlayAppServiceImpl");
            return null;
        }
        try {
            lp0Var.mo11468x92b714fd(m169374x21b81c55);
            return lp0Var;
        } catch (java.lang.Exception e17) {
            rk4.k5.d(e17.toString(), null);
            return null;
        }
    }
}
