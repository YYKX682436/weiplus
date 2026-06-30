package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes9.dex */
public final class x2 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.fav.ui.x2 f101594a = new com.tencent.mm.plugin.fav.ui.x2();

    public final void a(android.content.Context context, r45.kv2 finderItem) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(finderItem, "finderItem");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("report_scene", 4);
        intent.putExtra("from_user", c01.z1.r());
        intent.putExtra("feed_object_id", pm0.v.Z(finderItem.getString(0)));
        intent.putExtra("feed_object_nonceId", finderItem.getString(8));
        ot0.q qVar = new ot0.q();
        zy2.i iVar = new zy2.i();
        iVar.f477411b = finderItem;
        qVar.f(iVar);
        qVar.f348666i = 51;
        qVar.f348654f = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.giz);
        qVar.f348674k = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492409gj0);
        intent.putExtra("KEY_AUTHORIZATION_CONTENT", ot0.q.u(qVar, null, null));
        intent.putExtra("key_finder_teen_mode_check", true);
        intent.putExtra("key_finder_teen_mode_scene", 3);
        intent.putExtra("key_finder_teen_mode_user_name", finderItem.getString(2));
        intent.putExtra("key_finder_teen_mode_user_id", finderItem.getString(1));
        intent.putExtra("business_type", 0);
        intent.putExtra("finder_user_name", finderItem.getString(1));
        intent.putExtra("KEY_FROM_SOURCE", "GlobalFav");
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(43, 2, 4, intent);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        zy2.ta.b(ya2.e1.f460472a, context, intent, false, 4, null);
    }

    public final void b(java.lang.String toUser, o72.r2 r2Var, boolean z17) {
        r45.ev2 ev2Var;
        kotlin.jvm.internal.o.g(toUser, "toUser");
        if (r2Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Fav.FavFinderLogic", "item info is null, send fav url fail, return");
            return;
        }
        r45.bq0 bq0Var = r2Var.field_favProto;
        if (bq0Var == null || (ev2Var = bq0Var.Q) == null) {
            return;
        }
        ot0.q qVar = new ot0.q();
        zy2.g gVar = new zy2.g();
        gVar.f477383b = ev2Var;
        qVar.f(gVar);
        qVar.f348666i = 120;
        qVar.f348654f = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.giz);
        qVar.f348674k = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492409gj0);
        ((ez.w0) ot0.j1.a()).getClass();
        android.util.Pair I = com.tencent.mm.pluginsdk.model.app.k0.I(qVar, "", "", toUser, "", null);
        if (!((I.first == null || I.second == null) ? false : true)) {
            I = null;
        }
        if (I != null) {
            java.lang.Object second = I.second;
            kotlin.jvm.internal.o.f(second, "second");
            long longValue = ((java.lang.Number) second).longValue();
            com.tencent.mm.autogen.events.UpdateForwardMsgIdEvent updateForwardMsgIdEvent = new com.tencent.mm.autogen.events.UpdateForwardMsgIdEvent();
            am.xz xzVar = updateForwardMsgIdEvent.f54918g;
            xzVar.f8409a = longValue;
            xzVar.f8410b = 0;
            xzVar.f8411c = toUser;
            updateForwardMsgIdEvent.e();
        }
    }

    public final void c(java.lang.String toUser, o72.r2 r2Var, boolean z17) {
        r45.kv2 kv2Var;
        kotlin.jvm.internal.o.g(toUser, "toUser");
        if (r2Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Fav.FavFinderLogic", "item info is null, send fav url fail, return");
            return;
        }
        r45.bq0 bq0Var = r2Var.field_favProto;
        if (bq0Var == null || (kv2Var = bq0Var.M) == null) {
            return;
        }
        ot0.q qVar = new ot0.q();
        zy2.i iVar = new zy2.i();
        iVar.f477411b.set(0, kv2Var.getString(0));
        iVar.f477411b.set(8, kv2Var.getString(8));
        iVar.f477411b.set(5, java.lang.Integer.valueOf(kv2Var.getInteger(5)));
        r45.kv2 kv2Var2 = iVar.f477411b;
        java.lang.String string = kv2Var.getString(3);
        if (string == null) {
            string = "";
        }
        kv2Var2.set(3, string);
        iVar.f477411b.set(2, kv2Var.getString(2));
        iVar.f477411b.set(4, kv2Var.getString(4));
        iVar.f477411b.set(6, java.lang.Integer.valueOf(kv2Var.getInteger(6)));
        java.util.LinkedList list = iVar.f477411b.getList(7);
        java.util.LinkedList list2 = kv2Var.getList(7);
        kotlin.jvm.internal.o.f(list2, "getMediaList(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list2, 10));
        java.util.Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            r45.iv2 iv2Var = (r45.iv2) it.next();
            r45.iv2 iv2Var2 = new r45.iv2();
            iv2Var2.set(0, java.lang.Integer.valueOf(iv2Var.getInteger(0)));
            iv2Var2.set(1, iv2Var.getString(1));
            iv2Var2.set(2, iv2Var.getString(2));
            iv2Var2.set(3, java.lang.Float.valueOf(iv2Var.getFloat(3)));
            iv2Var2.set(4, java.lang.Float.valueOf(iv2Var.getFloat(4)));
            arrayList.add(iv2Var2);
        }
        list.addAll(arrayList);
        iVar.f477411b.set(15, kv2Var.getString(15));
        iVar.f477411b.set(16, kv2Var.getString(16));
        iVar.f477411b.set(12, kv2Var.getString(12));
        iVar.f477411b.set(17, kv2Var.getString(17));
        iVar.f477411b.set(23, kv2Var.getString(23));
        iVar.f477411b.set(25, java.lang.Integer.valueOf(kv2Var.getInteger(25)));
        iVar.f477411b.set(31, java.lang.Integer.valueOf(kv2Var.getInteger(31)));
        r45.gv2 gv2Var = new r45.gv2();
        gv2Var.set(0, java.lang.Boolean.valueOf(z17));
        gv2Var.set(3, 5);
        iVar.f477411b.set(30, gv2Var);
        qVar.f(iVar);
        if (iVar.f477411b.getInteger(31) == 2) {
            qVar.f348666i = 129;
        } else if ((iVar.f477411b.getInteger(25) & 4) > 0) {
            iVar.f477411b.set(1, kv2Var.getString(1));
            qVar.f348666i = 106;
        } else {
            qVar.f348666i = 51;
        }
        qVar.f348654f = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.giz);
        qVar.f348674k = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492409gj0);
        com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavFinderLogic", "share finderObject %s to %s", kv2Var.getString(0), toUser);
        ((ez.w0) ot0.j1.a()).getClass();
        android.util.Pair I = com.tencent.mm.pluginsdk.model.app.k0.I(qVar, "", "", toUser, "", null);
        if (!((I.first == null || I.second == null) ? false : true)) {
            I = null;
        }
        if (I != null) {
            java.lang.Object second = I.second;
            kotlin.jvm.internal.o.f(second, "second");
            long longValue = ((java.lang.Number) second).longValue();
            com.tencent.mm.autogen.events.UpdateForwardMsgIdEvent updateForwardMsgIdEvent = new com.tencent.mm.autogen.events.UpdateForwardMsgIdEvent();
            am.xz xzVar = updateForwardMsgIdEvent.f54918g;
            xzVar.f8409a = longValue;
            xzVar.f8410b = 0;
            xzVar.f8411c = toUser;
            updateForwardMsgIdEvent.e();
        }
    }
}
