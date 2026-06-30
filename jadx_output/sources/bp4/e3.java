package bp4;

/* loaded from: classes8.dex */
public final class e3 extends androidx.recyclerview.widget.f2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f23155d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public int f23156e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.l f23157f;

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f23155d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        bp4.d3 holder = (bp4.d3) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        vo0.a aVar = vo0.e.f438468b;
        java.util.ArrayList arrayList = this.f23155d;
        ((so4.b) arrayList.get(i17)).getClass();
        ((wo0.b) aVar.g(null)).c(holder.f23144e);
        ((so4.b) arrayList.get(i17)).getClass();
        holder.f23143d.setText((java.lang.CharSequence) null);
        if (this.f23156e == i17) {
            android.view.View view = holder.f23145f;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/TemplateModeContainer$TemplateListAdapter$TemplateListViewHolder", "setSelected", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/vlog/ui/plugin/TemplateModeContainer$TemplateListAdapter$TemplateListViewHolder", "setSelected", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view2 = holder.f23145f;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(4);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/TemplateModeContainer$TemplateListAdapter$TemplateListViewHolder", "setSelected", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/vlog/ui/plugin/TemplateModeContainer$TemplateListAdapter$TemplateListViewHolder", "setSelected", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        holder.itemView.setTag(java.lang.Integer.valueOf(i17));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/vlog/ui/plugin/TemplateModeContainer$TemplateListAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer num = (java.lang.Integer) (view != null ? view.getTag() : null);
        int intValue = num != null ? num.intValue() : -1;
        if (intValue >= 0) {
            this.f23156e = intValue;
            notifyDataSetChanged();
            yz5.l lVar = this.f23157f;
            if (lVar != null) {
                lVar.invoke(java.lang.Integer.valueOf(intValue));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/plugin/TemplateModeContainer$TemplateListAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup view, int i17) {
        kotlin.jvm.internal.o.g(view, "view");
        android.view.View inflate = android.view.LayoutInflater.from(view.getContext()).inflate(com.tencent.mm.R.layout.cyd, view, false);
        inflate.setOnClickListener(this);
        return new bp4.d3(inflate);
    }
}
