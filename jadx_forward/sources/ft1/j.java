package ft1;

@j95.b
/* loaded from: classes11.dex */
public final class j extends i95.w implements xg3.u {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f348027d = jz5.h.b(ft1.i.f348026d);

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f348028e = jz5.h.b(ft1.h.f348025d);

    public static final void Ai(ft1.j jVar, byte[] bArr) {
        jVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("trySaveRspSyncKeyBuf, buf isNull=");
        sb6.append(bArr == null);
        sb6.append(", buf size=");
        sb6.append(bArr != null ? bArr.length : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddFriendVerifyRecordService", sb6.toString());
        if (bArr != null) {
            if (!(bArr.length == 0)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddFriendVerifyRecordService", "trySaveRspSyncKeyBuf, saving syncKey, buf hex=" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(bArr));
                jz5.g gVar = kt1.u.f393491a;
                java.lang.String valueOf = java.lang.String.valueOf(29);
                java.lang.Object mo141623x754a37bb = ((jz5.n) kt1.u.f393491a).mo141623x754a37bb();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
                ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) mo141623x754a37bb).H(valueOf, bArr);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddFriendVerifyRecordService", "trySaveRspSyncKeyBuf, save success");
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AddFriendVerifyRecordService", "trySaveRspSyncKeyBuf, buf is null or empty, skip saving");
    }

    public static final void wi(ft1.j jVar, r45.yx6 yx6Var) {
        jVar.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.LinkedList<r45.mx6> linkedList = yx6Var.f473016f;
        if (linkedList != null) {
            for (r45.mx6 mx6Var : linkedList) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("createVerifyRecordMsgInfo: ");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mx6Var);
                sb6.append(ft1.k.a(mx6Var));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddFriendVerifyRecordService", sb6.toString());
                com.p314xaae8f345.mm.p2621x8fb0427b.ib ibVar = new com.p314xaae8f345.mm.p2621x8fb0427b.ib();
                ibVar.f68088xd09be28e = mx6Var.f462434e;
                ibVar.f68086x613e327a = mx6Var.f462433d;
                ibVar.f68085xac3be4e = mx6Var.f462436g * 1 * 1000;
                ibVar.f68089x10a0fed7 = yx6Var.f473015e;
                ibVar.f68091x8987ca93 = yx6Var.f473017g;
                ibVar.f68087x5285fa99 = yx6Var.f473014d;
                java.lang.String content = mx6Var.f462435f;
                ibVar.f68084xad49e234 = content;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(content, "content");
                java.lang.String username = yx6Var.f473014d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(username, "username");
                ibVar.f68090x114ef53e = com.p314xaae8f345.mm.p2621x8fb0427b.hb.a(content, username, "MicroMsg.AddFriendVerifyRecordService");
                arrayList.add(ibVar);
            }
        }
        r45.mx6 mx6Var2 = yx6Var.f473018h;
        if (mx6Var2 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddFriendVerifyRecordService", "createVerifyRecordMsgInfo lastRecvMsg: " + ft1.k.a(mx6Var2));
            com.p314xaae8f345.mm.p2621x8fb0427b.ib ibVar2 = new com.p314xaae8f345.mm.p2621x8fb0427b.ib();
            ibVar2.f68088xd09be28e = mx6Var2.f462434e;
            ibVar2.f68086x613e327a = mx6Var2.f462433d;
            ibVar2.f68085xac3be4e = mx6Var2.f462436g * 1 * 1000;
            ibVar2.f68089x10a0fed7 = yx6Var.f473015e;
            ibVar2.f68091x8987ca93 = yx6Var.f473017g;
            ibVar2.f68087x5285fa99 = yx6Var.f473014d;
            java.lang.String content2 = mx6Var2.f462435f;
            ibVar2.f68084xad49e234 = content2;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(content2, "content");
            java.lang.String username2 = yx6Var.f473014d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(username2, "username");
            ibVar2.f68090x114ef53e = com.p314xaae8f345.mm.p2621x8fb0427b.hb.a(content2, username2, "MicroMsg.AddFriendVerifyRecordService");
            arrayList.add(ibVar2);
        }
        java.lang.String username3 = yx6Var.f473014d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(username3, "username");
        jVar.Ri(username3, yx6Var.f473015e, arrayList, yx6Var.f473017g);
    }

    public final void Bi(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddFriendVerifyRecordService", "clearFMsgAndFConvByEncryptTalker, encryptTalker: " + str);
        try {
            if (!gm0.j1.b().m()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AddFriendVerifyRecordService", "clearFMsgAndFConvByEncryptTalker: account not initialized, skip");
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2 h2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddFriendVerifyRecordService", "clearFMsgAndFConvByEncryptTalker, delete fconversation, ret = " + ((com.p314xaae8f345.mm.p2621x8fb0427b.o7) h2Var.Ri()).z0(str));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddFriendVerifyRecordService", "clearFMsgAndFConvByEncryptTalker, delete fmsginfo, ret = " + ((com.p314xaae8f345.mm.p2621x8fb0427b.q7) h2Var.Ui()).z0(str));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AddFriendVerifyRecordService", e17, "clearFMsgAndFConvByEncryptTalker error: " + str, new java.lang.Object[0]);
        }
    }

    public java.lang.Object Di(java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        try {
            ((com.p314xaae8f345.mm.p2621x8fb0427b.jb) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).oj()).y0(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddFriendVerifyRecordService", "deleteLocalVerifyRecord new data success: ".concat(str));
            Bi(str);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AddFriendVerifyRecordService", e17, "deleteLocalVerifyRecord error: encryptUsername=" + str, new java.lang.Object[0]);
        }
        return jz5.f0.f384359a;
    }

    public void Ni(long j17, xg3.t tVar) {
        v65.i.b((com.p314xaae8f345.mm.sdk.p2597xc267989b.C20977x242e434b) ((jz5.n) this.f348027d).mo141623x754a37bb(), null, new ft1.g(j17, this, tVar, null), 1, null);
    }

    public void Ri(java.lang.String encryptUsername, int i17, java.util.List msgInfoList, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(encryptUsername, "encryptUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfoList, "msgInfoList");
        xg3.x0 oj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).oj();
        if (i17 == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddFriendVerifyRecordService", "updateLocalVerifyRecord: status is Deleted, delete records for: ".concat(encryptUsername));
            ((com.p314xaae8f345.mm.p2621x8fb0427b.jb) oj6).J0(encryptUsername, kz5.p0.f395529d);
        } else {
            ((com.p314xaae8f345.mm.p2621x8fb0427b.jb) oj6).J0(encryptUsername, msgInfoList);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddFriendVerifyRecordService", "updateLocalVerifyRecord: updated " + msgInfoList.size() + " records for " + encryptUsername);
        }
    }
}
