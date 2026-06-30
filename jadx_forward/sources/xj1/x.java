package xj1;

/* loaded from: classes7.dex */
public final class x extends android.widget.ArrayAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f536354d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2768x6318a73c.C22722xd3be5395 f536355e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f536356f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f536357g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(android.content.Context context, java.util.ArrayList dataList) {
        super(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569551ej, dataList);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataList, "dataList");
        this.f536354d = dataList;
        jz5.i iVar = jz5.i.f384363e;
        this.f536356f = jz5.h.a(iVar, xj1.u.f536350d);
        this.f536357g = jz5.h.a(iVar, xj1.v.f536351d);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public long getItemId(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 c11714x918fd2e4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4) getItem(i17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c11714x918fd2e4);
        sb6.append(c11714x918fd2e4.f157894d);
        sb6.append(c11714x918fd2e4.f157896f);
        return sb6.toString().hashCode();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup parent) {
        xj1.a0 a0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        if (view == null || view.getTag() == null) {
            android.view.LayoutInflater from = android.view.LayoutInflater.from(getContext());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(from, "from(...)");
            android.view.View inflate = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569551ej, parent, false);
            android.view.View inflate2 = ((android.view.ViewStub) inflate.findViewById(com.p314xaae8f345.mm.R.id.chv)).inflate();
            if (inflate2 != null) {
                inflate2.setBackground(null);
            }
            a0Var = new xj1.a0(inflate);
        } else {
            java.lang.Object tag = view.getTag();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.ui.collection.CollectionSortViewHolder");
            a0Var = (xj1.a0) tag;
        }
        java.lang.Object item = getItem(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(item);
        a0Var.i((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4) item);
        a0Var.f3639x46306858.setClickable(false);
        java.lang.String str = (java.lang.String) this.f536356f.mo141623x754a37bb();
        android.view.View view2 = a0Var.f536310o;
        view2.setContentDescription(str);
        int i18 = i17 == getCount() + (-1) ? 8 : 0;
        android.view.View view3 = a0Var.f536311p;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/collection/CollectionSortViewHolder", "setBottomLineVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/appbrand/ui/collection/CollectionSortViewHolder", "setBottomLineVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setOnClickListener(new xj1.w(this, i17));
        android.view.View itemView = a0Var.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        return itemView;
    }
}
