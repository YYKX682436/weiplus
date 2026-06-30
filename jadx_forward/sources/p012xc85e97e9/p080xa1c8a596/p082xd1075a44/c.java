package p012xc85e97e9.p080xa1c8a596.p082xd1075a44;

/* loaded from: classes14.dex */
public class c extends o3.p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p080xa1c8a596.p082xd1075a44.d f92646b;

    public c(p012xc85e97e9.p080xa1c8a596.p082xd1075a44.d dVar) {
        this.f92646b = dVar;
    }

    @Override // o3.p
    public o3.l a(int i17) {
        return new o3.l(android.view.accessibility.AccessibilityNodeInfo.obtain(this.f92646b.m7254x1e1c2599(i17).f424175a));
    }

    @Override // o3.p
    public o3.l b(int i17) {
        p012xc85e97e9.p080xa1c8a596.p082xd1075a44.d dVar = this.f92646b;
        int i18 = i17 == 2 ? dVar.f2889x8b6506d5 : dVar.f2892x2891d0e8;
        if (i18 == Integer.MIN_VALUE) {
            return null;
        }
        return a(i18);
    }

    @Override // o3.p
    public boolean c(int i17, int i18, android.os.Bundle bundle) {
        return this.f92646b.m7262x8c1184f7(i17, i18, bundle);
    }
}
