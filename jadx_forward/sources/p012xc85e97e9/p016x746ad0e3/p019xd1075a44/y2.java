package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* loaded from: classes15.dex */
public class y2 extends n3.d2 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f91274a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f91275b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2 f91276c;

    public y2(p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2 z2Var, int i17) {
        this.f91276c = z2Var;
        this.f91275b = i17;
    }

    @Override // n3.d2, n3.c2
    public void a(android.view.View view) {
        this.f91274a = true;
    }

    @Override // n3.c2
    public void b(android.view.View view) {
        if (this.f91274a) {
            return;
        }
        this.f91276c.f91280a.setVisibility(this.f91275b);
    }

    @Override // n3.d2, n3.c2
    public void c(android.view.View view) {
        this.f91276c.f91280a.setVisibility(0);
    }
}
