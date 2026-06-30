package br1;

/* loaded from: classes11.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final br1.w f105181a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f105182b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f105183c;

    public y(br1.w onGetContact) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onGetContact, "onGetContact");
        this.f105181a = onGetContact;
        this.f105182b = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f105183c = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(java.lang.String r13, int r14, java.lang.Boolean r15) {
        /*
            r12 = this;
            r0 = 1
            r1 = 0
            if (r13 == 0) goto Ld
            int r2 = r13.length()
            if (r2 != 0) goto Lb
            goto Ld
        Lb:
            r2 = r1
            goto Le
        Ld:
            r2 = r0
        Le:
            if (r2 == 0) goto L11
            return r1
        L11:
            jr1.i r2 = jr1.i.f382893a
            java.lang.String r3 = r2.c(r1)
            java.lang.String r3 = jr1.j.a(r3)
            boolean r3 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r13, r3)
            java.lang.String r4 = "BizFans.BizFansContactLooper"
            if (r3 == 0) goto L2a
            java.lang.String r13 = "self biz contact do not need update."
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r13)
            return r1
        L2a:
            r3 = 5
            java.lang.String r5 = r2.c(r3)
            java.lang.String r5 = jr1.j.c(r5)
            boolean r5 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r13, r5)
            if (r5 == 0) goto L40
            java.lang.String r13 = "self photo contact do not need update."
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r13)
            return r1
        L40:
            java.util.concurrent.ConcurrentLinkedQueue r5 = r12.f105182b
            boolean r6 = r5.contains(r13)
            if (r6 == 0) goto L49
            return r1
        L49:
            java.lang.String r6 = "talker"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r13, r6)
            if (r14 != r3) goto L5a
            nr1.b r3 = yq1.u0.Ui()
            hr1.a r3 = r3.y0(r13)
            goto L62
        L5a:
            hr1.c r3 = yq1.u0.Bi()
            hr1.a r3 = r3.y0(r13)
        L62:
            if (r3 == 0) goto L8b
            java.lang.String r6 = r3.f66213x996f7ca
            int r7 = r3.f66216xf8cebfca
            boolean r6 = r2.a(r6, r7)
            if (r6 == 0) goto L6f
            goto L86
        L6f:
            int r6 = c01.id.e()
            long r6 = (long) r6
            long r8 = r3.f66206xac3be4e
            long r6 = r6 - r8
            long r8 = r3.f66202x2ea7cae6
            r10 = 10
            int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r3 >= 0) goto L80
            r8 = r10
        L80:
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 <= 0) goto L86
            r3 = r0
            goto L87
        L86:
            r3 = r1
        L87:
            if (r3 != 0) goto L8b
            r3 = r1
            goto L8c
        L8b:
            r3 = r0
        L8c:
            if (r3 != 0) goto L95
            java.lang.String r13 = "talker contact do not need update."
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r13)
            return r1
        L95:
            java.lang.String r13 = jr1.j.e(r13, r14)
            r5.add(r13)
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            boolean r13 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r15, r13)
            if (r13 == 0) goto Laf
            java.lang.String r13 = r2.c(r14)
            java.lang.String r13 = jr1.j.e(r13, r14)
            r12.b(r13, r14)
        Laf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: br1.y.a(java.lang.String, int, java.lang.Boolean):boolean");
    }

    public final void b(java.lang.String str, int i17) {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.f105183c;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.f105182b;
        if (concurrentLinkedQueue.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizFans.BizFansContactLooper", "queue empty");
            atomicBoolean.set(false);
            this.f105181a.a(i17);
            return;
        }
        int size = concurrentLinkedQueue.size();
        if (30 <= size) {
            size = 30;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (int i18 = 0; i18 < size; i18++) {
            java.lang.String str2 = (java.lang.String) concurrentLinkedQueue.poll();
            if (str2 != null) {
                linkedList.add(str2);
            }
        }
        java.util.LinkedList linkedList2 = new java.util.LinkedList(kz5.n0.Q(linkedList));
        r45.mv6 mv6Var = new r45.mv6();
        mv6Var.f462392d = str;
        mv6Var.f462393e = linkedList2;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 28069;
        lVar.f152199c = "/cgi-bin/mmbiz-bin/mp/userattr";
        lVar.f152197a = mv6Var;
        lVar.f152198b = new r45.nv6();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizFans.BizFansContactLooper", "need get profile contact list: " + linkedList2);
        ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).wi(a17, new br1.x(linkedList2, this, str, i17));
    }
}
