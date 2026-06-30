package vc1;

/* loaded from: classes13.dex */
public class h0 implements com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnMarkerClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vc1.p1 f516506a;

    public h0(vc1.p1 p1Var) {
        this.f516506a = p1Var;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnMarkerClickListener
    /* renamed from: onMarkerClick */
    public boolean mo14570x289a5e0f(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a) {
        com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a2;
        if (interfaceC4409x88f1805a == null) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Map.DefaultTencentMapView", "map:%s markerid:%s, onMarkerClick", this, interfaceC4409x88f1805a.mo37237xb5887064());
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) interfaceC4409x88f1805a.mo37237xb5887064()) && this.f516506a.f516629s != null && ((vc1.l1) this.f516506a.f516629s.m100131x5e5b7e39()).m100181x71c84dc4(interfaceC4409x88f1805a) != null) {
            this.f516506a.e(((vc1.l1) this.f516506a.f516629s.m100131x5e5b7e39()).m100181x71c84dc4(interfaceC4409x88f1805a));
            return true;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) interfaceC4409x88f1805a.mo37237xb5887064())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Map.DefaultTencentMapView", "realMarker.getTag is null, return");
            return false;
        }
        if (((java.lang.String) interfaceC4409x88f1805a.mo37237xb5887064()).endsWith("AnchorPoint")) {
            vc1.p1 p1Var = this.f516506a;
            if (p1Var.f516611j != null && p1Var.f516598c0 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Map.DefaultTencentMapView", "click anchor point");
                vc1.p1 p1Var2 = this.f516506a;
                p1Var2.f516611j.a(p1Var2.f516598c0.m171456x2605e9e2(), this.f516506a.f516598c0.m171457x79d7af9());
            }
            return true;
        }
        vc1.o1 z17 = this.f516506a.z((java.lang.String) interfaceC4409x88f1805a.mo37237xb5887064());
        if (z17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Map.DefaultTencentMapView", "[onMarkerClickListener] map:%s appbrandMarker is null, return", this);
            return false;
        }
        if (this.f516506a.f516607h == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Map.DefaultTencentMapView", "[onMarkerClickListener] map:%s mapCalloutClick is null, return", this);
            return false;
        }
        if (z17.f516558b != null) {
            if (((java.lang.String) interfaceC4409x88f1805a.mo37237xb5887064()).endsWith("#label")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Map.DefaultTencentMapView", "realMarker.getTag is label marker, do nothing");
            } else {
                vc1.o2 o2Var = z17.f516558b.f516681s;
                com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a3 = z17.f516563c;
                if (interfaceC4409x88f1805a3 == null) {
                    interfaceC4409x88f1805a3 = interfaceC4409x88f1805a;
                }
                if (o2Var == null || o2Var.f516580n != 0 || interfaceC4409x88f1805a3 == null) {
                    if (o2Var != null && interfaceC4409x88f1805a3 != null) {
                        this.f516506a.d0(interfaceC4409x88f1805a3);
                    }
                } else if (interfaceC4409x88f1805a3.mo37243x4a284ae9()) {
                    interfaceC4409x88f1805a3.mo37241xa1cc0120();
                } else {
                    this.f516506a.d0(interfaceC4409x88f1805a3);
                }
            }
        }
        com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a4 = z17.f516563c;
        if (interfaceC4409x88f1805a4 != null) {
            interfaceC4409x88f1805a4.mo37247x7640bf25();
            z17.f516563c.mo37244xa41e4b79();
        }
        com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a5 = z17.f516564d;
        if (interfaceC4409x88f1805a5 != null) {
            interfaceC4409x88f1805a5.mo37247x7640bf25();
            z17.f516564d.mo37244xa41e4b79();
        }
        vc1.c3 c3Var = this.f516506a.f516598c0;
        if (c3Var != null && (interfaceC4409x88f1805a2 = c3Var.f516475d) != null) {
            interfaceC4409x88f1805a2.mo37247x7640bf25();
            c3Var.f516475d.mo37244xa41e4b79();
        }
        int i17 = z17.f516558b.f516664b;
        if (i17 <= 0) {
            if (!((java.lang.String) interfaceC4409x88f1805a.mo37237xb5887064()).endsWith("#label")) {
                return this.f516506a.f516607h.a(z17);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Map.DefaultTencentMapView", "realMarker.getTag is label marker, return");
            return this.f516506a.f516609i.a(z17);
        }
        vc1.p1 p1Var3 = this.f516506a;
        p1Var3.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Map.DefaultTencentMapView", "clickClusterLabelMarker");
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26109x9733a9da interfaceC26109x9733a9da = (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2998xe528ba8.InterfaceC26109x9733a9da) p1Var3.f516620n0.get(java.lang.Integer.valueOf(i17));
        if (interfaceC26109x9733a9da != null) {
            java.util.Iterator it = interfaceC26109x9733a9da.mo100118x749b8e0a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((vc1.n1) it.next()).f516556c == i17) {
                    vc1.i2 i2Var = p1Var3.f516610i0;
                    if (i2Var != null) {
                        i2Var.b(p1Var3.w(interfaceC26109x9733a9da, false));
                    }
                }
            }
            if (p1Var3.f516626q0) {
                java.util.LinkedList linkedList = new java.util.LinkedList();
                java.util.Iterator it6 = interfaceC26109x9733a9da.mo100118x749b8e0a().iterator();
                while (it6.hasNext()) {
                    linkedList.add(((vc1.n1) it6.next()).f516555b);
                }
                p1Var3.d(linkedList, 0, 0, 0, 0);
            }
        }
        return true;
    }
}
