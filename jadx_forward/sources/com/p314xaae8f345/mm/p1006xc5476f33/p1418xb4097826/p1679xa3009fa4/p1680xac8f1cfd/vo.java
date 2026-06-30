package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes10.dex */
public final class vo implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dm.pd f217793a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.yo f217794b;

    public vo(dm.pd pdVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.yo yoVar) {
        this.f217793a = pdVar;
        this.f217794b = yoVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00aa, code lost:
    
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(r8, r6) != false) goto L32;
     */
    @Override // gm5.a
    /* renamed from: call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object r8) {
        /*
            r7 = this;
            com.tencent.mm.modelbase.f r8 = (com.p314xaae8f345.mm.p944x882e457a.f) r8
            dm.pd r0 = r7.f217793a
            if (r8 != 0) goto L2b
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r1 = "result == null id "
            r8.<init>(r1)
            long r1 = r0.f66095xc8a07680
            r8.append(r1)
            java.lang.String r1 = " content "
            r8.append(r1)
            java.lang.String r0 = r0.f66079xad49e234
            java.lang.String r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(r0)
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            java.lang.String r0 = "SimpleUIComponent"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r8)
            goto Ldb
        L2b:
            int r1 = r8.f152148a
            com.tencent.mm.plugin.finder.viewmodel.component.yo r2 = r7.f217794b
            if (r1 != 0) goto L35
            int r3 = r8.f152149b
            if (r3 == 0) goto L3d
        L35:
            int r3 = r8.f152149b
            boolean r1 = hc2.p.b(r1, r3)
            if (r1 == 0) goto Ld6
        L3d:
            com.tencent.mm.protobuf.f r8 = r8.f152151d
            r45.h51 r8 = (r45.h51) r8
            r1 = 2
            com.tencent.mm.protobuf.f r8 = r8.m75936x14adae67(r1)
            com.tencent.mm.protocal.protobuf.FinderObject r8 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) r8
            if (r8 == 0) goto Ldb
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract r3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.f204353a
            int r4 = r2.f218129d
            int r5 = r2.f218131f
            r3.x(r1, r4, r5)
            java.lang.String r4 = "feed_object_id"
            long r5 = r8.m76784x5db1b11()
            r1.putExtra(r4, r5)
            java.lang.String r4 = "feed_object_nonceid"
            java.lang.String r5 = r8.m76803x6c285d75()
            r1.putExtra(r4, r5)
            long r4 = r0.f66095xc8a07680
            java.lang.String r6 = "mention_id"
            r1.putExtra(r6, r4)
            java.lang.String r4 = "mention_create_time"
            int r5 = r0.f66080xac3be4e
            r1.putExtra(r4, r5)
            java.lang.String r4 = "from_scene"
            int r5 = r2.f218129d
            r1.putExtra(r4, r5)
            com.tencent.mm.protocal.protobuf.FinderContact r4 = r8.m76760x76845fea()
            if (r4 == 0) goto L8b
            java.lang.String r4 = r4.m76197x6c03c64c()
            if (r4 != 0) goto L8d
        L8b:
            java.lang.String r4 = ""
        L8d:
            java.lang.String r6 = "feed_username"
            r1.putExtra(r6, r4)
            r4 = 1
            if (r5 != r4) goto Lb4
            com.tencent.mm.protocal.protobuf.FinderContact r8 = r8.m76760x76845fea()
            r5 = 0
            if (r8 == 0) goto La1
            java.lang.String r8 = r8.m76197x6c03c64c()
            goto La2
        La1:
            r8 = r5
        La2:
            java.lang.String r6 = r2.f218134i
            if (r6 == 0) goto Lad
            boolean r8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(r8, r6)
            if (r8 == 0) goto Lb4
            goto Lb5
        Lad:
            java.lang.String r8 = "username"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r8)
            throw r5
        Lb4:
            r4 = 0
        Lb5:
            java.lang.String r8 = "feed_is_self"
            r1.putExtra(r8, r4)
            r3.u(r1, r0)
            com.tencent.mm.plugin.finder.viewmodel.component.iy r8 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1
            android.app.Activity r0 = r2.m80379x76847179()
            r8.c(r0, r1)
            java.lang.Class<com.tencent.mm.plugin.finder.assist.i0> r8 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class
            i95.m r8 = i95.n0.c(r8)
            com.tencent.mm.plugin.finder.assist.i0 r8 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) r8
            androidx.appcompat.app.AppCompatActivity r0 = r2.m158354x19263085()
            r8.Xj(r0, r1)
            goto Ldb
        Ld6:
            int r8 = r8.f152149b
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.yo.O6(r2, r8)
        Ldb:
            jz5.f0 r8 = jz5.f0.f384359a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.vo.mo1059x2e7a5e(java.lang.Object):java.lang.Object");
    }
}
