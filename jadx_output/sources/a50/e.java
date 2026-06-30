package a50;

/* loaded from: classes11.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a50.a0 f1468d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1469e;

    public e(a50.a0 a0Var, int i17) {
        this.f1468d = a0Var;
        this.f1469e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.wechat.mm.finder_box.c cVar = this.f1468d.f1451a;
        if (cVar != null) {
            cVar.z(this.f1469e);
        }
    }
}
