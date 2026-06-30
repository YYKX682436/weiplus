package db5;

/* loaded from: classes11.dex */
public class u6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.StringBuilder f310059d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ db5.x6 f310060e;

    public u6(db5.x6 x6Var, java.lang.StringBuilder sb6) {
        this.f310060e = x6Var;
        this.f310059d = sb6;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f310060e.f310106f.C.d(this.f310059d.toString());
    }
}
