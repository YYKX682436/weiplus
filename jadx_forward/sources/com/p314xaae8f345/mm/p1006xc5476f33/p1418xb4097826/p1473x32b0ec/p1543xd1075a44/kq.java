package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class kq implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.nq f200384a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f200385b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.z53 f200386c;

    public kq(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.nq nqVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, r45.z53 z53Var) {
        this.f200384a = nqVar;
        this.f200385b = interfaceC29045xdcb5ca57;
        this.f200386c = z53Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0066 A[EDGE_INSN: B:21:0x0066->B:22:0x0066 BREAK  A[LOOP:0: B:6:0x0024->B:30:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[LOOP:0: B:6:0x0024->B:30:?, LOOP_END, SYNTHETIC] */
    @Override // gm5.a
    /* renamed from: call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object r10) {
        /*
            r9 = this;
            com.tencent.mm.modelbase.f r10 = (com.p314xaae8f345.mm.p944x882e457a.f) r10
            int r0 = r10.f152148a
            jz5.f0 r1 = jz5.f0.f384359a
            kotlin.coroutines.Continuation r2 = r9.f200385b
            com.tencent.mm.plugin.finder.live.widget.nq r3 = r9.f200384a
            r4 = 0
            r5 = 0
            if (r0 != 0) goto L85
            int r0 = r10.f152149b
            if (r0 != 0) goto L85
            com.tencent.mm.protobuf.f r10 = r10.f152151d
            r45.hv1 r10 = (r45.hv1) r10
            r0 = 1
            java.util.LinkedList r10 = r10.m75941xfb821914(r0)
            java.lang.String r6 = "getGame_user_info_list(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r10, r6)
            java.util.Iterator r10 = r10.iterator()
        L24:
            boolean r6 = r10.hasNext()
            if (r6 == 0) goto L65
            java.lang.Object r6 = r10.next()
            r7 = r6
            r45.n73 r7 = (r45.n73) r7
            com.tencent.mm.protobuf.f r8 = r7.m75936x14adae67(r0)
            r45.z53 r8 = (r45.z53) r8
            if (r8 == 0) goto L3e
            java.lang.String r8 = r8.m75945x2fec8307(r4)
            goto L3f
        L3e:
            r8 = r5
        L3f:
            boolean r8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r8)
            if (r8 != 0) goto L61
            com.tencent.mm.protobuf.f r7 = r7.m75936x14adae67(r0)
            r45.z53 r7 = (r45.z53) r7
            if (r7 == 0) goto L52
            java.lang.String r7 = r7.m75945x2fec8307(r4)
            goto L53
        L52:
            r7 = r5
        L53:
            r45.z53 r8 = r9.f200386c
            java.lang.String r8 = r8.m75945x2fec8307(r4)
            boolean r7 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r7, r8)
            if (r7 == 0) goto L61
            r7 = r0
            goto L62
        L61:
            r7 = r4
        L62:
            if (r7 == 0) goto L24
            goto L66
        L65:
            r6 = r5
        L66:
            r45.n73 r6 = (r45.n73) r6
            if (r6 == 0) goto L73
            java.lang.Object r10 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r6)
            r2.mo48700xdecd0e93(r10)
            r10 = r1
            goto L74
        L73:
            r10 = r5
        L74:
            if (r10 != 0) goto La3
            java.lang.String r10 = r3.H
            java.lang.String r0 = "CgiFinderLiveGetUserGameConfig error, no match game"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r10, r0)
            java.lang.Object r10 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r5)
            r2.mo48700xdecd0e93(r10)
            goto La3
        L85:
            java.lang.String r10 = r3.H
            java.lang.String r0 = "CgiFinderLiveGetUserGameConfig error, toast"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r10, r0)
            r10 = 2131763761(0x7f102231, float:1.9158636E38)
            android.content.Context r0 = r3.f199716e
            java.lang.String r10 = r0.getString(r10)
            android.widget.Toast r10 = db5.t7.m123883x26a183b(r0, r10, r4)
            r10.show()
            java.lang.Object r10 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r5)
            r2.mo48700xdecd0e93(r10)
        La3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.kq.mo1059x2e7a5e(java.lang.Object):java.lang.Object");
    }
}
