package l75;

/* loaded from: classes12.dex */
public class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f398497d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f398498e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l75.v0 f398499f;

    public t0(l75.v0 v0Var, java.lang.Object obj, java.lang.Object obj2) {
        this.f398499f = v0Var;
        this.f398497d = obj;
        this.f398498e = obj2;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f398499f.h(this.f398497d, this.f398498e);
    }
}
