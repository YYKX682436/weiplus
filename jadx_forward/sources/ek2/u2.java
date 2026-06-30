package ek2;

/* loaded from: classes.dex */
public final class u2 extends ek2.g0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(java.lang.String str, java.util.ArrayList selectChatRoomList, java.util.ArrayList selectUserList) {
        super(null, 1, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectChatRoomList, "selectChatRoomList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectUserList, "selectUserList");
        r45.ee2 ee2Var = new r45.ee2();
        ee2Var.set(1, db2.t4.f309704a.b(8586, this.f97668n));
        ee2Var.set(2, str);
        ee2Var.m75941xfb821914(3).addAll(selectChatRoomList);
        ee2Var.m75941xfb821914(4).addAll(selectUserList);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = ee2Var;
        r45.fe2 fe2Var = new r45.fe2();
        fe2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) fe2Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = fe2Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderlivevisibilityorchargesettings";
        lVar.f152200d = 8586;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.fe2 resp = (r45.fe2) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderLiveVisibilityOrChargeSettingsRequest", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
    }
}
