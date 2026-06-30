package ju1;

/* loaded from: classes9.dex */
public final class b1 implements vl1.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v4.ActivityC13077xb3b83e76 f383231a;

    public b1(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v4.ActivityC13077xb3b83e76 activityC13077xb3b83e76) {
        this.f383231a = activityC13077xb3b83e76;
    }

    @Override // vl1.n
    public final void a(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, android.view.View view, int i17, long j17) {
        r45.tt ttVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v4.ActivityC13077xb3b83e76 activityC13077xb3b83e76 = this.f383231a;
        ju1.j jVar = activityC13077xb3b83e76.f176959o;
        if (jVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mHistoryCardListAdapter");
            throw null;
        }
        ju1.a x17 = jVar.x(i17);
        if (x17 == null || (ttVar = x17.f383223c) == null) {
            return;
        }
        int i18 = ttVar.f468313v;
        int i19 = 2;
        if (i18 == 1) {
            lu1.d.j((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activityC13077xb3b83e76.mo55332x76847179(), ttVar.f468314w, 0);
        } else if (i18 != 2) {
            android.content.Intent intent = new android.content.Intent(activityC13077xb3b83e76.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13047x63b575f5.class);
            intent.putExtra("key_card_id", ttVar.f468298d);
            intent.addFlags(131072);
            intent.putExtra("key_from_scene", 3);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC13077xb3b83e76.mo55332x76847179();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(mo55332x76847179, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/v4/HistoryCardListUI", "gotoCardDetailUI", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            mo55332x76847179.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(mo55332x76847179, "com/tencent/mm/plugin/card/ui/v4/HistoryCardListUI", "gotoCardDetailUI", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            r45.iu iuVar = ttVar.f468315x;
            if (iuVar != null) {
                lu1.d.f(iuVar.f458861d, iuVar.f458862e, iuVar.f458863f);
            }
        }
        int i27 = activityC13077xb3b83e76.f176960p;
        if (i27 != 2 && i27 == 3) {
            i19 = 1;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HistoryCardListUI", "go to card detail ui, cardIndex: " + i17 + ", cardID: " + ttVar.f468298d + ", pageScene: " + i19 + ", cardType: " + ttVar.f468313v);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(21329, java.lang.Integer.valueOf(i19), 1, ttVar.f468298d, java.lang.Integer.valueOf(i17));
    }
}
