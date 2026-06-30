package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1759xd1075a44;

/* renamed from: com.tencent.mm.plugin.game.widget.GameTagListView */
/* loaded from: classes.dex */
public class C16037x7e3b52ab extends android.widget.LinearLayout implements xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public int f223493d;

    /* renamed from: e, reason: collision with root package name */
    public int f223494e;

    public C16037x7e3b52ab(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void a(java.util.LinkedList linkedList, int i17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        while (getChildCount() < linkedList.size()) {
            android.widget.TextView textView = new android.widget.TextView(getContext());
            textView.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563395af5);
            textView.setMaxLines(1);
            textView.setTextColor(this.f223493d);
            textView.setTextSize(0, this.f223494e);
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, 0, getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561362ge), 0);
            textView.setLayoutParams(layoutParams);
            addView(textView);
        }
        float f17 = 0.0f;
        int i18 = 0;
        while (true) {
            if (i18 >= linkedList.size()) {
                break;
            }
            java.lang.String str = (java.lang.String) linkedList.get(i18);
            android.widget.TextView textView2 = (android.widget.TextView) getChildAt(i18);
            textView2.setVisibility(0);
            textView2.setText(str);
            f17 = f17 + textView2.getPaint().measureText(str) + textView2.getPaddingLeft() + textView2.getPaddingRight() + getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561362ge);
            if (f17 > i17) {
                textView2.setVisibility(8);
                break;
            }
            i18++;
        }
        while (i18 < getChildCount()) {
            int i19 = i18 + 1;
            android.view.View childAt = getChildAt(i18);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(childAt, arrayList.toArray(), "com/tencent/mm/plugin/game/widget/GameTagListView", "setData", "(Ljava/util/LinkedList;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            childAt.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(childAt, "com/tencent/mm/plugin/game/widget/GameTagListView", "setData", "(Ljava/util/LinkedList;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            i18 = i19;
        }
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f223493d = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560724sf);
        this.f223494e = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561366gi);
    }
}
