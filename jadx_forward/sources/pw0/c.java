package pw0;

/* loaded from: classes5.dex */
public final class c extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f440162d;

    public c(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setColor(j65.q.a(context).getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.ac9, null));
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.f440162d = paint;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect outRect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: onDraw */
    public void mo8166xc398a7c3(android.graphics.Canvas c17, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17, "c");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        super.mo8166xc398a7c3(c17, parent, state);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = parent.mo7946xf939df19();
        pw0.i iVar = mo7946xf939df19 instanceof pw0.i ? (pw0.i) mo7946xf939df19 : null;
        if (iVar == null) {
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = parent.getLayoutManager();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        int w17 = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager).w();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager2 = parent.getLayoutManager();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        int y17 = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager2).y();
        if (parent.getChildCount() == 0 || w17 > y17) {
            return;
        }
        while (true) {
            vv0.n nVar = (vv0.n) kz5.n0.a0(iVar.f357503d, w17);
            boolean z17 = false;
            if (nVar != null && !nVar.f521935e) {
                z17 = true;
            }
            if (!z17) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07 = parent.p0(w17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(p07, "null cannot be cast to non-null type com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.adapter.SegmentAdapter.Holder");
                android.view.View itemView = ((pw0.h) p07).f3639x46306858;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
                float bottom = itemView.getBottom();
                float left = (itemView.getLeft() + itemView.getRight()) / 2.0f;
                float f17 = 2;
                c17.drawOval(new android.graphics.RectF(left - ((int) (j65.q.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).getDisplayMetrics().density * f17)), ((int) (j65.q.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).getDisplayMetrics().density * 4)) + bottom, left + ((int) (j65.q.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).getDisplayMetrics().density * f17)), bottom + ((int) (j65.q.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).getDisplayMetrics().density * 8))), this.f440162d);
            }
            if (w17 == y17) {
                return;
            } else {
                w17++;
            }
        }
    }
}
