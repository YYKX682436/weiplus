package xl3;

/* loaded from: classes11.dex */
public abstract class d {
    public static boolean a(b21.r rVar) {
        return (rVar == null || android.text.TextUtils.isEmpty(rVar.F) || !"hls".equalsIgnoreCase(rVar.F)) ? false : true;
    }

    public static boolean b(int i17) {
        if (i17 != 0 && i17 != 1 && i17 != 4 && i17 != 5 && i17 != 14) {
            switch (i17) {
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                    break;
                default:
                    kl3.e l17 = kl3.t.l();
                    return l17 != null && l17.j(i17);
            }
        }
        return true;
    }
}
