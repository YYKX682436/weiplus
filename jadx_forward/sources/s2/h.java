package s2;

/* loaded from: classes14.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f483762d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f483763e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s2.b0 f483764f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(s2.b0 b0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f483764f = b0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        s2.h hVar = new s2.h(this.f483764f, interfaceC29045xdcb5ca57);
        hVar.f483763e = obj;
        return hVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((s2.h) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0042 -> B:5:0x0045). Please report as a decompilation issue!!! */
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
            int r1 = r9.f483762d
            r2 = 1
            if (r1 == 0) goto L1a
            if (r1 != r2) goto L12
            java.lang.Object r1 = r9.f483763e
            kotlinx.coroutines.y0 r1 = (p3325xe03a0797.p3326xc267989b.y0) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            r10 = r9
            goto L45
        L12:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1a:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            java.lang.Object r10 = r9.f483763e
            kotlinx.coroutines.y0 r10 = (p3325xe03a0797.p3326xc267989b.y0) r10
            r1 = r10
            r10 = r9
        L23:
            boolean r3 = p3325xe03a0797.p3326xc267989b.z0.h(r1)
            if (r3 == 0) goto L5f
            s2.g r3 = s2.g.f483755d
            r10.f483763e = r1
            r10.f483762d = r2
            oz5.l r4 = r10.mo48699x76847179()
            int r5 = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.b3.f92048c0
            androidx.compose.ui.platform.a3 r5 = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.a3.f92042d
            oz5.i r4 = r4.get(r5)
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(r4)
            java.lang.Object r3 = n0.s2.b(r3, r10)
            if (r3 != r0) goto L45
            return r0
        L45:
            s2.b0 r3 = r10.f483764f
            int[] r4 = r3.D
            r5 = 0
            r6 = r4[r5]
            r7 = r4[r2]
            android.view.View r8 = r3.f483733q
            r8.getLocationOnScreen(r4)
            r5 = r4[r5]
            if (r6 != r5) goto L5b
            r4 = r4[r2]
            if (r7 == r4) goto L23
        L5b:
            r3.l()
            goto L23
        L5f:
            jz5.f0 r10 = jz5.f0.f384359a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: s2.h.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
