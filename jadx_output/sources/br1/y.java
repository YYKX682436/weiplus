package br1;

/* loaded from: classes11.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final br1.w f23648a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f23649b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f23650c;

    public y(br1.w onGetContact) {
        kotlin.jvm.internal.o.g(onGetContact, "onGetContact");
        this.f23648a = onGetContact;
        this.f23649b = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f23650c = new java.util.concurrent.atomic.AtomicBoolean(false);
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
            jr1.i r2 = jr1.i.f301360a
            java.lang.String r3 = r2.c(r1)
            java.lang.String r3 = jr1.j.a(r3)
            boolean r3 = kotlin.jvm.internal.o.b(r13, r3)
            java.lang.String r4 = "BizFans.BizFansContactLooper"
            if (r3 == 0) goto L2a
            java.lang.String r13 = "self biz contact do not need update."
            com.tencent.mars.xlog.Log.i(r4, r13)
            return r1
        L2a:
            r3 = 5
            java.lang.String r5 = r2.c(r3)
            java.lang.String r5 = jr1.j.c(r5)
            boolean r5 = kotlin.jvm.internal.o.b(r13, r5)
            if (r5 == 0) goto L40
            java.lang.String r13 = "self photo contact do not need update."
            com.tencent.mars.xlog.Log.i(r4, r13)
            return r1
        L40:
            java.util.concurrent.ConcurrentLinkedQueue r5 = r12.f23649b
            boolean r6 = r5.contains(r13)
            if (r6 == 0) goto L49
            return r1
        L49:
            java.lang.String r6 = "talker"
            kotlin.jvm.internal.o.g(r13, r6)
            if (r14 != r3) goto L5a
            nr1.b r3 = yq1.u0.Ui()
            hr1.a r3 = r3.y0(r13)
            goto L62
        L5a:
            hr1.c r3 = yq1.u0.Bi()
            hr1.a r3 = r3.y0(r13)
        L62:
            if (r3 == 0) goto L8b
            java.lang.String r6 = r3.field_openid
            int r7 = r3.field_serviceType
            boolean r6 = r2.a(r6, r7)
            if (r6 == 0) goto L6f
            goto L86
        L6f:
            int r6 = c01.id.e()
            long r6 = (long) r6
            long r8 = r3.field_createTime
            long r6 = r6 - r8
            long r8 = r3.field_cacheLifetime
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
            com.tencent.mars.xlog.Log.i(r4, r13)
            return r1
        L95:
            java.lang.String r13 = jr1.j.e(r13, r14)
            r5.add(r13)
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            boolean r13 = kotlin.jvm.internal.o.b(r15, r13)
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
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.f23650c;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.f23649b;
        if (concurrentLinkedQueue.isEmpty()) {
            com.tencent.mars.xlog.Log.i("BizFans.BizFansContactLooper", "queue empty");
            atomicBoolean.set(false);
            this.f23648a.a(i17);
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
        mv6Var.f380859d = str;
        mv6Var.f380860e = linkedList2;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 28069;
        lVar.f70666c = "/cgi-bin/mmbiz-bin/mp/userattr";
        lVar.f70664a = mv6Var;
        lVar.f70665b = new r45.nv6();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        com.tencent.mars.xlog.Log.i("BizFans.BizFansContactLooper", "need get profile contact list: " + linkedList2);
        ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(a17, new br1.x(linkedList2, this, str, i17));
    }
}
