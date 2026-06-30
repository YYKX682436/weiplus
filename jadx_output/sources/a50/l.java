package a50;

/* loaded from: classes9.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a50.a0 f1502d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1503e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f1504f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f1505g;

    public l(a50.a0 a0Var, int i17, boolean z17, boolean z18) {
        this.f1502d = a0Var;
        this.f1503e = i17;
        this.f1504f = z17;
        this.f1505g = z18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.wechat.mm.finder_box.c cVar = this.f1502d.f1451a;
        if (cVar != null) {
            cVar.w0(this.f1503e, a50.o.a(this.f1504f, this.f1505g));
        }
    }
}
