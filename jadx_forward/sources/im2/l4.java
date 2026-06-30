package im2;

/* loaded from: classes2.dex */
public final class l4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f373960d;

    /* renamed from: e, reason: collision with root package name */
    public int f373961e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ im2.p4 f373962f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f373963g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(im2.p4 p4Var, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f373962f = p4Var;
        this.f373963g = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new im2.l4(this.f373962f, this.f373963g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((im2.l4) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x005f  */
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
            int r1 = r13.f373961e
            r2 = 1
            im2.p4 r3 = r13.f373962f
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            java.lang.Object r0 = r13.f373960d
            com.tencent.mm.plugin.finder.assist.d9 r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d9) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            goto L53
        L13:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1b:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            com.tencent.mm.plugin.finder.assist.a9 r4 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d9.f183626f
            androidx.appcompat.app.AppCompatActivity r5 = r3.m158354x19263085()
            androidx.appcompat.app.AppCompatActivity r14 = r3.m158354x19263085()
            android.content.res.Resources r14 = r14.getResources()
            r1 = 2131768164(0x7f103364, float:1.9167567E38)
            java.lang.String r6 = r14.getString(r1)
            r7 = 500(0x1f4, double:2.47E-321)
            r9 = 0
            r10 = 8
            r11 = 0
            com.tencent.mm.plugin.finder.assist.d9 r14 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a9.a(r4, r5, r6, r7, r9, r10, r11)
            r14.a()
            kotlinx.coroutines.f1 r1 = r3.f374031r
            if (r1 == 0) goto L56
            r13.f373960d = r14
            r13.f373961e = r2
            kotlinx.coroutines.g1 r1 = (p3325xe03a0797.p3326xc267989b.g1) r1
            java.lang.Object r1 = r1.k(r13)
            if (r1 != r0) goto L51
            return r0
        L51:
            r0 = r14
            r14 = r1
        L53:
            yl2.k r14 = (yl2.k) r14
            goto L5a
        L56:
            r0 = 0
            r12 = r0
            r0 = r14
            r14 = r12
        L5a:
            r0.b()
            if (r14 == 0) goto L66
            int r0 = r3.f374021e
            int r1 = r13.f373963g
            im2.p4.O6(r3, r1, r0, r14)
        L66:
            jz5.f0 r14 = jz5.f0.f384359a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: im2.l4.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
