package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes9.dex */
public final class x2 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.x2 f183127a = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.x2();

    public final void a(android.content.Context context, r45.kv2 finderItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderItem, "finderItem");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("report_scene", 4);
        intent.putExtra("from_user", c01.z1.r());
        intent.putExtra("feed_object_id", pm0.v.Z(finderItem.m75945x2fec8307(0)));
        intent.putExtra("feed_object_nonceId", finderItem.m75945x2fec8307(8));
        ot0.q qVar = new ot0.q();
        zy2.i iVar = new zy2.i();
        iVar.f558944b = finderItem;
        qVar.f(iVar);
        qVar.f430199i = 51;
        qVar.f430187f = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.giz);
        qVar.f430207k = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573942gj0);
        intent.putExtra("KEY_AUTHORIZATION_CONTENT", ot0.q.u(qVar, null, null));
        intent.putExtra("key_finder_teen_mode_check", true);
        intent.putExtra("key_finder_teen_mode_scene", 3);
        intent.putExtra("key_finder_teen_mode_user_name", finderItem.m75945x2fec8307(2));
        intent.putExtra("key_finder_teen_mode_user_id", finderItem.m75945x2fec8307(1));
        intent.putExtra("business_type", 0);
        intent.putExtra("finder_user_name", finderItem.m75945x2fec8307(1));
        intent.putExtra("KEY_FROM_SOURCE", "GlobalFav");
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(43, 2, 4, intent);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        zy2.ta.b(ya2.e1.f542005a, context, intent, false, 4, null);
    }

    public final void b(java.lang.String toUser, o72.r2 r2Var, boolean z17) {
        r45.ev2 ev2Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUser, "toUser");
        if (r2Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Fav.FavFinderLogic", "item info is null, send fav url fail, return");
            return;
        }
        r45.bq0 bq0Var = r2Var.f67640x5ab01132;
        if (bq0Var == null || (ev2Var = bq0Var.Q) == null) {
            return;
        }
        ot0.q qVar = new ot0.q();
        zy2.g gVar = new zy2.g();
        gVar.f558916b = ev2Var;
        qVar.f(gVar);
        qVar.f430199i = 120;
        qVar.f430187f = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.giz);
        qVar.f430207k = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573942gj0);
        ((ez.w0) ot0.j1.a()).getClass();
        android.util.Pair I = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.I(qVar, "", "", toUser, "", null);
        if (!((I.first == null || I.second == null) ? false : true)) {
            I = null;
        }
        if (I != null) {
            java.lang.Object second = I.second;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(second, "second");
            long longValue = ((java.lang.Number) second).longValue();
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6194x6522023a c6194x6522023a = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6194x6522023a();
            am.xz xzVar = c6194x6522023a.f136451g;
            xzVar.f89942a = longValue;
            xzVar.f89943b = 0;
            xzVar.f89944c = toUser;
            c6194x6522023a.e();
        }
    }

    public final void c(java.lang.String toUser, o72.r2 r2Var, boolean z17) {
        r45.kv2 kv2Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUser, "toUser");
        if (r2Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Fav.FavFinderLogic", "item info is null, send fav url fail, return");
            return;
        }
        r45.bq0 bq0Var = r2Var.f67640x5ab01132;
        if (bq0Var == null || (kv2Var = bq0Var.M) == null) {
            return;
        }
        ot0.q qVar = new ot0.q();
        zy2.i iVar = new zy2.i();
        iVar.f558944b.set(0, kv2Var.m75945x2fec8307(0));
        iVar.f558944b.set(8, kv2Var.m75945x2fec8307(8));
        iVar.f558944b.set(5, java.lang.Integer.valueOf(kv2Var.m75939xb282bd08(5)));
        r45.kv2 kv2Var2 = iVar.f558944b;
        java.lang.String m75945x2fec8307 = kv2Var.m75945x2fec8307(3);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        kv2Var2.set(3, m75945x2fec8307);
        iVar.f558944b.set(2, kv2Var.m75945x2fec8307(2));
        iVar.f558944b.set(4, kv2Var.m75945x2fec8307(4));
        iVar.f558944b.set(6, java.lang.Integer.valueOf(kv2Var.m75939xb282bd08(6)));
        java.util.LinkedList m75941xfb821914 = iVar.f558944b.m75941xfb821914(7);
        java.util.LinkedList m75941xfb8219142 = kv2Var.m75941xfb821914(7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getMediaList(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb8219142, 10));
        java.util.Iterator it = m75941xfb8219142.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            r45.iv2 iv2Var = (r45.iv2) it.next();
            r45.iv2 iv2Var2 = new r45.iv2();
            iv2Var2.set(0, java.lang.Integer.valueOf(iv2Var.m75939xb282bd08(0)));
            iv2Var2.set(1, iv2Var.m75945x2fec8307(1));
            iv2Var2.set(2, iv2Var.m75945x2fec8307(2));
            iv2Var2.set(3, java.lang.Float.valueOf(iv2Var.m75938x746dc8a6(3)));
            iv2Var2.set(4, java.lang.Float.valueOf(iv2Var.m75938x746dc8a6(4)));
            arrayList.add(iv2Var2);
        }
        m75941xfb821914.addAll(arrayList);
        iVar.f558944b.set(15, kv2Var.m75945x2fec8307(15));
        iVar.f558944b.set(16, kv2Var.m75945x2fec8307(16));
        iVar.f558944b.set(12, kv2Var.m75945x2fec8307(12));
        iVar.f558944b.set(17, kv2Var.m75945x2fec8307(17));
        iVar.f558944b.set(23, kv2Var.m75945x2fec8307(23));
        iVar.f558944b.set(25, java.lang.Integer.valueOf(kv2Var.m75939xb282bd08(25)));
        iVar.f558944b.set(31, java.lang.Integer.valueOf(kv2Var.m75939xb282bd08(31)));
        r45.gv2 gv2Var = new r45.gv2();
        gv2Var.set(0, java.lang.Boolean.valueOf(z17));
        gv2Var.set(3, 5);
        iVar.f558944b.set(30, gv2Var);
        qVar.f(iVar);
        if (iVar.f558944b.m75939xb282bd08(31) == 2) {
            qVar.f430199i = 129;
        } else if ((iVar.f558944b.m75939xb282bd08(25) & 4) > 0) {
            iVar.f558944b.set(1, kv2Var.m75945x2fec8307(1));
            qVar.f430199i = 106;
        } else {
            qVar.f430199i = 51;
        }
        qVar.f430187f = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.giz);
        qVar.f430207k = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573942gj0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavFinderLogic", "share finderObject %s to %s", kv2Var.m75945x2fec8307(0), toUser);
        ((ez.w0) ot0.j1.a()).getClass();
        android.util.Pair I = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.I(qVar, "", "", toUser, "", null);
        if (!((I.first == null || I.second == null) ? false : true)) {
            I = null;
        }
        if (I != null) {
            java.lang.Object second = I.second;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(second, "second");
            long longValue = ((java.lang.Number) second).longValue();
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6194x6522023a c6194x6522023a = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6194x6522023a();
            am.xz xzVar = c6194x6522023a.f136451g;
            xzVar.f89942a = longValue;
            xzVar.f89943b = 0;
            xzVar.f89944c = toUser;
            c6194x6522023a.e();
        }
    }
}
