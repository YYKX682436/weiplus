package rv4;

/* loaded from: classes12.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv4.p f482055d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f482056e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f482057f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f482058g;

    public o(rv4.p pVar, long j17, long j18, java.lang.String str) {
        this.f482055d = pVar;
        this.f482056e = j17;
        this.f482057f = j18;
        this.f482058g = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f482058g;
        long j17 = this.f482057f;
        long j18 = this.f482056e;
        rv4.p pVar = this.f482055d;
        try {
            try {
                pVar.f482066h = j18;
                pVar.f482067i = j17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSGlobalTeachHotSearchData", "[ftshotsearch] Response received, duration: " + (j17 - j18) + "ms");
                if (str.length() == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FTSGlobalTeachHotSearchData", "[ftshotsearch] Empty JSON received");
                    pVar.f482061c = kz5.p0.f395529d;
                } else {
                    java.util.List d17 = rv4.q.f482077a.d(new org.json.JSONObject(str));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSGlobalTeachHotSearchData", "[ftshotsearch] Parsed " + d17.size() + " items");
                    pVar.f482061c = d17;
                    if (!d17.isEmpty()) {
                        pVar.l(ov4.f.f430765g, pVar.f482073o);
                    }
                    java.util.Iterator it = d17.iterator();
                    while (it.hasNext()) {
                        ((rv4.i0) it.next()).f482027e = pVar;
                    }
                    java.lang.String u17 = ((sg0.a3) ((su4.e1) i95.n0.c(su4.e1.class))).wi().u("websearch:hotsearch:config", "");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("[FTSNativeGlobalTeach] FTSGlobalTeachDataMgr", "getHotSearchConfig: " + u17);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u17);
                    org.json.JSONObject f17 = pv4.a.f(u17);
                    if (f17 != null) {
                        java.lang.String optString = f17.optString("searchID", "");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
                        pVar.f482063e = optString;
                        java.lang.String optString2 = f17.optString("requestId", "");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString2, "optString(...)");
                        pVar.f482062d = optString2;
                        f17.optBoolean("refreshCanShow", false);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f17.optString("refreshTitle", ""), "optString(...)");
                        java.lang.String optString3 = f17.optString("refreshDocInfo", "");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString3, "optString(...)");
                        pVar.f482064f = optString3;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f17.optString("guessTitle", ""), "optString(...)");
                        f17.optInt("showCount", 4);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f17.optString("ctx", ""), "optString(...)");
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSGlobalTeachHotSearchData", "[ftshotsearch] Config updated: searchId=" + pVar.f482063e);
                    }
                }
                if (pVar.f482075q == 1) {
                    pVar.f482068j = 1;
                }
                pVar.f482069k = false;
                yz5.a aVar = pVar.f482074p;
                if (aVar != null) {
                    aVar.mo152xb9724478();
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSGlobalTeachHotSearchData", "[ftshotsearch] UI updated successfully with " + pVar.f482061c.size() + " items");
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTSGlobalTeachHotSearchData", "[ftshotsearch] Error handling network response", e17);
                yz5.a aVar2 = pVar.f482074p;
                if (aVar2 != null) {
                    aVar2.mo152xb9724478();
                }
            }
            pVar.f482074p = null;
        } catch (java.lang.Throwable th6) {
            pVar.f482074p = null;
            throw th6;
        }
    }
}
