package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes3.dex */
public final class nd implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f228766d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.qd f228767e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f228768f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f228769g;

    public nd(android.widget.TextView textView, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.qd qdVar, int i17, boolean z17) {
        this.f228766d = textView;
        this.f228767e = qdVar;
        this.f228768f = i17;
        this.f228769g = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.TextView textView = this.f228766d;
        if (textView == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.qd qdVar = this.f228767e;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = qdVar.m158354x19263085();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 activityC16373x8a110f13 = m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16373x8a110f13) m158354x19263085 : null;
        boolean z17 = activityC16373x8a110f13 != null ? activityC16373x8a110f13.f227789i2 : false;
        android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        int measuredWidth = textView.getMeasuredWidth();
        int b17 = ((int) (qdVar.f228880d * 0.61d)) - i65.a.b(qdVar.m80379x76847179(), 30);
        int i17 = this.f228768f;
        int i18 = b17 - i17;
        int lineCount = new android.text.StaticLayout(textView.getText(), textView.getPaint(), measuredWidth, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false).getLineCount();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[doMeasureWidth] lineCount: ");
        sb6.append(lineCount);
        sb6.append(", isMax：");
        sb6.append(measuredWidth >= i18);
        sb6.append("，allWidth: ");
        sb6.append(measuredWidth);
        sb6.append("，maxWidth：");
        sb6.append(i18);
        sb6.append(", extraPadding：");
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewPrepareUISkinUIC", sb6.toString());
        if (this.f228769g && z17 && measuredWidth >= i18) {
            layoutParams.width = i18;
        } else {
            layoutParams.width = -2;
        }
        textView.setLayoutParams(layoutParams);
    }
}
