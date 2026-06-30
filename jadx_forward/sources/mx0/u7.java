package mx0;

/* loaded from: classes5.dex */
public final class u7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f413912d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f413913e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced f413914f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7(java.lang.String str, float f17, com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f413912d = str;
        this.f413913e = f17;
        this.f413914f = c10977x8e40eced;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mx0.u7(this.f413912d, this.f413913e, this.f413914f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        mx0.u7 u7Var = (mx0.u7) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        u7Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        mx0.ja m47325xd23b40d7;
        xx0.f0 f0Var;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced = this.f413914f;
        m47325xd23b40d7 = c10977x8e40eced.m47325xd23b40d7();
        m47325xd23b40d7.getClass();
        java.lang.String templateId = this.f413912d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
        mx0.t9 t9Var = m47325xd23b40d7.f413613i;
        t9Var.getClass();
        mx0.q9 q9Var = t9Var.f413893h;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(q9Var != null ? q9Var.f413802a : null, templateId);
        float f17 = this.f413913e;
        if (b17) {
            t9Var.f413893h = new mx0.q9(templateId, (int) (100 * f17));
            java.util.Iterator it = t9Var.f413891f.iterator();
            int i17 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i17 = -1;
                    break;
                }
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((vt3.p) it.next()).f521553b, templateId)) {
                    break;
                }
                i17++;
            }
            if (i17 >= 0) {
                t9Var.m8148xed6e4d18(t9Var.z(i17), mx0.r9.f413827d);
            }
        }
        xx0.n nVar = c10977x8e40eced.K1;
        if (nVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
            xx0.c a17 = nVar.a();
            if (a17 != null && (f0Var = a17.f539397g) != null) {
                java.util.Iterator it6 = ((java.util.LinkedHashMap) f0Var.f539432h).values().iterator();
                while (it6.hasNext()) {
                    xx0.d0 d0Var = ((xx0.e0) it6.next()).f539421a;
                    d0Var.getClass();
                    xx0.t tVar = d0Var.f539414i;
                    tVar.getClass();
                    xx0.u uVar = tVar.f539475h;
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(uVar != null ? uVar.f539478a : null, templateId)) {
                        tVar.f539475h = new xx0.u(templateId, java.lang.Integer.valueOf((int) (100 * f17)));
                        java.util.Iterator it7 = ((java.util.ArrayList) tVar.f539474g).iterator();
                        int i18 = 0;
                        while (true) {
                            if (!it7.hasNext()) {
                                i18 = -1;
                                break;
                            }
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((vt3.p) it7.next()).f521553b, templateId)) {
                                break;
                            }
                            i18++;
                        }
                        if (i18 >= 0) {
                            tVar.m8148xed6e4d18(i18, 0);
                        }
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
