package dk5;

/* loaded from: classes9.dex */
public class y2 implements k01.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f316535a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 f316536b;

    public y2(com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 activityC22571x51759e93, android.content.Intent intent) {
        this.f316536b = activityC22571x51759e93;
        this.f316535a = intent;
    }

    @Override // k01.t0
    public void a(boolean z17) {
    }

    @Override // k01.t0
    public void b() {
        this.f316535a.putExtra("KShowTodoIntroduceView", 1);
        dk5.m7.b(this.f316536b, null);
    }
}
