package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes8.dex */
public class o3 extends com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d {

    /* renamed from: r, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.o3 f273332r = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.o3();

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f273333n = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f273334o = "";

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f273335p = "";

    /* renamed from: q, reason: collision with root package name */
    public int f273336q = 0;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public void A(boolean z17, int i17) {
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FilesFloatBall.FilesFloatBallHelper", "onMenuFloatBallSelected, exit float ball");
            d();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FilesFloatBall.FilesFloatBallHelper", "onMenuFloatBallSelected, enter float ball");
        a0(false);
        if (!k()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.ActivityC12906x5398ea7.U6(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 1, this.f174665d, l(), this.f174670i);
            return;
        }
        j();
        gp1.v vVar = this.f174669h;
        if (vVar != null) {
            vVar.Z();
        }
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        android.content.Intent intent = new android.content.Intent("com.tencent.QQBrowser.action.sdk.document.receiver");
        intent.setPackage("com.tencent.mtt");
        intent.putExtra("key_reader_sdk_window_close", true);
        try {
            context.sendBroadcast(intent);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FilesFloatBall.FilesFloatBallHelper", "closeQb() Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public void H() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FilesFloatBall.FilesFloatBallHelper", "onReceivedBallInfoRemovedEvent, filePath:%s", this.f273333n);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        android.content.Intent intent = new android.content.Intent("com.tencent.QQBrowser.action.sdk.document.receiver");
        intent.setPackage("com.tencent.mtt");
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(dm.i4.f66865x76d1ec5a, 1);
            jSONObject.put("isShow", true);
            jSONArray.put(jSONObject);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put(dm.i4.f66865x76d1ec5a, 2);
            jSONObject2.put("isShow", false);
            jSONArray.put(jSONObject2);
            intent.putExtra("menuItems", jSONArray.toString());
            context.sendBroadcast(intent);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FilesFloatBall.FilesFloatBallHelper", "updateQbFloatBallMenu() Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public void I() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FilesFloatBall.FilesFloatBallHelper", "onReceivedFinishWhenSwitchBallEvent, filePath:%s", this.f273333n);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public boolean n() {
        return true;
    }
}
