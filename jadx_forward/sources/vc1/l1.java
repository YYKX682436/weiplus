package vc1;

/* loaded from: classes13.dex */
public class l1 extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c {

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ vc1.p1 f516538z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(vc1.p1 p1Var, android.content.Context context, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7 interfaceC25945x718093f7, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.C26111x2ace1473 c26111x2ace1473) {
        super(context, interfaceC25945x718093f7, c26111x2ace1473);
        this.f516538z = p1Var;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c
    /* renamed from: onBeforeClusterItemRendered */
    public void mo100188x18a278e4(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26110x1f5a1c0d interfaceC26110x1f5a1c0d, com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4410xea4764e4 c4410xea4764e4) {
        vc1.n1 n1Var = (vc1.n1) interfaceC26110x1f5a1c0d;
        super.mo100188x18a278e4(n1Var, c4410xea4764e4);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Map.DefaultTencentMapView", "onBeforeClusterItemRendered");
        int i17 = n1Var.f516556c;
        if (i17 > 0 && this.f516538z.f516616l0.contains(java.lang.Integer.valueOf(i17))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Map.DefaultTencentMapView", "remove clusterId:%d", java.lang.Integer.valueOf(n1Var.f516556c));
            this.f516538z.P("" + n1Var.f516556c);
            this.f516538z.f516616l0.remove(java.lang.Integer.valueOf(n1Var.f516556c));
            this.f516538z.f516620n0.remove(java.lang.Integer.valueOf(n1Var.f516556c));
            this.f516538z.f516629s.m100126x33fb11fa();
        }
        n1Var.f516556c = 0;
        com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a m100186x24a3b730 = m100186x24a3b730((vc1.l1) n1Var);
        vc1.q2 q2Var = (vc1.q2) this.f516538z.f516622o0.get(n1Var.f516554a);
        vc1.p1.h(this.f516538z, n1Var.f516554a, c4410xea4764e4, q2Var, m100186x24a3b730);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new vc1.k1(this, n1Var, q2Var, c4410xea4764e4), 200L);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.p3000x373aa5.C26118xa74407c
    /* renamed from: onBeforeClusterRendered */
    public void mo100189xbcb2bab1(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26109x9733a9da interfaceC26109x9733a9da, com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4410xea4764e4 c4410xea4764e4) {
        vc1.p1 p1Var;
        boolean z17;
        super.mo100189xbcb2bab1(interfaceC26109x9733a9da, c4410xea4764e4);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Map.DefaultTencentMapView", "onBeforeClusterRendered, cluster size:%d", java.lang.Integer.valueOf(interfaceC26109x9733a9da.mo100118x749b8e0a().size()));
        java.util.Iterator it = interfaceC26109x9733a9da.mo100118x749b8e0a().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            p1Var = this.f516538z;
            if (!hasNext) {
                break;
            }
            vc1.n1 n1Var = (vc1.n1) it.next();
            if (n1Var.f516556c > 0) {
                p1Var.P("" + n1Var.f516556c);
            }
            p1Var.P("" + n1Var.f516554a);
        }
        if (!p1Var.f516628r0) {
            c4410xea4764e4.m37267x589b15e(0.0f);
        }
        if (p1Var.f516610i0 != null) {
            for (vc1.n1 n1Var2 : interfaceC26109x9733a9da.mo100118x749b8e0a()) {
                if (((vc1.o1) ((java.util.concurrent.ConcurrentHashMap) p1Var.Y).get(n1Var2.f516554a)) != null) {
                    if (n1Var2.f516556c > 0) {
                        break;
                    }
                } else {
                    z17 = false;
                    break;
                }
            }
            z17 = true;
            if (!z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Map.DefaultTencentMapView", "don't send ClusterCreateEvent");
                return;
            }
            vc1.i2 i2Var = p1Var.f516610i0;
            p1Var.getClass();
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            jSONArray.put(p1Var.w(interfaceC26109x9733a9da, true));
            i2Var.a(jSONArray);
        }
    }
}
