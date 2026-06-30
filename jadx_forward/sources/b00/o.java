package b00;

/* loaded from: classes9.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f98270d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.lh0 f98271e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f98272f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(r45.lh0 lh0Var, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f98271e = lh0Var;
        this.f98272f = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new b00.o(this.f98271e, this.f98272f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((b00.o) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f98270d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            c00.z2 z2Var = (c00.z2) i95.n0.c(c00.z2.class);
            bw5.ne0 ne0Var = new bw5.ne0();
            r45.lh0 lh0Var = this.f98271e;
            ne0Var.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.b8.c(lh0Var.f461008f));
            java.lang.String str = lh0Var.f461010h;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str == null) {
                str = "";
            }
            ne0Var.f112190i = str;
            boolean[] zArr = ne0Var.f112192n;
            zArr[6] = true;
            ne0Var.f112189h = this.f98272f;
            zArr[5] = true;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(lh0Var.f461009g)) {
                bw5.x7 x7Var = new bw5.x7();
                try {
                    x7Var.mo11468x92b714fd(android.util.Base64.decode(lh0Var.f461009g, 0));
                    bw5.u7 f17 = x7Var.f();
                    ne0Var.f112188g = f17 != null ? f17.m13092xfb83cc9b() : null;
                    zArr[4] = true;
                } catch (java.lang.Exception unused) {
                }
            }
            this.f98270d = 1;
            if (((b00.r) z2Var).vj(ne0Var, 6, false, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
