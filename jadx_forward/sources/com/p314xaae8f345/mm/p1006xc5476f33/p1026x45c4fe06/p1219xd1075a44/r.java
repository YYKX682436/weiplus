package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44;

/* loaded from: classes7.dex */
public class r extends android.text.Spannable.Factory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.s f173388a;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.s sVar) {
        this.f173388a = sVar;
    }

    @Override // android.text.Spannable.Factory
    public android.text.Spannable newSpannable(java.lang.CharSequence charSequence) {
        android.text.Spannable newSpannable = super.newSpannable(charSequence);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.s sVar = this.f173388a;
        if (sVar.f173636e != null && !android.text.TextUtils.isEmpty(newSpannable)) {
            newSpannable.setSpan(sVar.f173636e, 0, newSpannable.length(), 18);
        }
        return newSpannable;
    }
}
