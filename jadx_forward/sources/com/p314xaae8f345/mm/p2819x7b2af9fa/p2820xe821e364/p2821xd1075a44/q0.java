package com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44;

/* loaded from: classes15.dex */
public class q0 implements com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.k2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 f296154a;

    public q0(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4) {
        this.f296154a = c22949xf1deaba4;
    }

    public void a(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1 y1Var, com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.a1 a1Var, com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.a1 a1Var2) {
        boolean z17;
        int i17;
        int i18;
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4 = this.f296154a;
        c22949xf1deaba4.getClass();
        y1Var.x(false);
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.b2 b2Var = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.b2) c22949xf1deaba4.S;
        b2Var.getClass();
        if (a1Var == null || ((i17 = a1Var.f295982a) == (i18 = a1Var2.f295982a) && a1Var.f295983b == a1Var2.f295983b)) {
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.q qVar = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.q) b2Var;
            qVar.l(y1Var);
            android.view.View view = y1Var.f296236d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/xcompat/recyclerview/widget/DefaultItemAnimator", "animateAdd", "(Lcom/tencent/mm/xcompat/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/xcompat/recyclerview/widget/DefaultItemAnimator", "animateAdd", "(Lcom/tencent/mm/xcompat/recyclerview/widget/RecyclerView$ViewHolder;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
            qVar.f296144i.add(y1Var);
            z17 = true;
        } else {
            z17 = b2Var.g(y1Var, i17, a1Var.f295983b, i18, a1Var2.f295983b);
        }
        if (z17) {
            c22949xf1deaba4.S();
        }
    }

    public void b(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1 y1Var, com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.a1 a1Var, com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.a1 a1Var2) {
        boolean z17;
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4 = this.f296154a;
        c22949xf1deaba4.f295932f.k(y1Var);
        c22949xf1deaba4.g(y1Var);
        y1Var.x(false);
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.b2 b2Var = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.b2) c22949xf1deaba4.S;
        b2Var.getClass();
        int i17 = a1Var.f295982a;
        int i18 = a1Var.f295983b;
        android.view.View view = y1Var.f296236d;
        int left = a1Var2 == null ? view.getLeft() : a1Var2.f295982a;
        int top = a1Var2 == null ? view.getTop() : a1Var2.f295983b;
        if (y1Var.m() || (i17 == left && i18 == top)) {
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.q qVar = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.q) b2Var;
            qVar.l(y1Var);
            qVar.f296143h.add(y1Var);
            z17 = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            z17 = b2Var.g(y1Var, i17, i18, left, top);
        }
        if (z17) {
            c22949xf1deaba4.S();
        }
    }

    public void c(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1 y1Var) {
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4 = this.f296154a;
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.g1 g1Var = c22949xf1deaba4.f295946t;
        android.view.View view = y1Var.f296236d;
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.f fVar = g1Var.f296054a;
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.r0 r0Var = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.r0) fVar.f296040a;
        int indexOfChild = r0Var.f296156a.indexOfChild(view);
        if (indexOfChild >= 0) {
            if (fVar.f296041b.f(indexOfChild)) {
                fVar.k(view);
            }
            r0Var.b(indexOfChild);
        }
        c22949xf1deaba4.f295932f.g(view);
    }
}
