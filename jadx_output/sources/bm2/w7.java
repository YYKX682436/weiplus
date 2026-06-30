package bm2;

/* loaded from: classes3.dex */
public final class w7 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f22416d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f22417e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f22418f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.l f22419g;

    public w7(com.tencent.mm.ui.MMActivity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f22416d = activity;
        this.f22417e = new java.util.ArrayList();
        this.f22418f = jz5.h.b(new bm2.v7(this));
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return ((java.util.ArrayList) this.f22417e).size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        bm2.u7 holder = (bm2.u7) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.String word = (java.lang.String) ((java.util.ArrayList) this.f22417e).get(i17);
        kotlin.jvm.internal.o.g(word, "word");
        holder.f22355f = word;
        holder.f22354e.setText(word);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.ayz, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new bm2.u7(this, inflate);
    }
}
