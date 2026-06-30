package v24;

/* loaded from: classes15.dex */
public class d0 implements com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.tg {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f514440a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f514441b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ wd0.p1 f514442c;

    public d0(android.content.Context context, long j17, wd0.p1 p1Var) {
        this.f514440a = context;
        this.f514441b = j17;
        this.f514442c = p1Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.tg
    public void a(boolean z17) {
        if (z17) {
            v24.o0.a(this.f514440a, 3, 1, this.f514441b, 0L, new v24.c0(this), false);
        } else {
            this.f514442c.a();
        }
    }
}
