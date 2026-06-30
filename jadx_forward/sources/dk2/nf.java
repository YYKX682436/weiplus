package dk2;

/* loaded from: classes2.dex */
public final class nf {
    public nf(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final dk2.of a(android.content.Intent intent) {
        if (intent == null) {
            return null;
        }
        java.lang.String stringExtra = intent.getStringExtra("KEY_PARAMS_CONFIG_THEME_SPECIAL_BUBBLE_KEY");
        if (stringExtra == null) {
            stringExtra = "";
        }
        dk2.nf nfVar = dk2.of.f315392j;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("Finder.FinderLiveScrollSquareBundle", "getFromIntent " + intent.hashCode() + ", key:" + stringExtra, new java.lang.Object[0]);
        return (dk2.of) dk2.of.f315393k.get(stringExtra);
    }

    public final void b(android.content.Intent intent, dk2.of ofVar) {
        if (intent == null || ofVar == null) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(c01.id.c());
        sb6.append('_');
        sb6.append(ofVar.hashCode());
        java.lang.String sb7 = sb6.toString();
        dk2.of.f315393k.put(sb7, ofVar);
        intent.putExtra("KEY_PARAMS_CONFIG_THEME_SPECIAL_BUBBLE_KEY", sb7);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("Finder.FinderLiveScrollSquareBundle", "saveToIntent " + intent.hashCode() + ", " + ofVar.hashCode() + ", key:" + sb7, new java.lang.Object[0]);
    }
}
