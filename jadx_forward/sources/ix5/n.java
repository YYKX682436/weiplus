package ix5;

/* loaded from: classes16.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f377188d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f377189e;

    /* renamed from: f, reason: collision with root package name */
    public int f377190f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f377191g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f377192h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f377193i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(java.lang.String str, java.util.Map map, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f377192h = str;
        this.f377193i = map;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        ix5.n nVar = new ix5.n(this.f377192h, this.f377193i, interfaceC29045xdcb5ca57);
        nVar.f377191g = obj;
        return nVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ix5.n) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f377190f;
        if (i17 != 0) {
            if (i17 == 1) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return kz5.q0.f395534d;
            }
            if (i17 == 2) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            if (i17 != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        ix5.h hVar = ix5.h.f377164b;
        hVar.c().mo46953x3164ae("operateWVA running, cmd:" + this.f377192h);
        int i18 = android.os.Build.VERSION.SDK_INT;
        if (i18 < 30) {
            throw new com.p314xaae8f345.wva.p3204x417d0592.C27797x789ae92d(hx5.e.f367251h, "SDK_INT: " + i18);
        }
        java.lang.String str = this.f377192h;
        int hashCode = str.hashCode();
        if (hashCode != -709344037) {
            if (hashCode != 3127582) {
                if (hashCode == 2090862380 && str.equals("bootFramework")) {
                    java.util.Map map = this.f377193i;
                    this.f377190f = 2;
                    obj = ix5.h.a(hVar, map, this);
                    return obj == aVar ? aVar : obj;
                }
            } else if (str.equals("exit")) {
                this.f377190f = 1;
                if (p3325xe03a0797.p3326xc267989b.l.g(ix5.h.f377172j, new ix5.k(null), this) == aVar) {
                    return aVar;
                }
                return kz5.q0.f395534d;
            }
        } else if (str.equals("isBooted")) {
            return kz5.b1.e(new jz5.l(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, java.lang.Boolean.valueOf(hVar.e())));
        }
        com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25532x283aeb1b c25532x283aeb1b = ix5.h.f377170h;
        if (c25532x283aeb1b == null) {
            hVar.c().mo46953x3164ae("operateWVA, framework not booted");
            throw new com.p314xaae8f345.wva.p3204x417d0592.C27797x789ae92d(hx5.e.f367245b);
        }
        java.lang.String str2 = this.f377192h;
        java.util.Map map2 = this.f377193i;
        this.f377191g = c25532x283aeb1b;
        this.f377188d = str2;
        this.f377189e = map2;
        this.f377190f = 3;
        oz5.n nVar = new oz5.n(pz5.f.b(this));
        try {
            android.content.Context context = ix5.h.f377166d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
            c25532x283aeb1b.mo95548xed8d1e6f(context, str2, kz5.c1.t(map2), new ix5.m(nVar));
        } catch (java.lang.Exception e17) {
            ix5.h.f377164b.c().mo46949x5c4d208("process:" + str2 + " failed", (java.lang.Throwable) e17);
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            nVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new com.p314xaae8f345.wva.p3204x417d0592.C27797x789ae92d(hx5.e.f367244a, e17))));
        }
        obj = nVar.a();
        pz5.a aVar2 = pz5.a.f440719d;
        return obj == aVar ? aVar : obj;
    }
}
