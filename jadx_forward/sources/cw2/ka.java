package cw2;

/* loaded from: classes2.dex */
public final class ka extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f305345d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f305346e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f305347f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.nw1 f305348g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f305349h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15201xe049f190 f305350i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka(java.lang.Long l17, java.lang.String str, r45.nw1 nw1Var, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15201xe049f190 c15201xe049f190, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f305346e = l17;
        this.f305347f = str;
        this.f305348g = nw1Var;
        this.f305349h = str2;
        this.f305350i = c15201xe049f190;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new cw2.ka(this.f305346e, this.f305347f, this.f305348g, this.f305349h, this.f305350i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((cw2.ka) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f305345d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
            long longValue = this.f305346e.longValue();
            java.lang.String str = this.f305347f;
            long m75942xfb822ef2 = this.f305348g.m75942xfb822ef2(0);
            java.lang.String str2 = this.f305349h;
            android.content.Context context = this.f305350i.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            this.f305345d = 1;
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
