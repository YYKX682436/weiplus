package e04;

/* loaded from: classes9.dex */
public class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f327605d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5834xa4df3853 f327606e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e04.p f327607f;

    public q0(e04.p pVar, android.content.Context context, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5834xa4df3853 c5834xa4df3853) {
        this.f327607f = pVar;
        this.f327605d = context;
        this.f327606e = c5834xa4df3853;
    }

    @Override // java.lang.Runnable
    public void run() {
        am.co coVar;
        if (this.f327605d == null || (coVar = this.f327606e.f136142h) == null) {
            return;
        }
        int i17 = coVar.f87900a;
        e04.p pVar = this.f327607f;
        if (i17 == 1) {
            pVar.D(true);
        } else if (i17 == 2) {
            pVar.D(false);
        }
    }
}
