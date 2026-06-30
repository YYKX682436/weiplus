package mx0;

/* loaded from: classes5.dex */
public final class m0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f413675d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mx0.e1 f413676e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.p472x58ceaf0.C4094x2bd762a1 f413677f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f413678g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4084x74642117 f413679h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3978x9b06196b f413680i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.l f413681m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(mx0.e1 e1Var, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.p472x58ceaf0.C4094x2bd762a1 c4094x2bd762a1, java.lang.String str, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4084x74642117 c4084x74642117, com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3978x9b06196b c3978x9b06196b, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f413676e = e1Var;
        this.f413677f = c4094x2bd762a1;
        this.f413678g = str;
        this.f413679h = c4084x74642117;
        this.f413680i = c3978x9b06196b;
        this.f413681m = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mx0.m0(this.f413676e, this.f413677f, this.f413678g, this.f413679h, this.f413680i, this.f413681m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((mx0.m0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f413675d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            mx0.e1 e1Var = this.f413676e;
            com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.p472x58ceaf0.C4094x2bd762a1 c4094x2bd762a1 = this.f413677f;
            java.lang.String str = this.f413678g;
            com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4084x74642117 c4084x74642117 = this.f413679h;
            com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3978x9b06196b c3978x9b06196b = this.f413680i;
            this.f413675d = 1;
            obj = mx0.e1.a(e1Var, c4094x2bd762a1, str, c4084x74642117, c3978x9b06196b, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        this.f413676e.f(booleanValue ? mx0.d0.f413428f : mx0.d0.f413426d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaterialImportHelper", "enterImportPreview: after beginUseAssetInput importPreviewState = " + this.f413676e.f413468b);
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
        mx0.l0 l0Var = new mx0.l0(this.f413676e, this.f413679h, booleanValue, this.f413681m, null);
        this.f413675d = 2;
        if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, l0Var, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
