package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class q70 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.u70 f201043d;

    public q70(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.u70 u70Var) {
        this.f201043d = u70Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
    
        if (r3 != null) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bd  */
    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo771x2f8fd3(java.lang.Object r8, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r9) {
        /*
            r7 = this;
            r45.n73 r8 = (r45.n73) r8
            zl2.r4 r9 = zl2.r4.f555483a
            com.tencent.mm.plugin.finder.live.widget.u70 r0 = r7.f201043d
            java.lang.Class<mm2.g1> r1 = mm2.g1.class
            androidx.lifecycle.c1 r1 = r0.m56788xbba4bfc0(r1)
            mm2.g1 r1 = (mm2.g1) r1
            kotlinx.coroutines.flow.j2 r1 = r1.f410601f
            kotlinx.coroutines.flow.h3 r1 = (p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) r1
            java.lang.Object r1 = r1.mo144003x754a37bb()
            r45.q12 r1 = (r45.q12) r1
            boolean r9 = r9.T1(r1)
            if (r9 == 0) goto Lc2
            r9 = 0
            r1 = 0
            r2 = 1
            if (r8 == 0) goto L4e
            com.tencent.mm.protobuf.f r3 = r8.m75936x14adae67(r2)
            r45.z53 r3 = (r45.z53) r3
            if (r3 == 0) goto L4e
            java.lang.String r3 = r3.m75945x2fec8307(r9)
            if (r3 == 0) goto L4e
            int r4 = r3.length()
            if (r4 <= 0) goto L39
            r4 = r2
            goto L3a
        L39:
            r4 = r9
        L3a:
            if (r4 == 0) goto L3d
            goto L3e
        L3d:
            r3 = r1
        L3e:
            if (r3 == 0) goto L4e
            km2.g r4 = km2.g.f390633a
            km2.e r3 = r4.d(r3)
            if (r3 == 0) goto L4e
            java.lang.String r3 = r3.f390623a
            if (r3 == 0) goto L4e
            goto Lbb
        L4e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "getGameBgUrl live_cover_url="
            r3.<init>(r4)
            r4 = 3
            if (r8 == 0) goto L65
            com.tencent.mm.protobuf.f r5 = r8.m75936x14adae67(r4)
            r45.s63 r5 = (r45.s63) r5
            if (r5 == 0) goto L65
            java.lang.String r5 = r5.m75945x2fec8307(r2)
            goto L66
        L65:
            r5 = r1
        L66:
            r3.append(r5)
            java.lang.String r5 = ", default_live_cover_url = "
            r3.append(r5)
            r5 = 9
            if (r8 == 0) goto L7f
            com.tencent.mm.protobuf.f r6 = r8.m75936x14adae67(r2)
            r45.z53 r6 = (r45.z53) r6
            if (r6 == 0) goto L7f
            java.lang.String r6 = r6.m75945x2fec8307(r5)
            goto L80
        L7f:
            r6 = r1
        L80:
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            java.lang.String r6 = "Finder.FinderStartLivePostCoverWidget"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r6, r3)
            if (r8 == 0) goto Lac
            com.tencent.mm.protobuf.f r3 = r8.m75936x14adae67(r4)
            r45.s63 r3 = (r45.s63) r3
            if (r3 == 0) goto Lac
            java.lang.String r3 = r3.m75945x2fec8307(r2)
            if (r3 == 0) goto Lac
            int r4 = r3.length()
            if (r4 <= 0) goto La3
            r9 = r2
        La3:
            if (r9 == 0) goto La6
            goto La7
        La6:
            r3 = r1
        La7:
            if (r3 != 0) goto Laa
            goto Lac
        Laa:
            r1 = r3
            goto Lba
        Lac:
            if (r8 == 0) goto Lba
            com.tencent.mm.protobuf.f r8 = r8.m75936x14adae67(r2)
            r45.z53 r8 = (r45.z53) r8
            if (r8 == 0) goto Lba
            java.lang.String r1 = r8.m75945x2fec8307(r5)
        Lba:
            r3 = r1
        Lbb:
            if (r3 == 0) goto Lc2
            java.lang.String r8 = "gameAppInfo"
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.u70.Z6(r0, r8, r3)
        Lc2:
            jz5.f0 r8 = jz5.f0.f384359a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.q70.mo771x2f8fd3(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
