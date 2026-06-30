package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78;

/* loaded from: classes2.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.C14879x7c6ab7a6 f204905d;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.C14879x7c6ab7a6 c14879x7c6ab7a6) {
        this.f204905d = c14879x7c6ab7a6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.C14879x7c6ab7a6 c14879x7c6ab7a6 = this.f204905d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.h hVar = c14879x7c6ab7a6.presenter;
        if (!((hVar == null || (arrayList2 = hVar.f204901e) == null || !(arrayList2.isEmpty() ^ true)) ? false : true)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.C14876x9baef275 c14876x9baef275 = c14879x7c6ab7a6.layoutManager;
            if (c14876x9baef275 == null) {
                return;
            }
            c14876x9baef275.f204839q = false;
            return;
        }
        android.widget.TextView textView = (android.widget.TextView) c14879x7c6ab7a6.findViewById(com.p314xaae8f345.mm.R.id.e4c);
        if (textView != null) {
            textView.setTextSize(1, i65.a.q(c14879x7c6ab7a6.getContext()) * 14.0f);
            ym5.a1.h(textView, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.k(c14879x7c6ab7a6));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.C14876x9baef275 c14876x9baef2752 = c14879x7c6ab7a6.layoutManager;
            if (c14876x9baef2752 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.h hVar2 = c14879x7c6ab7a6.presenter;
                if (((hVar2 == null || (arrayList = hVar2.f204901e) == null) ? 0 : arrayList.size()) > c14876x9baef2752.o(0)) {
                    textView.setVisibility(0);
                }
            }
            textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.l(c14879x7c6ab7a6, textView));
        }
    }
}
