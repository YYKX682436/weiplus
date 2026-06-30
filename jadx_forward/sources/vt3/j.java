package vt3;

/* loaded from: classes5.dex */
public final class j extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public int f521533d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u26.w f521534e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(u26.w wVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(1, interfaceC29045xdcb5ca57);
        this.f521534e = wVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo2108xaf65a0fc(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new vt3.j(this.f521534e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        return ((vt3.j) mo2108xaf65a0fc((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f521533d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            vt3.l lVar = vt3.l.f521538a;
            this.f521533d = 1;
            obj = vt3.l.a(lVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2 && i17 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        u26.w wVar = this.f521534e;
        if (booleanValue) {
            com.p314xaae8f345.p457x3304c6.p458x9b169b86.C3970x2c87daa4 c3970x2c87daa4 = vt3.l.f521539b;
            java.nio.ByteBuffer f17 = c3970x2c87daa4 != null ? c3970x2c87daa4.f() : null;
            this.f521533d = 3;
            if (wVar.t(f17, this) == aVar) {
                return aVar;
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AssetInfoStatistics", "toBinaryBuffer but init is error");
            this.f521533d = 2;
            if (wVar.t(null, this) == aVar) {
                return aVar;
            }
        }
        return jz5.f0.f384359a;
    }
}
