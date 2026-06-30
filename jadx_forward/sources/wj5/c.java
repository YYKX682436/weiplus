package wj5;

/* loaded from: classes3.dex */
public abstract class c extends in5.r implements android.view.View.OnCreateContextMenuListener {
    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
        android.view.View view = new android.view.View(holder.f3639x46306858.getContext());
        android.view.View view2 = holder.f3639x46306858;
        android.view.ViewGroup viewGroup = view2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) view2 : null;
        if (viewGroup != null) {
            viewGroup.addView(view);
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = 0;
            layoutParams.height = 0;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/tipsbar/convert/BaseTipsBarConvert", "onCreateViewHolder", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/tipsbar/convert/BaseTipsBarConvert", "onCreateViewHolder", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void n(android.view.View longClickView, int i17, com.p314xaae8f345.mm.ui.p2738xb1dfbddb.d tipsBarContext, db5.t4 t4Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(longClickView, "longClickView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tipsBarContext, "tipsBarContext");
        longClickView.setOnLongClickListener(new wj5.b(i17, this, t4Var, tipsBarContext, longClickView));
    }

    public void o(in5.s0 holder, xj5.a item, int i17, int i18, boolean z17, java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(holder.f3639x46306858, "group_msg_set_top_bar");
        aVar.ik(holder.f3639x46306858, 40, 26356);
        aVar.gk(holder.f3639x46306858, item.b());
        super.h(holder, item, i17, i18, z17, list);
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        android.content.Context context;
        if (contextMenu != null) {
            contextMenu.add(0, 0, 0, (view == null || (context = view.getContext()) == null) ? null : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571889so));
        }
    }
}
