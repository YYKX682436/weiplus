package im2;

/* loaded from: classes3.dex */
public final class d6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f373828d;

    /* renamed from: e, reason: collision with root package name */
    public int f373829e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f373830f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.f1 f373831g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ im2.h6 f373832h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(p3325xe03a0797.p3326xc267989b.f1 f1Var, im2.h6 h6Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f373831g = f1Var;
        this.f373832h = h6Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        im2.d6 d6Var = new im2.d6(this.f373831g, this.f373832h, interfaceC29045xdcb5ca57);
        d6Var.f373830f = obj;
        return d6Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((im2.d6) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0097  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r14) {
        /*
            r13 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r13.f373829e
            r2 = 0
            r3 = 2
            r4 = 1
            im2.h6 r5 = r13.f373832h
            if (r1 == 0) goto L2f
            if (r1 == r4) goto L23
            if (r1 != r3) goto L1b
            java.lang.Object r0 = r13.f373828d
            r45.l71 r0 = (r45.l71) r0
            java.lang.Object r1 = r13.f373830f
            kotlinx.coroutines.y0 r1 = (p3325xe03a0797.p3326xc267989b.y0) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            goto L68
        L1b:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L23:
            java.lang.Object r1 = r13.f373828d
            kotlinx.coroutines.f1 r1 = (p3325xe03a0797.p3326xc267989b.f1) r1
            java.lang.Object r4 = r13.f373830f
            kotlinx.coroutines.y0 r4 = (p3325xe03a0797.p3326xc267989b.y0) r4
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            goto L56
        L2f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            java.lang.Object r14 = r13.f373830f
            kotlinx.coroutines.y0 r14 = (p3325xe03a0797.p3326xc267989b.y0) r14
            r7 = 0
            r8 = 0
            im2.c6 r9 = new im2.c6
            r9.<init>(r5, r2)
            r10 = 3
            r11 = 0
            r6 = r14
            kotlinx.coroutines.f1 r1 = p3325xe03a0797.p3326xc267989b.l.b(r6, r7, r8, r9, r10, r11)
            r13.f373830f = r14
            r13.f373828d = r1
            r13.f373829e = r4
            kotlinx.coroutines.f1 r4 = r13.f373831g
            java.lang.Object r4 = r4.k(r13)
            if (r4 != r0) goto L53
            return r0
        L53:
            r12 = r4
            r4 = r14
            r14 = r12
        L56:
            r45.l71 r14 = (r45.l71) r14
            r13.f373830f = r4
            r13.f373828d = r14
            r13.f373829e = r3
            java.lang.Object r1 = r1.k(r13)
            if (r1 != r0) goto L65
            return r0
        L65:
            r0 = r14
            r14 = r1
            r1 = r4
        L68:
            r45.wa1 r14 = (r45.wa1) r14
            boolean r1 = p3325xe03a0797.p3326xc267989b.z0.h(r1)
            jz5.f0 r3 = jz5.f0.f384359a
            if (r1 == 0) goto Lbb
            boolean r1 = r5.P
            if (r1 == 0) goto L77
            goto Lbb
        L77:
            if (r0 == 0) goto L8d
            r1 = 21
            com.tencent.mm.protobuf.f r0 = r0.m75936x14adae67(r1)
            r45.z74 r0 = (r45.z74) r0
            if (r0 == 0) goto L8d
            r1 = 0
            long r0 = r0.m75942xfb822ef2(r1)
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r0)
        L8d:
            java.lang.String r0 = "FinderLiveVisitorAfterPagePlugin"
            if (r2 != 0) goto L97
            java.lang.String r14 = "display flag is null!!"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r14)
            return r3
        L97:
            long r1 = r2.longValue()
            int r1 = (int) r1
            r2 = 8
            boolean r1 = pm0.v.z(r1, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "can show shop window = "
            r2.<init>(r4)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r2)
            if (r1 != 0) goto Lb6
            return r3
        Lb6:
            com.tencent.mm.plugin.finder.live.widget.h4 r0 = r5.A
            r0.b(r14)
        Lbb:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: im2.d6.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
