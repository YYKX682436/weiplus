package b50;

/* loaded from: classes11.dex */
public final class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f99495d;

    public m0(long j17) {
        this.f99495d = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p2621x8fb0427b.s1 L0 = r01.q3.nj().L0(this.f99495d);
        if (L0 == null) {
            return;
        }
        L0.f67285xf918da09 = true;
        r01.q3.nj().o1(L0, false);
    }
}
