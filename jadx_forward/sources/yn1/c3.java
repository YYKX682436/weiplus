package yn1;

/* loaded from: classes11.dex */
public final class c3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yn1.a4 f545159d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f545160e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f545161f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f545162g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f545163h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f545164i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(yn1.a4 a4Var, java.lang.String str, long j17, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, java.util.ArrayList arrayList3, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f545159d = a4Var;
        this.f545160e = str;
        this.f545161f = j17;
        this.f545162g = arrayList;
        this.f545163h = arrayList2;
        this.f545164i = arrayList3;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yn1.c3(this.f545159d, this.f545160e, this.f545161f, this.f545162g, this.f545163h, this.f545164i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yn1.c3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        yn1.a4 a4Var = this.f545159d;
        yn1.a4.a(a4Var);
        xn1.k kVar = new xn1.k();
        co1.g gVar = co1.g.f125301a;
        java.lang.String str = this.f545160e;
        boolean b17 = gVar.b(str);
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (!b17) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.a aVar2 = a4Var.f545142d;
            if (aVar2 != null) {
                aVar2.m(this.f545161f, 0L, new java.util.ArrayList());
            }
            return f0Var;
        }
        java.lang.String str2 = a4Var.f545139a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[filterRestoreMediaAsync] taskId=");
        long j17 = this.f545161f;
        sb6.append(j17);
        sb6.append(", convId=");
        sb6.append(str);
        sb6.append(", scopeTimer_step1=");
        sb6.append(kVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
        jz5.l f17 = gVar.f(str, this.f545162g, this.f545163h, this.f545164i);
        long longValue = ((java.lang.Number) f17.f384366d).longValue();
        java.util.ArrayList arrayList = (java.util.ArrayList) f17.f384367e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(a4Var.f545139a, "[filterRestoreMediaAsync] taskId=" + j17 + ", convId=" + str + ", scopeTimer_step2=" + kVar);
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.a aVar3 = a4Var.f545142d;
        if (aVar3 != null) {
            aVar3.m(this.f545161f, longValue, arrayList);
        }
        return f0Var;
    }
}
