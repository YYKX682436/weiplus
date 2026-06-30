package iq2;

/* loaded from: classes2.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iq2.d0 f375286d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(iq2.d0 d0Var) {
        super(2);
        this.f375286d = d0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048 A[LOOP:0: B:2:0x0016->B:12:0x0048, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004c A[EDGE_INSN: B:13:0x004c->B:14:0x004c BREAK  A[LOOP:0: B:2:0x0016->B:12:0x0048], SYNTHETIC] */
    @Override // yz5.p
    /* renamed from: invoke */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo149xb9724478(java.lang.Object r12, java.lang.Object r13) {
        /*
            r11 = this;
            java.lang.Number r12 = (java.lang.Number) r12
            long r2 = r12.longValue()
            java.lang.Number r13 = (java.lang.Number) r13
            long r4 = r13.longValue()
            iq2.d0 r12 = r11.f375286d
            java.util.ArrayList r13 = r12.f375265p
            java.util.Iterator r13 = r13.iterator()
            r0 = 0
            r1 = r0
        L16:
            boolean r6 = r13.hasNext()
            r7 = 1
            r8 = -1
            if (r6 == 0) goto L4b
            java.lang.Object r6 = r13.next()
            so2.j5 r6 = (so2.j5) r6
            boolean r9 = r6 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5
            if (r9 == 0) goto L44
            zl2.q4 r9 = zl2.q4.f555466a
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r6 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) r6
            boolean r9 = r9.C(r6)
            if (r9 == 0) goto L44
            com.tencent.mm.plugin.finder.storage.FinderItem r6 = r6.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObject r6 = r6.getFeedObject()
            long r9 = r6.m76784x5db1b11()
            int r6 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r6 != 0) goto L44
            r6 = r7
            goto L45
        L44:
            r6 = r0
        L45:
            if (r6 == 0) goto L48
            goto L4c
        L48:
            int r1 = r1 + 1
            goto L16
        L4b:
            r1 = r8
        L4c:
            if (r1 == r8) goto Lb0
            up2.h r13 = r12.f375267r
            boolean r6 = r13 instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf
            r8 = 0
            if (r6 == 0) goto L56
            goto L57
        L56:
            r13 = r8
        L57:
            if (r13 == 0) goto L5d
            int r0 = r13.a0()
        L5d:
            up2.h r13 = r12.f375267r
            if (r13 == 0) goto L6c
            int r0 = r0 + r1
            dk2.zg r6 = new dk2.zg
            r6.<init>()
            r6.f315977g = r7
            r13.m8148xed6e4d18(r0, r6)
        L6c:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "[NearbyEndLive] LiveStreamTab show ended UI at index="
            r13.<init>(r0)
            r13.append(r1)
            java.lang.String r0 = ", feedId="
            r13.append(r0)
            java.lang.String r0 = pm0.v.u(r2)
            r13.append(r0)
            java.lang.String r0 = ", will remove after 500ms"
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            java.lang.String r0 = r12.f375254e
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r13)
            iq2.d0 r13 = r11.f375286d
            iq2.k r6 = new iq2.k
            r0 = r6
            r1 = r13
            r0.<init>(r1, r2, r4)
            java.util.List r13 = r13.f375266q
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            r13.add(r6)
            com.tencent.mm.plugin.finder.nest.FinderChildRecyclerView r12 = r12.f375259j
            if (r12 == 0) goto Laa
            r0 = 500(0x1f4, double:2.47E-321)
            r12.postDelayed(r6, r0)
            goto Lb0
        Laa:
            java.lang.String r12 = "recyclerView"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r12)
            throw r8
        Lb0:
            jz5.f0 r12 = jz5.f0.f384359a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: iq2.l.mo149xb9724478(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
