package zy2;

/* loaded from: classes10.dex */
public abstract class s {
    public static final java.lang.String a(r45.g92 g92Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(g92Var, "<this>");
        r45.d50 d50Var = (r45.d50) g92Var.m75936x14adae67(46);
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa> m75941xfb821914 = d50Var != null ? d50Var.m75941xfb821914(1) : null;
        if (m75941xfb821914 == null || m75941xfb821914.isEmpty()) {
            return null;
        }
        java.lang.String m75945x2fec8307 = g92Var.m75945x2fec8307(21);
        java.lang.String m75945x2fec83072 = !(m75945x2fec8307 == null || m75945x2fec8307.length() == 0) ? g92Var.m75945x2fec8307(21) : g92Var.m75945x2fec8307(3);
        lz5.e eVar = new lz5.e(m75941xfb821914.size() + 1);
        if (m75945x2fec83072 == null) {
            m75945x2fec83072 = "";
        }
        eVar.add(m75945x2fec83072);
        for (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa : m75941xfb821914) {
            java.lang.String m76184x8010e5e4 = c19782x23db1cfa != null ? c19782x23db1cfa.m76184x8010e5e4() : null;
            if (m76184x8010e5e4 == null) {
                m76184x8010e5e4 = "";
            }
            eVar.add(m76184x8010e5e4);
        }
        java.util.List a17 = kz5.b0.a(eVar);
        zy2.p pVar = zy2.p.f559059a;
        return pVar.c(a17).concat(pVar.d(((kz5.l) a17).d()));
    }

    public static final void b(android.widget.TextView textView, java.util.List nicknames, int i17, android.view.View view) {
        int i18;
        int intValue;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nicknames, "nicknames");
        java.lang.Object tag = textView.getTag(com.p314xaae8f345.mm.R.id.sut);
        java.lang.Integer num = null;
        zy2.n nVar = tag instanceof zy2.n ? (zy2.n) tag : null;
        if (nVar != null) {
            android.view.ViewTreeObserver viewTreeObserver = textView.getViewTreeObserver().isAlive() ? textView.getViewTreeObserver() : nVar.f559011a;
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(nVar.f559012b);
            }
            android.view.View.OnAttachStateChangeListener onAttachStateChangeListener = nVar.f559013c;
            if (onAttachStateChangeListener != null) {
                textView.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            }
        }
        textView.setMinWidth(0);
        if (view != null) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(view.getWidth());
            if (!(valueOf.intValue() > 0)) {
                valueOf = null;
            }
            if (valueOf != null) {
                intValue = valueOf.intValue();
            } else {
                android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    java.lang.Integer valueOf2 = java.lang.Integer.valueOf(layoutParams.width);
                    if (valueOf2.intValue() > 0) {
                        num = valueOf2;
                    }
                }
                intValue = num != null ? num.intValue() : 0;
            }
            i18 = intValue;
        } else {
            i18 = 0;
        }
        if (i18 > 0) {
            textView.setMaxWidth(i18);
        }
        zy2.p pVar = zy2.p.f559059a;
        java.lang.String concat = pVar.c(nicknames).concat(pVar.d(i17));
        if (i18 > 0) {
            int paddingStart = (i18 - textView.getPaddingStart()) - textView.getPaddingEnd();
            int i19 = paddingStart >= 0 ? paddingStart : 0;
            if (i19 > 0) {
                android.text.TextPaint paint = textView.getPaint();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(paint, "getPaint(...)");
                concat = pVar.b(nicknames, i17, i19, paint);
            }
        }
        textView.setText(pVar.a(concat, i17));
        android.view.ViewTreeObserver viewTreeObserver2 = textView.getViewTreeObserver();
        zy2.r rVar = new zy2.r(textView, viewTreeObserver2, nicknames, i17, i18);
        viewTreeObserver2.addOnPreDrawListener(rVar);
        zy2.q qVar = new zy2.q(textView, viewTreeObserver2, rVar);
        textView.addOnAttachStateChangeListener(qVar);
        textView.setTag(com.p314xaae8f345.mm.R.id.sut, new zy2.n(viewTreeObserver2, rVar, qVar));
    }
}
