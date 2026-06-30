package sx4;

/* loaded from: classes8.dex */
public class s0 {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f495190a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f495191b;

    /* renamed from: c, reason: collision with root package name */
    public static int f495192c;

    public s0(android.content.Intent intent) {
        if (intent == null) {
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("KPublisherId");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        f495190a = stringExtra == null ? "" : stringExtra;
        java.lang.String stringExtra2 = intent.getStringExtra("geta8key_username");
        f495191b = stringExtra2 != null ? stringExtra2 : "";
        f495192c = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1(java.lang.Integer.valueOf(intent.getIntExtra("geta8key_scene", 0)));
    }
}
