package a50;

/* loaded from: classes11.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a50.e0 f1465d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1466e;

    public d0(a50.e0 e0Var, int i17) {
        this.f1465d = e0Var;
        this.f1466e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.wechat.mm.finder_box.e eVar = this.f1465d.f1470a;
        if (eVar != null) {
            eVar.h(this.f1466e);
        }
    }
}
