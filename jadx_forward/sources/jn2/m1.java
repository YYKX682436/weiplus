package jn2;

/* loaded from: classes8.dex */
public final class m1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jn2.z1 f382182d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f382183e;

    public m1(jn2.z1 z1Var, int i17) {
        this.f382182d = z1Var;
        this.f382183e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f382182d.y(this.f382183e);
    }
}
