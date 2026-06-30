package al5;

/* loaded from: classes14.dex */
public final class x {
    public x(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public static final int a(al5.x xVar, android.view.View view) {
        int measuredWidth;
        int paddingStart;
        int paddingEnd;
        xVar.getClass();
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        int marginStart = ((android.widget.FrameLayout.LayoutParams) layoutParams).getMarginStart();
        android.view.ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        int marginEnd = ((android.widget.FrameLayout.LayoutParams) layoutParams2).getMarginEnd();
        int i17 = 0;
        if (view instanceof android.widget.TextView) {
            android.widget.TextView textView = (android.widget.TextView) view;
            if (textView.getLayout() != null) {
                i17 = a06.d.b(textView.getLayout().getPrimaryHorizontal(textView.getLayout().getOffsetForHorizontal(textView.getLineCount() - 1, Float.MAX_VALUE)));
            }
            paddingStart = i17 + textView.getPaddingStart();
            paddingEnd = textView.getPaddingEnd();
        } else {
            if (!(view instanceof com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc)) {
                measuredWidth = view.getMeasuredWidth();
                return marginStart + marginEnd + measuredWidth;
            }
            com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc c23001x9d3a0bdc = (com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc) view;
            if (c23001x9d3a0bdc.mo84153x22f21e20() != null) {
                i17 = a06.d.b(c23001x9d3a0bdc.mo84153x22f21e20().f(c23001x9d3a0bdc.mo84153x22f21e20().g(c23001x9d3a0bdc.mo84153x22f21e20().d() - 1, Float.MAX_VALUE)));
            }
            paddingStart = i17 + c23001x9d3a0bdc.getPaddingStart();
            paddingEnd = c23001x9d3a0bdc.getPaddingEnd();
        }
        measuredWidth = paddingStart + paddingEnd;
        return marginStart + marginEnd + measuredWidth;
    }

    public static final int b(al5.x xVar, android.view.View view) {
        xVar.getClass();
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        int i17 = ((android.widget.FrameLayout.LayoutParams) layoutParams).topMargin;
        android.view.ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        return i17 + ((android.widget.FrameLayout.LayoutParams) layoutParams2).bottomMargin + view.getMeasuredHeight();
    }

    public static final int c(al5.x xVar, android.view.View view) {
        xVar.getClass();
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        int marginStart = ((android.widget.FrameLayout.LayoutParams) layoutParams).getMarginStart();
        android.view.ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        return marginStart + ((android.widget.FrameLayout.LayoutParams) layoutParams2).getMarginEnd() + view.getMeasuredWidth();
    }

    public static final int d(al5.x xVar, com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc c23001x9d3a0bdc) {
        xVar.getClass();
        if (c23001x9d3a0bdc.mo84153x22f21e20() == null) {
            return 0;
        }
        return c23001x9d3a0bdc.mo84153x22f21e20().a(c23001x9d3a0bdc.mo84153x22f21e20().d() - 1);
    }
}
