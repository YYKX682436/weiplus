package mx0;

/* loaded from: classes5.dex */
public final class o8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f413729d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rx0.k f413730e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced f413731f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o8(java.lang.String str, rx0.k kVar, com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f413729d = str;
        this.f413730e = kVar;
        this.f413731f = c10977x8e40eced;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mx0.o8(this.f413729d, this.f413730e, this.f413731f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        mx0.o8 o8Var = (mx0.o8) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        o8Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.util.List list;
        int i17;
        java.util.List<com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.p472x58ceaf0.C4094x2bd762a1> list2;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.String h17 = ai3.d.h("mp4");
        zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        ((yb0.g) b0Var).getClass();
        boolean z17 = com.p314xaae8f345.mm.p1004x2137b148.C11325x6ace8b92.g(context, this.f413729d, h17, null) != null;
        pp0.h0 h0Var = (pp0.h0) i95.n0.c(pp0.h0.class);
        com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3981x30b9dbd5 c3981x30b9dbd5 = this.f413730e.f482469c;
        if (c3981x30b9dbd5 == null || (list2 = c3981x30b9dbd5.f129356g) == null) {
            list = kz5.p0.f395529d;
        } else {
            list = new java.util.ArrayList();
            for (com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.p472x58ceaf0.C4094x2bd762a1 c4094x2bd762a1 : list2) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c4094x2bd762a1);
                com.p314xaae8f345.mm.p839xf223db21.C10858x5d0663fa a17 = pp0.j0.a(c4094x2bd762a1);
                if (a17 != null) {
                    list.add(a17);
                }
            }
        }
        ((yy0.m0) h0Var).wi(list);
        if (z17) {
            q75.c.f(h17, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            i17 = com.p314xaae8f345.mm.R.C30867xcad56011.oir;
        } else {
            i17 = com.p314xaae8f345.mm.R.C30867xcad56011.oiq;
        }
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced = this.f413731f;
        db5.t7.i(c10977x8e40eced.getContext(), c10977x8e40eced.getContext().getString(i17), 0);
        return jz5.f0.f384359a;
    }
}
