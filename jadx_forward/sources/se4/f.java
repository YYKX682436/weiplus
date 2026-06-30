package se4;

/* loaded from: classes9.dex */
public class f implements km5.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f488455a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ re4.z f488456b;

    public f(long j17, re4.z zVar) {
        this.f488455a = j17;
        this.f488456b = zVar;
    }

    @Override // km5.f
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterInitManager", "onTerminate");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterInitManager", "init takes %d ms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f488455a));
        re4.z zVar = this.f488456b;
        if (zVar != null) {
            zVar.h(0, "");
        }
        se4.h.b(0, "");
    }
}
