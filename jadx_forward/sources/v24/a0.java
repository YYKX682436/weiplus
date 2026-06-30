package v24;

/* loaded from: classes15.dex */
public class a0 implements com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.tg {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f514429a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f514430b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f514431c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wd0.p1 f514432d;

    public a0(android.content.Context context, long j17, long j18, wd0.p1 p1Var) {
        this.f514429a = context;
        this.f514430b = j17;
        this.f514431c = j18;
        this.f514432d = p1Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.tg
    public void a(boolean z17) {
        if (z17) {
            v24.o0.a(this.f514429a, 3, 1, this.f514430b, this.f514431c, new v24.z(this), true);
        } else {
            this.f514432d.a();
        }
    }
}
