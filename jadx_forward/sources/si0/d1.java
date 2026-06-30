package si0;

/* loaded from: classes4.dex */
public final class d1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f489584d;

    /* renamed from: e, reason: collision with root package name */
    public int f489585e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ si0.m1 f489586f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f489587g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f489588h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f489589i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(si0.m1 m1Var, java.util.Map map, yz5.l lVar, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f489586f = m1Var;
        this.f489587g = map;
        this.f489588h = lVar;
        this.f489589i = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new si0.d1(this.f489586f, this.f489587g, this.f489588h, this.f489589i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((si0.d1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0087  */
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
            int r1 = r13.f489585e
            yz5.l r2 = r13.f489588h
            java.lang.String r3 = "object_buffer"
            jz5.f0 r4 = jz5.f0.f384359a
            long r5 = r13.f489589i
            r7 = 2
            r8 = 1
            si0.m1 r9 = r13.f489586f
            java.util.Map r10 = r13.f489587g
            r11 = 0
            if (r1 == 0) goto L32
            if (r1 == r8) goto L2a
            if (r1 != r7) goto L22
            java.lang.Object r0 = r13.f489584d
            com.tencent.mm.ui.widget.dialog.u3 r0 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            goto L80
        L22:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L2a:
            java.lang.Object r1 = r13.f489584d
            android.content.Context r1 = (android.content.Context) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            goto L4e
        L32:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            android.content.Context r1 = r9.i()
            if (r1 != 0) goto L3c
            return r4
        L3c:
            kotlinx.coroutines.p0 r14 = p3325xe03a0797.p3326xc267989b.q1.f392103c
            si0.b1 r12 = new si0.b1
            r12.<init>(r5, r11)
            r13.f489584d = r1
            r13.f489585e = r8
            java.lang.Object r14 = p3325xe03a0797.p3326xc267989b.l.g(r14, r12, r13)
            if (r14 != r0) goto L4e
            return r0
        L4e:
            com.tencent.mm.plugin.sns.storage.SnsInfo r14 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) r14
            if (r14 == 0) goto L60
            byte[] r14 = r14.f68881x4c58c87d
            java.lang.String r0 = "field_attrBuf"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r14, r0)
            r10.put(r3, r14)
            r9.g(r10, r2)
            goto L9d
        L60:
            r14 = 2131756166(0x7f100486, float:1.9143232E38)
            java.lang.String r14 = i65.a.r(r1, r14)
            r8 = 0
            com.tencent.mm.ui.widget.dialog.u3 r14 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(r1, r14, r8, r8, r11)
            kotlinx.coroutines.p0 r1 = p3325xe03a0797.p3326xc267989b.q1.f392103c
            si0.c1 r8 = new si0.c1
            r8.<init>(r5, r11)
            r13.f489584d = r14
            r13.f489585e = r7
            java.lang.Object r1 = p3325xe03a0797.p3326xc267989b.l.g(r1, r8, r13)
            if (r1 != r0) goto L7e
            return r0
        L7e:
            r0 = r14
            r14 = r1
        L80:
            r45.n96 r14 = (r45.n96) r14
            r0.dismiss()
            if (r14 == 0) goto L89
            com.tencent.mm.protocal.protobuf.SnsObject r11 = r14.f462719d
        L89:
            if (r11 == 0) goto L9d
            com.tencent.mm.protocal.protobuf.SnsObject r14 = r14.f462719d
            byte[] r14 = r14.mo14344x5f01b1f6()
            java.lang.String r0 = "toByteArray(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r14, r0)
            r10.put(r3, r14)
            r9.g(r10, r2)
        L9d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: si0.d1.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
