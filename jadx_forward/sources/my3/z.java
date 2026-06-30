package my3;

/* loaded from: classes13.dex */
public final class z implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ my3.c0 f414379d;

    public z(my3.c0 c0Var) {
        this.f414379d = c0Var;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        int i17 = bundle.getInt("code");
        my3.c0 c0Var = this.f414379d;
        if (i17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Rtos.RtosWatchService", "handshake cgi failed " + i17);
            my3.x xVar = c0Var.f414324f;
            if (xVar != null) {
                ((iy3.c) xVar).a(false, "");
            }
            c0Var.f414324f = null;
        }
        com.p314xaae8f345.p3133xd0ce8b26.p3170x3593a6.C27663xee5e94d4 c27663xee5e94d4 = c0Var.f414320b;
        if (c27663xee5e94d4 != null) {
            c27663xee5e94d4.m119271x4f3ec59(i17, bundle.getInt("taskid"), bundle.getString("handshke"));
        }
    }
}
