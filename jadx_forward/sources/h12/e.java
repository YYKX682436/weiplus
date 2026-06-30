package h12;

/* loaded from: classes9.dex */
public abstract class e {
    public static java.io.InputStream a(android.content.Context context, java.lang.String str) {
        if (context != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            try {
                return context.getResources().openRawResource(context.getResources().getIdentifier(str.split("\\.")[0], "drawable", context.getPackageName()));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EmojiInfoUtil", "get emoji file fail, %s", e17.getMessage());
            }
        }
        return null;
    }
}
