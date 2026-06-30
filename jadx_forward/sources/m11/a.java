package m11;

/* loaded from: classes9.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f404154a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f404155b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f404156c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f404157d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f404158e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f404159f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f404160g;

    public a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.f404154a = str;
        this.f404155b = str2;
        this.f404157d = str3;
        this.f404156c = str4;
    }

    public static java.lang.String a(m11.a aVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (aVar != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f404154a)) {
            java.lang.Object[] objArr = new java.lang.Object[4];
            java.lang.String str = aVar.f404154a;
            if (str == null) {
                str = "";
            }
            objArr[0] = str;
            java.lang.String str2 = aVar.f404155b;
            if (str2 == null) {
                str2 = "";
            }
            objArr[1] = str2;
            java.lang.String str3 = aVar.f404157d;
            if (str3 == null) {
                str3 = "";
            }
            objArr[2] = str3;
            java.lang.String str4 = aVar.f404156c;
            objArr[3] = str4 != null ? str4 : "";
            sb6.append(java.lang.String.format("<appinfo><appid>%s</appid><mediatagname>%s</mediatagname><messageext>%s</messageext><messageaction>%s</messageaction></appinfo>", objArr));
            java.lang.String str5 = aVar.f404160g;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5)) {
                sb6.append(str5);
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f404159f) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f404158e)) {
                sb6.append("<platform_signature>");
                sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(aVar.f404159f));
                sb6.append("</platform_signature><imgdatahash>");
                sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(aVar.f404158e));
                sb6.append("</imgdatahash>");
            }
        }
        return sb6.toString();
    }

    public static java.lang.String b(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return "";
        }
        return "<msg>" + str + "</msg>";
    }

    public static m11.a c(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        int indexOf = str.indexOf(60);
        if (indexOf > 0) {
            str = str.substring(indexOf);
        }
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "msg", null);
        if (d17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppMsgAppInfo", "parseImg failed");
            return null;
        }
        m11.a aVar = new m11.a();
        aVar.f404154a = (java.lang.String) d17.get(".msg.appinfo.appid");
        aVar.f404155b = (java.lang.String) d17.get(".msg.appinfo.mediatagname");
        aVar.f404157d = (java.lang.String) d17.get(".msg.appinfo.messageext");
        aVar.f404156c = (java.lang.String) d17.get(".msg.appinfo.messageaction");
        aVar.f404159f = (java.lang.String) d17.get(".msg.platform_signature");
        aVar.f404158e = (java.lang.String) d17.get(".msg.imgdatahash");
        return aVar;
    }

    public a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.f404154a = str;
        this.f404155b = str2;
        this.f404157d = str3;
        this.f404156c = str4;
        this.f404160g = str5;
    }
}
