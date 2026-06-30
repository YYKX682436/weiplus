package xc5;

/* loaded from: classes12.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f535011d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xc5.l f535012e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(xc5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f535012e = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new xc5.i(this.f535012e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((xc5.i) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f535011d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        xc5.l lVar = this.f535012e;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                qf3.a aVar2 = lVar.f535056e;
                if (aVar2 == null) {
                    lVar.f535062n = false;
                    return f0Var;
                }
                int i18 = lVar.f535060i;
                int i19 = i18 + 8;
                int length = lVar.f535058g.length;
                if (i19 > length) {
                    i19 = length;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                while (i18 < i19) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = pt0.f0.f439742b1.k(lVar.f535057f, lVar.f535058g[i18]);
                    if (k17 != null) {
                        arrayList.add(lVar.W6(k17));
                    }
                    i18++;
                }
                lVar.f535060i = i19;
                if (!arrayList.isEmpty()) {
                    lVar.f535055d.addAll(arrayList);
                    p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                    p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
                    xc5.h hVar = new xc5.h(aVar2, lVar, arrayList, null);
                    this.f535011d = 1;
                    if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, hVar, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            lVar.f535062n = false;
            return f0Var;
        } catch (java.lang.Throwable th6) {
            lVar.f535062n = false;
            throw th6;
        }
    }
}
