package yx;

/* loaded from: classes3.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f548581d;

    /* renamed from: e, reason: collision with root package name */
    public int f548582e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f548583f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f548584g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(android.content.Context context, n0.v2 v2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f548583f = context;
        this.f548584g = v2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yx.m(this.f548583f, this.f548584g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx.m) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        yx.m mVar;
        int i17;
        pz5.a aVar = pz5.a.f440719d;
        int i18 = this.f548582e;
        if (i18 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            mVar = this;
            i17 = 1;
        } else {
            if (i18 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i19 = this.f548581d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            i17 = i19;
            mVar = this;
        }
        while (true) {
            int i27 = i17 + 1;
            java.lang.String str = "";
            for (int i28 = 0; i28 < i17 % 4; i28++) {
                str = str + '.';
            }
            java.lang.String string = mVar.f548583f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ngu, str);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            mVar.f548584g.mo148714x53d8522f(string);
            mVar.f548581d = i27;
            mVar.f548582e = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(500L, mVar) == aVar) {
                return aVar;
            }
            i17 = i27;
        }
    }
}
