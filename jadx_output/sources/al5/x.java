package al5;

/* loaded from: classes14.dex */
public final class x {
    public x(kotlin.jvm.internal.i iVar) {
    }

    public static final int a(al5.x xVar, android.view.View view) {
        int measuredWidth;
        int paddingStart;
        int paddingEnd;
        xVar.getClass();
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        int marginStart = ((android.widget.FrameLayout.LayoutParams) layoutParams).getMarginStart();
        android.view.ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
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
            if (!(view instanceof com.tencent.neattextview.textview.view.NeatTextView)) {
                measuredWidth = view.getMeasuredWidth();
                return marginStart + marginEnd + measuredWidth;
            }
            com.tencent.neattextview.textview.view.NeatTextView neatTextView = (com.tencent.neattextview.textview.view.NeatTextView) view;
            if (neatTextView.getLayout() != null) {
                i17 = a06.d.b(neatTextView.getLayout().f(neatTextView.getLayout().g(neatTextView.getLayout().d() - 1, Float.MAX_VALUE)));
            }
            paddingStart = i17 + neatTextView.getPaddingStart();
            paddingEnd = neatTextView.getPaddingEnd();
        }
        measuredWidth = paddingStart + paddingEnd;
        return marginStart + marginEnd + measuredWidth;
    }

    public static final int b(al5.x xVar, android.view.View view) {
        xVar.getClass();
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        int i17 = ((android.widget.FrameLayout.LayoutParams) layoutParams).topMargin;
        android.view.ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        return i17 + ((android.widget.FrameLayout.LayoutParams) layoutParams2).bottomMargin + view.getMeasuredHeight();
    }

    public static final int c(al5.x xVar, android.view.View view) {
        xVar.getClass();
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        int marginStart = ((android.widget.FrameLayout.LayoutParams) layoutParams).getMarginStart();
        android.view.ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        return marginStart + ((android.widget.FrameLayout.LayoutParams) layoutParams2).getMarginEnd() + view.getMeasuredWidth();
    }

    public static final int d(al5.x xVar, com.tencent.neattextview.textview.view.NeatTextView neatTextView) {
        xVar.getClass();
        if (neatTextView.getLayout() == null) {
            return 0;
        }
        return neatTextView.getLayout().a(neatTextView.getLayout().d() - 1);
    }
}
