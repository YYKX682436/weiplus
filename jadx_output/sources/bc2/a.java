package bc2;

/* loaded from: classes3.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bc2.b f19154d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.kj0 f19155e;

    public a(bc2.b bVar, bw5.kj0 kj0Var) {
        this.f19154d = bVar;
        this.f19155e = kj0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ecs/shopping/holder/EcsFinderShoppingNotifyHolder$updateShelfMessageEntranceInfoInfo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bc2.b bVar = this.f19154d;
        com.tencent.mars.xlog.Log.i(bVar.f19158c, "handle click author notify cell");
        pq.a aVar = new pq.a(bVar.f19157b);
        bw5.kj0 kj0Var = this.f19155e;
        if ((kj0Var != null ? kj0Var.f29402g[2] ? kj0Var.f29400e : new bw5.x7() : null) != null) {
            i95.m c17 = i95.n0.c(pq.q.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            pq.q qVar = (pq.q) c17;
            bw5.x7 x7Var = kj0Var.f29402g[2] ? kj0Var.f29400e : new bw5.x7();
            kotlin.jvm.internal.o.f(x7Var, "getJumpInfo(...)");
            pq.q.Lb(qVar, aVar, x7Var, null, 4, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ecs/shopping/holder/EcsFinderShoppingNotifyHolder$updateShelfMessageEntranceInfoInfo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
