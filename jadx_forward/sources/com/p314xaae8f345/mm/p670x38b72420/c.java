package com.p314xaae8f345.mm.p670x38b72420;

/* loaded from: classes.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p670x38b72420.d f146387d;

    public c(com.p314xaae8f345.mm.p670x38b72420.d dVar) {
        this.f146387d = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Set set = c01.e2.f118650a;
        java.util.LinkedList<com.p314xaae8f345.mm.p2621x8fb0427b.z3> linkedList = new java.util.LinkedList();
        android.database.Cursor B = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().f276604d.B("select  username, alias, conRemark, domainList, nickname, pyInitial, quanPin, showHead, type, uiType, weiboFlag, weiboNickname, conRemarkPYFull, conRemarkPYShort, lvbuff, verifyFlag, encryptUsername, chatroomFlag, deleteFlag, contactLabelIds, descWordingId, openImAppid, sourceExtInfo, rowid, contactExtra from rcontact ", null);
        if (B.getCount() == 0) {
            B.close();
        } else {
            B.moveToFirst();
            do {
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
                z3Var.mo9015xbf5d97fd(B);
                linkedList.add(z3Var);
            } while (B.moveToNext());
            B.close();
            linkedList.size();
        }
        for (com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var2 : linkedList) {
            z3Var2.n3(z3Var2.d2());
            gm0.j1.i();
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().p0(z3Var2.d1(), z3Var2);
        }
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CONTACT_UPDATE_USERNAME_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        this.f146387d.f146390e = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactUpgradeHelper", "refreshUserName, updateUserNameFlag done!");
    }
}
