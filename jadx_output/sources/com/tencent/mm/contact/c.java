package com.tencent.mm.contact;

/* loaded from: classes.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.contact.d f64854d;

    public c(com.tencent.mm.contact.d dVar) {
        this.f64854d = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Set set = c01.e2.f37117a;
        java.util.LinkedList<com.tencent.mm.storage.z3> linkedList = new java.util.LinkedList();
        android.database.Cursor B = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().f195071d.B("select  username, alias, conRemark, domainList, nickname, pyInitial, quanPin, showHead, type, uiType, weiboFlag, weiboNickname, conRemarkPYFull, conRemarkPYShort, lvbuff, verifyFlag, encryptUsername, chatroomFlag, deleteFlag, contactLabelIds, descWordingId, openImAppid, sourceExtInfo, rowid, contactExtra from rcontact ", null);
        if (B.getCount() == 0) {
            B.close();
        } else {
            B.moveToFirst();
            do {
                com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3();
                z3Var.convertFrom(B);
                linkedList.add(z3Var);
            } while (B.moveToNext());
            B.close();
            linkedList.size();
        }
        for (com.tencent.mm.storage.z3 z3Var2 : linkedList) {
            z3Var2.n3(z3Var2.d2());
            gm0.j1.i();
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().p0(z3Var2.d1(), z3Var2);
        }
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_CONTACT_UPDATE_USERNAME_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        this.f64854d.f64857e = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactUpgradeHelper", "refreshUserName, updateUserNameFlag done!");
    }
}
