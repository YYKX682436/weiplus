package qp1;

/* loaded from: classes.dex */
public abstract class m {
    public static void a(android.os.Bundle bundle, java.lang.String str, java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            bundle.putString(str, (java.lang.String) obj);
            return;
        }
        if (obj instanceof java.lang.Integer) {
            bundle.putInt(str, ((java.lang.Integer) obj).intValue());
            return;
        }
        if (obj instanceof java.lang.Long) {
            bundle.putLong(str, ((java.lang.Long) obj).longValue());
            return;
        }
        if (obj instanceof java.lang.Boolean) {
            bundle.putBoolean(str, ((java.lang.Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof java.lang.Double) {
            bundle.putDouble(str, ((java.lang.Double) obj).doubleValue());
        } else if (obj instanceof byte[]) {
            bundle.putByteArray(str, (byte[]) obj);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FloatBallIntentUtil", "put not support type, key:%s, value:%s", str, obj);
        }
    }

    public static void b(android.content.Intent intent, android.os.Bundle bundle, java.util.Set set) {
        android.os.Bundle bundle2 = new android.os.Bundle();
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (bundle.containsKey(str)) {
                a(bundle2, str, bundle.get(str));
            }
        }
        intent.putExtras(bundle2);
    }

    public static void c(android.content.Intent intent, android.os.Bundle bundle, java.util.Set set) {
        if (intent.getExtras() != null) {
            android.os.Bundle extras = intent.getExtras();
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                if (extras.containsKey(str)) {
                    a(bundle, str, extras.get(str));
                }
            }
        }
    }
}
