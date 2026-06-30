package a50;

/* loaded from: classes11.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a50.a0 f1463d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1464e;

    public d(a50.a0 a0Var, int i17) {
        this.f1463d = a0Var;
        this.f1464e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.wechat.mm.finder_box.c cVar = this.f1463d.f1451a;
        if (cVar != null) {
            cVar.u(this.f1464e);
        }
    }
}
