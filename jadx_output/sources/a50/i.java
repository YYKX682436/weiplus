package a50;

/* loaded from: classes11.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a50.a0 f1491d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1492e;

    public i(a50.a0 a0Var, int i17) {
        this.f1491d = a0Var;
        this.f1492e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.wechat.mm.finder_box.c cVar = this.f1491d.f1451a;
        if (cVar != null) {
            cVar.y(this.f1492e);
        }
    }
}
