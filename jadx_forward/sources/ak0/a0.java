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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LegacyTinkerIntentUtil", "getSerializableExtra exception:" + e17.getMessage());
            return null;
        }
    }
}
