package u61;

/* loaded from: classes4.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f506451d;

    /* renamed from: e, reason: collision with root package name */
    public int f506452e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f506453f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f506454g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.gn4 f506455h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f506456i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(yz5.l lVar, android.content.Context context, r45.gn4 gn4Var, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f506453f = lVar;
        this.f506454g = context;
        this.f506455h = gn4Var;
        this.f506456i = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new u61.n(this.f506453f, this.f506454g, this.f506455h, this.f506456i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((u61.n) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        yz5.l lVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f506452e;
        yz5.l lVar2 = this.f506453f;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                u61.o oVar = u61.o.f506457a;
                android.content.Context context = this.f506454g;
                r45.gn4 gn4Var = this.f506455h;
                java.lang.String str = this.f506456i;
                this.f506451d = lVar2;
                this.f506452e = 1;
                obj = oVar.b(context, gn4Var, str, this);
                if (obj == aVar) {
                    return aVar;
                }
                lVar = lVar2;
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lVar = (yz5.l) this.f506451d;
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
