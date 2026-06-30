package a50;

/* loaded from: classes11.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a50.a0 f1539d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1540e;

    public u(a50.a0 a0Var, int i17) {
        this.f1539d = a0Var;
        this.f1540e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.wechat.mm.finder_box.c cVar = this.f1539d.f1451a;
        if (cVar != null) {
            cVar.g(this.f1540e);
        }
    }
}
