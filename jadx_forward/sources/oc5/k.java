package oc5;

/* loaded from: classes3.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oc5.m f425975d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f425976e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f425977f;

    public k(oc5.m mVar, int i17, java.lang.Runnable runnable) {
        this.f425975d = mVar;
        this.f425976e = i17;
        this.f425977f = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oc5.m mVar = this.f425975d;
        mVar.getClass();
        int i17 = this.f425976e;
        mVar.c(i17, new oc5.l(mVar, i17));
        this.f425977f.run();
    }
}
