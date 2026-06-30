package a50;

/* loaded from: classes11.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a50.a0 f1542d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1543e;

    public v(a50.a0 a0Var, int i17) {
        this.f1542d = a0Var;
        this.f1543e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.wechat.mm.finder_box.c cVar = this.f1542d.f1451a;
        if (cVar != null) {
            cVar.j(this.f1543e);
        }
    }
}
