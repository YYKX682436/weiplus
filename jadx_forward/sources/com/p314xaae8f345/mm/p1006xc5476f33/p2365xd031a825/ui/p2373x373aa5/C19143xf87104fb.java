package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.view.FavourLayout */
/* loaded from: classes.dex */
public class C19143xf87104fb extends android.widget.LinearLayout {
    public C19143xf87104fb(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: setWording */
    public void m73917xc2385d6(java.util.LinkedList<java.lang.String> linkedList) {
        removeAllViews();
        java.util.Iterator<java.lang.String> it = linkedList.iterator();
        while (it.hasNext()) {
            java.lang.String next = it.next();
            android.widget.TextView textView = new android.widget.TextView(getContext());
            textView.setText(next);
            textView.setTextColor(android.graphics.Color.parseColor("#ff891e"));
            textView.setTextSize(0, i65.a.h(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561458j4));
            addView(textView);
        }
    }

    public C19143xf87104fb(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
