package up3;

/* loaded from: classes12.dex */
public final class b0 extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f511344a = tp3.b.a("¯¬¼ ¥¥\u009b·£¶µ¤±·");

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f511345b = tp3.b.a("¤´ \u009f¢¯§");

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f511346c = tp3.b.a("¯ ª\u0090½¹¦¤¥¡\u0099´\u00ad ²°");

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f511347d = tp3.b.a("\u00ad¿©\u0090¸»¥¨¡¶µ\u0098¬¨±·");

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f511348e = tp3.b.a("®£«\u0097¼º§«¤¢\u0098¦¨®¦");

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f511349f = tp3.b.a("©»\u00ad\u0094¶±¾\u0098® ¯¦");

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f511350g = tp3.b.a("¥·¡\u0098° ¶«");

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String f511351h = tp3.b.a("·¥·\u008e¶¶ \u0092¯©¼¬¸\u0094§ª«·¬¤¶¦");

    public b0(up3.r rVar) {
    }

    public static void a(android.content.Context context, java.lang.String str, java.lang.String str2, boolean z17) {
        android.content.Intent intent = new android.content.Intent(f511344a);
        intent.putExtra(f511345b, f511348e);
        intent.putExtra(f511349f, str);
        intent.putExtra(f511350g, str2);
        intent.putExtra(f511351h, z17);
        intent.setPackage(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b);
        context.sendBroadcast(intent, com.p314xaae8f345.mm.sdk.p2603x2137b148.v9.a());
    }

    public static void b(android.content.Context context, java.lang.String str, java.lang.String[] strArr) {
        android.content.Intent intent = new android.content.Intent(f511344a);
        intent.putExtra(f511345b, f511346c);
        intent.putExtra(f511349f, str);
        intent.putExtra(f511347d, strArr);
        intent.setPackage(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b);
        context.sendBroadcast(intent, com.p314xaae8f345.mm.sdk.p2603x2137b148.v9.a());
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (!f511344a.equals(intent.getAction())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(up3.d0.f511356d, "Explained by site 1.");
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra(f511345b);
        ((ku5.t0) ku5.t0.f394148d).g(new up3.a0(this, stringExtra, intent));
    }
}
