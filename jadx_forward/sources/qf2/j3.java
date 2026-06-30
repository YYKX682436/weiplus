package qf2;

/* loaded from: classes.dex */
public final class j3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f443958d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xg2.h f443959e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qf2.q3 f443960f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f443961g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ oi2.a f443962h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f443963i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, qf2.q3 q3Var, java.lang.String str, oi2.a aVar) {
        super(2, interfaceC29045xdcb5ca57);
        this.f443959e = hVar;
        this.f443960f = q3Var;
        this.f443961g = str;
        this.f443962h = aVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qf2.j3(this.f443959e, interfaceC29045xdcb5ca57, this.f443960f, this.f443961g, this.f443962h);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((qf2.j3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d3 A[RETURN] */
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
            int r1 = r9.f443958d
            r2 = 2
            r3 = 0
            qf2.q3 r4 = r9.f443960f
            r5 = 1
            if (r1 == 0) goto L24
            if (r1 == r5) goto L1c
            if (r1 != r2) goto L14
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto Ld4
        L14:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1c:
            java.lang.Object r1 = r9.f443963i
            r45.m52 r1 = (r45.m52) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L89
        L24:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            xg2.h r10 = r9.f443959e
            xg2.i r10 = (xg2.i) r10
            java.lang.Object r10 = r10.f535926b
            r1 = r10
            r45.m52 r1 = (r45.m52) r1
            com.tencent.mm.protobuf.g r10 = r1.m75934xbce7f2f(r5)
            r6 = 0
            if (r10 != 0) goto L5e
            r10 = 4
            com.tencent.mm.protobuf.f r7 = r1.m75936x14adae67(r10)
            r45.qp1 r7 = (r45.qp1) r7
            if (r7 == 0) goto L5e
            com.tencent.mm.protobuf.f r10 = r1.m75936x14adae67(r10)
            r45.qp1 r10 = (r45.qp1) r10
            if (r10 == 0) goto L59
            java.lang.String r10 = r10.m75945x2fec8307(r5)
            if (r10 == 0) goto L59
            android.content.Context r0 = r4.O6()
            android.widget.Toast r10 = db5.t7.m123883x26a183b(r0, r10, r6)
            r10.show()
        L59:
            r4.b7()
            goto Ld4
        L5e:
            java.lang.Class<zy2.b6> r10 = zy2.b6.class
            i95.m r10 = i95.n0.c(r10)
            zy2.b6 r10 = (zy2.b6) r10
            android.content.Context r7 = r4.O6()
            com.tencent.mm.protobuf.g r8 = r1.m75934xbce7f2f(r5)
            if (r8 == 0) goto L75
            byte[] r8 = r8.g()
            goto L76
        L75:
            r8 = r3
        L76:
            if (r8 != 0) goto L7a
            byte[] r8 = new byte[r6]
        L7a:
            r9.f443963i = r1
            r9.f443958d = r5
            c61.l7 r10 = (c61.l7) r10
            java.lang.String r5 = r9.f443961g
            java.lang.Object r10 = r10.Mk(r7, r8, r5, r9)
            if (r10 != r0) goto L89
            return r0
        L89:
            jz5.l r10 = (jz5.l) r10
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "applyPayMicRequest success, pay result: "
            r5.<init>(r6)
            r5.append(r10)
            java.lang.String r6 = " session_id: "
            r5.append(r6)
            r6 = 3
            java.lang.String r7 = r1.m75945x2fec8307(r6)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            java.lang.String r7 = "FinderLivePayMicControl"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r7, r5)
            java.lang.Class<mm2.o4> r5 = mm2.o4.class
            androidx.lifecycle.c1 r5 = r4.m56788xbba4bfc0(r5)
            mm2.o4 r5 = (mm2.o4) r5
            java.lang.String r1 = r1.m75945x2fec8307(r6)
            if (r1 != 0) goto Lbb
            java.lang.String r1 = ""
        Lbb:
            r5.P7(r1)
            kotlinx.coroutines.p0 r1 = p3325xe03a0797.p3326xc267989b.q1.f392101a
            kotlinx.coroutines.g3 r1 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a
            qf2.h3 r5 = new qf2.h3
            oi2.a r6 = r9.f443962h
            r5.<init>(r10, r4, r6, r3)
            r9.f443963i = r3
            r9.f443958d = r2
            java.lang.Object r10 = p3325xe03a0797.p3326xc267989b.l.g(r1, r5, r9)
            if (r10 != r0) goto Ld4
            return r0
        Ld4:
            jz5.f0 r10 = jz5.f0.f384359a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: qf2.j3.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
