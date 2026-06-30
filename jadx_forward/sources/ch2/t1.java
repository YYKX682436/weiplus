package ch2;

/* loaded from: classes10.dex */
public final class t1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f122999d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ch2.o2 f123000e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f123001f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f123002g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f123003h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(ch2.o2 o2Var, java.lang.String str, java.lang.String str2, java.lang.String str3, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f123000e = o2Var;
        this.f123001f = str;
        this.f123002g = str2;
        this.f123003h = str3;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ch2.t1(this.f123000e, this.f123001f, this.f123002g, this.f123003h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ch2.t1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f122999d;
        java.lang.String str = this.f123002g;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f122999d = 1;
            obj = this.f123000e.r7(this.f123001f, str, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        r45.by1 by1Var = (r45.by1) obj;
        if (by1Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.d2.e(by1Var, str, this.f123003h, true);
        }
        return jz5.f0.f384359a;
    }
}
