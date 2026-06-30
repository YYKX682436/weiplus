package kc2;

/* loaded from: classes15.dex */
public final class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kc2.g1 f388052d;

    public x0(kc2.g1 g1Var) {
        this.f388052d = g1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int e17 = c01.id.e();
        kc2.a2.a(this.f388052d.m(), e17, false, 2, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderKaraInfoManager", "openWx(" + java.lang.Thread.currentThread().getName() + ") curTime=" + e17);
    }
}
