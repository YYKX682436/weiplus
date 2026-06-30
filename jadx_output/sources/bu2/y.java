package bu2;

/* loaded from: classes2.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public static final bu2.y f24577a = new bu2.y();

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if ((r9.getLocalId() != 0) != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.plugin.finder.storage.FinderItem a(r45.p21 r9) {
        /*
            r8 = this;
            java.lang.String r0 = "data"
            kotlin.jvm.internal.o.g(r9, r0)
            r0 = 2
            com.tencent.mm.protobuf.f r1 = r9.getCustom(r0)
            com.tencent.mm.protocal.protobuf.FinderObject r1 = (com.tencent.mm.protocal.protobuf.FinderObject) r1
            r2 = 5
            int r2 = r9.getInteger(r2)
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L17
            r2 = r3
            goto L18
        L17:
            r2 = r4
        L18:
            r5 = 0
            if (r2 == 0) goto L84
            if (r1 == 0) goto L84
            java.lang.Class<c61.l7> r2 = c61.l7.class
            i95.m r2 = i95.n0.c(r2)
            c61.l7 r2 = (c61.l7) r2
            com.tencent.mm.plugin.finder.storage.f90 r2 = r2.Pj()
            int r6 = r9.getInteger(r4)
            if (r6 != r0) goto L4a
            long r0 = r9.getLong(r3)
            com.tencent.mm.plugin.finder.storage.FinderItem r9 = r2.z0(r0)
            if (r9 == 0) goto L48
            long r0 = r9.getLocalId()
            r6 = 0
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 == 0) goto L44
            goto L45
        L44:
            r3 = r4
        L45:
            if (r3 == 0) goto L48
            goto L81
        L48:
            r9 = r5
            goto L81
        L4a:
            com.tencent.mm.plugin.finder.storage.h90 r2 = com.tencent.mm.plugin.finder.storage.FinderItem.Companion
            r3 = 3
            int r9 = r9.getInteger(r3)
            com.tencent.mm.plugin.finder.storage.FinderItem r9 = r2.a(r1, r9)
            ya2.g r1 = ya2.h.f460484a
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r9.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderContact r2 = r2.getContact()
            if (r2 == 0) goto L66
            java.lang.String r2 = r2.getUsername()
            goto L67
        L66:
            r2 = r5
        L67:
            ya2.b2 r2 = r1.b(r2)
            if (r2 != 0) goto L78
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r9.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderContact r2 = r2.getContact()
            ya2.g.m(r1, r2, r4, r0, r5)
        L78:
            bu2.j r0 = bu2.j.f24534a
            bu2.i r1 = bu2.i.f24521b
            bu2.i r1 = bu2.i.f24521b
            r0.o(r9, r1)
        L81:
            if (r9 == 0) goto L84
            return r9
        L84:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: bu2.y.a(r45.p21):com.tencent.mm.plugin.finder.storage.FinderItem");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0046 A[LOOP:0: B:2:0x0010->B:16:0x0046, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a A[EDGE_INSN: B:17:0x004a->B:18:0x004a BREAK  A[LOOP:0: B:2:0x0010->B:16:0x0046], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(long r9, com.tencent.mm.protocal.protobuf.FinderObject r11, java.util.LinkedList r12) {
        /*
            r8 = this;
            java.lang.String r0 = "newOne"
            kotlin.jvm.internal.o.g(r11, r0)
            java.lang.String r0 = "list"
            kotlin.jvm.internal.o.g(r12, r0)
            java.util.Iterator r0 = r12.iterator()
            r1 = 0
            r2 = r1
        L10:
            boolean r3 = r0.hasNext()
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L49
            java.lang.Object r3 = r0.next()
            r45.p21 r3 = (r45.p21) r3
            r6 = 5
            int r6 = r3.getInteger(r6)
            if (r6 != 0) goto L42
            int r6 = r3.getInteger(r1)
            if (r6 == r4) goto L42
            com.tencent.mm.protobuf.f r3 = r3.getCustom(r4)
            com.tencent.mm.protocal.protobuf.FinderObject r3 = (com.tencent.mm.protocal.protobuf.FinderObject) r3
            if (r3 == 0) goto L3d
            long r6 = r3.getId()
            int r3 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r3 != 0) goto L3d
            r3 = r5
            goto L3e
        L3d:
            r3 = r1
        L3e:
            if (r3 == 0) goto L42
            r3 = r5
            goto L43
        L42:
            r3 = r1
        L43:
            if (r3 == 0) goto L46
            goto L4a
        L46:
            int r2 = r2 + 1
            goto L10
        L49:
            r2 = -1
        L4a:
            if (r2 < 0) goto L56
            java.lang.Object r9 = r12.get(r2)
            r45.p21 r9 = (r45.p21) r9
            r9.set(r4, r11)
            r1 = r5
        L56:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bu2.y.b(long, com.tencent.mm.protocal.protobuf.FinderObject, java.util.LinkedList):boolean");
    }
}
