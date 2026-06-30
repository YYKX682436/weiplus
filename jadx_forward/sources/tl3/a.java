package tl3;

/* loaded from: classes11.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6771xc0e95fa2 f501829a = null;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f501830b = "1.0";

    public static void a() {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6771xc0e95fa2 c6771xc0e95fa2 = f501829a;
        if (c6771xc0e95fa2 == null) {
            return;
        }
        c6771xc0e95fa2.k();
    }

    public static java.lang.String b(java.lang.String[] strArr) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (int i17 = 0; i17 < strArr.length; i17++) {
            stringBuffer.append(strArr[i17]);
            if (i17 != strArr.length - 1) {
                stringBuffer.append("|");
            }
        }
        return stringBuffer.toString();
    }

    public static void c() {
        if (f501829a == null) {
            return;
        }
        f501829a.p(b(new java.lang.String[]{java.lang.String.valueOf(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())), f501830b, "end/stop", "1.0", java.lang.String.valueOf(b21.m.a().f98871b)}));
        a();
    }
}
