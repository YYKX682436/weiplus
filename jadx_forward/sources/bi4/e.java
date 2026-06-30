package bi4;

/* loaded from: classes10.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f102572a = 0;

    static {
        new bi4.a();
    }

    public static int[] a(android.content.Context context) {
        com.p314xaae8f345.mm.ui.ah a17 = com.p314xaae8f345.mm.ui.bh.a(context);
        int i17 = a17.f278668a;
        int i18 = (int) (i17 * 1.7777778f);
        int[] iArr = new int[2];
        int i19 = a17.f278669b;
        if (i18 <= i19) {
            iArr[0] = i17;
            iArr[1] = i18;
        } else {
            iArr[0] = i17;
            iArr[1] = i19;
        }
        return iArr;
    }

    public static int b(android.content.Context context, android.view.View view) {
        int i17 = a(context)[1];
        int i18 = (int) (r4[1] / 1.7777778f);
        a(context)[1] = i18;
        if (view != null) {
            i18 = view.getHeight();
            view.getMeasuredHeight();
        }
        return i17 - i18;
    }

    public static boolean c(android.content.Context context) {
        com.p314xaae8f345.mm.ui.ah a17 = com.p314xaae8f345.mm.ui.bh.a(context);
        return ((float) a17.f278669b) / ((float) a17.f278668a) > 0.8f;
    }

    public static boolean d(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        return str.equals("5") || str.equals("14");
    }
}
