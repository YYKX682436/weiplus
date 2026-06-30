package bt3;

/* loaded from: classes9.dex */
public abstract class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f24256a = 0;

    static {
        new java.text.SimpleDateFormat(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:73:0x01d3. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:74:0x01d6. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:75:0x01d9. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:76:0x01dc. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(android.content.Context r9, com.tencent.mm.storage.f9 r10, boolean r11, r45.j4 r12) {
        /*
            Method dump skipped, instructions count: 938
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bt3.f0.a(android.content.Context, com.tencent.mm.storage.f9, boolean, r45.j4):boolean");
    }

    public static boolean b(com.tencent.mm.storage.f9 f9Var, r45.j4 j4Var) {
        r45.du5 du5Var = new r45.du5();
        java.lang.String j17 = f9Var.j();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (j17 == null) {
            j17 = "";
        }
        du5Var.f372756d = j17;
        du5Var.f372757e = true;
        j4Var.f377561h = du5Var;
        return true;
    }

    public static boolean c(android.content.Context context, r45.j4 j4Var, int i17) {
        java.lang.String string = i17 == 1 ? context.getString(com.tencent.mm.R.string.f490382tf) : i17 == 2 ? context.getString(com.tencent.mm.R.string.f490512x6) : i17 == 3 ? context.getString(com.tencent.mm.R.string.f490564ym) : null;
        j4Var.f377560g = 1;
        r45.du5 du5Var = new r45.du5();
        du5Var.f372756d = string;
        du5Var.f372757e = true;
        j4Var.f377561h = du5Var;
        return true;
    }

    public static void d(java.lang.String str, r45.j4 j4Var) {
        j4Var.f377560g = 1;
        r45.du5 du5Var = new r45.du5();
        du5Var.f372756d = str;
        du5Var.f372757e = true;
        j4Var.f377561h = du5Var;
    }
}
