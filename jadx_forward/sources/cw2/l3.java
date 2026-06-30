package cw2;

/* loaded from: classes2.dex */
public final class l3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f305361d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f305362e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f305363f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.nw1 f305364g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f305365h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15182x1607686b f305366i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(java.lang.Long l17, java.lang.String str, r45.nw1 nw1Var, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15182x1607686b c15182x1607686b, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f305362e = l17;
        this.f305363f = str;
        this.f305364g = nw1Var;
        this.f305365h = str2;
        this.f305366i = c15182x1607686b;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new cw2.l3(this.f305362e, this.f305363f, this.f305364g, this.f305365h, this.f305366i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((cw2.l3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f305361d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
            long longValue = this.f305362e.longValue();
            java.lang.String str = this.f305363f;
            long m75942xfb822ef2 = this.f305364g.m75942xfb822ef2(0);
            java.lang.String str2 = this.f305365h;
            android.content.Context context = this.f305366i.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            this.f305361d = 1;
            obj = ((b92.d1) zbVar).Bi(longValue, str, m75942xfb822ef2, str2, context, this);
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
