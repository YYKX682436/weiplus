package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes3.dex */
public final class j6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.extension.reddot.l6 f105613d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.StringBuilder f105614e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(com.tencent.mm.plugin.finder.extension.reddot.l6 l6Var, java.lang.StringBuilder sb6) {
        super(0);
        this.f105613d = l6Var;
        this.f105614e = sb6;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        jz5.f0 f0Var;
        com.tencent.mm.plugin.finder.extension.reddot.l6 l6Var = this.f105613d;
        android.widget.LinearLayout linearLayout = l6Var.f105681g;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        java.lang.String str = l6Var.f105676b;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            android.widget.TextView textView = new android.widget.TextView(linearLayout.getContext());
            java.lang.StringBuilder sb6 = this.f105614e;
            textView.setText(sb6);
            com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
            textView.setTextColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f478549aj));
            textView.setTextSize(0, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479930ja));
            textView.setBackgroundColor(android.graphics.Color.parseColor("#26000000"));
            textView.setVerticalScrollBarEnabled(true);
            textView.setMaxWidth((int) ((java.lang.Number) ((jz5.n) l6Var.f105682h).getValue()).floatValue());
            jz5.g gVar = l6Var.f105688n;
            textView.setPadding(((java.lang.Number) ((jz5.n) gVar).getValue()).intValue(), ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue(), 0, ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue());
            textView.setClickable(false);
            textView.setFocusable(false);
            textView.setEnabled(false);
            textView.setImportantForAccessibility(2);
            android.widget.LinearLayout linearLayout2 = l6Var.f105681g;
            if (linearLayout2 != null) {
                linearLayout2.addView(textView);
            }
            com.tencent.mars.xlog.Log.i(str, "update msg=" + ((java.lang.Object) sb6) + '!');
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.i(str, "update rootLL is null!");
        }
        return f0Var2;
    }
}
