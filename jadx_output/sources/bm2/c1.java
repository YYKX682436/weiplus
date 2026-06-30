package bm2;

/* loaded from: classes10.dex */
public final class c1 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f21807d;

    public c1(gk2.e liveData) {
        kotlin.jvm.internal.o.g(liveData, "liveData");
        this.f21807d = new java.util.ArrayList();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f21807d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        if (i17 != 0) {
            return i17 != 1 ? -1 : 1;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        bm2.b1 holder = (bm2.b1) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        android.view.ViewGroup.LayoutParams layoutParams = new android.view.ViewGroup.LayoutParams(-1, -1);
        com.tencent.mm.plugin.finder.live.view.k2 k2Var = holder.f21784d;
        k2Var.setLayoutParams(layoutParams);
        k2Var.e();
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        java.util.ArrayList arrayList = this.f21807d;
        if (i17 == 0) {
            java.lang.Object obj = arrayList.get(0);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            return new bm2.b1((com.tencent.mm.plugin.finder.live.view.k2) obj);
        }
        java.lang.Object obj2 = arrayList.get(1);
        kotlin.jvm.internal.o.f(obj2, "get(...)");
        return new bm2.b1((com.tencent.mm.plugin.finder.live.view.k2) obj2);
    }
}
