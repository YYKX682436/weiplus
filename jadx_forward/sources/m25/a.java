package m25;

/* loaded from: classes2.dex */
public abstract class a {
    public static void a(android.content.Context context, android.content.Intent intent) {
        if (!b()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyHelper", "gotoNearBy");
            if (c()) {
                j45.l.h(context, "nearby", ".ui.NearbyFriendsUI");
                return;
            }
            gm0.j1.b().c();
            if (((com.p314xaae8f345.mm.p2621x8fb0427b.u8) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Zi()).f() > 0) {
                j45.l.h(context, "nearby", ".ui.NearbyFriendShowSayHiUI");
                return;
            } else {
                j45.l.h(context, "nearby", ".ui.NearbyFriendsUI");
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyHelper", "gotoNearByUILiveFriends");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        ((wo2.k) ((ws5.g) i95.n0.c(ws5.g.class))).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        ((k40.f) ((l40.e) i95.n0.c(l40.e.class))).Zi("", "enterFinderLbsLiveFriendsUI");
        tq2.d.f502763a.a("clickEnter");
        nq2.d dVar = nq2.d.f420513a;
        dVar.k(intent);
        rq2.s sVar = rq2.s.f480412a;
        c92.g gVar = c92.g.f121271a;
        sVar.c(true, gVar.b());
        if (gVar.b()) {
            dVar.l(intent, 88889, 0, "同城直播");
        } else if (!sVar.a()) {
            dVar.l(intent, 88890, 0, "推荐");
        }
        android.content.Intent intent2 = !(context instanceof android.app.Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ActivityC14498x316bf573.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/FinderNearByActivityRouter", "enterFinderLbsLiveFriendsUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/nearby/FinderNearByActivityRouter", "enterFinderLbsLiveFriendsUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public static boolean b() {
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        return vd2.t3.f517454a.g();
    }

    public static boolean c() {
        java.lang.String d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("EnableStrangerChat");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17)) {
            d17 = "0";
        }
        return "1".equals(d17);
    }
}
