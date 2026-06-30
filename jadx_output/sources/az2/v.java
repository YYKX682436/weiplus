package az2;

/* loaded from: classes2.dex */
public abstract class v extends az2.u {
    public v(r45.qt2 qt2Var, int i17, kotlin.jvm.internal.i iVar) {
        super((i17 & 1) != 0 ? null : qt2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0087, code lost:
    
        if (r8.getInteger(40) == 1) goto L18;
     */
    @Override // az2.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void J(int r4, int r5, int r6, java.lang.String r7, com.tencent.mm.network.v0 r8, byte[] r9) {
        /*
            r3 = this;
            java.util.List r4 = r3.K(r8)
            java.util.Iterator r5 = r4.iterator()
        L8:
            boolean r6 = r5.hasNext()
            r7 = 0
            if (r6 == 0) goto L2a
            java.lang.Object r6 = r5.next()
            com.tencent.mm.plugin.finder.storage.FinderItem r6 = (com.tencent.mm.plugin.finder.storage.FinderItem) r6
            bu2.j r9 = bu2.j.f24534a
            bu2.h r0 = new bu2.h
            if (r8 == 0) goto L1f
            int r7 = r8.getType()
        L1f:
            long r1 = r3.L()
            r0.<init>(r7, r1)
            r9.n(r6, r0)
            goto L8
        L2a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "request: "
            r5.<init>(r6)
            long r8 = r3.L()
            r5.append(r8)
            java.lang.String r6 = ", allowSimpleResult: false, switch: "
            r5.append(r6)
            com.tencent.mm.plugin.finder.storage.t70 r6 = com.tencent.mm.plugin.finder.storage.t70.f127590a
            lb2.j r8 = r6.j1()
            java.lang.Object r8 = r8.r()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            java.lang.String r8 = "NetSceneFinderFeedBase"
            com.tencent.mars.xlog.Log.i(r8, r5)
            lb2.j r5 = r6.j1()
            r5.l()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L69:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L91
            java.lang.Object r6 = r4.next()
            r8 = r6
            com.tencent.mm.plugin.finder.storage.FinderItem r8 = (com.tencent.mm.plugin.finder.storage.FinderItem) r8
            com.tencent.mm.protocal.protobuf.FinderObject r8 = r8.getFeedObject()
            r45.dm2 r8 = r8.getObject_extend()
            if (r8 == 0) goto L8a
            r9 = 40
            int r8 = r8.getInteger(r9)
            r9 = 1
            if (r8 != r9) goto L8a
            goto L8b
        L8a:
            r9 = r7
        L8b:
            if (r9 == 0) goto L69
            r5.add(r6)
            goto L69
        L91:
            java.util.ArrayList r4 = new java.util.ArrayList
            r6 = 10
            int r6 = kz5.d0.q(r5, r6)
            r4.<init>(r6)
            java.util.Iterator r5 = r5.iterator()
        La0:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto Ld3
            java.lang.Object r6 = r5.next()
            com.tencent.mm.plugin.finder.storage.FinderItem r6 = (com.tencent.mm.plugin.finder.storage.FinderItem) r6
            r45.rv0 r8 = new r45.rv0
            r8.<init>()
            long r0 = r6.getId()
            java.lang.String r9 = pm0.v.u(r0)
            java.lang.String r0 = "getBatchFeed: "
            java.lang.String r9 = r0.concat(r9)
            java.lang.String r0 = "FinderFeedCgi"
            com.tencent.mars.xlog.Log.i(r0, r9)
            long r0 = r6.getId()
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
            r8.set(r7, r6)
            r4.add(r8)
            goto La0
        Ld3:
            com.tencent.mm.plugin.finder.storage.t70 r4 = com.tencent.mm.plugin.finder.storage.t70.f127590a
            lb2.j r4 = r4.j1()
            java.lang.Object r4 = r4.r()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            r4.booleanValue()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: az2.v.J(int, int, int, java.lang.String, com.tencent.mm.network.v0, byte[]):void");
    }

    public abstract java.util.List K(com.tencent.mm.network.v0 v0Var);

    public abstract long L();
}
