package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class j4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f108084d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(java.util.List list) {
        super(1);
        this.f108084d = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0048 A[EDGE_INSN: B:15:0x0048->B:16:0x0048 BREAK  A[LOOP:0: B:2:0x000d->B:22:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[LOOP:0: B:2:0x000d->B:22:?, LOOP_END, SYNTHETIC] */
    @Override // yz5.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(java.lang.Object r10) {
        /*
            r9 = this;
            com.tencent.mm.plugin.finder.storage.FinderItem r10 = (com.tencent.mm.plugin.finder.storage.FinderItem) r10
            java.lang.String r0 = "removeIt"
            kotlin.jvm.internal.o.g(r10, r0)
            java.util.List r0 = r9.f108084d
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L47
            java.lang.Object r1 = r0.next()
            r4 = r1
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = (com.tencent.mm.plugin.finder.storage.FinderItem) r4
            long r5 = r4.getLocalId()
            long r7 = r10.getLocalId()
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L43
            long r5 = r4.field_id
            r7 = 0
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 == 0) goto L36
            long r7 = r10.field_id
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L43
        L36:
            int r4 = r4.getCreateTime()
            int r5 = r10.getCreateTime()
            if (r4 != r5) goto L41
            goto L43
        L41:
            r4 = r2
            goto L44
        L43:
            r4 = r3
        L44:
            if (r4 == 0) goto Ld
            goto L48
        L47:
            r1 = 0
        L48:
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = (com.tencent.mm.plugin.finder.storage.FinderItem) r1
            if (r1 == 0) goto L4d
            r2 = r3
        L4d:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r2)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.model.j4.invoke(java.lang.Object):java.lang.Object");
    }
}
