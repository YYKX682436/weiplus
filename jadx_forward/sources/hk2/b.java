package hk2;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final hk2.b f363412a = new hk2.b();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f363413b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f363414c;

    static {
        jz5.h.b(hk2.a.f363411d);
        f363413b = "\u2005";
        f363414c = 17;
    }

    public final android.graphics.drawable.Drawable a(int i17) {
        int i18;
        if (40 <= i17 && i17 < 50) {
            i18 = com.p314xaae8f345.mm.R.C30861xcebc809e.f563243a20;
        } else {
            if (50 <= i17 && i17 < 60) {
                i18 = com.p314xaae8f345.mm.R.C30861xcebc809e.f563245a22;
            } else {
                if (60 <= i17 && i17 < 70) {
                    i18 = com.p314xaae8f345.mm.R.C30861xcebc809e.f563247a24;
                } else {
                    if (70 <= i17 && i17 < 80) {
                        i18 = com.p314xaae8f345.mm.R.C30861xcebc809e.f563249a26;
                    } else {
                        if (80 <= i17 && i17 < 90) {
                            i18 = com.p314xaae8f345.mm.R.C30861xcebc809e.a28;
                        } else {
                            i18 = 90 <= i17 && i17 < 100 ? com.p314xaae8f345.mm.R.C30861xcebc809e.a2_ : com.p314xaae8f345.mm.R.C30861xcebc809e.a1y;
                        }
                    }
                }
            }
        }
        android.graphics.drawable.Drawable drawable = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDrawable(i18, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(drawable, "getDrawable(...)");
        return drawable;
    }

    public final android.text.style.ImageSpan b(r45.yl1 yl1Var) {
        int i17;
        gm2.c cVar;
        int i18;
        java.lang.Integer valueOf = yl1Var != null ? java.lang.Integer.valueOf(yl1Var.m75939xb282bd08(0)) : null;
        if (valueOf != null && valueOf.intValue() == 2) {
            android.graphics.drawable.Drawable a17 = gm2.q.f354993e.a(gm2.t1.f355014c.b(yl1Var.m75939xb282bd08(2)), 2.0f);
            gm2.c1 c1Var = gm2.c1.f354853a;
            gm2.c cVar2 = new gm2.c(gm2.c1.c(c1Var, c1Var.l() + c1Var.k(), 0, 2, null));
            wo.q1 q1Var = new wo.q1(c1Var.l(), c1Var.l());
            int W0 = zl2.r4.f555483a.W0(yl1Var.m75939xb282bd08(2));
            cVar2.f354848d = a17;
            cVar2.f354849e = q1Var;
            cVar2.f354850f = W0;
            c1Var.k();
            cVar2.f354851g = 0;
            return cVar2;
        }
        if (valueOf != null && valueOf.intValue() == 4) {
            int m75939xb282bd08 = yl1Var.m75939xb282bd08(2);
            if (1 <= m75939xb282bd08 && m75939xb282bd08 < 7) {
                i18 = com.p314xaae8f345.mm.R.C30861xcebc809e.c4e;
            } else {
                if (7 <= m75939xb282bd08 && m75939xb282bd08 < 13) {
                    i18 = com.p314xaae8f345.mm.R.C30861xcebc809e.c4f;
                } else {
                    if (!(13 <= m75939xb282bd08 && m75939xb282bd08 < 18)) {
                        if (!(18 <= m75939xb282bd08 && m75939xb282bd08 <= Integer.MAX_VALUE)) {
                            i18 = 0;
                        }
                    }
                    i18 = com.p314xaae8f345.mm.R.C30861xcebc809e.c4g;
                }
            }
            android.graphics.drawable.Drawable e17 = m95.a.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e, i18, 2.0f);
            gm2.c1 c1Var2 = gm2.c1.f354853a;
            cVar = new gm2.c(gm2.c1.c(c1Var2, c1Var2.l() + c1Var2.k(), 0, 2, null));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(e17);
            wo.q1 q1Var2 = new wo.q1(c1Var2.l(), c1Var2.l());
            cVar.f354848d = e17;
            cVar.f354849e = q1Var2;
            cVar.f354850f = 0;
            c1Var2.k();
            cVar.f354851g = 0;
        } else {
            if (valueOf == null || valueOf.intValue() != 12) {
                return null;
            }
            int m75939xb282bd082 = yl1Var.m75939xb282bd08(2);
            if (1 <= m75939xb282bd082 && m75939xb282bd082 < 7) {
                i17 = com.p314xaae8f345.mm.R.C30861xcebc809e.cpt;
            } else {
                if (7 <= m75939xb282bd082 && m75939xb282bd082 < 13) {
                    i17 = com.p314xaae8f345.mm.R.C30861xcebc809e.cpu;
                } else {
                    if (!(13 <= m75939xb282bd082 && m75939xb282bd082 < 18)) {
                        if (!(18 <= m75939xb282bd082 && m75939xb282bd082 <= Integer.MAX_VALUE)) {
                            i17 = 0;
                        }
                    }
                    i17 = com.p314xaae8f345.mm.R.C30861xcebc809e.cpq;
                }
            }
            android.graphics.drawable.Drawable e18 = m95.a.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e, i17, 2.0f);
            gm2.c1 c1Var3 = gm2.c1.f354853a;
            cVar = new gm2.c(gm2.c1.c(c1Var3, c1Var3.l() + c1Var3.k(), 0, 2, null));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(e18);
            wo.q1 q1Var3 = new wo.q1(c1Var3.l(), c1Var3.l());
            cVar.f354848d = e18;
            cVar.f354849e = q1Var3;
            cVar.f354850f = 0;
            c1Var3.k();
            cVar.f354851g = 0;
        }
        return cVar;
    }

    public final void c(dk2.zf finderLiveMsg, android.view.View likeRoot) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderLiveMsg, "finderLiveMsg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(likeRoot, "likeRoot");
        if (finderLiveMsg instanceof dk2.cg) {
            dk2.cg cgVar = (dk2.cg) finderLiveMsg;
            se2.w.f488428a.m(likeRoot, cgVar.o(), cgVar.s(), null);
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(likeRoot, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/model/danmakuitem/DanmakuItemBase", "processLike", "(Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        likeRoot.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(likeRoot, "com/tencent/mm/plugin/finder/live/model/danmakuitem/DanmakuItemBase", "processLike", "(Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void d(android.view.View itemView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.qcw);
        itemView.findViewById(com.p314xaae8f345.mm.R.id.lti).setPadding(0, 0, 0, 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15217xc42aa699 c15217xc42aa699 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15217xc42aa699) itemView.findViewById(com.p314xaae8f345.mm.R.id.i8m);
        if (c15217xc42aa699 != null) {
            c15217xc42aa699.setTextColor(c15217xc42aa699.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
            c15217xc42aa699.m61616x1d4b00a4(null);
        }
        int dimensionPixelOffset = findViewById.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
        int dimensionPixelOffset2 = findViewById.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561178bk);
        findViewById.setPadding(dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset, dimensionPixelOffset2);
        findViewById.setBackground(null);
    }

    public final void e(r45.yl1 yl1Var, android.view.View bgView, android.view.View likeRoot) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bgView, "bgView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(likeRoot, "likeRoot");
        java.lang.Integer valueOf = yl1Var != null ? java.lang.Integer.valueOf(yl1Var.m75939xb282bd08(0)) : null;
        if (valueOf != null && valueOf.intValue() == 2) {
            bgView.setBackground(a(yl1Var.m75939xb282bd08(2)));
            android.view.ViewGroup.LayoutParams layoutParams = likeRoot.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            gm2.c1 c1Var = gm2.c1.f354853a;
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin = ((java.lang.Number) ((jz5.n) gm2.c1.f354865m).mo141623x754a37bb()).intValue();
            return;
        }
        if (valueOf != null && valueOf.intValue() == 4) {
            bgView.setBackground(null);
            android.view.ViewGroup.LayoutParams layoutParams2 = likeRoot.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = gm2.c1.f354853a.j() * (-1);
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams3 = likeRoot.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams3).leftMargin = gm2.c1.f354853a.j() * (-1);
        bgView.setBackground(null);
    }

    public final void f(android.view.View bgView, android.view.View likeRoot) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bgView, "bgView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(likeRoot, "likeRoot");
        android.view.ViewGroup.LayoutParams layoutParams = likeRoot.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin = gm2.c1.f354853a.j() * (-1);
        bgView.setBackground(null);
    }
}
