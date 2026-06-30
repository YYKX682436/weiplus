package fm4;

/* loaded from: classes9.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final fm4.e f345710a = new fm4.e();

    public void a(bw5.o50 o50Var, qk.i8 action, bw5.ar0 enterScene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enterScene, "enterScene");
        action.toString();
        enterScene.toString();
        if (o50Var != null) {
            o50Var.c();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[8];
        objArr[0] = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
        objArr[1] = 0;
        java.lang.String c17 = o50Var != null ? o50Var.c() : null;
        if (c17 == null) {
            c17 = "";
        }
        objArr[2] = c17;
        objArr[3] = java.lang.Integer.valueOf(action.f445701d);
        objArr[4] = 0;
        objArr[5] = "";
        objArr[6] = 0;
        objArr[7] = java.lang.Integer.valueOf(enterScene.f106955d);
        g0Var.d(31200, objArr);
    }
}
