package bx3;

/* loaded from: classes5.dex */
public final class c extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f36320d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f36321e;

    public c(java.util.List datas, android.content.Context context) {
        kotlin.jvm.internal.o.g(datas, "datas");
        kotlin.jvm.internal.o.g(context, "context");
        this.f36320d = datas;
        this.f36321e = context;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f36320d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        bx3.b holder = (bx3.b) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.CharSequence charSequence = (java.lang.CharSequence) this.f36320d.get(i17);
        android.widget.TextView textView = holder.f36319d;
        textView.setText(charSequence);
        int i18 = i17 % 2;
        android.content.Context context = this.f36321e;
        if (i18 == 0) {
            textView.setBackgroundColor(context.getResources().getColor(com.tencent.mm.R.color.aar));
        } else {
            textView.setBackgroundColor(context.getResources().getColor(com.tencent.mm.R.color.aaw));
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(this.f36321e).inflate(com.tencent.mm.R.layout.cfi, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new bx3.b(this, inflate);
    }
}
