package sp2;

/* loaded from: classes2.dex */
public final class u1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sp2.o2 f492761d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(sp2.o2 o2Var) {
        super(2);
        this.f492761d = o2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006e A[LOOP:0: B:2:0x003c->B:12:0x006e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0072 A[EDGE_INSN: B:13:0x0072->B:14:0x0072 BREAK  A[LOOP:0: B:2:0x003c->B:12:0x006e], SYNTHETIC] */
    @Override // yz5.p
    /* renamed from: invoke */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo149xb9724478(java.lang.Object r13, java.lang.Object r14) {
        /*
            r12 = this;
            java.lang.Number r13 = (java.lang.Number) r13
            long r2 = r13.longValue()
            java.lang.Number r14 = (java.lang.Number) r14
            long r4 = r14.longValue()
            sp2.o2 r13 = r12.f492761d
            r13.getClass()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r0 = "[NearbyEndLive]onLiveEnded feedId="
            r14.<init>(r0)
            java.lang.String r0 = pm0.v.u(r2)
            r14.append(r0)
            java.lang.String r0 = " liveId="
            r14.append(r0)
            java.lang.String r0 = pm0.v.u(r4)
            r14.append(r0)
            java.lang.String r14 = r14.toString()
            java.lang.String r0 = "Finder.LiveEntranceFragmentViewCallback"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r14)
            java.util.ArrayList r14 = r13.f492678m
            java.util.Iterator r14 = r14.iterator()
            r1 = 0
            r6 = r1
        L3c:
            boolean r7 = r14.hasNext()
            r8 = 1
            r9 = -1
            if (r7 == 0) goto L71
            java.lang.Object r7 = r14.next()
            so2.j5 r7 = (so2.j5) r7
            boolean r10 = r7 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5
            if (r10 == 0) goto L6a
            zl2.q4 r10 = zl2.q4.f555466a
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r7 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) r7
            boolean r10 = r10.C(r7)
            if (r10 == 0) goto L6a
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r7.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObject r7 = r7.getFeedObject()
            long r10 = r7.m76784x5db1b11()
            int r7 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r7 != 0) goto L6a
            r7 = r8
            goto L6b
        L6a:
            r7 = r1
        L6b:
            if (r7 == 0) goto L6e
            goto L72
        L6e:
            int r6 = r6 + 1
            goto L3c
        L71:
            r6 = r9
        L72:
            if (r6 == r9) goto Lc6
            up2.h r14 = r13.f492684p
            boolean r7 = r14 instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf
            r9 = 0
            if (r7 == 0) goto L7c
            goto L7d
        L7c:
            r14 = r9
        L7d:
            if (r14 == 0) goto L83
            int r1 = r14.a0()
        L83:
            up2.h r14 = r13.f492684p
            if (r14 == 0) goto L92
            int r1 = r1 + r6
            dk2.zg r7 = new dk2.zg
            r7.<init>()
            r7.f315977g = r8
            r14.m8148xed6e4d18(r1, r7)
        L92:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r1 = "[NearbyEndLive]onLiveEnded show ended UI at index="
            r14.<init>(r1)
            r14.append(r6)
            java.lang.String r1 = ", will remove after 500ms"
            r14.append(r1)
            java.lang.String r14 = r14.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r14)
            sp2.x1 r14 = new sp2.x1
            r0 = r14
            r1 = r13
            r0.<init>(r1, r2, r4)
            java.util.List r0 = r13.f492680n
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r14)
            com.tencent.mm.plugin.finder.nest.FinderParentRecyclerView r13 = r13.f492672j
            if (r13 == 0) goto Lc0
            r0 = 500(0x1f4, double:2.47E-321)
            r13.postDelayed(r14, r0)
            goto Lc6
        Lc0:
            java.lang.String r13 = "recyclerView"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r13)
            throw r9
        Lc6:
            jz5.f0 r13 = jz5.f0.f384359a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: sp2.u1.mo149xb9724478(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
