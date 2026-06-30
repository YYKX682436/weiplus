package vd0;

/* loaded from: classes8.dex */
public final class g3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vd0.l3 f516951d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f516952e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f516953f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f516954g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(vd0.l3 l3Var, java.lang.String str, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f516951d = l3Var;
        this.f516952e = str;
        this.f516953f = activityC0065xcd7aa112;
        this.f516954g = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new vd0.g3(this.f516951d, this.f516952e, this.f516953f, this.f516954g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        vd0.g3 g3Var = (vd0.g3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        g3Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        vd0.l3 l3Var = this.f516951d;
        java.lang.Object obj2 = l3Var.f516993d;
        java.lang.String str = this.f516952e;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f516953f;
        int i17 = this.f516954g;
        synchronized (obj2) {
            l3Var.Zi();
            vd0.y2 y2Var = (vd0.y2) l3Var.f516994e.get(str);
            if (y2Var != null && y2Var.f517074a.get() == activityC0065xcd7aa112) {
                vd0.l3.Ai(l3Var, y2Var.f517075b, activityC0065xcd7aa112);
                java.util.HashMap hashMap = l3Var.f516994e;
                java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(activityC0065xcd7aa112);
                vd0.c3 searchIndex = y2Var.f517075b;
                int i18 = y2Var.f517076c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(searchIndex, "searchIndex");
                hashMap.put(str, new vd0.y2(weakReference, searchIndex, i18));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingSearchFeatureService", "buildSettingIndex refresh visible only, activityTag=" + str + ", size=" + y2Var.f517075b.f516914a.size());
                l3Var.f516995f = str;
            }
            java.util.HashMap b17 = u24.m.f505662a.b(activityC0065xcd7aa112);
            u24.j jVar = u24.j.f505658a;
            java.util.Collection values = b17.values();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
            a24.t a17 = jVar.a(kz5.n0.S0(values));
            if (a17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SettingSearchFeatureService", "buildSettingIndex fail: rootNode is null, activityTag=" + str);
            } else {
                l3Var.f516994e.put(str, new vd0.y2(new java.lang.ref.WeakReference(activityC0065xcd7aa112), vd0.l3.wi(l3Var, a17), i17));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingSearchFeatureService", "buildSettingIndex create index, activityTag=" + str + ", size=" + b17.size());
                l3Var.f516995f = str;
            }
        }
        return jz5.f0.f384359a;
    }
}
