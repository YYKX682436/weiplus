package pc0;

@j95.b
/* loaded from: classes10.dex */
public final class k extends i95.w implements ci0.s {
    public void Ai(android.content.Context context, java.lang.String downloadUrl, java.lang.String appId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(downloadUrl, "downloadUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        if (appId.equals("wxa5e0de08d96cc09d")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CheckDownloadUtil", "download SecondCut url ".concat(downloadUrl));
            gw4.f fVar = new gw4.f(context);
            fVar.f357690b = "mmdownloadapp_zJ3ZCIGTevklRQPhnw";
            ((fw4.l) ((gw4.g) i95.n0.c(gw4.g.class))).wi(fVar, null);
        }
    }

    public boolean wi(android.content.Context context, java.lang.String packageName, java.lang.String publicKey) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(packageName, "packageName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(publicKey, "publicKey");
        return dw3.c.f325714a.b(context, packageName, publicKey);
    }
}
