package a50;

/* loaded from: classes11.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a50.a0 f1499d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1500e;

    public k(a50.a0 a0Var, int i17) {
        this.f1499d = a0Var;
        this.f1500e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.wechat.mm.finder_box.c cVar = this.f1499d.f1451a;
        if (cVar != null) {
            cVar.D(this.f1500e);
        }
    }
}
