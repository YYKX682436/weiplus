package a50;

/* loaded from: classes11.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a50.a0 f1488d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1489e;

    public h(a50.a0 a0Var, int i17) {
        this.f1488d = a0Var;
        this.f1489e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.wechat.mm.finder_box.c cVar = this.f1488d.f1451a;
        if (cVar != null) {
            cVar.o(this.f1489e);
        }
    }
}
