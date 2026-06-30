package vt3;

/* loaded from: classes5.dex */
public final class b extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public int f521519d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f521520e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(yz5.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(1, interfaceC29045xdcb5ca57);
        this.f521520e = aVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo2108xaf65a0fc(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new vt3.b(this.f521520e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        return ((vt3.b) mo2108xaf65a0fc((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f521519d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            vt3.l lVar = vt3.l.f521538a;
            this.f521519d = 1;
            obj = vt3.l.a(lVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (booleanValue) {
            this.f521520e.mo152xb9724478();
            return f0Var;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AssetInfoStatistics", "doAfterReady but init is error");
        return f0Var;
    }
}
