package dy4;

/* loaded from: classes8.dex */
public final class s implements z41.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dy4.w f326235a;

    public s(dy4.w wVar) {
        this.f326235a = wVar;
    }

    @Override // z41.b
    public final void a(z41.a aVar, z41.a aVar2) {
        int i17;
        int i18 = aVar2 == null ? -1 : dy4.r.f326231a[aVar2.ordinal()];
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
        dy4.w wVar = this.f326235a;
        wVar.f326257j = i17;
        int i19 = wVar.f326257j;
        if (i19 == wVar.f326258k) {
            return;
        }
        wVar.f326258k = i19;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(wVar.f326248a, "onOrientationsChange currentOrientation=" + wVar.f326257j);
        try {
            org.json.JSONObject c17 = wVar.c();
            c17.put("newOrientation", wVar.f326257j);
            wVar.getClass();
            int i27 = android.provider.Settings.System.getInt(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getContentResolver(), "accelerometer_rotation", 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(wVar.f326248a, "accRotation=" + i27);
            c17.put("sysLock", i27 == 0 ? 1 : 0);
            wVar.a("onOrientationsChange", c17);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(wVar.f326248a, "OnXWebVideoError fail", e17);
        }
    }
}
