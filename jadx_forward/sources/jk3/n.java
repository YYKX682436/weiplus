package jk3;

/* loaded from: classes8.dex */
public final class n implements jk3.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jk3.v f381629a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f381630b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f381631c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f381632d;

    public n(jk3.v vVar, boolean z17, int i17, android.graphics.Bitmap bitmap) {
        this.f381629a = vVar;
        this.f381630b = z17;
        this.f381631c = i17;
        this.f381632d = bitmap;
    }

    @Override // jk3.g
    public void a() {
        jk3.v vVar = this.f381629a;
        vVar.j();
        vVar.f381657q = vVar.f();
        boolean z17 = this.f381630b;
        android.graphics.Bitmap bitmap = this.f381632d;
        int i17 = this.f381631c;
        if (z17) {
            ((ku5.t0) ku5.t0.f394148d).b(new jk3.m(vVar, i17, bitmap), "MultiTasklLoopTag");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("auto hideUIC,id:");
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = vVar.f381610a;
            sb6.append(c16601x7ed0e40c != null ? c16601x7ed0e40c.f66791xc8a07680 : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageMultiTaskHelper", sb6.toString());
            i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.Bd((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) c17, 0, "MultiTaskForSnapshotMinusScreen", 1048576, null, 8, null);
        } else {
            vVar.l(vVar.F(i17) ? vVar.P(bitmap, vVar.f381657q) : null, i17 == 4);
        }
        ak3.c cVar = vVar.f381644d;
        if (cVar != null) {
            ((ak3.i) cVar).t(false);
        }
    }
}
