package mx0;

/* loaded from: classes5.dex */
public final class r6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced f413820d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f413820d = c10977x8e40eced;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mx0.r6(this.f413820d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        mx0.r6 r6Var = (mx0.r6) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        r6Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.util.List S0;
        boolean z17;
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff;
        java.lang.Object obj2;
        xx0.d0 d0Var;
        boolean z18;
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff2;
        vu3.c m170537x647851f2;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        xx0.n nVar = this.f413820d.K1;
        if (nVar != null) {
            uu3.u uVar = nVar.f539452e;
            android.view.View a17 = (uVar == null || (m170537x647851f2 = uVar.m170537x647851f2()) == null) ? null : m170537x647851f2.a();
            xx0.c cVar = a17 instanceof xx0.c ? (xx0.c) a17 : null;
            if (cVar != null) {
                xx0.i iVar = cVar.f539395e;
                synchronized (iVar.f539441f) {
                    S0 = kz5.n0.S0(iVar.f539444i);
                }
                if (!(!S0.isEmpty()) || (z18 = cVar.f539400m)) {
                    if (S0.isEmpty() && (z17 = cVar.f539400m) && z17 && (c2718xca2902ff = cVar.f539396f) != null) {
                        java.util.List list = cVar.f539399i;
                        int i17 = cVar.f539401n;
                        list.remove(i17);
                        xx0.f0 f0Var = cVar.f539397g;
                        if (f0Var != null) {
                            f0Var.mo8343xced61ae5();
                        }
                        c2718xca2902ff.o(i17);
                        c2718xca2902ff.s(c2718xca2902ff.m20352xe06bcb0d(), 0.0f, false, true);
                        cVar.f539400m = false;
                    }
                } else if (!z18 && (c2718xca2902ff2 = cVar.f539396f) != null) {
                    java.lang.String string = cVar.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.oil);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                    vt3.r rVar = new vt3.r(-1L, string, new vt3.n(null, null, null, null, 8, null), true);
                    java.util.List list2 = cVar.f539399i;
                    int i18 = cVar.f539401n;
                    list2.add(i18, rVar);
                    xx0.f0 f0Var2 = cVar.f539397g;
                    if (f0Var2 != null) {
                        f0Var2.mo8343xced61ae5();
                    }
                    android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(cVar.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570957dk2, (android.view.ViewGroup) null);
                    ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.qoy)).setText(rVar.f521573b);
                    inflate.setTag(java.lang.Long.valueOf(rVar.f521572a));
                    oa.i l17 = c2718xca2902ff2.l();
                    l17.f425316f = inflate;
                    l17.f();
                    c2718xca2902ff2.c(l17, i18, c2718xca2902ff2.f126074d.isEmpty());
                    c2718xca2902ff2.s(c2718xca2902ff2.m20352xe06bcb0d(), 0.0f, false, true);
                    cVar.f539400m = true;
                }
                xx0.f0 f0Var3 = cVar.f539397g;
                if (f0Var3 != null) {
                    java.util.Iterator it = f0Var3.f539429e.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (((vt3.r) obj2).f521575d) {
                            break;
                        }
                    }
                    vt3.r rVar2 = (vt3.r) obj2;
                    if (rVar2 != null) {
                        xx0.e0 e0Var = (xx0.e0) ((java.util.LinkedHashMap) f0Var3.f539432h).get(java.lang.Long.valueOf(rVar2.f521572a));
                        if (e0Var != null && (d0Var = e0Var.f539421a) != null) {
                            p3325xe03a0797.p3326xc267989b.l.d(d0Var.f539409d, null, null, new xx0.c0(d0Var, null), 3, null);
                        }
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
