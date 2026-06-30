package qm;

/* loaded from: classes11.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public android.graphics.Bitmap f446149a;

    public static android.graphics.Bitmap a(android.content.Context context, android.graphics.Bitmap bitmap) {
        if (context == null || bitmap == null) {
            return null;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(android.R.dimen.notification_large_icon_height) - context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.a5x);
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.S(bitmap, dimensionPixelSize, dimensionPixelSize, false, false), false, context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.a5w));
    }

    public final android.graphics.Bitmap b(java.lang.String str, com.p314xaae8f345.mm.vfs.r6 r6Var) {
        try {
            if (r6Var == null) {
                return ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.r4) ((uq3.h) i95.n0.c(uq3.h.class))).Vi(str, 9);
            }
            if (r6Var.m()) {
                return com.p314xaae8f345.mm.sdk.p2603x2137b148.x.L(r6Var.m82469x9616526c(), 96, 96);
            }
            return null;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NotificationAvatar", "loadAvatar err: " + th6);
            return null;
        }
    }
}
