package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class b4 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.a4 f261679d = null;

    /* renamed from: e, reason: collision with root package name */
    public int f261680e;

    /* renamed from: f, reason: collision with root package name */
    public final int f261681f;

    public b4(android.content.Context context) {
        this.f261680e = -1;
        this.f261681f = -1;
        this.f261680e = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a_w);
        this.f261681f = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletClickableSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.a4 a4Var = this.f261679d;
        if (a4Var != null) {
            a4Var.mo73850xaf6b9ae9(view);
            com.p314xaae8f345.mm.p2802xd031a825.ui.b0.e(view);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletClickableSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setFakeBoldText(false);
        textPaint.setColor(this.f261680e);
        textPaint.setUnderlineText(false);
        textPaint.bgColor = this.f261681f;
    }
}
