package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes3.dex */
public final class md implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f228714d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f228715e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f228716f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.qd f228717g;

    public md(android.widget.TextView textView, boolean z17, android.widget.TextView textView2, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.qd qdVar) {
        this.f228714d = textView;
        this.f228715e = z17;
        this.f228716f = textView2;
        this.f228717g = qdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        java.lang.String obj;
        android.widget.TextView textView = this.f228714d;
        android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (this.f228715e) {
            android.widget.TextView textView2 = this.f228716f;
            if (textView2 != null && textView2.getVisibility() == 0) {
                java.lang.CharSequence text = textView2.getText();
                java.lang.String str2 = "";
                if (text == null || (str = text.toString()) == null) {
                    str = "";
                }
                android.text.TextPaint paint = textView2.getPaint();
                int measureText = paint != null ? (int) paint.measureText(str) : 0;
                java.lang.CharSequence text2 = textView.getText();
                if (text2 != null && (obj = text2.toString()) != null) {
                    str2 = obj;
                }
                android.text.TextPaint paint2 = textView.getPaint();
                int measureText2 = paint2 != null ? (int) paint2.measureText(str2) : 0;
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.qd qdVar = this.f228717g;
                int b17 = measureText2 + i65.a.b(qdVar.m80379x76847179(), 16);
                int b18 = (((int) (qdVar.f228880d * 0.61d)) - i65.a.b(qdVar.m80379x76847179(), 6)) - measureText;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[doLimitedDescTextWidth] isOver：");
                sb6.append(b17 >= b18);
                sb6.append("，allWidth: ");
                sb6.append(b17);
                sb6.append("，maxWidth：");
                sb6.append(b18);
                sb6.append(", targetWidth：");
                sb6.append(measureText);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewPrepareUISkinUIC", sb6.toString());
                if (b17 >= b18) {
                    if (layoutParams != null) {
                        layoutParams.width = b18;
                    }
                } else if (layoutParams != null) {
                    layoutParams.width = -2;
                }
                textView.setLayoutParams(layoutParams);
                return;
            }
        }
        if (layoutParams != null) {
            layoutParams.width = -2;
        }
        textView.setLayoutParams(layoutParams);
    }
}
