package vs5;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final vs5.a f521457a = new vs5.a();

    public static /* synthetic */ void b(vs5.a aVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, org.json.JSONObject jSONObject, java.lang.String str7, int i17, java.lang.Object obj) {
        aVar.a(str, str2, str3, str4, str5, str6, (i17 & 64) != 0 ? null : jSONObject, (i17 & 128) != 0 ? "" : str7);
    }

    public final void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String shareScene, java.lang.String shareType, java.lang.String isFastShare, org.json.JSONObject jSONObject, java.lang.String str4) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shareScene, "shareScene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shareType, "shareType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(isFastShare, "isFastShare");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveShareReporter", "[report25775] liveId:" + str + ", feedId:" + str2 + ", username:" + str3 + ", shareScene:" + shareScene + ", shareType: " + shareType + "isFastShare:" + isFastShare + ", shareExtra:" + jSONObject + " sessionBuffer: " + str4);
        java.lang.String t17 = r26.i0.t(java.lang.String.valueOf(jSONObject), ",", ";", false);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[10];
        objArr[0] = java.lang.String.valueOf(currentTimeMillis);
        if (str == null) {
            str = "";
        }
        objArr[1] = str;
        if (str2 == null) {
            str2 = "";
        }
        objArr[2] = str2;
        if (str3 == null) {
            str3 = "";
        }
        objArr[3] = str3;
        objArr[4] = shareScene;
        objArr[5] = shareType;
        objArr[6] = isFastShare;
        objArr[7] = t17;
        objArr[8] = java.lang.Long.valueOf(currentTimeMillis);
        objArr[9] = str4;
        g0Var.d(25775, objArr);
    }
}
