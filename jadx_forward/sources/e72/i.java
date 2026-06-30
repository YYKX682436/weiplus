package e72;

/* loaded from: classes14.dex */
public class i implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e72.k f331438d;

    public i(e72.k kVar) {
        this.f331438d = kVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        if (!this.f331438d.f331446g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NormalFaceMotion", "hy: already stopped");
            return false;
        }
        if (this.f331438d.j() == null) {
            return true;
        }
        this.f331438d.j().startAnimation(this.f331438d.f331447h);
        return true;
    }
}
