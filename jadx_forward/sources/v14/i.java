package v14;

/* loaded from: classes.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f514080d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v14.p f514081e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f514082f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(v14.p pVar, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f514081e = pVar;
        this.f514082f = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new v14.i(this.f514081e, this.f514082f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((v14.i) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r6) {
        /*
            r5 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r5.f514080d
            r2 = 1
            v14.p r3 = r5.f514081e
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            goto L2d
        Lf:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L17:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            java.lang.String r6 = r3.f514111e
            if (r6 != 0) goto L2f
            kv.b0 r6 = r3.f514110d
            r5.f514080d = r2
            hn1.s r6 = (hn1.s) r6
            java.lang.String r1 = r5.f514082f
            java.lang.Object r6 = r6.hj(r1, r5)
            if (r6 != r0) goto L2d
            return r0
        L2d:
            java.lang.String r6 = (java.lang.String) r6
        L2f:
            jz5.f0 r0 = jz5.f0.f384359a
            if (r6 != 0) goto L4b
            androidx.appcompat.app.AppCompatActivity r6 = r3.m158354x19263085()
            int r1 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n
            com.tencent.mm.ui.widget.dialog.e4 r1 = new com.tencent.mm.ui.widget.dialog.e4
            r1.<init>(r6)
            r6 = 2131774682(0x7f104cda, float:1.9180787E38)
            r1.d(r6)
            r6 = 0
            r1.f293312f = r6
            r1.c()
            return r0
        L4b:
            java.lang.Class<zb0.b0> r1 = zb0.b0.class
            i95.m r1 = i95.n0.c(r1)
            zb0.b0 r1 = (zb0.b0) r1
            androidx.appcompat.app.AppCompatActivity r2 = r3.m158354x19263085()
            v14.h r4 = new v14.h
            r4.<init>(r3, r6)
            yb0.g r1 = (yb0.g) r1
            r1.wi(r2, r6, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v14.i.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
