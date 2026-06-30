package s83;

/* loaded from: classes8.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f486394a = "";

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f486395b = "";

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f486396c = "";

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f486397d = "";

    /* renamed from: e, reason: collision with root package name */
    public int f486398e = 0;

    public static s83.a a(java.lang.String str) {
        s83.a aVar = new s83.a();
        int indexOf = str.indexOf("<ActivityInfo");
        if (indexOf == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCallActivityMsgInfo", "msgContent not start with <ActivityInfo");
            return aVar;
        }
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str.substring(indexOf), "ActivityInfo", null);
        if (d17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCallActivityMsgInfo", "XmlParser values is null, xml %s", str);
            return null;
        }
        if (d17.containsKey(".ActivityInfo.Title")) {
            aVar.f486394a = (java.lang.String) d17.get(".ActivityInfo.Title");
        }
        if (d17.containsKey(".ActivityInfo.Desc")) {
            aVar.f486395b = (java.lang.String) d17.get(".ActivityInfo.Desc");
        }
        if (d17.containsKey(".ActivityInfo.ImgUrl")) {
            aVar.f486396c = (java.lang.String) d17.get(".ActivityInfo.ImgUrl");
        }
        if (d17.containsKey(".ActivityInfo.StartBtnText")) {
            aVar.f486397d = (java.lang.String) d17.get(".ActivityInfo.StartBtnText");
        }
        if (d17.containsKey(".ActivityInfo.ActivityType")) {
            aVar.f486398e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".ActivityInfo.ActivityType"), 0);
        }
        return aVar;
    }
}
