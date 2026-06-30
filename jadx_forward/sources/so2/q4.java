package so2;

/* loaded from: classes2.dex */
public final class q4 {

    /* renamed from: a, reason: collision with root package name */
    public static final so2.q4 f492084a = new so2.q4();

    public final boolean a(r45.pb4 pb4Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pb4Var, "<this>");
        if (pb4Var.m75939xb282bd08(1) > 0) {
            zl2.q4 q4Var = zl2.q4.f555466a;
            long m75942xfb822ef2 = pb4Var.m75942xfb822ef2(0);
            java.util.Calendar calendar = java.util.Calendar.getInstance();
            calendar.setTimeInMillis(m75942xfb822ef2);
            int i17 = calendar.get(1);
            int i18 = calendar.get(2);
            int i19 = calendar.get(5);
            java.util.Calendar calendar2 = java.util.Calendar.getInstance();
            int i27 = calendar2.get(1);
            int i28 = calendar2.get(2);
            if (i17 < i27 || (i17 == i27 && i18 < i28) || (i17 == i27 && i18 == i28 && i19 < calendar2.get(5))) {
                pb4Var.set(1, 0);
                pb4Var.set(2, 0L);
                pb4Var.set(0, 0L);
                return true;
            }
        }
        return false;
    }
}
