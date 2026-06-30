package of1;

/* loaded from: classes8.dex */
public class d2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f426437d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ of1.m2 f426438e;

    public d2(of1.m2 m2Var, android.os.Bundle bundle) {
        this.f426438e = m2Var;
        this.f426437d = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.w wVar;
        of1.m2 m2Var = this.f426438e;
        if (m2Var.f426508e == null || (wVar = m2Var.f426509f) == null || !wVar.c().f(42)) {
            return;
        }
        m2Var.f426508e.D(this.f426437d, "download_succ");
    }
}
