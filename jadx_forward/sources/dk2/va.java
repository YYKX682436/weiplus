package dk2;

/* loaded from: classes3.dex */
public final class va {
    public va(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final dk2.wa a(android.content.Intent intent) {
        if (intent == null) {
            return null;
        }
        java.lang.String stringExtra = intent.getStringExtra("KEY_PARAMS_CONFIG_MORE_OPTION_UI_BUBBLE_KEY");
        if (stringExtra == null) {
            stringExtra = "";
        }
        dk2.va vaVar = dk2.wa.f315816b;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("Finder.FinderLiveScrollSquareBundle", "getFromIntent " + intent.hashCode() + ", key:" + stringExtra, new java.lang.Object[0]);
        return (dk2.wa) dk2.wa.f315817c.get(stringExtra);
    }
}
