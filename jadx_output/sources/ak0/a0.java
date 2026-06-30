package ak0;

/* loaded from: classes11.dex */
public abstract class a0 {
    public static java.io.Serializable a(android.content.Intent intent, java.lang.String str) {
        if (intent == null) {
            return null;
        }
        try {
            return intent.getSerializableExtra(str);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LegacyTinkerIntentUtil", "getSerializableExtra exception:" + e17.getMessage());
            return null;
        }
    }
}
