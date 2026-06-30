package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public final class hl implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.jl f228535d;

    public hl(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.jl jlVar) {
        this.f228535d = jlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.jl jlVar = this.f228535d;
        android.widget.TextView textView = jlVar.f228604i;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tempLabelTv");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = jlVar.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeItemDetailUINew");
        int i17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16389xdab6e25f) m158354x19263085).f228042m;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = jlVar.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x192630852, "null cannot be cast to non-null type com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeItemDetailUINew");
        int i18 = i17 - ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16389xdab6e25f) m158354x192630852).f228043n;
        android.widget.TextView textView2 = jlVar.f228604i;
        if (textView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tempLabelTv");
            throw null;
        }
        layoutParams2.topMargin = i18 - textView2.getHeight();
        android.widget.TextView textView3 = jlVar.f228604i;
        if (textView3 != null) {
            textView3.setLayoutParams(layoutParams2);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tempLabelTv");
            throw null;
        }
    }
}
