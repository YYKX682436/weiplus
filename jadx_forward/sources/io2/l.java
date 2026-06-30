package io2;

/* loaded from: classes2.dex */
public final class l extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Rect f375014d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f375015e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f375016f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f375017g;

    /* renamed from: h, reason: collision with root package name */
    public final int f375018h;

    /* renamed from: i, reason: collision with root package name */
    public final int f375019i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ io2.p f375020m;

    public l(io2.p pVar) {
        this.f375020m = pVar;
        android.graphics.Rect rect = new android.graphics.Rect();
        this.f375014d = rect;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f375015e = paint;
        java.lang.String r17 = i65.a.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.lra);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getString(...)");
        this.f375016f = r17;
        java.lang.String r18 = i65.a.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.lrh);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r18, "getString(...)");
        this.f375017g = r18;
        paint.setColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.a(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        paint.setTextSize(i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 15));
        paint.setAntiAlias(true);
        paint.getTextBounds(r17, 0, 1, rect);
        this.f375018h = i65.a.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz) + rect.height();
        this.f375019i = i65.a.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv) + (rect.height() / 2);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo8217x5db88677(android.graphics.Rect outRect, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent) {
        so2.j3 j3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        io2.p pVar = this.f375020m;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1566x332453.C14459x792f41a5 c14459x792f41a5 = pVar.f375024a.f375010d;
        if (c14459x792f41a5.f202692e) {
            if (i17 > 0) {
                java.lang.Object obj = c14459x792f41a5.m56388xcaeb60d0().get(i17 - 1);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.FinderMemberCardData");
                j3Var = (so2.j3) obj;
            } else {
                j3Var = null;
            }
            java.lang.Object obj2 = pVar.f375024a.f375010d.m56388xcaeb60d0().get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.FinderMemberCardData");
            so2.j3 j3Var2 = (so2.j3) obj2;
            if (j3Var == null || (!j3Var.a() && j3Var2.a())) {
                outRect.top = this.f375018h;
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: onDraw */
    public void mo8166xc398a7c3(android.graphics.Canvas c17, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        so2.j3 j3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17, "c");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        super.mo8166xc398a7c3(c17, parent, state);
        io2.p pVar = this.f375020m;
        if (pVar.f375024a.f375010d.f202692e) {
            int childCount = parent.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.View childAt = parent.getChildAt(i17);
                int u07 = parent.u0(childAt);
                java.lang.Object obj = pVar.f375024a.f375010d.m56388xcaeb60d0().get(u07);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.FinderMemberCardData");
                so2.j3 j3Var2 = (so2.j3) obj;
                if (u07 > 0) {
                    java.lang.Object obj2 = pVar.f375024a.f375010d.m56388xcaeb60d0().get(u07 - 1);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.FinderMemberCardData");
                    j3Var = (so2.j3) obj2;
                } else {
                    j3Var = null;
                }
                if (j3Var == null || (!j3Var.a() && j3Var2.a())) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(childAt);
                    java.lang.String str = j3Var2.a() ? this.f375016f : this.f375017g;
                    android.graphics.Paint paint = this.f375015e;
                    paint.getTextBounds(str, 0, 1, this.f375014d);
                    android.graphics.Paint.FontMetrics fontMetrics = paint.getFontMetrics();
                    float f17 = fontMetrics.bottom;
                    c17.drawText(str, childAt.getPaddingLeft(), (childAt.getTop() + (((f17 - fontMetrics.top) / 2) - f17)) - this.f375019i, paint);
                    if (j3Var2.a()) {
                        return;
                    }
                }
            }
        }
    }
}
