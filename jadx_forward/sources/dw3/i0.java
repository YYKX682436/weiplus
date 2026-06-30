package dw3;

/* loaded from: classes5.dex */
public final class i0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f325748d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f325749e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f325749e = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new dw3.i0(this.f325749e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((dw3.i0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f325748d;
        try {
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.RemuxCheckThirdPartyVideo", e17, "miaojian cgi error:" + e17, new java.lang.Object[0]);
        }
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.lang.String str = this.f325749e;
            java.lang.String m69189x92967934 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69189x92967934(str);
            if (m69189x92967934 == null || m69189x92967934.length() == 0) {
                return null;
            }
            try {
                java.lang.String optString = new org.json.JSONObject(m69189x92967934).optString("description");
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString != null ? r26.n0.u0(optString).toString() : null, "miaojian")) {
                    java.lang.String Di = ((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).Di(str);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemuxCheckThirdPartyVideo", "checkThirdPartyVideo md5:" + Di + ", videoPath:" + str);
                    w40.e eVar = (w40.e) i95.n0.c(w40.e.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Di);
                    ((qs2.q) eVar).getClass();
                    db2.c1 c1Var = new db2.c1(Di);
                    this.f325748d = 1;
                    obj = rm0.h.a(c1Var, 0L, null, this, 3, null);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
            } catch (java.lang.Exception unused) {
            }
            return null;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.p81 p81Var = (r45.p81) obj;
        if (p81Var == null) {
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemuxCheckThirdPartyVideo", "checkThirdPartyVideo exist:" + p81Var.m75933x41a8a7f2(1) + ", jianTongKuanMeta:" + p81Var.m75945x2fec8307(2));
        boolean m75933x41a8a7f2 = p81Var.m75933x41a8a7f2(1);
        java.lang.String m75945x2fec8307 = p81Var.m75945x2fec8307(2);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        return new dw3.h0(m75933x41a8a7f2, m75945x2fec8307);
    }
}
