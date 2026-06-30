package tk4;

/* loaded from: classes11.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f501508d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f501509e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f501510f;

    /* renamed from: g, reason: collision with root package name */
    public int f501511g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2285xb446ff0.C18711x7115b73a f501512h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f501513i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2285xb446ff0.C18711x7115b73a c18711x7115b73a, android.content.Intent intent, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f501512h = c18711x7115b73a;
        this.f501513i = intent;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new tk4.g(this.f501512h, this.f501513i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((tk4.g) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2285xb446ff0.C18711x7115b73a c18711x7115b73a;
        android.content.Intent intent;
        java.lang.Object obj2;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f501511g;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2285xb446ff0.C18711x7115b73a c18711x7115b73a2 = this.f501512h;
            p3325xe03a0797.p3326xc267989b.p3332x361a9b.d dVar = c18711x7115b73a2.f256171J;
            this.f501508d = dVar;
            android.content.Intent intent2 = this.f501513i;
            this.f501509e = intent2;
            this.f501510f = c18711x7115b73a2;
            this.f501511g = 1;
            p3325xe03a0797.p3326xc267989b.p3332x361a9b.k kVar = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) dVar;
            if (kVar.b(null, this) == aVar) {
                return aVar;
            }
            c18711x7115b73a = c18711x7115b73a2;
            intent = intent2;
            obj2 = kVar;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c18711x7115b73a = (com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2285xb446ff0.C18711x7115b73a) this.f501510f;
            intent = (android.content.Intent) this.f501509e;
            java.lang.Object obj3 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.d) this.f501508d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            obj2 = obj3;
        }
        try {
            java.lang.String action = intent.getAction();
            if (kz5.n0.O(c18711x7115b73a.L, action)) {
                java.lang.String m40061x1de3608b = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40061x1de3608b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c18711x7115b73a.f256172a, "audioPushStatusChange on network changed: " + m40061x1de3608b);
                java.lang.String str = c18711x7115b73a.E;
                if (str != null && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m40061x1de3608b, str) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m40061x1de3608b, "NON_NETWORK")) {
                    c18711x7115b73a.f(null);
                }
                c18711x7115b73a.E = m40061x1de3608b;
            } else if (kz5.n0.O(c18711x7115b73a.M, action)) {
                c18711x7115b73a.e(null);
            }
            ((p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) obj2).d(null);
            return jz5.f0.f384359a;
        } catch (java.lang.Throwable th6) {
            ((p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) obj2).d(null);
            throw th6;
        }
    }
}
