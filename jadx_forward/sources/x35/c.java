package x35;

/* loaded from: classes10.dex */
public final class c extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 implements x35.a {

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Rect f533183d;

    /* renamed from: e, reason: collision with root package name */
    public final int f533184e = i65.a.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 1.0f);

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect outRect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = parent.getLayoutManager();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        int i17 = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d) layoutManager).f93394w;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager.LayoutParams");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d.LayoutParams layoutParams2 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d.LayoutParams) layoutParams;
        if (layoutParams2.f93399i != i17) {
            int i18 = this.f533184e;
            outRect.top = i18;
            outRect.bottom = i18;
            int i19 = layoutParams2.f93398h;
            if (i19 == 0) {
                outRect.left = 0;
                outRect.right = i18;
            } else if (i19 == i17 - 1) {
                outRect.left = i18;
                outRect.right = 0;
            } else {
                outRect.left = i18;
                outRect.right = i18;
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: onDrawOver */
    public void mo7903x73cebf37(android.graphics.Canvas c17, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17, "c");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        super.mo7903x73cebf37(c17, parent, state);
        if (parent.mo7946xf939df19() != null && (parent.mo7946xf939df19() instanceof x35.b) && parent.getChildCount() > 0) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = parent.mo7946xf939df19();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo7946xf939df19, "null cannot be cast to non-null type com.tencent.mm.pluginsdk.ui.pin.PinnedHeaderAdapter<@[FlexibleNullability] androidx.recyclerview.widget.RecyclerView.ViewHolder?>");
            x35.b bVar = (x35.b) mo7946xf939df19;
            int u07 = parent.u0(parent.getChildAt(0));
            while (true) {
                if (-1 >= u07) {
                    u07 = -1;
                    break;
                } else if (((d45.q) bVar).mo863xcdaf1228(u07) == 2) {
                    break;
                } else {
                    u07--;
                }
            }
            if (u07 == -1) {
                this.f533183d = null;
                return;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc = bVar.mo865x9cc5cacc(parent, bVar.mo863xcdaf1228(u07));
            bVar.mo864xe5e2e48d(mo865x9cc5cacc, u07);
            android.view.View itemView = mo865x9cc5cacc.f3639x46306858;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
            if (itemView.isLayoutRequested()) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams layoutParams = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) itemView.getLayoutParams();
                if (layoutParams == null) {
                    throw new java.lang.NullPointerException("PinnedHeaderItemDecoration");
                }
                int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec((parent.getMeasuredWidth() - ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - ((android.view.ViewGroup.MarginLayoutParams) layoutParams).rightMargin, 1073741824);
                int i17 = ((android.view.ViewGroup.MarginLayoutParams) layoutParams).height;
                itemView.measure(makeMeasureSpec, i17 > 0 ? android.view.View.MeasureSpec.makeMeasureSpec(i17, 1073741824) : android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                itemView.layout(0, 0, itemView.getMeasuredWidth(), itemView.getMeasuredHeight());
            }
            int childCount = parent.getChildCount();
            int i18 = 0;
            for (int i19 = 0; i19 < childCount; i19++) {
                if (((d45.q) bVar).mo863xcdaf1228(parent.u0(parent.getChildAt(i19))) == 2) {
                    int top = parent.getChildAt(i19).getTop();
                    int height = itemView.getHeight();
                    if (1 <= top && top < height) {
                        i18 = top - height;
                    }
                }
            }
            int save = c17.save();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(itemView.getLayoutParams(), "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            c17.translate(((android.view.ViewGroup.MarginLayoutParams) ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) r2)).leftMargin, i18);
            c17.clipRect(0, 0, parent.getWidth(), itemView.getMeasuredHeight());
            itemView.draw(c17);
            c17.restoreToCount(save);
            if (this.f533183d == null) {
                this.f533183d = new android.graphics.Rect();
            }
            android.graphics.Rect rect = this.f533183d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(rect);
            rect.set(0, 0, parent.getWidth(), itemView.getMeasuredHeight() + i18);
        }
    }
}
