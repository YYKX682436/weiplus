package i53;

/* loaded from: classes8.dex */
public class j0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i53.m0 f370138d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f370139e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p33.l f370140f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i53.k0 f370141g;

    public j0(i53.k0 k0Var, i53.m0 m0Var, int i17, p33.l lVar) {
        this.f370141g = k0Var;
        this.f370138d = m0Var;
        this.f370139e = i17;
        this.f370140f = lVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/media/GameHaowanRecycleView$GameHaowanAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i53.k0 k0Var = this.f370141g;
        vl1.p pVar = k0Var.f370161m;
        i53.m0 m0Var = this.f370138d;
        android.view.View view2 = m0Var.f3639x46306858;
        long m8184x1ed62e84 = m0Var.m8184x1ed62e84();
        int i17 = this.f370139e;
        pVar.a(view2, i17, m8184x1ed62e84);
        int x17 = k0Var.x(i17);
        p33.l lVar = this.f370140f;
        k0Var.y(x17, 2, lVar.f433147s, lVar.f433152x);
        yj0.a.h(this, "com/tencent/mm/plugin/game/media/GameHaowanRecycleView$GameHaowanAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
