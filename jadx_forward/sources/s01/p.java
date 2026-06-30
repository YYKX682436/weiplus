package s01;

/* loaded from: classes11.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f483447d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f483448e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f483449f;

    public p(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f483447d = str;
        this.f483448e = str2;
        this.f483449f = str3;
    }

    @Override // java.lang.Runnable
    public void run() {
        s01.h D0 = r01.q3.Ui().D0(this.f483447d);
        if (D0 == null) {
            return;
        }
        if (D0.f69174xf62a869b < com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(this.f483448e, Integer.MAX_VALUE)) {
            D0.f69177x18bd0ff = true;
            r01.q3.Ui().P0(D0);
        }
        boolean y07 = D0.y0();
        java.lang.String str = this.f483449f;
        if (y07) {
            r01.q3.Ni().f(D0.f69169xf75e5c37, str, 5000);
        } else {
            r01.q3.Ni().g(D0.f69169xf75e5c37, str, 5000);
        }
    }
}
