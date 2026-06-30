package la3;

/* loaded from: classes8.dex */
public final class i extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.f3 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zg0.q2 f399069b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f399070c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zg0.q2 f399071d;

    public i(zg0.q2 q2Var, android.content.Context context, zg0.q2 q2Var2) {
        this.f399069b = q2Var;
        this.f399070c = context;
        this.f399071d = q2Var2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.f3
    public void e() {
        zg0.q2 q2Var = this.f399069b;
        try {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) q2Var).e0().rg(new la3.h(this.f399070c, this.f399071d), ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) q2Var).U());
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppWebviewView", "bind web view callback failed");
        }
    }
}
