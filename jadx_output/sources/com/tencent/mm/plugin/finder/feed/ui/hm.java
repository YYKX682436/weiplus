package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes8.dex */
public final class hm implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderTestNumFormat f110127d;

    public hm(com.tencent.mm.plugin.finder.feed.ui.FinderTestNumFormat finderTestNumFormat) {
        this.f110127d = finderTestNumFormat;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        int i17 = com.tencent.mm.plugin.finder.feed.ui.FinderTestNumFormat.G;
        com.tencent.mm.plugin.finder.feed.ui.FinderTestNumFormat finderTestNumFormat = this.f110127d;
        java.lang.String obj = ((com.tencent.mm.ui.widget.MMEditText) ((jz5.n) finderTestNumFormat.f109561u).getValue()).getText().toString();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (obj == null) {
            obj = "";
        }
        long E1 = com.tencent.mm.sdk.platformtools.t8.E1(obj);
        ((android.widget.TextView) ((jz5.n) finderTestNumFormat.f109562v).getValue()).setText(((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).Zi(E1));
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) finderTestNumFormat.f109563w).getValue();
        ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).getClass();
        java.lang.String f17 = com.tencent.mm.plugin.finder.assist.w2.f((int) E1);
        kotlin.jvm.internal.o.f(f17, "formatLiveCardNumberMillion(...)");
        textView.setText(f17);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
