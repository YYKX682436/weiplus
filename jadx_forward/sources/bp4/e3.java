package bp4;

/* loaded from: classes8.dex */
public final class e3 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f104688d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public int f104689e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.l f104690f;

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f104688d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        bp4.d3 holder = (bp4.d3) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        vo0.a aVar = vo0.e.f520001b;
        java.util.ArrayList arrayList = this.f104688d;
        ((so4.b) arrayList.get(i17)).getClass();
        ((wo0.b) aVar.g(null)).c(holder.f104677e);
        ((so4.b) arrayList.get(i17)).getClass();
        holder.f104676d.setText((java.lang.CharSequence) null);
        if (this.f104689e == i17) {
            android.view.View view = holder.f104678f;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/TemplateModeContainer$TemplateListAdapter$TemplateListViewHolder", "setSelected", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/vlog/ui/plugin/TemplateModeContainer$TemplateListAdapter$TemplateListViewHolder", "setSelected", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view2 = holder.f104678f;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(4);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/TemplateModeContainer$TemplateListAdapter$TemplateListViewHolder", "setSelected", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/vlog/ui/plugin/TemplateModeContainer$TemplateListAdapter$TemplateListViewHolder", "setSelected", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        holder.f3639x46306858.setTag(java.lang.Integer.valueOf(i17));
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
            this.f104689e = intValue;
            m8146xced61ae5();
            yz5.l lVar = this.f104690f;
            if (lVar != null) {
                lVar.mo146xb9724478(java.lang.Integer.valueOf(intValue));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/plugin/TemplateModeContainer$TemplateListAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup view, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        android.view.View inflate = android.view.LayoutInflater.from(view.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cyd, view, false);
        inflate.setOnClickListener(this);
        return new bp4.d3(inflate);
    }
}
