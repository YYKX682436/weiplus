package ro5;

/* loaded from: classes14.dex */
public final class l0 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public int f479765d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ int f479766e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f479767f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ro5.m1 f479768g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(ro5.m1 m1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(3, interfaceC29045xdcb5ca57);
        this.f479768g = m1Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj).intValue();
        ro5.l0 l0Var = new ro5.l0(this.f479768g, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj3);
        l0Var.f479766e = intValue;
        l0Var.f479767f = (yz5.l) obj2;
        return l0Var.mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f479765d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            int i18 = this.f479766e;
            yz5.l lVar = (yz5.l) this.f479767f;
            int i19 = i18 | 268435456;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MVR.VoIPMPRenderLogic", "get decoder surfaceTexture for " + i18 + ", " + i19);
            ro5.m1 m1Var = this.f479768g;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("hw_decoder_");
            sb6.append(i18);
            java.lang.String sb7 = sb6.toString();
            ro5.m1 m1Var2 = this.f479768g;
            yo5.e eVar = (yo5.e) m1Var2.f479775d.f537331i.mo141623x754a37bb();
            ro5.k0 k0Var = new ro5.k0(lVar, m1Var2, i18);
            this.f479765d = 1;
            obj = m1Var.e(sb7, i19, eVar, k0Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return obj;
    }
}
