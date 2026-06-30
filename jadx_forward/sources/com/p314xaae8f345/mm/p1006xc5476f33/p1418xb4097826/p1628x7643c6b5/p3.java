package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5;

/* loaded from: classes3.dex */
public final class p3 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.p3 f207707a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.p3();

    public void a(android.content.Context context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.ui.ActivityC13658x4433fc11.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/service/FinderPoiService", "openPoiHalfScreenDrawer", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/service/FinderPoiService", "openPoiHalfScreenDrawer", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void b(android.content.Context context, r45.f96 location, zy2.o9 fromType, int i17, java.lang.String str, zy2.r9 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(location, "location");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fromType, "fromType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("poiRedirectRequest: poiClassifyId = ");
        sb6.append(location.m75945x2fec8307(5));
        sb6.append(", Longitude = ");
        boolean z17 = false;
        sb6.append(location.m75938x746dc8a6(0));
        sb6.append(", Latitude = ");
        sb6.append(location.m75938x746dc8a6(1));
        sb6.append(", fromType = ");
        sb6.append(fromType);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPoiService", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        boolean booleanValue = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.C4).mo141623x754a37bb()).r()).booleanValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPoiService", "isGoToNewPage = " + booleanValue);
        if (!booleanValue) {
            callback.a(zy2.p9.f559061d);
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_location", location.mo14344x5f01b1f6());
        intent.putExtra("key_from_type", fromType);
        intent.putExtra("key_sns_feed_id", str);
        intent.putExtra("key_entrance_type", 0);
        if (fromType == zy2.o9.f559049d) {
            intent.putExtra("key_finder_teen_mode_scene", 3);
        }
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(4, 11, 81, intent);
        com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20298x46d4560a c20298x46d4560a = new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20298x46d4560a();
        if (j62.e.g().c(c20298x46d4560a) == 1 || bm5.o1.f104252a.h(c20298x46d4560a) == 1) {
            java.lang.String m75945x2fec8307 = location.m75945x2fec8307(5);
            if (m75945x2fec8307 != null && r26.i0.y(m75945x2fec8307, "foursquare_", false)) {
                z17 = true;
            }
            if (!z17 && ((java.lang.Number) t70Var.b1().r()).intValue() != 0) {
                if (i17 == 14) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).Tk(context, intent, location, 14);
                    return;
                } else {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).Tk(context, intent, location, 7);
                    return;
                }
            }
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).Uk(context, intent);
    }

    public void c(android.view.View view, boolean z17, boolean z18, java.lang.String viewId, java.util.Map map) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewId, "viewId");
        int i17 = z17 ? 8 : 0;
        if (z18) {
            i17 |= 32;
        }
        if (z17 && view == null) {
            if (map != null) {
                map.put("view_id", viewId);
            }
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("view_clk", view, map, 27051);
        } else {
            cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar.pk(view, viewId);
            aVar.gk(view, map);
            aVar.ik(view, i17, 27051);
        }
    }
}
