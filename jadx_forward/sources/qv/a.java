package qv;

@j95.b
/* loaded from: classes.dex */
public class a extends i95.w implements rv.h2 {
    public java.lang.String wi(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !(str.startsWith("https://") || str.startsWith("http://"))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AppMsgBizHelperService", "imgSourceUrl not encode, which is " + str);
            return str;
        }
        try {
            return java.net.URLEncoder.encode(str, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AppMsgBizHelperService", "encode img url error: " + e17);
            return str;
        }
    }
}
