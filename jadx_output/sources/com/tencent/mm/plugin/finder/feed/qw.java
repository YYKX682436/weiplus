package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class qw extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.pz f108853d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qw(com.tencent.mm.plugin.finder.feed.pz pzVar) {
        super(0);
        this.f108853d = pzVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
    
        vz5.b.a(r0, null);
        com.tencent.mars.xlog.Log.i("Finder.FinderActionStorage", "getAllFailedCommentFeedIds " + r1 + " listSize:" + r3.size());
        r0 = r13.f108853d;
        r1 = r0.f108764p1;
        r2 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0083, code lost:
    
        if (r2.hasNext() == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0085, code lost:
    
        r3 = (com.tencent.mm.plugin.finder.storage.k) r2.next();
        r1.add(new so2.r(r3.f127035a, r3.f127036b, r3.f127037c, 0, 8, null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x009f, code lost:
    
        pm0.v.X(new com.tencent.mm.plugin.finder.feed.pw(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a9, code lost:
    
        return jz5.f0.f302826a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0030, code lost:
    
        if (r0.moveToFirst() != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0032, code lost:
    
        r4 = new com.tencent.mm.plugin.finder.storage.yj0();
        r4.convertFrom(r0);
        r6 = r4.field_feedId;
        r8 = r4.field_dupFlag;
        r4 = r4.field_objectNonceId;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0042, code lost:
    
        if (r4 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0044, code lost:
    
        r4 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0049, code lost:
    
        r3.add(new com.tencent.mm.plugin.finder.storage.k(r6, r8, r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0053, code lost:
    
        if (r0.moveToNext() != false) goto L27;
     */
    @Override // yz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke() {
        /*
            r13 = this;
            java.lang.Class<c61.l7> r0 = c61.l7.class
            i95.m r0 = i95.n0.c(r0)
            c61.l7 r0 = (c61.l7) r0
            com.tencent.mm.plugin.finder.storage.l r0 = r0.Ij()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r0.f127098e
            r1.append(r2)
            java.lang.String r2 = " WHERE actionType = 1 and state = -1 and  canRemove = 0 group By feedId"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            l75.k0 r0 = r0.f127097d
            r2 = 0
            r3 = 2
            android.database.Cursor r0 = r0.f(r1, r2, r3)
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            boolean r4 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L47
            if (r4 == 0) goto L55
        L32:
            com.tencent.mm.plugin.finder.storage.yj0 r4 = new com.tencent.mm.plugin.finder.storage.yj0     // Catch: java.lang.Throwable -> L47
            r4.<init>()     // Catch: java.lang.Throwable -> L47
            r4.convertFrom(r0)     // Catch: java.lang.Throwable -> L47
            com.tencent.mm.plugin.finder.storage.k r5 = new com.tencent.mm.plugin.finder.storage.k     // Catch: java.lang.Throwable -> L47
            long r6 = r4.field_feedId     // Catch: java.lang.Throwable -> L47
            java.lang.String r8 = r4.field_dupFlag     // Catch: java.lang.Throwable -> L47
            java.lang.String r4 = r4.field_objectNonceId     // Catch: java.lang.Throwable -> L47
            if (r4 != 0) goto L49
            java.lang.String r4 = ""
            goto L49
        L47:
            r1 = move-exception
            goto Laa
        L49:
            r5.<init>(r6, r8, r4)     // Catch: java.lang.Throwable -> L47
            r3.add(r5)     // Catch: java.lang.Throwable -> L47
            boolean r4 = r0.moveToNext()     // Catch: java.lang.Throwable -> L47
            if (r4 != 0) goto L32
        L55:
            vz5.b.a(r0, r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "getAllFailedCommentFeedIds "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r1 = " listSize:"
            r0.append(r1)
            int r1 = r3.size()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Finder.FinderActionStorage"
            com.tencent.mars.xlog.Log.i(r1, r0)
            com.tencent.mm.plugin.finder.feed.pz r0 = r13.f108853d
            java.util.concurrent.ConcurrentLinkedQueue r1 = r0.f108764p1
            java.util.Iterator r2 = r3.iterator()
        L7f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L9f
            java.lang.Object r3 = r2.next()
            com.tencent.mm.plugin.finder.storage.k r3 = (com.tencent.mm.plugin.finder.storage.k) r3
            so2.r r12 = new so2.r
            long r5 = r3.f127035a
            java.lang.String r7 = r3.f127036b
            java.lang.String r8 = r3.f127037c
            r9 = 0
            r10 = 8
            r11 = 0
            r4 = r12
            r4.<init>(r5, r7, r8, r9, r10, r11)
            r1.add(r12)
            goto L7f
        L9f:
            com.tencent.mm.plugin.finder.feed.pw r1 = new com.tencent.mm.plugin.finder.feed.pw
            r1.<init>(r0)
            pm0.v.X(r1)
            jz5.f0 r0 = jz5.f0.f302826a
            return r0
        Laa:
            throw r1     // Catch: java.lang.Throwable -> Lab
        Lab:
            r2 = move-exception
            vz5.b.a(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.qw.invoke():java.lang.Object");
    }
}
