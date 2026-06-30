package gx0;

/* loaded from: classes5.dex */
public final class q0 implements jx0.h0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gx0.u0 f358393a;

    public q0(gx0.u0 u0Var) {
        this.f358393a = u0Var;
    }

    @Override // jx0.h0
    public void a(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a seekTime) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(seekTime, "seekTime");
        this.f358393a.G7().X6(seekTime);
    }

    @Override // jx0.h0
    public java.lang.Object b(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.Object d76 = gx0.hf.d7(this.f358393a.G7(), false, interfaceC29045xdcb5ca57, 1, null);
        return d76 == pz5.a.f440719d ? d76 : jz5.f0.f384359a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // jx0.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(boolean r5, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a r6, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof gx0.p0
            if (r0 == 0) goto L13
            r0 = r7
            gx0.p0 r0 = (gx0.p0) r0
            int r1 = r0.f358344f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f358344f = r1
            goto L18
        L13:
            gx0.p0 r0 = new gx0.p0
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f358342d
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f358344f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L4c
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            gx0.u0 r7 = r4.f358393a
            if (r5 == 0) goto L45
            gx0.hf r5 = r7.G7()
            r0.f358344f = r3
            r6 = 0
            r7 = 0
            java.lang.Object r5 = gx0.hf.d7(r5, r6, r0, r3, r7)
            if (r5 != r1) goto L4c
            return r1
        L45:
            gx0.hf r5 = r7.G7()
            r5.X6(r6)
        L4c:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.q0.c(boolean, com.tencent.maas.model.time.MJTime, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
