package ao0;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ao0.c f12524a = new ao0.c();

    public final ao0.b a(java.lang.String sei) {
        kotlin.jvm.internal.o.g(sei, "sei");
        cl0.g gVar = new cl0.g(sei);
        cl0.e f17 = gVar.f("ga");
        cl0.g k17 = f17 != null ? f17.k(0) : null;
        java.lang.String optString = gVar.optString("gs");
        if (k17 == null) {
            kotlin.jvm.internal.o.d(optString);
            if (optString.length() == 0) {
                return null;
            }
        }
        java.lang.String optString2 = gVar.optString("u");
        float optDouble = (float) gVar.optDouble("a");
        java.lang.String optString3 = k17 != null ? k17.optString(dm.i4.COL_ID) : null;
        java.lang.String str = optString3 == null ? "" : optString3;
        java.lang.String optString4 = k17 != null ? k17.optString("i") : null;
        java.lang.String str2 = optString4 == null ? "" : optString4;
        float optDouble2 = k17 != null ? (float) k17.optDouble("x") : 0.0f;
        float optDouble3 = k17 != null ? (float) k17.optDouble("y") : 0.0f;
        float optDouble4 = k17 != null ? (float) k17.optDouble("r") : 0.0f;
        float optDouble5 = k17 != null ? (float) k17.optDouble("s") : 0.0f;
        java.lang.String optString5 = k17 != null ? k17.optString("g") : null;
        java.lang.String str3 = optString5 == null ? "" : optString5;
        kotlin.jvm.internal.o.d(optString2);
        kotlin.jvm.internal.o.d(optString);
        return new ao0.b(optString2, optDouble, str, str2, optDouble2, optDouble3, optDouble4, optDouble5, str3, optString);
    }
}
