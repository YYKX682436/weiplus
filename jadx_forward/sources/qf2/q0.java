package qf2;

/* loaded from: classes3.dex */
public final class q0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f444073d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qf2.v0 f444074e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(qf2.v0 v0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f444074e = v0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qf2.q0(this.f444074e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((qf2.q0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0038 -> B:5:0x003c). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r8) {
        /*
            r7 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r7.f444073d
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            r1 = r0
            r0 = r7
            goto L3c
        Lf:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L17:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            r3 = 0
            r8 = r7
        L1d:
            java.lang.Class<mm2.c1> r1 = mm2.c1.class
            qf2.v0 r5 = r8.f444074e
            androidx.lifecycle.c1 r1 = r5.m56788xbba4bfc0(r1)
            mm2.c1 r1 = (mm2.c1) r1
            boolean r1 = r1.a8()
            if (r1 == 0) goto L45
            r8.f444073d = r2
            java.lang.String r1 = "timeSEISync"
            java.lang.Object r1 = qf2.v0.a7(r5, r3, r1, r8)
            if (r1 != r0) goto L38
            return r0
        L38:
            r6 = r0
            r0 = r8
            r8 = r1
            r1 = r6
        L3c:
            java.lang.Number r8 = (java.lang.Number) r8
            long r3 = r8.longValue()
            r8 = r0
            r0 = r1
            goto L1d
        L45:
            jz5.f0 r8 = jz5.f0.f384359a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: qf2.q0.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
