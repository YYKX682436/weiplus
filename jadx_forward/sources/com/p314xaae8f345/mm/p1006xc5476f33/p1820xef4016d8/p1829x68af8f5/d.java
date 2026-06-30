package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5;

/* loaded from: classes9.dex */
public class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16344xea85a40c f227376d;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16344xea85a40c c16344xea85a40c) {
        this.f227376d = c16344xea85a40c;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        qk.v vVar = new qk.v();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16344xea85a40c c16344xea85a40c = this.f227376d;
        vVar.f445560g = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1(java.lang.Integer.valueOf(c16344xea85a40c.E1.f463044t));
        java.lang.String str = c16344xea85a40c.E1.f463039o;
        if (str == null) {
            str = "";
        }
        vVar.f445563j = str;
        java.lang.String str2 = c16344xea85a40c.E1.f463038n;
        vVar.f445564k = str2 != null ? str2 : "";
        vVar.f445688a = 30;
        vVar.f445689b = true;
        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.q6 q6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.q6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.q6.class);
        if (q6Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EnvelopeAppBarLayout", "emoticon page service not found");
            yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.h4) q6Var).wi(c16344xea85a40c.getContext(), vVar);
        gb3.n.a(7);
        gb3.m.a(94, c16344xea85a40c.G1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.g1.f227406n++;
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
