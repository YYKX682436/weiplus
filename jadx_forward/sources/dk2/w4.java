package dk2;

/* loaded from: classes3.dex */
public final class w4 {
    public w4(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final dk2.x4 a(android.content.Intent intent) {
        if (intent == null) {
            return null;
        }
        java.lang.String stringExtra = intent.getStringExtra("KEY_PARAMS_CONFIG_KEY");
        if (stringExtra == null) {
            stringExtra = "";
        }
        dk2.w4 w4Var = dk2.x4.C;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("Finder.FinderLiveBundle", "getFromIntent " + intent.hashCode() + ", key:" + stringExtra, new java.lang.Object[0]);
        return (dk2.x4) dk2.x4.D.get(stringExtra);
    }

    public final void b(android.os.Bundle bundle, dk2.x4 x4Var) {
        if (bundle == null || x4Var == null) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(c01.id.c());
        sb6.append('_');
        sb6.append(x4Var.hashCode());
        java.lang.String sb7 = sb6.toString();
        dk2.x4.D.put(sb7, x4Var);
        bundle.putString("KEY_PARAMS_CONFIG_KEY", sb7);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("Finder.FinderLiveBundle", "saveToBundle " + bundle.hashCode() + ", " + x4Var.hashCode() + ", key:" + sb7, new java.lang.Object[0]);
    }

    public final void c(android.content.Intent intent, dk2.x4 x4Var) {
        if (intent == null || x4Var == null) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(c01.id.c());
        sb6.append('_');
        sb6.append(x4Var.hashCode());
        java.lang.String sb7 = sb6.toString();
        dk2.x4.D.put(sb7, x4Var);
        intent.putExtra("KEY_PARAMS_CONFIG_KEY", sb7);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("Finder.FinderLiveBundle", "saveToIntent " + intent.hashCode() + ", " + x4Var.hashCode() + ", key:" + sb7, new java.lang.Object[0]);
    }
}
