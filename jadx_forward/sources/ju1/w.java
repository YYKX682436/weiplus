package ju1;

/* loaded from: classes9.dex */
public final class w implements vl1.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v4.ActivityC13076xc17cada1 f383332a;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v4.ActivityC13076xc17cada1 activityC13076xc17cada1) {
        this.f383332a = activityC13076xc17cada1;
    }

    @Override // vl1.n
    public final void a(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, android.view.View view, int i17, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v4.ActivityC13076xc17cada1 activityC13076xc17cada1 = this.f383332a;
        ju1.j jVar = activityC13076xc17cada1.f176952p;
        if (jVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mCardsCardListAdapter");
            throw null;
        }
        ju1.a x17 = jVar.x(i17);
        if (x17 != null) {
            int i18 = x17.f383221a;
            int i19 = i18 != 1 ? i18 != 2 ? -1 : i17 - 1 : i17 - 2;
            r45.tt ttVar = x17.f383223c;
            if (ttVar != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC13076xc17cada1.f176948i, "go to card detail ui, cardIndex: " + i19 + ", cardID: " + ttVar.f468298d + ", cardType: " + ttVar.f468313v);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(19748, 3, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / ((long) 1000)), ttVar.f468298d, java.lang.Integer.valueOf(i19), 0, 1);
                int i27 = ttVar.f468313v;
                if (i27 == 1) {
                    lu1.d.j((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activityC13076xc17cada1.mo55332x76847179(), ttVar.f468314w, 0);
                } else if (i27 != 2) {
                    android.content.Intent intent = new android.content.Intent(activityC13076xc17cada1.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13047x63b575f5.class);
                    intent.putExtra("key_card_id", ttVar.f468298d);
                    intent.addFlags(131072);
                    intent.putExtra("key_from_scene", 3);
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC13076xc17cada1.mo55332x76847179();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(mo55332x76847179, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/v4/CouponAndGiftCardListV4UI", "gotoCardDetailUI", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    mo55332x76847179.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(mo55332x76847179, "com/tencent/mm/plugin/card/ui/v4/CouponAndGiftCardListV4UI", "gotoCardDetailUI", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else {
                    r45.iu iuVar = ttVar.f468315x;
                    if (iuVar != null) {
                        lu1.d.f(iuVar.f458861d, iuVar.f458862e, iuVar.f458863f);
                    }
                }
                activityC13076xc17cada1.f176953q = true;
            }
        }
    }
}
