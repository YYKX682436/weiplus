package iu1;

/* loaded from: classes9.dex */
public final class q extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f376469d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f376470e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13064xaf775f76 f376471f;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13064xaf775f76 activityC13064xaf775f76) {
        this.f376471f = activityC13064xaf775f76;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f376469d = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.f376470e = paint2;
        paint.setColor(activityC13064xaf775f76.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a4m));
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setFlags(1);
        paint2.setColor(activityC13064xaf775f76.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        paint2.setStyle(android.graphics.Paint.Style.FILL);
        paint2.setFlags(1);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect outRect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        super.mo7902x5db88677(outRect, view, parent, state);
        int u07 = parent.u0(view);
        iu1.c cVar = this.f376471f.f176717m;
        if (cVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mHomePageAdapter");
            throw null;
        }
        if (u07 != cVar.mo1894x7e414b06() - 1) {
            outRect.bottom = 1;
        } else {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13064xaf775f76.N;
            outRect.bottom = com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13064xaf775f76.N;
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: onDraw */
    public void mo8166xc398a7c3(android.graphics.Canvas c17, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17, "c");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        super.mo8166xc398a7c3(c17, parent, state);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f c12808x5de4409f = this.f376471f.f176716i;
        if (c12808x5de4409f == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRecyclerView");
            throw null;
        }
        int paddingLeft = c12808x5de4409f.getPaddingLeft();
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13064xaf775f76.N;
        int i18 = paddingLeft + com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13064xaf775f76.P;
        int width = c12808x5de4409f.getWidth() - c12808x5de4409f.getPaddingRight();
        int childCount = c12808x5de4409f.getChildCount();
        int i19 = 0;
        while (true) {
            int i27 = 1;
            int i28 = childCount - 1;
            if (i19 >= i28) {
                return;
            }
            android.view.View childAt = c12808x5de4409f.getChildAt(i19);
            android.view.ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            int bottom = childAt.getBottom() + ((android.view.ViewGroup.MarginLayoutParams) ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) layoutParams)).bottomMargin;
            if (i19 == i28) {
                int i29 = com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13064xaf775f76.N;
                i27 = com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13064xaf775f76.N;
            }
            int i37 = bottom + i27;
            c17.drawRect(i18, bottom, width, i37, this.f376469d);
            c17.drawRect(0, bottom, i18, i37, this.f376470e);
            i19++;
        }
    }
}
