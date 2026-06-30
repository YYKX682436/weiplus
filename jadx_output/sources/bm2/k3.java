package bm2;

/* loaded from: classes3.dex */
public final class k3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.j3 f22031d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f22032e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bm2.m3 f22033f;

    public k3(bm2.j3 j3Var, int i17, bm2.m3 m3Var) {
        this.f22031d = j3Var;
        this.f22032e = i17;
        this.f22033f = m3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveFastCommentInputAdapter$bindInputFastComment$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bm2.m3 m3Var = this.f22033f;
        bm2.h3 fastCommentScene = m3Var.f22096e;
        bm2.j3 j3Var = this.f22031d;
        j3Var.getClass();
        kotlin.jvm.internal.o.g(fastCommentScene, "fastCommentScene");
        int ordinal = fastCommentScene.ordinal();
        int i17 = this.f22032e;
        if (ordinal == 0) {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).ak(2, 10, j3Var.b());
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ((ml2.r0) c17).ak(2, j3Var.f22006b == 0 ? 7 : 8, null);
            i95.m c18 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            zy2.zb.T8((zy2.zb) c18, ml2.t1.E, j3Var.a(i17), null, null, null, null, false, 124, null);
        } else if (ordinal == 1) {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).Ak(2, j3Var.c());
        }
        yz5.l lVar = m3Var.f22098g;
        if (lVar != null) {
            lVar.invoke(java.lang.Integer.valueOf(i17));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveFastCommentInputAdapter$bindInputFastComment$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
