package com.tencent.mm.plugin.appbrand.widget;

/* loaded from: classes7.dex */
public class r extends android.text.Spannable.Factory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.s f91855a;

    public r(com.tencent.mm.plugin.appbrand.widget.s sVar) {
        this.f91855a = sVar;
    }

    @Override // android.text.Spannable.Factory
    public android.text.Spannable newSpannable(java.lang.CharSequence charSequence) {
        android.text.Spannable newSpannable = super.newSpannable(charSequence);
        com.tencent.mm.plugin.appbrand.widget.s sVar = this.f91855a;
        if (sVar.f92103e != null && !android.text.TextUtils.isEmpty(newSpannable)) {
            newSpannable.setSpan(sVar.f92103e, 0, newSpannable.length(), 18);
        }
        return newSpannable;
    }
}
