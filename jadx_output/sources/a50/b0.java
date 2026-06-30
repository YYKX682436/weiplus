package a50;

/* loaded from: classes11.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a50.e0 f1456d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1457e;

    public b0(a50.e0 e0Var, int i17) {
        this.f1456d = e0Var;
        this.f1457e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.wechat.mm.finder_box.e eVar = this.f1456d.f1470a;
        if (eVar != null) {
            eVar.q(this.f1457e);
        }
    }
}
