package xm3;

/* loaded from: classes.dex */
public final class k0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f536871d;

    /* renamed from: e, reason: collision with root package name */
    public int f536872e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f536873f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe f536874g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f536875h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f536876i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe, yz5.l lVar, p3325xe03a0797.p3326xc267989b.q qVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f536873f = i17;
        this.f536874g = c16718x7059cefe;
        this.f536875h = lVar;
        this.f536876i = qVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new xm3.k0(this.f536873f, this.f536874g, this.f536875h, this.f536876i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((xm3.k0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x003d -> B:5:0x003e). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r7) {
        /*
            r6 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r6.f536872e
            r2 = 1
            if (r1 == 0) goto L19
            if (r1 != r2) goto L11
            int r1 = r6.f536871d
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            r7 = r1
            r1 = r6
            goto L3e
        L11:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L19:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            r7 = 0
            r1 = r6
        L1e:
            int r3 = r7 + 1
            int r4 = r1.f536873f
            com.tencent.mm.plugin.mvvmlist.MvvmList r5 = r1.f536874g
            if (r7 >= r4) goto L52
            java.util.ArrayList r7 = r5.f233599p
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L52
            if (r3 >= r4) goto L52
            r1.f536871d = r3
            r1.f536872e = r2
            r4 = 10
            java.lang.Object r7 = p3325xe03a0797.p3326xc267989b.k1.b(r4, r1)
            if (r7 != r0) goto L3d
            return r0
        L3d:
            r7 = r3
        L3e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "syncGetSnapshotList retry countL"
            r3.<init>(r4)
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "MicroMsg.Mvvm.MvvmList"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r3)
            goto L1e
        L52:
            java.util.ArrayList r7 = r5.f233599p
            kz5.g0.s(r7)
            java.util.ArrayList r7 = r5.f233599p
            yz5.l r0 = r1.f536875h
            java.lang.Object r7 = r0.mo146xb9724478(r7)
            xm3.d r7 = (xm3.d) r7
            r0 = 0
            kotlinx.coroutines.q r1 = r1.f536876i
            kotlinx.coroutines.r r1 = (p3325xe03a0797.p3326xc267989b.r) r1
            r1.s(r7, r0)
            jz5.f0 r7 = jz5.f0.f384359a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: xm3.k0.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
