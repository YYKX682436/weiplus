package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public class w1 extends android.text.Spannable.Factory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.a2 f91703a;

    public w1(com.tencent.mm.plugin.appbrand.widget.input.a2 a2Var) {
        this.f91703a = a2Var;
    }

    @Override // android.text.Spannable.Factory
    public android.text.Spannable newSpannable(java.lang.CharSequence charSequence) {
        android.text.Spannable newSpannable = super.newSpannable(charSequence);
        com.tencent.mm.plugin.appbrand.widget.input.a2 a2Var = this.f91703a;
        if (a2Var.A != null && !android.text.TextUtils.isEmpty(newSpannable)) {
            newSpannable.setSpan(a2Var.A, 0, newSpannable.length(), 18);
        }
        return newSpannable;
    }
}
