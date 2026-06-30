package lf;

/* loaded from: classes13.dex */
public class c implements com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4219xb9b728ce {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lf.e f399709a;

    public c(lf.e eVar) {
        this.f399709a = eVar;
    }

    @Override // com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4219xb9b728ce
    /* renamed from: onLocationChanged */
    public void mo34913xcf0f8560(com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4218x687499fa interfaceC4218x687499fa, int i17, java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()) {
            ((ku5.t0) ku5.t0.f394148d).h(new lf.b(this, this, interfaceC4218x687499fa, i17, str), "MicroMsg.DefaultTencentLocationManager");
            return;
        }
        if (i17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DefaultTencentLocationManager", "[mlocationListener]error:%d, reason:%s", java.lang.Integer.valueOf(i17), str);
        }
        java.util.List list = this.f399709a.f399719o;
        if (list != null && ((java.util.concurrent.CopyOnWriteArrayList) list).size() > 0) {
            lf.e eVar = this.f399709a;
            lf.e.a(eVar, eVar.f399719o, i17, str, eVar.d(interfaceC4218x687499fa, false));
            ((java.util.concurrent.CopyOnWriteArrayList) this.f399709a.f399719o).clear();
        }
        java.util.List list2 = this.f399709a.f399718n;
        if (list2 != null && ((java.util.concurrent.CopyOnWriteArrayList) list2).size() > 0) {
            lf.e eVar2 = this.f399709a;
            lf.e.a(eVar2, eVar2.f399718n, i17, str, eVar2.d(interfaceC4218x687499fa, true));
            ((java.util.concurrent.CopyOnWriteArrayList) this.f399709a.f399718n).clear();
        }
        java.util.List list3 = this.f399709a.f399721q;
        if (list3 != null && ((java.util.concurrent.CopyOnWriteArrayList) list3).size() > 0) {
            lf.e eVar3 = this.f399709a;
            lf.e.a(eVar3, eVar3.f399721q, i17, str, eVar3.d(interfaceC4218x687499fa, false));
        }
        java.util.List list4 = this.f399709a.f399720p;
        if (list4 != null && ((java.util.concurrent.CopyOnWriteArrayList) list4).size() > 0) {
            lf.e eVar4 = this.f399709a;
            lf.e.a(eVar4, eVar4.f399720p, i17, str, eVar4.d(interfaceC4218x687499fa, true));
        }
        lf.e eVar5 = this.f399709a;
        eVar5.f399712e = interfaceC4218x687499fa;
        eVar5.f399713f = java.lang.System.currentTimeMillis();
        if (interfaceC4218x687499fa != null && interfaceC4218x687499fa.m34894x74653a5a() != null && interfaceC4218x687499fa.m34894x74653a5a().getBoolean("KEY_IS_HIGH_ACCURACY")) {
            lf.e eVar6 = this.f399709a;
            eVar6.f399714g = interfaceC4218x687499fa;
            eVar6.f399715h = java.lang.System.currentTimeMillis();
        }
        lf.e eVar7 = this.f399709a;
        eVar7.f399716i = i17;
        eVar7.f399717m = str;
        eVar7.e();
    }

    @Override // com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4219xb9b728ce
    /* renamed from: onStatusUpdate */
    public void mo34914xf54242da(java.lang.String str, int i17, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DefaultTencentLocationManager", "[mlocationListener]name:%s, status:%d, desc:%s", str, java.lang.Integer.valueOf(i17), str2);
    }
}
