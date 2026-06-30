package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class sd extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f90213d;

    public sd(java.util.List list) {
        this.f90213d = list;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        java.util.List list = this.f90213d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        com.tencent.mm.plugin.appbrand.ui.rd holder = (com.tencent.mm.plugin.appbrand.ui.rd) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.util.List list = this.f90213d;
        kotlin.jvm.internal.o.d(list);
        com.tencent.mm.plugin.appbrand.appstorage.l0 l0Var = (com.tencent.mm.plugin.appbrand.appstorage.l0) list.get(i17);
        if (l0Var == null) {
            return;
        }
        n11.a.b().g(l0Var.f76255b, holder.f89990d);
        holder.f89991e.setText(l0Var.f76256c);
        holder.f89992f.setText(l0Var.f76254a);
        android.widget.TextView textView = holder.f89993g;
        textView.setText(textView.getContext().getString(com.tencent.mm.R.string.awl, java.lang.Long.valueOf(l0Var.f76257d)));
        android.widget.TextView textView2 = holder.f89994h;
        textView2.setText(textView2.getContext().getString(com.tencent.mm.R.string.a5w, java.lang.Long.valueOf(l0Var.f76258e)));
        android.widget.TextView textView3 = holder.f89995i;
        textView3.setText(textView3.getContext().getString(com.tencent.mm.R.string.f490669wo, java.lang.Integer.valueOf(l0Var.f76259f)));
        android.widget.TextView textView4 = holder.f89996m;
        textView4.setText(textView4.getContext().getString(com.tencent.mm.R.string.awe, java.lang.Long.valueOf(l0Var.f76260g)));
        android.text.format.Time time = new android.text.format.Time();
        time.set(l0Var.f76261h * 1000);
        android.widget.TextView textView5 = holder.f89997n;
        textView5.setText(textView5.getContext().getString(com.tencent.mm.R.string.f490668vw, k35.s.a("yyyy.MM.dd", time).toString()));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.f488098dp, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new com.tencent.mm.plugin.appbrand.ui.rd(inflate);
    }
}
