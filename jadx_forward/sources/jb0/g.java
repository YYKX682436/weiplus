package jb0;

@j95.b
/* loaded from: classes8.dex */
public final class g extends i95.w implements jt.x {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f380217d = "MicroMsg.OpenWayFeatureService";

    public boolean Ai(int i17) {
        switch (i17) {
            case 1:
            case 2:
            case 5:
                return true;
            case 3:
                return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2558xb4b58865.C20603x950f8a81()) == 1;
            case 4:
                return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2558xb4b58865.C20605x1871164f()) == 1;
            case 6:
                return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2558xb4b58865.C20604x1ae12a37()) == 1;
            default:
                return false;
        }
    }

    public boolean Bi(int i17) {
        lb0.d dVar = lb0.d.f399202a;
        return dVar.g(i17, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a.f270309e) || dVar.g(i17, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a.f270308d);
    }

    public void Di(android.content.Context context, java.util.List msgItemList, int i17, java.lang.String str, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgItemList, "msgItemList");
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        u15.a aVar = new u15.a();
        aVar.q(true);
        aVar.r(java.lang.Integer.valueOf(msgItemList.size()));
        aVar.s(i17);
        arrayList.add(aVar.m126747x696739c());
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(msgItemList, 10));
        java.util.Iterator it = msgItemList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((u15.a) it.next()).m126747x696739c());
        }
        arrayList.addAll(arrayList2);
        android.content.Intent intent = new android.content.Intent();
        pf5.j0.a(intent, a45.i.class);
        intent.putStringArrayListExtra("IntentKey_MsgData", arrayList);
        intent.putExtra("IntentKey_Title", str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f380217d, "previewMsgList ".concat(kz5.n0.g0(arrayList, ", ", null, null, 0, null, null, 62, null)));
        bh5.c cVar = new bh5.c();
        cVar.f102455a.f102457a = context;
        cVar.d(intent);
        cVar.a(com.p314xaae8f345.mm.ui.p2694xe7814c81.ActivityC22353x5623e3da.class.getName());
        if (z17) {
            cVar.f(false);
        }
        cVar.g();
    }

    public void Ni(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g2 g2Var) {
        if (g2Var != null) {
            java.util.HashMap b17 = kb0.j.f387742a.b(g2Var);
            b17.put("style_type", 0);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("view_share_sheet", "view_exp", b17, 35480);
        }
    }

    public void Ri(android.content.Context context, int i17, yz5.a block) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        lb0.q.f399221a.d(context, i17, block);
    }

    public com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.m2 wi(android.app.Activity context, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g2 g2Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (g2Var == null) {
            return null;
        }
        return new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.v(context, g2Var);
    }
}
