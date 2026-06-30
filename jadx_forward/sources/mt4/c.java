package mt4;

/* loaded from: classes9.dex */
public class c {
    public final int a(android.content.Intent intent) {
        if (intent == null) {
            b("Intent with no response code, assuming OK (known issue)");
            return 1;
        }
        java.lang.Object obj = intent.getExtras().get("RESPONSE_CODE");
        if (obj == null) {
            b("Intent with no response code, assuming OK (known issue)");
            return 0;
        }
        if (obj instanceof java.lang.Integer) {
            return ((java.lang.Integer) obj).intValue();
        }
        if (obj instanceof java.lang.Long) {
            return (int) ((java.lang.Long) obj).longValue();
        }
        b("Unexpected type for intent response code.");
        b(obj.getClass().getName());
        throw new java.lang.RuntimeException("Unexpected type for intent response code: ".concat(obj.getClass().getName()));
    }

    public void b(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IabResolver", "In-app billing error: " + str);
    }
}
