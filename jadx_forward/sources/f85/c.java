package f85;

/* loaded from: classes7.dex */
public final class c implements f85.e {
    @Override // f85.e
    public boolean a() {
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.j() && b()) || (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.s() && b()) || com.p314xaae8f345.mm.app.w.INSTANCE.f135422n;
    }

    public final boolean b() {
        java.lang.String m07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.m0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ForegroundCondition", "[existForegroundActivity] " + m07);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m07);
        return (m07.length() > 0) && r26.n0.B(m07, "com.tencent.mm", false);
    }
}
