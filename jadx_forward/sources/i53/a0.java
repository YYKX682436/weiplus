package i53;

/* loaded from: classes8.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f370026d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i53.d0 f370027e;

    public a0(i53.d0 d0Var, java.lang.String str) {
        this.f370027e = d0Var;
        this.f370026d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f370027e.Bi(this.f370026d, -2);
    }
}
