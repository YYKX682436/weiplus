package bc2;

/* loaded from: classes3.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bc2.b f100687d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.kj0 f100688e;

    public a(bc2.b bVar, bw5.kj0 kj0Var) {
        this.f100687d = bVar;
        this.f100688e = kj0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ecs/shopping/holder/EcsFinderShoppingNotifyHolder$updateShelfMessageEntranceInfoInfo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bc2.b bVar = this.f100687d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(bVar.f100691c, "handle click author notify cell");
        pq.a aVar = new pq.a(bVar.f100690b);
        bw5.kj0 kj0Var = this.f100688e;
        if ((kj0Var != null ? kj0Var.f110935g[2] ? kj0Var.f110933e : new bw5.x7() : null) != null) {
            i95.m c17 = i95.n0.c(pq.q.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            pq.q qVar = (pq.q) c17;
            bw5.x7 x7Var = kj0Var.f110935g[2] ? kj0Var.f110933e : new bw5.x7();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(x7Var, "getJumpInfo(...)");
            pq.q.Lb(qVar, aVar, x7Var, null, 4, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ecs/shopping/holder/EcsFinderShoppingNotifyHolder$updateShelfMessageEntranceInfoInfo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
