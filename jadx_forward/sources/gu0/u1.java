package gu0;

/* loaded from: classes5.dex */
public final class u1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f357351d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f357352e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f357353f;

    /* renamed from: g, reason: collision with root package name */
    public int f357354g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ gu0.k2 f357355h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(gu0.k2 k2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f357355h = k2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gu0.u1(this.f357355h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gu0.u1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 c4167x88133861;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f357354g;
        jz5.f0 f0Var = jz5.f0.f384359a;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                gu0.k2 k2Var = this.f357355h;
                com.p314xaae8f345.p457x3304c6.p479x4179489f.C4152x8b3cf7db c4152x8b3cf7db = k2Var.f357271n;
                if (c4152x8b3cf7db == null || (c4167x88133861 = k2Var.f357270m) == null) {
                    return f0Var;
                }
                com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 m33999xbdf18ae3 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553.m33999xbdf18ae3(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16098x2ccb95b5, c4167x88133861.l());
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m33999xbdf18ae3, "fromStartEnd(...)");
                this.f357351d = c4152x8b3cf7db;
                this.f357352e = m33999xbdf18ae3;
                this.f357353f = k2Var;
                this.f357354g = 1;
                oz5.n nVar = new oz5.n(pz5.f.b(this));
                c4152x8b3cf7db.m34179xda91516c(m33999xbdf18ae3, k2Var.f357274q, Integer.MAX_VALUE, true, new gu0.t1(nVar));
                if (nVar.a() == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MJCC.Session", "resumePlayback: " + e17.getMessage());
        }
        return f0Var;
    }
}
