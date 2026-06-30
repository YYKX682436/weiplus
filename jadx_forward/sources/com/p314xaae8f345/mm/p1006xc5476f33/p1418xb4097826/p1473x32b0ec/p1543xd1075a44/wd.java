package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class wd extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f201705d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f201706e;

    /* renamed from: f, reason: collision with root package name */
    public int f201707f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.h84 f201708g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ce f201709h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wd(r45.h84 h84Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ce ceVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f201708g = h84Var;
        this.f201709h = ceVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.wd(this.f201708g, this.f201709h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.wd) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0088  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r10) {
        /*
            r9 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r9.f201707f
            java.lang.String r2 = "getService(...)"
            java.lang.Class<zy.u> r3 = zy.u.class
            r4 = 2
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L2a
            if (r1 == r5) goto L1e
            if (r1 != r4) goto L16
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto Lb6
        L16:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1e:
            java.lang.Object r1 = r9.f201706e
            r45.g84 r1 = (r45.g84) r1
            java.lang.Object r7 = r9.f201705d
            com.tencent.mm.plugin.finder.live.widget.ce r7 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ce) r7
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L6a
        L2a:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            r45.h84 r10 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.fe.f199875i
            r10 = 4
            r45.h84 r1 = r9.f201708g
            java.util.LinkedList r10 = r1.m75941xfb821914(r10)
            if (r10 == 0) goto L40
            java.lang.Object r10 = kz5.n0.Z(r10)
            r45.g84 r10 = (r45.g84) r10
            r1 = r10
            goto L41
        L40:
            r1 = r6
        L41:
            if (r1 == 0) goto Lb6
            i95.m r10 = i95.n0.c(r3)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r10, r2)
            zy.u r10 = (zy.u) r10
            zy.w r10 = zy.u.p3(r10, r6, r5, r6)
            java.lang.String r7 = r1.m75945x2fec8307(r5)
            com.tencent.mm.plugin.finder.live.widget.ce r8 = r9.f201709h
            r9.f201705d = r8
            r9.f201706e = r1
            r9.f201707f = r5
            bz.a r10 = (bz.a) r10
            bz.w r10 = r10.b()
            java.lang.Object r10 = r10.f(r7, r9)
            if (r10 != r0) goto L69
            return r0
        L69:
            r7 = r8
        L6a:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            r8 = 0
            if (r10 == 0) goto L88
            java.lang.String r10 = r1.m75945x2fec8307(r5)
            java.lang.String r1 = r1.m75945x2fec8307(r4)
            r9.f201705d = r6
            r9.f201706e = r6
            r9.f201707f = r4
            java.lang.Object r10 = r7.i(r10, r8, r1, r9)
            if (r10 != r0) goto Lb6
            return r0
        L88:
            i95.m r10 = i95.n0.c(r3)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r10, r2)
            zy.u r10 = (zy.u) r10
            zy.w r10 = zy.u.p3(r10, r6, r5, r6)
            java.lang.String r0 = r1.m75945x2fec8307(r5)
            boolean r10 = zy.w.Ie(r10, r0, r6, r4, r6)
            r0 = 8
            if (r10 == 0) goto Lac
            android.widget.ImageView r10 = r7.f199526d
            r10.setVisibility(r0)
            com.tencent.mm.ui.widget.progress.RoundProgressBtn r10 = r7.f199527e
            r10.setVisibility(r0)
            goto Lb6
        Lac:
            android.widget.ImageView r10 = r7.f199526d
            r10.setVisibility(r8)
            com.tencent.mm.ui.widget.progress.RoundProgressBtn r10 = r7.f199527e
            r10.setVisibility(r0)
        Lb6:
            jz5.f0 r10 = jz5.f0.f384359a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.wd.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
