package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public final class od implements z41.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.pd f268274a;

    public od(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.pd pdVar) {
        this.f268274a = pdVar;
    }

    @Override // z41.b
    public final void a(z41.a aVar, z41.a aVar2) {
        int i17;
        nw4.n nVar;
        int i18 = aVar2 == null ? -1 : com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.nd.f267404a[aVar2.ordinal()];
        if (i18 == 1) {
            i17 = 90;
        } else if (i18 == 2) {
            i17 = -90;
        } else if (i18 == 3) {
            i17 = 0;
        } else if (i18 != 4) {
            return;
        } else {
            i17 = 180;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.pd pdVar = this.f268274a;
        pdVar.f268293b = i17;
        int i19 = pdVar.f268293b;
        if (i19 == pdVar.f268294c) {
            return;
        }
        pdVar.f268294c = i19;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewVideoFullScreenHelper", "onOrientationsChange currentOrientation=" + pdVar.f268293b);
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d c17 = pdVar.c();
            if (c17 == null || (nVar = c17.f265377p0) == null) {
                return;
            }
            int i27 = pdVar.f268293b;
            pdVar.getClass();
            int i28 = android.provider.Settings.System.getInt(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getContentResolver(), "accelerometer_rotation", 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewVideoFullScreenHelper", "accRotation=" + i28);
            nVar.Y(i27, i28 == 0 ? 1 : 0);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewVideoFullScreenHelper", "onOrientationsChange fail", e17);
        }
    }
}
