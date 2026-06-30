package k01;

/* loaded from: classes9.dex */
public abstract class i {
    public static boolean a(ot0.q qVar) {
        int i17;
        int i18 = qVar.f430199i;
        return (i18 == 33 && ((i17 = qVar.f430214l2) == 2 || i17 == 3)) || i18 == 36;
    }

    public static boolean b(int i17, int i18) {
        return (i17 & 1) == 1 && ((i17 >> (i18 - 1)) & 1) == 1;
    }
}
