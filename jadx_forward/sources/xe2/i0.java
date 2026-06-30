package xe2;

/* loaded from: classes3.dex */
public final class i0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ch1 f535402d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(r45.ch1 ch1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f535402d = ch1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new xe2.i0(this.f535402d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        xe2.i0 i0Var = (xe2.i0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        i0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0031  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r9) {
        /*
            r8 = this;
            pz5.a r0 = pz5.a.f440719d
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            r45.pi1 r9 = new r45.pi1
            r9.<init>()
            r0 = 4
            r45.ch1 r1 = r8.f535402d
            com.tencent.mm.protobuf.g r0 = r1.m75934xbce7f2f(r0)
            r1 = 0
            if (r0 == 0) goto L19
            byte[] r0 = r0.g()
            goto L1a
        L19:
            r0 = r1
        L1a:
            if (r0 != 0) goto L1e
        L1c:
            r9 = r1
            goto L2f
        L1e:
            r9.mo11468x92b714fd(r0)     // Catch: java.lang.Exception -> L22
            goto L2f
        L22:
            r9 = move-exception
            java.lang.String r0 = ""
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            java.lang.String r2 = "safeParser"
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a(r2, r0, r9)
            goto L1c
        L2f:
            if (r9 == 0) goto L39
            r0 = 0
            com.tencent.mm.protobuf.f r9 = r9.m75936x14adae67(r0)
            r1 = r9
            r45.kv1 r1 = (r45.kv1) r1
        L39:
            r4 = r1
            dk2.ef r9 = dk2.ef.f314905a
            com.tencent.mm.plugin.finder.live.view.k0 r9 = dk2.ef.f314913e
            if (r9 == 0) goto L55
            com.tencent.mm.plugin.finder.live.viewmodel.k4 r0 = new com.tencent.mm.plugin.finder.live.viewmodel.k4
            android.content.Context r3 = r9.getContext()
            java.lang.String r9 = "getContext(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r3, r9)
            r5 = 0
            r6 = 4
            r7 = 0
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            r0.w()
        L55:
            jz5.f0 r9 = jz5.f0.f384359a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: xe2.i0.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
