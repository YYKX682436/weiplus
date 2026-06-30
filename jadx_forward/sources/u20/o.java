package u20;

/* loaded from: classes9.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f505446d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f505447e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u20.p f505448f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f505449g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f505450h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(android.content.Context context, u20.p pVar, java.lang.String str, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f505447e = context;
        this.f505448f = pVar;
        this.f505449g = str;
        this.f505450h = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new u20.o(this.f505447e, this.f505448f, this.f505449g, this.f505450h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((u20.o) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f505446d;
        u20.p pVar = this.f505448f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            v20.n nVar = v20.n.f514319a;
            android.content.Context context = this.f505447e;
            u20.n nVar2 = pVar.f505451d;
            java.lang.String str = nVar2.f505445b;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = nVar2.f505444a;
            java.lang.String str3 = str2 == null ? "" : str2;
            java.lang.String str4 = this.f505449g;
            boolean z17 = this.f505450h;
            this.f505446d = 1;
            obj = nVar.a(context, str, str3, str4, z17, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        jz5.l lVar = (jz5.l) obj;
        boolean booleanValue = ((java.lang.Boolean) lVar.f384366d).booleanValue();
        java.lang.String str5 = (java.lang.String) lVar.f384367e;
        if (booleanValue) {
            pVar.d(com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str5));
        } else {
            pVar.a();
        }
        return jz5.f0.f384359a;
    }
}
