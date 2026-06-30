package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes12.dex */
public final class jb implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.y0 f282619d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.f1 f282620e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.e1 f282621f;

    public jb(p3325xe03a0797.p3326xc267989b.y0 y0Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.f1 f1Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.e1 e1Var) {
        this.f282619d = y0Var;
        this.f282620e = f1Var;
        this.f282621f = e1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo771x2f8fd3(mv.c0 r7, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.hb
            if (r0 == 0) goto L13
            r0 = r8
            com.tencent.mm.ui.chatting.gallery.hb r0 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.hb) r0
            int r1 = r0.f282542g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f282542g = r1
            goto L18
        L13:
            com.tencent.mm.ui.chatting.gallery.hb r0 = new com.tencent.mm.ui.chatting.gallery.hb
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f282540e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f282542g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r7 = r0.f282539d
            com.tencent.mm.ui.chatting.gallery.jb r7 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.jb) r7
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L4c
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            kotlinx.coroutines.p0 r8 = p3325xe03a0797.p3326xc267989b.q1.f392103c
            com.tencent.mm.ui.chatting.gallery.ib r2 = new com.tencent.mm.ui.chatting.gallery.ib
            com.tencent.mm.ui.chatting.gallery.e1 r4 = r6.f282621f
            r5 = 0
            r2.<init>(r4, r7, r5)
            r0.f282539d = r6
            r0.f282542g = r3
            java.lang.Object r8 = p3325xe03a0797.p3326xc267989b.l.g(r8, r2, r0)
            if (r8 != r1) goto L4b
            return r1
        L4b:
            r7 = r6
        L4c:
            kotlinx.coroutines.y0 r0 = r7.f282619d
            p3325xe03a0797.p3326xc267989b.z0.g(r0)
            com.tencent.mm.ui.chatting.gallery.f1 r7 = r7.f282620e
            com.tencent.mm.ui.chatting.gallery.t2$$a r7 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.C21798x679ece3) r7
            com.tencent.mm.ui.chatting.gallery.ta r1 = r7.f282928c
            com.tencent.mm.storage.f9 r2 = r7.f282929d
            int r3 = r7.f282930e
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            com.tencent.mm.ui.chatting.gallery.t2 r0 = r7.f282926a
            r0.getClass()
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L7b
            java.lang.String r8 = "MicroMsg.ImageGalleryHolderImage"
            java.lang.String r4 = "getImageFileFromBackupPackage initViewByState"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r8, r4)
            m11.b0 r7 = r7.f282927b
            int r8 = r7.f404169d
            r7.z(r8)
            r4 = 4
            r5 = 0
            r0.B(r1, r2, r3, r4, r5)
        L7b:
            jz5.f0 r7 = jz5.f0.f384359a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.jb.mo771x2f8fd3(mv.c0, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
