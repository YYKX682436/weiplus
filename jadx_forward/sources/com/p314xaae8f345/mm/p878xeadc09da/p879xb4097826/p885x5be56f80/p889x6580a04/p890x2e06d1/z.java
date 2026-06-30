package com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1;

/* loaded from: classes5.dex */
public abstract class z {
    public static final boolean a(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.q qVar) {
        if (qVar == null) {
            return false;
        }
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.p f150738e = qVar.getF150738e();
        return f150738e == com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.p.f150777f || f150738e == com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.p.f150778g || f150738e == com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.p.f150779h || f150738e == com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.p.f150780i;
    }

    public static final void b(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6 abstractC10936x89d53ec6, android.view.View view, java.lang.Integer num) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(abstractC10936x89d53ec6, "<this>");
        android.view.ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return;
        }
        int m47061x92c6830 = abstractC10936x89d53ec6.m47061x92c6830();
        int dimensionPixelSize = j65.q.a(abstractC10936x89d53ec6.getContext()).getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.ajd);
        int dimensionPixelSize2 = j65.q.a(abstractC10936x89d53ec6.getContext()).getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.ala);
        marginLayoutParams.topMargin = 0;
        if (num != null) {
            dimensionPixelSize2 = abstractC10936x89d53ec6.m47061x92c6830() + num.intValue();
        } else if (m47061x92c6830 != 0) {
            dimensionPixelSize2 = (int) (((abstractC10936x89d53ec6.m47061x92c6830() * 1.0f) * (dimensionPixelSize2 + dimensionPixelSize)) / dimensionPixelSize);
        }
        marginLayoutParams.bottomMargin = dimensionPixelSize2;
    }
}
