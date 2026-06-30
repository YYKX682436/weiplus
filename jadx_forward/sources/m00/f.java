package m00;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final m00.f f404065a = new m00.f();

    public static final com.p314xaae8f345.p2845xc516c4b6.ecs.C23633x64df374 a(m00.f fVar, android.content.Intent intent) {
        fVar.getClass();
        if (intent == null) {
            return new com.p314xaae8f345.p2845xc516c4b6.ecs.C23633x64df374(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
        }
        java.lang.String stringExtra = intent.getStringExtra("userName");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.String str = stringExtra == null ? "" : stringExtra;
        java.lang.String stringExtra2 = intent.getStringExtra("nationalCode");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        if (stringExtra2.length() >= 6) {
            stringExtra2 = stringExtra2.substring(0, 6);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stringExtra2, "substring(...)");
        }
        java.lang.String str2 = stringExtra2;
        java.lang.String stringExtra3 = intent.getStringExtra("addressPostalCode");
        java.lang.String str3 = stringExtra3 == null ? "" : stringExtra3;
        java.lang.String stringExtra4 = intent.getStringExtra("telNumber");
        java.lang.String str4 = stringExtra4 == null ? "" : stringExtra4;
        java.lang.String stringExtra5 = intent.getStringExtra("proviceFirstStageName");
        java.lang.String str5 = stringExtra5 == null ? "" : stringExtra5;
        java.lang.String stringExtra6 = intent.getStringExtra("addressCitySecondStageName");
        java.lang.String str6 = stringExtra6 == null ? "" : stringExtra6;
        java.lang.String stringExtra7 = intent.getStringExtra("addressCountiesThirdStageName");
        java.lang.String str7 = stringExtra7 == null ? "" : stringExtra7;
        java.lang.String stringExtra8 = intent.getStringExtra("addressCountiesFourStageName");
        java.lang.String str8 = stringExtra8 == null ? "" : stringExtra8;
        java.lang.String stringExtra9 = intent.getStringExtra("addressDetailInfo");
        return new com.p314xaae8f345.p2845xc516c4b6.ecs.C23633x64df374(str, str3, str2, str4, str5, str6, str7, str8, stringExtra9 == null ? "" : stringExtra9, null, null, null, 3584, null);
    }
}
