package a50;

/* loaded from: classes11.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a50.a0 f1552d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1553e;

    public w(a50.a0 a0Var, int i17) {
        this.f1552d = a0Var;
        this.f1553e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.wechat.mm.finder_box.c cVar = this.f1552d.f1451a;
        if (cVar != null) {
            cVar.n(this.f1553e);
        }
    }
}
