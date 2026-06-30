package nj1;

/* loaded from: classes5.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f419349d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f419350e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f419351f;

    public e(java.lang.String str, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2) {
        this.f419349d = str;
        this.f419350e = h0Var;
        this.f419351f = h0Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateWithParams params:");
        java.lang.String str = this.f419349d;
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SkylineNativeViewFactoryRichText", sb6.toString());
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        if (jSONObject.has(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306)) {
            java.lang.String optString = jSONObject.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.l lVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.l) this.f419350e.f391656d;
                if (lVar != null) {
                    android.graphics.Canvas lockHardwareCanvas = lVar.f170447n.lockHardwareCanvas();
                    try {
                        lockHardwareCanvas.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
                        lVar.f170447n.unlockCanvasAndPost(lockHardwareCanvas);
                    } catch (java.lang.Throwable th6) {
                        lVar.f170447n.unlockCanvasAndPost(lockHardwareCanvas);
                        throw th6;
                    }
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SkylineNativeViewFactoryRichText", "clean fail! ex:" + e17.getMessage());
            }
            wl1.h hVar = (wl1.h) this.f419351f.f391656d;
            if (hVar != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
                hVar.c(optString);
            }
        }
    }
}
