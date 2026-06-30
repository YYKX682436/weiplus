package a50;

/* loaded from: classes11.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a50.a0 f1478d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1479e;

    public f(a50.a0 a0Var, int i17) {
        this.f1478d = a0Var;
        this.f1479e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.wechat.mm.finder_box.c cVar = this.f1478d.f1451a;
        if (cVar != null) {
            cVar.s(this.f1479e);
        }
    }
}
