package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704;

/* loaded from: classes5.dex */
public final class y0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15147x19964f7b f211992a;

    public y0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15147x19964f7b c15147x19964f7b) {
        this.f211992a = c15147x19964f7b;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.a
    public void a(java.lang.String displayName, java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(displayName, "displayName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15147x19964f7b.N;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15147x19964f7b c15147x19964f7b = this.f211992a;
        java.lang.String obj = c15147x19964f7b.m61024xdb574fcd().getText().toString();
        int selectionEnd = c15147x19964f7b.m61024xdb574fcd().getSelectionEnd();
        int length = obj.length();
        if (selectionEnd > length) {
            selectionEnd = length;
        }
        int i17 = selectionEnd - 1;
        if (i17 < 0) {
            i17 = 0;
        }
        java.lang.String str = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj.subSequence(i17, selectionEnd).toString(), "@") ? "" : "@";
        long length2 = displayName.length() + 2;
        if (selectionEnd > obj.length()) {
            selectionEnd = obj.length();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String substring = obj.substring(0, selectionEnd);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
        sb6.append(substring);
        sb6.append(str);
        sb6.append(displayName);
        sb6.append((char) 8197);
        java.lang.String substring2 = obj.substring(selectionEnd, obj.length());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring2, "substring(...)");
        sb6.append(substring2);
        java.lang.String sb7 = sb6.toString();
        int length3 = selectionEnd + str.length() + displayName.length() + 1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15269x718714b0 m61024xdb574fcd = c15147x19964f7b.m61024xdb574fcd();
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = c15147x19964f7b.getContext();
        ((ke0.e) xVar).getClass();
        m61024xdb574fcd.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, sb7));
        c15147x19964f7b.m61024xdb574fcd().mo81549xf579a34a(length3);
        c15147x19964f7b.m61024xdb574fcd().postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.v0(c15147x19964f7b), 200L);
        c15147x19964f7b.I.add(new hv2.a(username, displayName, -1L, length2));
    }
}
