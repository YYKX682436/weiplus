package lo1;

/* loaded from: classes.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f401631d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.lang.String str) {
        super(0);
        this.f401631d = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        org.json.JSONObject put = new org.json.JSONObject().put("deviceId", this.f401631d).put("totalSize", 0).put("usedSize", 0).put("backupUsedSize", 0).put("lastBackupTime", 0).put("cached", false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(put);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackup.RoamJsApiEvent", "post event:deviceInfo, data:" + put);
        put.put("notify_type", "deviceInfo");
        ((xc1.t) ((ft.q4) i95.n0.c(ft.q4.class))).Ai("wxd930c3b7cf7c92e6", put.toString());
        return jz5.f0.f384359a;
    }
}
