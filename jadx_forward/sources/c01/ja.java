package c01;

/* loaded from: classes9.dex */
public final class ja {

    /* renamed from: a, reason: collision with root package name */
    public static final c01.ja f118803a = new c01.ja();

    public final boolean a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        p15.e eVar = new p15.e();
        java.lang.String str = msgInfo.G;
        if (str == null) {
            str = "";
        }
        eVar.m126728xdc93280d(str);
        p15.s q17 = eVar.q();
        if ((q17 != null ? q17.j() : 0) != 0) {
            return false;
        }
        if ((msgInfo.F & 1048576) != 0) {
            return false;
        }
        int i17 = c01.ia.f118787a;
        p15.s q18 = eVar.q();
        return !(q18 != null && (q18.k() == 2 || q18.u() == 1));
    }
}
