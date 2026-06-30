package ww1;

/* loaded from: classes5.dex */
public final class f extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f531710d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f531711e;

    /* renamed from: f, reason: collision with root package name */
    public ww1.a f531712f;

    /* renamed from: g, reason: collision with root package name */
    public ww1.b f531713g;

    public f(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f531710d = context;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        java.util.List list = this.f531711e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list);
        return list.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        return 0;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        ww1.c viewHolder = (ww1.c) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolder, "viewHolder");
        java.util.List list = this.f531711e;
        if (list == null || i17 < 0 || i17 >= list.size()) {
            return;
        }
        java.util.List list2 = this.f531711e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list2);
        y63.a aVar = (y63.a) list2.get(i17);
        android.content.Context context = this.f531710d;
        int b17 = i65.a.b(context, 12);
        int b18 = i65.a.b(context, 64);
        android.view.View view = viewHolder.f531688d;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams layoutParams2 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) layoutParams;
        java.util.List list3 = this.f531711e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list3);
        if (i17 == list3.size() - 1) {
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = b18;
        } else {
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = b17;
        }
        view.setLayoutParams(layoutParams2);
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573671fc5, " ");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        y63.b bVar = (y63.b) aVar.N.get(1);
        java.lang.Long valueOf = bVar != null ? java.lang.Long.valueOf(bVar.f541188d * 1000) : null;
        java.lang.String r17 = valueOf != null ? com.p314xaae8f345.mm.p2802xd031a825.ui.r1.r(string, valueOf.longValue()) : null;
        android.view.View view2 = viewHolder.f531688d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/collect/model/AAGroupSolitatireEntranceInfoAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/collect/model/AAGroupSolitatireEntranceInfoAdapter$NormalViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/collect/model/AAGroupSolitatireEntranceInfoAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/collect/model/AAGroupSolitatireEntranceInfoAdapter$NormalViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setOnClickListener(new ww1.d(this, aVar));
        viewHolder.f531689e.setText(aVar.H);
        viewHolder.f531690f.setText(r17);
        viewHolder.f531691g.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573917ga4, java.lang.Integer.valueOf(h61.o.h(aVar).size())));
        java.lang.String obj = viewHolder.f531692h.getText().toString();
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.w0(viewHolder.f531692h, obj, 0, obj.length(), new com.p314xaae8f345.mm.p2802xd031a825.ui.a0((com.p314xaae8f345.mm.p2802xd031a825.ui.z) new ww1.e(this, aVar), true), this.f531710d);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewGroup, "viewGroup");
        android.view.View inflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569397a1, viewGroup, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new ww1.c(inflate);
    }
}
