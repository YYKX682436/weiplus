package bm2;

/* loaded from: classes9.dex */
public final class c extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f21803d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public yz5.l f21804e;

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f21803d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        java.lang.String string;
        java.lang.String string2;
        bm2.a holder = (bm2.a) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.Object obj = this.f21803d.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        cm2.k kVar = (cm2.k) obj;
        holder.f21746g = kVar;
        r45.b73 b73Var = (r45.b73) kVar.f43358d.getCustom(1);
        r45.c73 c73Var = kVar.f43358d;
        if (b73Var == null || (string = b73Var.getString(12)) == null) {
            r45.b73 b73Var2 = (r45.b73) c73Var.getCustom(1);
            string = b73Var2 != null ? b73Var2.getString(1) : null;
            if (string == null) {
                string = "";
            }
        }
        holder.f21743d.setText(string);
        r45.b73 b73Var3 = (r45.b73) c73Var.getCustom(1);
        holder.f21744e.setVisibility(b73Var3 != null && b73Var3.getInteger(10) == 1 ? 0 : 8);
        r45.b73 b73Var4 = (r45.b73) c73Var.getCustom(1);
        java.lang.String str = (b73Var4 == null || (string2 = b73Var4.getString(2)) == null) ? "" : string2;
        i95.m c17 = i95.n0.c(vd2.i5.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        vd2.i5.l8((vd2.i5) c17, str, holder.f21745f, null, 4, null);
        holder.itemView.setOnClickListener(new bm2.b(this, kVar));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = com.tencent.mm.ui.id.b(parent.getContext()).inflate(com.tencent.mm.R.layout.aju, parent, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new bm2.a(inflate);
    }
}
