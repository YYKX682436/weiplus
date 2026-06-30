package yw4;

/* loaded from: classes7.dex */
public final class f extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yw4.i f548487a;

    public f(yw4.i iVar) {
        this.f548487a = iVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o1
    public void f(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebPrefetcherInterceptor", "onPageCommitVisible, url = %s", str);
        yw4.i iVar = this.f548487a;
        if (!iVar.f548496h) {
            iVar.c().f263449a.mo14660x738236e6(r26.b0.b("(function(p){\n                p.wx=p.wx||{};\n                p.wx.timeOrigin=" + iVar.c().V.f367670s + ";\n                p.wx.info=Object.assign(p.wx.info||{}, {\n                    preauth:" + iVar.f548492d + ",\n                    prefetch:" + iVar.f548491c + ",\n                    predns:" + iVar.f548493e + "\n                })\n                return p.wx.info;\n            })(window.performance);"), yw4.e.f548486a);
            iVar.f548496h = true;
            zq1.j0 j0Var = iVar.f548490b;
            if (j0Var != null) {
                zw4.i.a(zw4.h.f558460m, str, j0Var != null ? j0Var.f556528a : null, j0Var != null ? j0Var.f556536i : 0, j0Var != null ? j0Var.f556531d : 0, j0Var != null ? j0Var.f556535h : 0);
            }
            zw4.n.f558467a.b(zw4.a.f558416h, iVar.c().f263461g);
        }
        yw4.q qVar = iVar.f548497i;
        if (qVar == null) {
            return;
        }
        qVar.f548522l = false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o1
    public void g(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebPrefetcherInterceptor", "onPageFinished, url = %s", str);
        zw4.n.f558467a.b(zw4.a.f558417i, this.f548487a.c().f263461g);
        yw4.u uVar = this.f548487a.f548499k;
        java.lang.String str2 = "dumpPrefetchLoadResPerformance prefetch: " + uVar.f548527a + ", enableLoadResOpt: true, loadContentCost: " + uVar.f548530d + ", loadResCostTotal: " + uVar.f548530d + ", loadResAvg: %s, url = %s";
        java.lang.Object[] objArr = new java.lang.Object[2];
        int i17 = uVar.f548532f;
        objArr[0] = i17 > 0 ? java.lang.Long.valueOf(uVar.f548531e / i17) : null;
        objArr[1] = uVar.f548528b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebPrefetcherResPerformanceHelper", str2, objArr);
        if (uVar.f548527a) {
            ((ku5.t0) ku5.t0.f394148d).g(new yw4.t(uVar));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o1
    public void h(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        yw4.q qVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPageStarted, prefetch: ");
        yw4.i iVar = this.f548487a;
        sb6.append(iVar.f548491c);
        sb6.append(", url = %s");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebPrefetcherInterceptor", sb6.toString(), str);
        zw4.n.f558467a.b(zw4.a.f558415g, iVar.c().f263461g);
        if (!iVar.f548491c || (qVar = iVar.f548497i) == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebPrefetcherJsApiHandler", "updateRandomStr isDgtVerify: " + qVar.f548520j);
        if (qVar.f548519i && qVar.f548520j) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("__event_id", "sys:updateRandomStr");
                jSONObject2.put("randomStr", qVar.f548521k);
                jSONObject.put("__json_message", jSONObject2);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = qVar.f548513c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22633x83752a59);
                c22633x83752a59.mo14660x738236e6("javascript:WeixinPrefecherJSBridge._handleMessageFromWeixin(" + jSONObject + ')', new yw4.p());
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebPrefetcherJsApiHandler", e17, "updateRandomStr exception", new java.lang.Object[0]);
            }
        }
    }
}
