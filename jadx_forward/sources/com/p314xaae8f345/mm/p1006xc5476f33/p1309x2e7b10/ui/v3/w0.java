package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3;

/* loaded from: classes9.dex */
public final class w0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f176927d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13074xfcf8fabf f176928e;

    public w0(in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13074xfcf8fabf activityC13074xfcf8fabf) {
        this.f176927d = s0Var;
        this.f176928e = activityC13074xfcf8fabf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/v3/VipCardListUI$VipCardConverter$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.t0 t0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.t0) this.f176927d.f374658i;
        r45.tt a17 = t0Var.a();
        int i17 = a17.f468313v;
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13074xfcf8fabf activityC13074xfcf8fabf = this.f176928e;
        if (i17 == 1) {
            lu1.d.j((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activityC13074xfcf8fabf.mo55332x76847179(), a17.f468314w, 0);
        } else if (i17 == 2) {
            r45.iu iuVar = a17.f468315x;
            lu1.d.f(iuVar.f458861d, iuVar.f458862e, iuVar.f458863f);
        } else if (i17 == 3) {
            java.lang.String user_card_id = t0Var.a().f468298d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(user_card_id, "user_card_id");
            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13074xfcf8fabf.X6(activityC13074xfcf8fabf, user_card_id);
        } else {
            java.lang.String user_card_id2 = t0Var.a().f468298d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(user_card_id2, "user_card_id");
            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13074xfcf8fabf.X6(activityC13074xfcf8fabf, user_card_id2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[6];
        objArr[0] = 1;
        objArr[1] = java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / 1000);
        objArr[2] = t0Var.a().f468298d;
        java.lang.String user_card_id3 = t0Var.a().f468298d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(user_card_id3, "user_card_id");
        java.util.Iterator it = activityC13074xfcf8fabf.f176812v.iterator();
        int i18 = 0;
        while (true) {
            if (!it.hasNext()) {
                i18 = -1;
                break;
            }
            java.lang.Object next = it.next();
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.t0) next).a().f468298d, user_card_id3)) {
                break;
            } else {
                i18 = i19;
            }
        }
        objArr[3] = java.lang.Integer.valueOf(i18);
        objArr[4] = 0;
        objArr[5] = java.lang.Integer.valueOf(activityC13074xfcf8fabf.B);
        g0Var.d(19748, objArr);
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/v3/VipCardListUI$VipCardConverter$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
