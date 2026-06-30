package wg4;

/* loaded from: classes7.dex */
public final class a extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "reportFrameSetStatus";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String optString = data.optString("frameSetId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
        if (optString.length() == 0) {
            s().mo146xb9724478(h(1, "frameSetId empty!"));
        }
        int optInt = data.optInt("status");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MBJsApiReportFrameSetStatus", "frameSetId:" + optString + " status:" + optInt);
        if (optInt == 0) {
            yg4.a aVar = yg4.a.f543861a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicLiveCardReporter", "markFrameSetAvailable frameSetId:".concat(optString));
            if (!(optString.length() == 0)) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                yg4.a.f543863c.put(optString, java.lang.Long.valueOf(currentTimeMillis));
                fq0.x Ai = ((fq0.z) ((gq0.r) i95.n0.c(gq0.r.class))).Ai(optString);
                java.lang.String str = Ai != null ? Ai.f347010a : null;
                if (str != null) {
                    if (str.length() > 0) {
                        aVar.a(str, 2L, currentTimeMillis, 0L);
                    }
                }
            }
        }
        s().mo146xb9724478(k());
    }
}
