package cp4;

/* loaded from: classes8.dex */
public final class x extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f302622d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f302623e;

    /* renamed from: f, reason: collision with root package name */
    public final cp4.u f302624f;

    public x(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f302622d = context;
        this.f302623e = new java.util.ArrayList();
        this.f302624f = new cp4.u(this);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f302623e.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 viewHolder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolder, "viewHolder");
        android.view.View itemView = viewHolder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        java.util.ArrayList arrayList = this.f302623e;
        java.lang.Object obj = arrayList.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        r45.is isVar = (r45.is) obj;
        if (!isVar.f458833g) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = isVar.f458830d;
            if (!android.text.TextUtils.isEmpty(gVar == null ? "" : gVar.h(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c))) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(itemView, arrayList2.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorEditCaptionView$EditorCaptionAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                itemView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(itemView, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorEditCaptionView$EditorCaptionAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) itemView.findViewById(com.p314xaae8f345.mm.R.id.f565077b62);
                c22621x7603e017.setOnFocusChangeListener(new cp4.v(this, i17, c22621x7603e017));
                com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = ((r45.is) arrayList.get(i17)).f458830d;
                c22621x7603e017.setText(gVar2 != null ? gVar2.h(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c) : "");
                return;
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList3.add(4);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(itemView, arrayList3.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorEditCaptionView$EditorCaptionAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        itemView.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(itemView, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorEditCaptionView$EditorCaptionAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(this.f302622d).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a5_, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        return new cp4.w((android.view.ViewGroup) inflate);
    }
}
