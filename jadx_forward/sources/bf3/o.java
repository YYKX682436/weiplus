package bf3;

/* loaded from: classes7.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final bf3.o f101176a = new bf3.o();

    public final boolean a(android.graphics.Bitmap bitmap) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap, "bitmap");
        com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.C5133xf1a4812 c5133xf1a4812 = new com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.C5133xf1a4812();
        int m43195x699c8e6a = com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.C5132x8dfa0ba3.m43195x699c8e6a(bitmap, 0.95f, c5133xf1a4812);
        if (m43195x699c8e6a != 1) {
            if (m43195x699c8e6a == 2) {
                return false;
            }
            throw new java.io.IOException("BitmapUtilsJni check failed:" + m43195x699c8e6a);
        }
        int i17 = (c5133xf1a4812.f21475xeab0352a >> 24) & 255;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MBBitmapUtil", "hy: pure color, alpha is " + i17);
        return i17 == 0;
    }
}
