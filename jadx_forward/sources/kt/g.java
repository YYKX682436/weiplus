package kt;

@j95.b
/* loaded from: classes5.dex */
public class g extends i95.w implements lt.n0 {
    public void Ai(java.lang.String key, java.lang.String imagePath) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.p0.f273354a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imagePath, "imagePath");
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var2 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.p0.f273354a;
            if (o4Var2 != null) {
                o4Var2.putString(key, imagePath);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizHalfScreenChattingUtil", "saveBizArticleQuoteThumbPath  k:" + key + "  v:" + imagePath);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BizHalfScreenChattingUtil", e17, "saveBizArticleQuoteThumbPath", new java.lang.Object[0]);
        }
    }

    public boolean wi(java.lang.String key) {
        boolean z17;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.p0.f273354a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var2 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.p0.f273354a;
            long j17 = o4Var2 != null ? o4Var2.getLong(key, 0L) : 0L;
            if (j17 > 0 && c01.id.c() - j17 <= 86400000) {
                z17 = false;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizHalfScreenChattingUtil", "isAutoGenerateQuote : " + z17);
                return z17;
            }
            z17 = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizHalfScreenChattingUtil", "isAutoGenerateQuote : " + z17);
            return z17;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BizHalfScreenChattingUtil", e17, "isAutoGenerateQuote", new java.lang.Object[0]);
            return false;
        }
    }
}
