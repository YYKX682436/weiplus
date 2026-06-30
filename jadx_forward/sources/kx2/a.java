package kx2;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final kx2.a f394811a = new kx2.a();

    /* renamed from: b, reason: collision with root package name */
    public static float f394812b;

    public final float a(android.content.Context context) {
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        int c17 = com.p314xaae8f345.mm.ui.bl.c(context);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e8 e8Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e8.f183664a;
        int c18 = e8Var.c(null);
        int a17 = e8Var.a() - c17;
        float f17 = c18 * 0.5625f;
        float f18 = a17;
        float f19 = f18 - f17;
        float f27 = f394812b;
        if (!(f27 == 0.0f) && f19 < f27) {
            f17 = f18 - f27;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderHalfScreenConstants", "getHalfScreenRatio: too large, height=" + a17 + ", halfScreenAreaHeight=" + f19 + ", minHalfCommentHeight=" + f394812b + ", topAreaHeight=" + f17);
        }
        float f28 = f17 / f18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (!(((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Y9).mo141623x754a37bb()).r()).intValue() == 1) || f28 <= 0.0f || f28 >= 1.0f) {
            return 0.75f;
        }
        return 1 - f28;
    }
}
