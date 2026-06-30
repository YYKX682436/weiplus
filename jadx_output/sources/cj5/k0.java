package cj5;

/* loaded from: classes.dex */
public final class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.m0 f42158d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f42159e;

    public k0(cj5.m0 m0Var, java.util.List list) {
        this.f42158d = m0Var;
        this.f42159e = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j75.f Q6 = this.f42158d.Q6();
        if (Q6 != null) {
            Q6.B3(new wi5.m0(this.f42159e, -1));
        }
    }
}
