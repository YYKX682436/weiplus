package kp3;

/* loaded from: classes14.dex */
public final class j implements ju3.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kp3.x f392535a;

    public j(kp3.x xVar) {
        this.f392535a = xVar;
    }

    @Override // ju3.x
    public void a(int i17, android.util.Range zoomRange) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(zoomRange, "zoomRange");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PalmPrintCameraSettingUIC", "[onOpenFinish] ret: " + i17 + ", zoomRange：" + zoomRange);
        if (i17 != 0) {
            kp3.x xVar = this.f392535a;
            xVar.f392588n.set(true);
            jp3.g.f382533a.i(xVar.m158354x19263085(), 80002, "ERR_PALM_INIT_CAMERA", (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
        }
    }
}
