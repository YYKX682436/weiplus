package gk5;

/* loaded from: classes9.dex */
public final class h {
    public h(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final boolean a(java.lang.String user, java.lang.String msgContent, java.lang.Boolean bool, long j17, java.lang.String str, java.lang.String str2) {
        r45.gv2 gv2Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(user, "user");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgContent, "msgContent");
        int i17 = (j17 > 0L ? 1 : (j17 == 0L ? 0 : -1));
        if (msgContent.length() > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForwardFinderFeedUIC", "transfer finder feed to %s", user);
            ot0.q v17 = ot0.q.v(msgContent);
            if (v17 != null) {
                zy2.i iVar = (zy2.i) v17.y(zy2.i.class);
                if (iVar != null) {
                    if (((r45.gv2) iVar.f558944b.m75936x14adae67(30)) == null) {
                        iVar.f558944b.set(30, new r45.gv2());
                    }
                    if (bool != null && (gv2Var = (r45.gv2) iVar.f558944b.m75936x14adae67(30)) != null) {
                        gv2Var.set(0, java.lang.Boolean.valueOf(bool.booleanValue()));
                    }
                    java.util.LinkedList linkedList = new java.util.LinkedList();
                    linkedList.add(new android.util.Pair(iVar.f558944b.m75945x2fec8307(0), iVar.f558944b.m75945x2fec8307(8)));
                    ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).nj(linkedList, false);
                }
                android.util.Pair L = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.L(v17, "", "", user, "", null, null, "", "", new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(j17, str), j17 > 0, str2);
                if (!((L.first == null || L.second == null) ? false : true)) {
                    L = null;
                }
                if (L != null) {
                    com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.O6(user, (java.lang.Long) L.second);
                }
                return true;
            }
        }
        return false;
    }
}
