package lv0;

/* loaded from: classes5.dex */
public final class b extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final lv0.a f403012d;

    public b(lv0.a builder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(builder, "builder");
        this.f403012d = builder;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setColor(-1);
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        paint2.setStyle(android.graphics.Paint.Style.FILL);
        paint2.setColor(-1);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect outRect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        super.mo7902x5db88677(outRect, view, parent, state);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = parent.getLayoutManager();
        int i17 = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d ? ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d) layoutManager).f93394w : layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1 ? ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1) layoutManager).f93453d : -1;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = parent.mo7946xf939df19();
        if (mo7946xf939df19 != null) {
            int mo1894x7e414b06 = mo7946xf939df19.mo1894x7e414b06();
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            int b17 = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) layoutParams).b();
            if (b17 < 0) {
                return;
            }
            int i18 = b17 % i17;
            lv0.a aVar = this.f403012d;
            int i19 = aVar.f403009b;
            int i27 = (i18 * i19) / i17;
            int i28 = i18 + 1;
            int i29 = i19 - ((i28 * i19) / i17);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager2 = parent.getLayoutManager();
            if (layoutManager2 instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d) {
                ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d) layoutManager2).B.a(b17, i17);
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager3 = parent.getLayoutManager();
            boolean z17 = true;
            if (!(layoutManager3 instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d) ? !(layoutManager3 instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1) || (((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1) layoutManager3).f93457h != 1 ? (b17 + 1) % i17 != 0 : b17 < mo1894x7e414b06 - (((mo1894x7e414b06 - 1) % i17) + 1)) : b17 < mo1894x7e414b06 - (((mo1894x7e414b06 - 1) % i17) + 1)) {
                z17 = false;
            }
            outRect.set(i27, 0, i29, z17 ? 0 : aVar.f403008a);
            int i37 = aVar.f403011d;
            if (i37 == 0 && aVar.f403010c == 0) {
                return;
            }
            int i38 = aVar.f403010c;
            int i39 = (i37 + i38) / i17;
            outRect.left += i38 - (i18 * i39);
            outRect.right += (i28 * i39) - i38;
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: onDraw */
    public void mo8166xc398a7c3(android.graphics.Canvas c17, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17, "c");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        super.mo8166xc398a7c3(c17, parent, state);
        lv0.a aVar = this.f403012d;
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
    }
}
