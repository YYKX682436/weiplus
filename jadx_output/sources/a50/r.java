package a50;

/* loaded from: classes9.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a50.a0 f1528d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1529e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.mm.finder_box.d1 f1530f;

    public r(a50.a0 a0Var, int i17, com.tencent.wechat.mm.finder_box.d1 d1Var) {
        this.f1528d = a0Var;
        this.f1529e = i17;
        this.f1530f = d1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.wechat.mm.finder_box.c cVar = this.f1528d.f1451a;
        if (cVar != null) {
            cVar.G1(this.f1529e, this.f1530f);
        }
    }
}
