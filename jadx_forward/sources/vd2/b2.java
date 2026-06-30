package vd2;

/* loaded from: classes3.dex */
public final class b2 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final km2.n f517194d;

    /* renamed from: e, reason: collision with root package name */
    public final vd2.t1 f517195e;

    /* renamed from: f, reason: collision with root package name */
    public final int f517196f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f517197g;

    public b2(android.content.Context context, km2.n liveDataModel, vd2.t1 presenter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveDataModel, "liveDataModel");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(presenter, "presenter");
        this.f517194d = liveDataModel;
        this.f517195e = presenter;
        this.f517196f = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.aog);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570365e80, (android.view.ViewGroup) null, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.f517197g = inflate;
    }

    public final int d() {
        vd2.a2 a2Var = ((vd2.v2) this.f517195e).f517477f;
        if (!(a2Var != null && a2Var.d())) {
            return -1;
        }
        java.util.ArrayList arrayList = this.f517194d.f390686e;
        java.util.ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (listIterator.hasPrevious()) {
            km2.m mVar = ((km2.t) listIterator.previous()).f390755d;
            if (mVar != null && mVar.f390669n) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect outRect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        int u07 = parent.u0(view);
        if (u07 == -1) {
            return;
        }
        int d17 = d();
        outRect.left = 0;
        outRect.right = 0;
        outRect.top = 0;
        if (d17 >= 0 && u07 == d17) {
            outRect.bottom = this.f517196f;
        } else {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14329x76e637f1.E;
            outRect.bottom = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14329x76e637f1.E;
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: onDrawOver */
    public void mo7903x73cebf37(android.graphics.Canvas c17, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        android.widget.TextView textView;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1516x633fb29.AbstractC14248xc3d8f89d abstractC14248xc3d8f89d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17, "c");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        int d17 = d();
        if (d17 < 0 || parent.getChildCount() == 0) {
            return;
        }
        int childCount = parent.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            if (parent.u0(parent.getChildAt(i17)) == d17) {
                vd2.a2 a2Var = ((vd2.v2) this.f517195e).f517477f;
                java.lang.String b17 = (a2Var == null || (abstractC14248xc3d8f89d = a2Var.f517181f) == null) ? null : abstractC14248xc3d8f89d.b();
                android.view.View view = this.f517197g;
                if (b17 != null && (textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.gc8)) != null) {
                    textView.setText(b17);
                }
                int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(parent.getWidth(), 1073741824);
                int i18 = this.f517196f;
                view.measure(makeMeasureSpec, android.view.View.MeasureSpec.makeMeasureSpec(i18, 1073741824));
                view.layout(0, 0, parent.getWidth(), i18);
                c17.save();
                c17.translate(0.0f, r3.getBottom());
                view.draw(c17);
                c17.restore();
                return;
            }
        }
    }
}
