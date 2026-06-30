package l14;

/* loaded from: classes8.dex */
public final class c extends x51.i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final l14.c f396534a = new l14.c();

    /* renamed from: b, reason: collision with root package name */
    public static long f396535b = 1 * (60 * 1000);

    @Override // x51.i0
    /* renamed from: getEventId */
    public java.lang.String mo42415xebc1791f() {
        return "msg_notify_status_polling";
    }

    @Override // x51.i0
    /* renamed from: getMmkv */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 mo42416xfb829b81() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("settings_notification_report_storage");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(M, "getMMKV(...)");
        return M;
    }

    @Override // x51.i0
    /* renamed from: getRouteRule */
    public int mo42417x96ae22f() {
        return 33328;
    }

    @Override // x51.i0
    /* renamed from: getTAG */
    public java.lang.String mo42418xb5886c64() {
        return "MicroMsg.SettingsNotificationReporter";
    }

    @Override // x51.i0
    /* renamed from: getTryIntervalTimeMs */
    public long mo144865x4e20385d() {
        return f396535b;
    }

    @Override // x51.i0
    /* renamed from: realReport */
    public void mo42427x86d86c72() {
        l14.e eVar = l14.e.f396541a;
        java.util.Map map = l14.e.f396542b;
        ((java.util.LinkedHashMap) map).clear();
        eVar.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsNotificationReporter", "dailyReport reportParams: " + map);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        if (rVar != null) {
            ((cy1.a) rVar).Ej("msg_notify_status_polling", map, 33328);
        }
    }

    @Override // x51.i0
    /* renamed from: setEventId */
    public void mo42419x5f32c693(java.lang.String value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
    }

    @Override // x51.i0
    /* renamed from: setMmkv */
    public void mo42420x764d628d(com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
    }

    @Override // x51.i0
    /* renamed from: setRouteRule */
    public void mo42421x65bea2a3(int i17) {
    }

    @Override // x51.i0
    /* renamed from: setTAG */
    public void mo42422xca0293d8(java.lang.String value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
    }

    @Override // x51.i0
    /* renamed from: setTryIntervalTimeMs */
    public void mo144866x29b644d1(long j17) {
        f396535b = j17;
    }
}
