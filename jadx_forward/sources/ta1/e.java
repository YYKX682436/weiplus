package ta1;

/* loaded from: classes7.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ta1.t0 f498143d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ta1.f f498144e;

    public e(ta1.f fVar, ta1.t0 t0Var) {
        this.f498144e = fVar;
        this.f498143d = t0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseGameRecord.HardwareMgrImp", "hy: stopRecord, stop callback");
        this.f498144e.f498147c.mo127743x5a5b64d();
        this.f498143d.a(0, 0, "ok", "");
    }
}
