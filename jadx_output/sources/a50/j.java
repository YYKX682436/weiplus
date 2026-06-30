package a50;

/* loaded from: classes11.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a50.a0 f1494d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1495e;

    public j(a50.a0 a0Var, int i17) {
        this.f1494d = a0Var;
        this.f1495e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.wechat.mm.finder_box.c cVar = this.f1494d.f1451a;
        if (cVar != null) {
            cVar.B(this.f1495e);
        }
    }
}
