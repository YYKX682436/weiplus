package t81;

/* loaded from: classes4.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t81.s f497900d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f497901e;

    public m(t81.s sVar, java.lang.String str) {
        this.f497900d = sVar;
        this.f497901e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f497900d.d(this.f497901e);
    }
}
