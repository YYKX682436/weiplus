package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5;

/* loaded from: classes9.dex */
public class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16344xea85a40c f227350d;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16344xea85a40c c16344xea85a40c) {
        this.f227350d = c16344xea85a40c;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16344xea85a40c c16344xea85a40c = this.f227350d;
        if (c16344xea85a40c.N1) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Contact_User", c16344xea85a40c.E1.f463039o);
            intent.putExtra("Contact_Scene", 240);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16344xea85a40c.E1.f463048x)) {
                java.lang.String uri = android.net.Uri.parse(c16344xea85a40c.E1.f463048x).buildUpon().appendQueryParameter("fromscene", "2").appendQueryParameter("type", "1").build().toString();
                intent.putExtra("biz_profile_enter_from_luck_money_spring_event_url", uri);
                gb3.m.f351561i = uri;
            }
            intent.putExtra("force_get_contact", true);
            j45.l.n(c16344xea85a40c.getContext(), com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, 2);
            gb3.n.a(7);
            gb3.m.a(88, c16344xea85a40c.G1);
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.g1.f227406n++;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
