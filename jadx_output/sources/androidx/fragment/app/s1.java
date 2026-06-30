package androidx.fragment.app;

/* loaded from: classes14.dex */
public class s1 implements androidx.fragment.app.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f11471a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.fragment.app.a f11472b;

    /* renamed from: c, reason: collision with root package name */
    public int f11473c;

    public s1(androidx.fragment.app.a aVar, boolean z17) {
        this.f11471a = z17;
        this.f11472b = aVar;
    }

    public void a() {
        boolean z17 = this.f11473c > 0;
        androidx.fragment.app.a aVar = this.f11472b;
        for (androidx.fragment.app.Fragment fragment : aVar.f11249r.getFragments()) {
            fragment.setOnStartEnterTransitionListener(null);
            if (z17 && fragment.isPostponed()) {
                fragment.startPostponedEnterTransition();
            }
        }
        aVar.f11249r.completeExecute(aVar, this.f11471a, !z17, true);
    }
}
