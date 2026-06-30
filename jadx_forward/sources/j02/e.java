package j02;

/* loaded from: classes8.dex */
public final class e implements vz.z1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.ui.ActivityC13235x6e95dd9a f378518a;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.ui.ActivityC13235x6e95dd9a activityC13235x6e95dd9a) {
        this.f378518a = activityC13235x6e95dd9a;
    }

    @Override // vz.z1
    public final void a(java.lang.String str, org.json.JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f378518a.f178756f = jSONObject.optLong("download_id");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("GameDetainManager.GameCloudAppDownloadUI", "gamelog.addDownloadTaskInWidget errMsg=" + str + "  value=" + jSONObject);
    }
}
