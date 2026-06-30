package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public class a4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f81695d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.b4 f81696e;

    public a4(com.tencent.mm.plugin.appbrand.jsapi.media.b4 b4Var, java.util.ArrayList arrayList) {
        this.f81696e = b4Var;
        this.f81695d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.vfs.x1 m17;
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it = this.f81695d.iterator();
        while (it.hasNext()) {
            com.tencent.mm.choosemsgfile.compat.MsgFile msgFile = (com.tencent.mm.choosemsgfile.compat.MsgFile) it.next();
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                if (com.tencent.mm.sdk.platformtools.t8.K0(msgFile.f64762e) || !com.tencent.mm.vfs.w6.j(msgFile.f64762e)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMessageFile", "msgFile:%s is not exist", msgFile.f64762e);
                } else {
                    if ("image".equals(msgFile.f64765h)) {
                        int a17 = com.tencent.mm.sdk.platformtools.l.a(msgFile.f64762e);
                        if (a17 != 0) {
                            com.tencent.mm.vfs.r6 allocTempFile = this.f81696e.f81723a.getFileSystem().allocTempFile(msgFile.f64763f);
                            if (allocTempFile != null) {
                                boolean y07 = com.tencent.mm.sdk.platformtools.x.y0(msgFile.f64762e, a17, "png".equals(msgFile.f64766i) ? android.graphics.Bitmap.CompressFormat.PNG : android.graphics.Bitmap.CompressFormat.JPEG, 100, allocTempFile.o());
                                if (y07) {
                                    msgFile.f64762e = allocTempFile.o();
                                    msgFile.f64761d = (int) allocTempFile.C();
                                }
                                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMessageFile", "isOk:%b degree:%d msgFile:%s", java.lang.Boolean.valueOf(y07), java.lang.Integer.valueOf(a17), msgFile);
                            } else {
                                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMessageFile", "allocTempFile failed");
                            }
                        }
                        com.tencent.mm.plugin.appbrand.jsapi.media.p7.a(msgFile.f64762e);
                    }
                    if (com.tencent.mm.sdk.platformtools.y1.g(msgFile.f64762e)) {
                        java.lang.String Ai = ((h12.z) ((k12.u) i95.n0.c(k12.u.class))).Ai(msgFile.f64762e, 1);
                        msgFile.f64762e = Ai;
                        com.tencent.mm.vfs.z7 a18 = com.tencent.mm.vfs.z7.a(Ai);
                        java.lang.String str = a18.f213279f;
                        if (str != null) {
                            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
                            if (!a18.f213279f.equals(l17)) {
                                a18 = new com.tencent.mm.vfs.z7(a18.f213277d, a18.f213278e, l17, a18.f213280g, a18.f213281h);
                            }
                        }
                        com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a18, null);
                        long j17 = 0;
                        if (m18.a() && (m17 = m18.f213266a.m(m18.f213267b)) != null) {
                            j17 = m17.f213233c;
                        }
                        msgFile.f64761d = (int) j17;
                        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMessageFile", "convert wxam to jpg, msgFile = " + msgFile);
                    }
                    com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(msgFile.f64762e);
                    ik1.b0 b0Var = new ik1.b0();
                    com.tencent.mm.plugin.appbrand.appstorage.j1 createTempFileFrom = this.f81696e.f81723a.getFileSystem().createTempFileFrom(r6Var, msgFile.f64766i, false, b0Var);
                    if (createTempFileFrom == com.tencent.mm.plugin.appbrand.appstorage.j1.OK) {
                        jSONObject.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, b0Var.f291824a);
                        jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, msgFile.f64763f);
                        jSONObject.put("size", msgFile.f64761d);
                        jSONObject.put("type", msgFile.f64765h);
                        jSONObject.put("time", msgFile.f64764g);
                        jSONArray.put(jSONObject);
                    } else {
                        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMessageFile", "msgFile:%s result:%s", msgFile, createTempFileFrom);
                    }
                }
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiChooseMessageFile", e17, "", new java.lang.Object[0]);
            }
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errMsg", this.f81696e.f81725c.k() + ":ok");
            jSONObject2.put("tempFiles", jSONArray);
        } catch (org.json.JSONException e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiChooseMessageFile", e18, "", new java.lang.Object[0]);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMessageFile", "chooseMessageFile:%s", jSONObject2.toString());
        com.tencent.mm.plugin.appbrand.jsapi.media.b4 b4Var = this.f81696e;
        b4Var.f81723a.a(b4Var.f81724b, jSONObject2.toString());
    }
}
