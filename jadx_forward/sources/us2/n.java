package us2;

/* loaded from: classes5.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f512048d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ us2.f f512049e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(us2.f fVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f512049e = fVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new us2.n(this.f512049e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((us2.n) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object g17;
        boolean z17;
        vt3.n nVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f512048d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            rt3.e eVar = us2.u.f512092l;
            int i18 = this.f512049e.f512013a;
            this.f512048d = 1;
            eVar.getClass();
            g17 = p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.q1.f392103c, new rt3.d(i18, null), this);
            if (g17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            g17 = obj;
        }
        r45.ep3 ep3Var = (r45.ep3) g17;
        if (ep3Var == null || ep3Var.f455185e.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShootComposingTemplateManager", "load data failed");
            return jz5.f0.f384359a;
        }
        java.lang.Object obj2 = us2.u.f512087g;
        us2.f fVar = this.f512049e;
        synchronized (obj2) {
            java.util.Map map = us2.u.f512089i;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.lang.Integer num = new java.lang.Integer(ep3Var.f455186f);
            long intValue = currentTimeMillis + (((num.intValue() != 0 ? num : null) != null ? r3.intValue() : 300) * 1000);
            java.util.LinkedList<r45.s46> tabs = ep3Var.f455185e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tabs, "tabs");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(tabs, 10));
            for (r45.s46 s46Var : tabs) {
                long j17 = s46Var.f467035d;
                java.lang.String tab_name = s46Var.f467036e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tab_name, "tab_name");
                vt3.n nVar2 = fVar.f512014b;
                if (s46Var.f467038g == 3) {
                    nVar = nVar2;
                    z17 = true;
                } else {
                    z17 = false;
                    nVar = nVar2;
                }
                arrayList.add(new vt3.r(j17, tab_name, nVar, z17));
            }
            ((java.util.HashMap) map).put(fVar, new us2.e(intValue, arrayList));
        }
        return jz5.f0.f384359a;
    }
}
