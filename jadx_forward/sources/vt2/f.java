package vt2;

/* loaded from: classes3.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f521484d;

    /* renamed from: e, reason: collision with root package name */
    public int f521485e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vt2.g f521486f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gk2.e f521487g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.i56 f521488h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(vt2.g gVar, gk2.e eVar, r45.i56 i56Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f521486f = gVar;
        this.f521487g = eVar;
        this.f521488h = i56Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new vt2.f(this.f521486f, this.f521487g, this.f521488h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((vt2.f) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f521485e;
        gk2.e eVar = this.f521487g;
        vt2.g gVar = this.f521486f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            android.app.Activity activity = gVar.f521489a;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), false, 3, null);
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392103c;
            vt2.e eVar2 = new vt2.e(gVar, eVar, this.f521488h, null);
            this.f521484d = f17;
            this.f521485e = 1;
            java.lang.Object g17 = p3325xe03a0797.p3326xc267989b.l.g(p0Var, eVar2, this);
            if (g17 == aVar) {
                return aVar;
            }
            u3Var = f17;
            obj = g17;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u3Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3) this.f521484d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        jz5.l lVar = (jz5.l) obj;
        java.util.List a17 = ((mm2.f6) eVar.a(mm2.f6.class)).f410572o.a();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : a17) {
            so2.j5 j5Var = (so2.j5) obj2;
            if ((j5Var instanceof cm2.i0) || ((j5Var instanceof cm2.m0) && ((cm2.m0) j5Var).f124901v.m75939xb282bd08(42) != 10)) {
                arrayList.add(obj2);
            }
        }
        if (lVar != null) {
            gVar.f521491c.clear();
            gVar.f521491c.addAll(arrayList);
            vt2.j jVar = gVar.f521492d;
            if (jVar != null) {
                pm0.v.X(new vt2.i(jVar));
            }
        }
        u3Var.dismiss();
        return jz5.f0.f384359a;
    }
}
