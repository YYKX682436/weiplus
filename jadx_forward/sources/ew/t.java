package ew;

/* loaded from: classes10.dex */
public final class t implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p697xfe7cbaae.p699xd2ae381c.C10475x8e721e2d f338534a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f338535b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23517x16019274 f338536c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mn0.b0 f338537d;

    public t(com.p314xaae8f345.mm.p689xc5a27af6.p697xfe7cbaae.p699xd2ae381c.C10475x8e721e2d c10475x8e721e2d, long j17, com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23517x16019274 c23517x16019274, mn0.b0 b0Var) {
        this.f338534a = c10475x8e721e2d;
        this.f338535b = j17;
        this.f338536c = c23517x16019274;
        this.f338537d = b0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
    
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((java.util.concurrent.ConcurrentHashMap) r6).get(java.lang.Long.valueOf(r4)), java.lang.Boolean.TRUE) == false) goto L13;
     */
    @Override // gm5.a
    /* renamed from: call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object r9) {
        /*
            r8 = this;
            com.tencent.mm.modelbase.f r9 = (com.p314xaae8f345.mm.p944x882e457a.f) r9
            com.tencent.mm.protobuf.f r0 = r9.f152151d
            r45.h51 r0 = (r45.h51) r0
            r1 = 2
            com.tencent.mm.protobuf.f r0 = r0.m75936x14adae67(r1)
            com.tencent.mm.protocal.protobuf.FinderObject r0 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) r0
            int r2 = r9.f152148a
            if (r2 != 0) goto Lc2
            int r2 = r9.f152149b
            if (r2 != 0) goto Lc2
            if (r0 == 0) goto Lc2
            r45.nw1 r2 = r0.m76794xd0557130()
            if (r2 == 0) goto Lc2
            com.tencent.mm.feature.brandecs.flutter.FlutterBrsFinderLivePlayerPlugin r2 = r8.f338534a
            java.util.Map r3 = r2.f146756n
            long r4 = r8.f338535b
            java.lang.Long r6 = java.lang.Long.valueOf(r4)
            java.util.concurrent.ConcurrentHashMap r3 = (java.util.concurrent.ConcurrentHashMap) r3
            boolean r3 = r3.containsKey(r6)
            java.util.Map r6 = r2.f146756n
            if (r3 == 0) goto L44
            java.lang.Long r3 = java.lang.Long.valueOf(r4)
            r7 = r6
            java.util.concurrent.ConcurrentHashMap r7 = (java.util.concurrent.ConcurrentHashMap) r7
            java.lang.Object r3 = r7.get(r3)
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            boolean r3 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r3, r7)
            if (r3 != 0) goto Lc2
        L44:
            java.util.Set r3 = r2.f146757o
            java.lang.Long r7 = java.lang.Long.valueOf(r4)
            java.util.HashSet r3 = (java.util.HashSet) r3
            boolean r7 = r3.contains(r7)
            if (r7 != 0) goto L67
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "try start play after stop or destroy has been called, playerId: "
            r9.<init>(r0)
            r9.append(r4)
            java.lang.String r9 = r9.toString()
            java.lang.String r0 = r2.f146749d
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r0, r9)
            goto Lc2
        L67:
            java.lang.Long r7 = java.lang.Long.valueOf(r4)
            r3.remove(r7)
            com.tencent.mm.protobuf.f r9 = r9.f152151d
            r45.h51 r9 = (r45.h51) r9
            com.tencent.mm.protobuf.f r9 = r9.m75936x14adae67(r1)
            com.tencent.mm.protocal.protobuf.FinderObject r9 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) r9
            if (r9 == 0) goto La1
            r45.nw1 r9 = r9.m76794xd0557130()
            if (r9 == 0) goto La1
            r45.p72 r1 = new r45.p72
            r1.<init>()
            bw5.os0 r2 = r2.f146759q
            java.lang.String r2 = r2.toString()
            r3 = 0
            r1.set(r3, r2)
            mn0.b0 r2 = r8.f338537d
            mn0.y r2 = (mn0.y) r2
            r2.S(r9, r1)
            java.lang.Long r9 = java.lang.Long.valueOf(r4)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.util.concurrent.ConcurrentHashMap r6 = (java.util.concurrent.ConcurrentHashMap) r6
            r6.put(r9, r1)
        La1:
            com.tencent.pigeon.biz_base.FinderLivePlayInfo r9 = r8.f338536c
            java.lang.String r9 = r9.m86836xb2ccb423()
            java.lang.String r1 = ""
            if (r9 != 0) goto Lac
            r9 = r1
        Lac:
            boolean r1 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r9, r1)
            if (r1 != 0) goto Lc2
            java.lang.Class<vw.r> r1 = vw.r.class
            i95.m r1 = i95.n0.c(r1)
            vw.r r1 = (vw.r) r1
            r1.getClass()
            java.util.concurrent.ConcurrentHashMap r1 = r1.f522256d
            r1.put(r9, r0)
        Lc2:
            jz5.f0 r9 = jz5.f0.f384359a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ew.t.mo1059x2e7a5e(java.lang.Object):java.lang.Object");
    }
}
