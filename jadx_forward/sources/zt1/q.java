package zt1;

/* loaded from: classes8.dex */
public class q extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public q() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5631x90d66b9 c5631x90d66b9 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5631x90d66b9) abstractC20979x809547d1;
        int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CARD_ENTRANCE_SWITCH_INT_SYNC, 1)).intValue();
        int intValue2 = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CARD_ENTRANCE_TRADE_AREA_INT_SYNC, 1)).intValue();
        boolean booleanValue = ((java.lang.Boolean) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CARD_ENTRANCE_SWITCH_V2_BOOLEAN_SYNC, java.lang.Boolean.TRUE)).booleanValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GotoCardHomePageEventIListener", "goto card version: %s, trade area: %s, newVersion2: %s", java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(intValue2), java.lang.Boolean.valueOf(booleanValue));
        if (booleanValue) {
            if (c5631x90d66b9.f135958g.f87687a != null) {
                am.ah ahVar = c5631x90d66b9.f135958g;
                android.content.Intent intent = new android.content.Intent(ahVar.f87687a, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13069x47bc6a4f.class);
                android.content.Context context = ahVar.f87687a;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/card/model/listener/GotoCardHomePageEventIListener", "callback", "(Lcom/tencent/mm/autogen/events/GotoCardHomePageEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/mm/plugin/card/model/listener/GotoCardHomePageEventIListener", "callback", "(Lcom/tencent/mm/autogen/events/GotoCardHomePageEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                wt1.f0.a();
                if (ahVar.f87689c == 1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16322, 3);
                }
            }
        } else if (intValue2 == 2) {
            java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CARD_ENTRANCE_TRADE_AREA_INFO_STRING_SYNC, "");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                try {
                    r45.iu iuVar = (r45.iu) new r45.iu().mo11468x92b714fd(str.getBytes(r26.c.f450400c));
                    lu1.d.f(iuVar.f458861d, iuVar.f458862e, iuVar.f458863f);
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("GotoCardHomePageEventIListener", e17, "", new java.lang.Object[0]);
                }
            }
        } else if (intValue != 1) {
            if (c5631x90d66b9.f135958g.f87687a != null) {
                am.ah ahVar2 = c5631x90d66b9.f135958g;
                android.content.Intent intent2 = new android.content.Intent(ahVar2.f87687a, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13053xb9371272.class);
                intent2.putExtra("key_from_scene", 22);
                intent2.putExtra("key_home_page_from_scene", ahVar2.f87688b);
                android.content.Context context2 = ahVar2.f87687a;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent2);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(context2, arrayList2.toArray(), "com/tencent/mm/plugin/card/model/listener/GotoCardHomePageEventIListener", "callback", "(Lcom/tencent/mm/autogen/events/GotoCardHomePageEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context2.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(context2, "com/tencent/mm/plugin/card/model/listener/GotoCardHomePageEventIListener", "callback", "(Lcom/tencent/mm/autogen/events/GotoCardHomePageEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                wt1.f0.a();
                if (ahVar2.f87689c == 1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16322, 2);
                }
            }
            c5631x90d66b9.f135959h.getClass();
        } else if (c5631x90d66b9.f135958g.f87687a != null) {
            am.ah ahVar3 = c5631x90d66b9.f135958g;
            android.content.Intent intent3 = new android.content.Intent(ahVar3.f87687a, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13064xaf775f76.class);
            android.content.Context context3 = ahVar3.f87687a;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(intent3);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(context3, arrayList3.toArray(), "com/tencent/mm/plugin/card/model/listener/GotoCardHomePageEventIListener", "callback", "(Lcom/tencent/mm/autogen/events/GotoCardHomePageEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context3.startActivity((android.content.Intent) arrayList3.get(0));
            yj0.a.f(context3, "com/tencent/mm/plugin/card/model/listener/GotoCardHomePageEventIListener", "callback", "(Lcom/tencent/mm/autogen/events/GotoCardHomePageEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            wt1.f0.a();
            if (ahVar3.f87689c == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16322, 3);
            }
        }
        au1.n.f95596m.a(true);
        return true;
    }
}
