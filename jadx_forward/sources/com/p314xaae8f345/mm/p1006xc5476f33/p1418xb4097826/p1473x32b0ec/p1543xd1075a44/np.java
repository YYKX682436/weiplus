package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes10.dex */
public final class np extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.pp f200729d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public np(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.pp ppVar) {
        super(0);
        this.f200729d = ppVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.ArrayList arrayList;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.pp ppVar = this.f200729d;
        ppVar.f200933f.clear();
        java.util.ArrayList arrayList2 = ppVar.f200934g;
        synchronized (arrayList2) {
            arrayList = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(new vi2.d((r45.xn1) it.next()));
            }
        }
        ppVar.f200933f.addAll(arrayList);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = ppVar.f200931d.mo7946xf939df19();
        if (mo7946xf939df19 != null) {
            mo7946xf939df19.m8146xced61ae5();
        }
        if (ppVar.f200933f.size() > 0) {
            int size = ppVar.f200933f.size();
            android.view.ViewGroup viewGroup = ppVar.f200929b;
            if (size > 0) {
                viewGroup.setVisibility(0);
            } else {
                viewGroup.setVisibility(8);
            }
            ppVar.f200930c.c();
        } else {
            ppVar.f200929b.setVisibility(8);
            ppVar.f200930c.d();
        }
        android.view.ViewGroup viewGroup2 = ppVar.f200929b;
        java.lang.String string = viewGroup2.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573001m32);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        java.lang.String string2 = viewGroup2.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573000m31, string);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        android.text.SpannableString spannableString = new android.text.SpannableString(string2);
        int L = r26.n0.L(string2, string, 0, false, 6, null);
        if (L >= 0 && string.length() + L <= string2.length()) {
            spannableString.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.lp(ppVar), L, string.length() + L, 33);
        }
        android.widget.TextView textView = ppVar.f200932e;
        textView.setText(spannableString);
        textView.setHighlightColor(viewGroup2.getContext().getResources().getColor(android.R.color.transparent));
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        ym5.a1.h(textView, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.mp());
        return jz5.f0.f384359a;
    }
}
