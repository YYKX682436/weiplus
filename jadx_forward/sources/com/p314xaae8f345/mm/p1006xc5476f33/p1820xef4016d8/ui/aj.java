package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public final class aj implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f228247d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16386x6b0f268b f228248e;

    public aj(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16386x6b0f268b activityC16386x6b0f268b) {
        this.f228247d = str;
        this.f228248e = activityC16386x6b0f268b;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearStateReceiveUI$updateViewRec$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearStateReceiveUI", "click StatusLayout");
        bi4.c1 c1Var = new bi4.c1();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        pj4.j0 j0Var = new pj4.j0();
        j0Var.f436672d = "3";
        j0Var.f436674f = "https://support.weixin.qq.com/security/readtemplate?t=w_security_center_website/upgrade&scene=1#wechat_redirect";
        arrayList2.add(j0Var);
        c1Var.b(this.f228247d);
        c1Var.f("red_packet_2022@inner");
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16386x6b0f268b activityC16386x6b0f268b = this.f228248e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.api.C18987x98923a5a c18987x98923a5a = activityC16386x6b0f268b.f227999z;
        if (c18987x98923a5a == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("info");
            throw null;
        }
        bi4.d1 d1Var = c1Var.f102567a;
        pj4.b0 b0Var = d1Var.f436470d;
        b0Var.f436509h = c18987x98923a5a.f259097p;
        if (c18987x98923a5a == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("info");
            throw null;
        }
        b0Var.f436511m = c18987x98923a5a.f259098q;
        if (c18987x98923a5a == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("info");
            throw null;
        }
        b0Var.f436520v = c18987x98923a5a.f259099r;
        if (c18987x98923a5a == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("info");
            throw null;
        }
        b0Var.f436521w = c18987x98923a5a.f259100s;
        if (c18987x98923a5a == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("info");
            throw null;
        }
        c1Var.h(c18987x98923a5a.f259101t);
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.api.C18987x98923a5a c18987x98923a5a2 = activityC16386x6b0f268b.f227999z;
        if (c18987x98923a5a2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("info");
            throw null;
        }
        c1Var.g(c18987x98923a5a2.f259096o);
        d1Var.f436470d.f436507f = 2;
        c1Var.c(arrayList2);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p765xa4f4bf5f.C10691x3b04d9e9) ((xe0.g0) i95.n0.c(xe0.g0.class))).Di(activityC16386x6b0f268b.mo55332x76847179(), d1Var);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("msg", "send state and close");
        activityC16386x6b0f268b.setResult(-1, intent);
        activityC16386x6b0f268b.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearStateReceiveUI$updateViewRec$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
