package u61;

/* loaded from: classes4.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f506446d;

    /* renamed from: e, reason: collision with root package name */
    public int f506447e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f506448f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f506449g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.gn4 f506450h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(yz5.l lVar, android.content.Context context, r45.gn4 gn4Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f506448f = lVar;
        this.f506449g = context;
        this.f506450h = gn4Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new u61.m(this.f506448f, this.f506449g, this.f506450h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((u61.m) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        yz5.l lVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f506447e;
        yz5.l lVar2 = this.f506448f;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                u61.o oVar = u61.o.f506457a;
                android.content.Context context = this.f506449g;
                r45.gn4 gn4Var = this.f506450h;
                this.f506446d = lVar2;
                this.f506447e = 1;
                obj = oVar.b(context, gn4Var, "BeforeReg", this);
                if (obj == aVar) {
                    return aVar;
                }
                lVar = lVar2;
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lVar = (yz5.l) this.f506446d;
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            lVar.mo146xb9724478(obj);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GateWayRegHelper", "reqSimMobile error: " + e17.getMessage());
            lVar2.mo146xb9724478(null);
        }
        return jz5.f0.f384359a;
    }
}
