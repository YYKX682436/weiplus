package mx0;

/* loaded from: classes5.dex */
public final class u8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f413915d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced f413916e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f413917f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u8(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f413916e = c10977x8e40eced;
        this.f413917f = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mx0.u8(this.f413916e, this.f413917f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((mx0.u8) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        mx0.l1 m47306x2f3509ad;
        mx0.c m47300xde982615;
        mx0.l1 m47306x2f3509ad2;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f413915d;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced = this.f413916e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            c10977x8e40eced.z0();
            if (!this.f413917f) {
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
                e4Var.f293309c = c10977x8e40eced.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.oi9);
                e4Var.c();
                c10977x8e40eced.u0();
                return jz5.f0.f384359a;
            }
            yx0.b8 b8Var = c10977x8e40eced.f151090v;
            this.f413915d = 1;
            obj = b8Var.X(this);
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
        m47306x2f3509ad = c10977x8e40eced.m47306x2f3509ad();
        m47306x2f3509ad.d(booleanValue);
        m47300xde982615 = c10977x8e40eced.m47300xde982615();
        m47300xde982615.mo9067x901b6914(0);
        m47306x2f3509ad2 = c10977x8e40eced.m47306x2f3509ad();
        m47306x2f3509ad2.e();
        return jz5.f0.f384359a;
    }
}
