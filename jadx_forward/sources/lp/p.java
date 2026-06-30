package lp;

/* loaded from: classes11.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public int f401770d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f401771e;

    public p(lp.q qVar, int i17) {
        this.f401771e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f401770d;
        this.f401770d = i17 + 1;
        if (i17 >= this.f401771e) {
            throw new java.lang.StackOverflowError("Just for test !!");
        }
        run();
    }
}
