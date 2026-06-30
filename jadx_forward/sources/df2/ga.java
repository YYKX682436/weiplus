package df2;

/* loaded from: classes5.dex */
public final class ga extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f311740d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.zb f311741e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, df2.zb zbVar) {
        super(2, interfaceC29045xdcb5ca57);
        this.f311740d = hVar;
        this.f311741e = zbVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.ga(this.f311740d, interfaceC29045xdcb5ca57, this.f311741e);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        df2.ga gaVar = (df2.ga) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        gaVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Integer] */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        r45.ze1 ze1Var;
        java.util.LinkedList<r45.pa7> m75941xfb821914;
        java.util.LinkedList m75941xfb8219142;
        java.lang.Object obj2;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.ye1 ye1Var = (r45.ye1) ((xg2.i) this.f311740d).f535926b;
        if (ye1Var == null || (m75941xfb8219142 = ye1Var.m75941xfb821914(1)) == null) {
            ze1Var = null;
        } else {
            java.util.Iterator it = m75941xfb8219142.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (((r45.ze1) obj2).m75939xb282bd08(0) == 4) {
                    break;
                }
            }
            ze1Var = (r45.ze1) obj2;
        }
        df2.zb zbVar = this.f311741e;
        if (ze1Var == null || ze1Var.m75939xb282bd08(1) != 0) {
            java.lang.String str = zbVar.f313472m;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[aiAssistant] fetchWelcomeConfig: result invalid, ret_code=");
            sb6.append(ze1Var != null ? new java.lang.Integer(ze1Var.m75939xb282bd08(1)) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, sb6.toString());
        } else {
            try {
                com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = ze1Var.m75934xbce7f2f(3);
                byte[] g17 = m75934xbce7f2f != null ? m75934xbce7f2f.g() : null;
                if (g17 == null) {
                    g17 = new byte[0];
                }
                r45.df1 df1Var = new r45.df1();
                df1Var.mo11468x92b714fd(g17);
                if (!df1Var.m75933x41a8a7f2(0)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(zbVar.f313472m, "[aiAssistant] fetchWelcomeConfig: success=false");
                } else {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    r45.nf1 nf1Var = (r45.nf1) df1Var.m75936x14adae67(1);
                    if (nf1Var != null && (m75941xfb821914 = nf1Var.m75941xfb821914(0)) != null) {
                        for (r45.pa7 pa7Var : m75941xfb821914) {
                            if (pa7Var.m75933x41a8a7f2(2)) {
                                java.lang.String m75945x2fec8307 = pa7Var.m75945x2fec8307(0);
                                if (!(m75945x2fec8307 == null || m75945x2fec8307.length() == 0)) {
                                    arrayList.add(pa7Var);
                                }
                            }
                        }
                    }
                    r45.nf1 nf1Var2 = (r45.nf1) df1Var.m75936x14adae67(1);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new df2.ea(zbVar, arrayList, nf1Var2 != null ? new java.lang.Float(nf1Var2.m75938x746dc8a6(1)) : null));
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(zbVar.f313472m, "[aiAssistant] fetchWelcomeConfig: parse failed: " + e17.getMessage());
            }
        }
        return jz5.f0.f384359a;
    }
}
