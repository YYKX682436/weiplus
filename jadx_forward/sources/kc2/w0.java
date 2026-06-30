package kc2;

/* loaded from: classes15.dex */
public final class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kc2.g1 f388045d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f388046e;

    public w0(kc2.g1 g1Var, int i17) {
        this.f388045d = g1Var;
        this.f388046e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        java.lang.Object obj;
        int e17 = c01.id.e();
        kc2.c d17 = this.f388045d.d();
        kc2.k.f387960e.getClass();
        java.util.Iterator it = ((kz5.h) kc2.k.f387977y).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            i17 = this.f388046e;
            if (!hasNext) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((kc2.k) obj).f387978d == i17 + 1) {
                    break;
                }
            }
        }
        kc2.k kVar = (kc2.k) obj;
        if (kVar == null) {
            kVar = kc2.k.f387961f;
        }
        d17.a(new kc2.a(kVar, e17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderKaraInfoManager", "onPageSelected(" + java.lang.Thread.currentThread().getName() + ") selectTime=" + e17 + " position=" + i17);
    }
}
