package yf;

/* loaded from: classes7.dex */
public class l0 implements zf.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f542942a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yf.i0 f542943b;

    public l0(yf.i0 i0Var, org.json.JSONObject jSONObject) {
        this.f542943b = i0Var;
        this.f542942a = jSONObject;
    }

    @Override // zf.b
    public void b(final java.lang.String str, java.lang.String str2) {
        final org.json.JSONObject jSONObject = this.f542942a;
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2);
        yf.i0 i0Var = this.f542943b;
        if (!K0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0Var.x(), "operatePlayBgm, local file path:%s", str2);
            try {
                jSONObject.put("BGMFilePath", str2);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SameLayer.LivePusherPluginHandler", "operatePlayBgm, set param fail", e17);
            }
            i0Var.G(new java.lang.Runnable() { // from class: yf.l0$$a
                @Override // java.lang.Runnable
                public final void run() {
                    yf.i0 i0Var2 = yf.l0.this.f542943b;
                    yf.o oVar = i0Var2.f542895i;
                    if (oVar == null || oVar.h("playBGM", jSONObject).f487221a == 0) {
                        return;
                    }
                    java.lang.String str3 = str;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SameLayer.LivePusherPluginHandler", "operatePlayBgm, play bgm fail, url:%s", str3);
                    if (i0Var2.f542897n != null) {
                        java.util.HashMap hashMap = new java.util.HashMap();
                        hashMap.put("url", str3);
                        ((bg1.q) i0Var2.f542897n).b(i0Var2.f334030d, jc1.g.f380474m, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54056xf1449bd6, "play bgm fail", hashMap);
                    }
                }
            });
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SameLayer.LivePusherPluginHandler", "operatePlayBgm, download file fail, url:%s", str);
        if (i0Var.f542897n != null) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("url", str);
            ((bg1.q) i0Var.f542897n).b(i0Var.f334030d, jc1.g.f380474m, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54056xf1449bd6, "download file fail", hashMap);
        }
    }
}
