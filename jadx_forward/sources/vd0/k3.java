package vd0;

/* loaded from: classes8.dex */
public final class k3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f516988d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vd0.l3 f516989e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f516990f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(java.lang.String str, vd0.l3 l3Var, java.lang.String str2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f516988d = str;
        this.f516989e = l3Var;
        this.f516990f = str2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new vd0.k3(this.f516988d, this.f516989e, this.f516990f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((vd0.k3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        wd0.w1 aj6;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.String obj2 = r26.n0.u0(this.f516988d).toString();
        if (obj2.length() == 0) {
            return kz5.p0.f395529d;
        }
        vd0.l3 l3Var = this.f516989e;
        java.lang.Object obj3 = l3Var.f516993d;
        java.lang.String str = this.f516990f;
        synchronized (obj3) {
            l3Var.Zi();
            vd0.y2 Ni = l3Var.Ni(str);
            vd0.c3 c3Var = Ni != null ? Ni.f517075b : null;
            if (c3Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SettingSearchFeatureService", "searchSetting skip: no available index, activityTag=".concat(str));
                return null;
            }
            java.lang.String lowerCase = obj2.toLowerCase(java.util.Locale.ROOT);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (vd0.z2 z2Var : c3Var.f516914a) {
                java.lang.Boolean bool = (java.lang.Boolean) c3Var.f516917d.get(z2Var.f517078a);
                if ((bool != null ? bool.booleanValue() : false) && (aj6 = l3Var.aj(z2Var, lowerCase)) != null) {
                    arrayList.add(new vd0.a3(z2Var, aj6));
                }
            }
            java.util.List<vd0.a3> F0 = kz5.n0.F0(arrayList, mz5.a.a(vd0.h3.f516963d, vd0.i3.f516972d, vd0.j3.f516976d));
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(F0, 10));
            for (vd0.a3 a3Var : F0) {
                vd0.z2 z2Var2 = a3Var.f516900a;
                wd0.w1 w1Var = a3Var.f516901b;
                java.lang.Boolean bool2 = (java.lang.Boolean) c3Var.f516917d.get(z2Var2.f517078a);
                arrayList2.add(l3Var.bj(z2Var2, w1Var, bool2 != null ? bool2.booleanValue() : false));
            }
            return arrayList2;
        }
    }
}
