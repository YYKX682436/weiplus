package a50;

/* loaded from: classes9.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw5.f f1521d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a50.a0 f1522e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1523f;

    public p(cw5.f fVar, a50.a0 a0Var, int i17) {
        this.f1521d = fVar;
        this.f1522e = a0Var;
        this.f1523f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int b17 = a50.j0.f1496a.b();
        com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p("officialaccounts");
        if (!((p17 == null || !p17.d2(64) || p17.d2(16)) ? false : true)) {
            b17 = 0;
        }
        cw5.f fVar = this.f1521d;
        fVar.f224355f = b17;
        fVar.f224356g[3] = true;
        com.tencent.wechat.mm.finder_box.c cVar = this.f1522e.f1451a;
        if (cVar != null) {
            cVar.L1(this.f1523f, fVar);
        }
    }
}
