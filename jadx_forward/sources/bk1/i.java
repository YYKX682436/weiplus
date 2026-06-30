package bk1;

/* loaded from: classes4.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f102842d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f102843e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f102844f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f102845g;

    /* renamed from: h, reason: collision with root package name */
    public int f102846h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f102847i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ak1.a f102848m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ bk1.w f102849n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1204xed412388.p1205xbf8a9d65.C12718xe1f0c9d6 f102850o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, ak1.a aVar, bk1.w wVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1204xed412388.p1205xbf8a9d65.C12718xe1f0c9d6 c12718xe1f0c9d6, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f102847i = h0Var;
        this.f102848m = aVar;
        this.f102849n = wVar;
        this.f102850o = c12718xe1f0c9d6;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new bk1.i(this.f102847i, this.f102848m, this.f102849n, this.f102850o, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((bk1.i) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var;
        ak1.a aVar;
        bk1.w wVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1204xed412388.p1205xbf8a9d65.C12718xe1f0c9d6 c12718xe1f0c9d6;
        bk1.y yVar;
        pz5.a aVar2 = pz5.a.f440719d;
        int i17 = this.f102846h;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            h0Var = this.f102847i;
            java.lang.Integer num = (java.lang.Integer) h0Var.f391656d;
            if (num == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPrivacyManagePage", "onLoadMore, fetchToken is null, not need");
                return f0Var;
            }
            bk1.e0 e0Var = bk1.e0.f102830a;
            int intValue = num.intValue();
            aVar = this.f102848m;
            this.f102842d = aVar;
            this.f102843e = h0Var;
            bk1.w wVar2 = this.f102849n;
            this.f102844f = wVar2;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1204xed412388.p1205xbf8a9d65.C12718xe1f0c9d6 c12718xe1f0c9d62 = this.f102850o;
            this.f102845g = c12718xe1f0c9d62;
            this.f102846h = 1;
            obj = e0Var.a(intValue, this);
            if (obj == aVar2) {
                return aVar2;
            }
            wVar = wVar2;
            c12718xe1f0c9d6 = c12718xe1f0c9d62;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c12718xe1f0c9d6 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1204xed412388.p1205xbf8a9d65.C12718xe1f0c9d6) this.f102845g;
            wVar = (bk1.w) this.f102844f;
            h0Var = (p3321xbce91901.jvm.p3324x21ffc6bd.h0) this.f102843e;
            aVar = (ak1.a) this.f102842d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        bk1.f0 f0Var2 = (bk1.f0) obj;
        bk1.d dVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1204xed412388.p1205xbf8a9d65.C12718xe1f0c9d6.f171461e;
        java.lang.Integer num2 = null;
        if (f0Var2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPrivacyManagePage", "onSecondTimesFetched, fetchResp is empty");
            aVar.a(false);
            h0Var.f391656d = null;
        } else {
            int i18 = f0Var2.f102834a;
            aVar.a(1 == i18);
            if ((1 == i18) && (yVar = (bk1.y) kz5.n0.k0(f0Var2.f102835b)) != null) {
                num2 = java.lang.Integer.valueOf(yVar.f102894c);
            }
            h0Var.f391656d = num2;
            wVar.x(c12718xe1f0c9d6.m0(f0Var2));
        }
        return f0Var;
    }
}
