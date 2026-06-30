package lt1;

/* loaded from: classes11.dex */
public final class d extends lt1.e {
    @Override // lt1.e
    public int b() {
        return 29;
    }

    @Override // lt1.e
    public int c() {
        return 12789;
    }

    @Override // lt1.e
    public java.lang.String d() {
        return "MicroMsg.AddFriendVerifyRecordSyncProcessor";
    }

    @Override // lt1.e
    public java.lang.String e() {
        return "/cgi-bin/micromsg-bin/verifyrecordsync";
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // lt1.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(r45.jo5 r5, boolean r6, yz5.l r7, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r8) {
        /*
            r4 = this;
            boolean r5 = r8 instanceof lt1.a
            if (r5 == 0) goto L13
            r5 = r8
            lt1.a r5 = (lt1.a) r5
            int r7 = r5.f402715f
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r7 & r0
            if (r1 == 0) goto L13
            int r7 = r7 - r0
            r5.f402715f = r7
            goto L18
        L13:
            lt1.a r5 = new lt1.a
            r5.<init>(r4, r8)
        L18:
            java.lang.Object r7 = r5.f402713d
            pz5.a r8 = pz5.a.f440719d
            int r0 = r5.f402715f
            r1 = 1
            java.lang.String r2 = "MicroMsg.AddFriendVerifyRecordSyncProcessor"
            if (r0 == 0) goto L31
            if (r0 != r1) goto L29
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L91
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            if (r6 == 0) goto L96
            java.lang.String r6 = "handleContinue: need continue, re-fetch all data from cloud"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r6)
            java.lang.String r6 = "handleContinue: delete all local verify record cache"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r6)
            java.lang.Class<vg3.x3> r6 = vg3.x3.class
            lm0.a r6 = gm0.j1.s(r6)
            vg3.x3 r6 = (vg3.x3) r6
            com.tencent.mm.plugin.messenger.foundation.h2 r6 = (com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) r6
            xg3.x0 r6 = r6.oj()
            com.tencent.mm.storage.jb r6 = (com.p314xaae8f345.mm.p2621x8fb0427b.jb) r6
            l75.k0 r7 = r6.f276595d
            java.lang.String r0 = "VerifyRecordMsgInfo"
            r3 = 0
            if (r7 == 0) goto L5a
            r7.mo70514xb06685ab(r0, r3, r3)
        L5a:
            r7 = 5
            r6.mo142179xf35bbb4(r0, r7, r3)
            java.lang.String r6 = "handleContinue: request verify record history from cloud"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r6)
            r5.f402715f = r1
            kotlinx.coroutines.r r6 = new kotlinx.coroutines.r
            kotlin.coroutines.Continuation r5 = pz5.f.b(r5)
            r6.<init>(r5, r1)
            r6.k()
            lt1.b r5 = lt1.b.f402716d
            r6.m(r5)
            java.lang.Class<xg3.u> r5 = xg3.u.class
            i95.m r5 = i95.n0.c(r5)
            xg3.u r5 = (xg3.u) r5
            lt1.c r7 = new lt1.c
            r7.<init>(r6)
            ft1.j r5 = (ft1.j) r5
            r0 = 0
            r5.Ni(r0, r7)
            java.lang.Object r5 = r6.j()
            if (r5 != r8) goto L91
            return r8
        L91:
            java.lang.String r5 = "handleContinue: re-fetch completed"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r5)
        L96:
            jz5.f0 r5 = jz5.f0.f384359a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: lt1.d.f(r45.jo5, boolean, yz5.l, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // lt1.e
    public void k(java.util.List syncItems) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(syncItems, "syncItems");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddFriendVerifyRecordSyncProcessor", "process() called with: syncItems = " + syncItems.size());
        if (syncItems.isEmpty()) {
            return;
        }
        xg3.u uVar = (xg3.u) i95.n0.c(xg3.u.class);
        java.util.Iterator it = syncItems.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            r45.yx6 yx6Var = new r45.yx6();
            yx6Var.mo11468x92b714fd(((r45.go5) next).f456930e.g());
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("VerifyRecord: status: ");
            sb6.append(yx6Var.f473015e);
            sb6.append(", version: ");
            sb6.append(yx6Var.f473017g);
            sb6.append(", msgSize: ");
            java.util.LinkedList linkedList = yx6Var.f473016f;
            sb6.append(linkedList.size());
            sb6.append(", username: ");
            sb6.append(yx6Var.f473014d);
            sb6.append(" lastRecvMsg:");
            sb6.append(yx6Var.f473018h);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddFriendVerifyRecordSyncProcessor", sb6.toString());
            if (linkedList != null) {
                java.util.Iterator it6 = linkedList.iterator();
                while (it6.hasNext()) {
                    r45.mx6 mx6Var = (r45.mx6) it6.next();
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("VerifyMsg: direction:");
                    sb7.append(mx6Var.f462433d);
                    sb7.append(" msgid:");
                    int i19 = i18;
                    sb7.append(mx6Var.f462434e);
                    sb7.append(" create_time:");
                    sb7.append(mx6Var.f462436g);
                    sb7.append(" content:");
                    sb7.append(mx6Var.f462435f);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddFriendVerifyRecordSyncProcessor", sb7.toString());
                    com.p314xaae8f345.mm.p2621x8fb0427b.ib ibVar = new com.p314xaae8f345.mm.p2621x8fb0427b.ib();
                    ibVar.f68088xd09be28e = mx6Var.f462434e;
                    ibVar.f68086x613e327a = mx6Var.f462433d;
                    xg3.u uVar2 = uVar;
                    java.util.Iterator it7 = it;
                    ibVar.f68085xac3be4e = mx6Var.f462436g * 1 * 1000;
                    ibVar.f68089x10a0fed7 = yx6Var.f473015e;
                    ibVar.f68091x8987ca93 = yx6Var.f473017g;
                    ibVar.f68087x5285fa99 = yx6Var.f473014d;
                    java.lang.String content = mx6Var.f462435f;
                    ibVar.f68084xad49e234 = content;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(content, "content");
                    java.lang.String username = yx6Var.f473014d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(username, "username");
                    ibVar.f68090x114ef53e = com.p314xaae8f345.mm.p2621x8fb0427b.hb.a(content, username, "MicroMsg.AddFriendVerifyRecordSyncProcessor");
                    arrayList.add(ibVar);
                    i18 = i19;
                    it6 = it6;
                    uVar = uVar2;
                    it = it7;
                }
            }
            xg3.u uVar3 = uVar;
            java.util.Iterator it8 = it;
            int i27 = i18;
            r45.mx6 mx6Var2 = yx6Var.f473018h;
            if (mx6Var2 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddFriendVerifyRecordSyncProcessor", "lastRecvMsg: direction:" + mx6Var2.f462433d + " msgid:" + mx6Var2.f462434e + " create_time:" + mx6Var2.f462436g + " content:" + mx6Var2.f462435f);
                com.p314xaae8f345.mm.p2621x8fb0427b.ib ibVar2 = new com.p314xaae8f345.mm.p2621x8fb0427b.ib();
                ibVar2.f68088xd09be28e = mx6Var2.f462434e;
                ibVar2.f68086x613e327a = mx6Var2.f462433d;
                ibVar2.f68085xac3be4e = ((long) mx6Var2.f462436g) * ((long) 1) * 1000;
                ibVar2.f68089x10a0fed7 = yx6Var.f473015e;
                ibVar2.f68091x8987ca93 = yx6Var.f473017g;
                ibVar2.f68087x5285fa99 = yx6Var.f473014d;
                java.lang.String content2 = mx6Var2.f462435f;
                ibVar2.f68084xad49e234 = content2;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(content2, "content");
                java.lang.String username2 = yx6Var.f473014d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(username2, "username");
                ibVar2.f68090x114ef53e = com.p314xaae8f345.mm.p2621x8fb0427b.hb.a(content2, username2, "MicroMsg.AddFriendVerifyRecordSyncProcessor");
                arrayList.add(ibVar2);
            }
            java.lang.String username3 = yx6Var.f473014d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(username3, "username");
            ((ft1.j) uVar3).Ri(username3, yx6Var.f473015e, arrayList, yx6Var.f473017g);
            i17 = i27;
            uVar = uVar3;
            it = it8;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddFriendVerifyRecordSyncProcessor", "process() end called");
    }
}
