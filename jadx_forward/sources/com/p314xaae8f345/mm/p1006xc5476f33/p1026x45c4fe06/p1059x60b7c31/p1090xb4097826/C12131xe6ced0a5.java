package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\b\u0010\u0007\u001a\u00020\u0005H\u0007¨\u0006\n"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/finder/OpenFinderChattingUIProxy$FinderChattingUITask", "Lcom/tencent/mm/plugin/appbrand/ipc/v;", "Landroidx/lifecycle/x;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "request", "Ljz5/f0;", "handleRequest", "onActivityStopped", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.finder.OpenFinderChattingUIProxy$FinderChattingUITask */
/* loaded from: classes7.dex */
final class C12131xe6ced0a5 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v implements p012xc85e97e9.p093xedfae76a.x {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v
    /* renamed from: handleRequest */
    public void mo50332x63bc5f47(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c abstractC11887x3610e10c) {
        java.lang.Throwable th6;
        java.lang.String str;
        int i17;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf m50421x3c6fed6a;
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(abstractC11887x3610e10c, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.finder.OpenFinderChattingUIProxy.OpenFinderChattingUIRequest");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.C12132xd6d4b1c5) abstractC11887x3610e10c).getReqData());
            str = jSONObject.optString("userName");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "optString(...)");
            try {
                i17 = jSONObject.optInt("sourceType");
            } catch (java.lang.Throwable th7) {
                th6 = th7;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("OpenFinderChattingUIProxy", th6, "parse data failed", new java.lang.Object[0]);
                i17 = -1;
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                ya2.e1 e1Var = ya2.e1.f542005a;
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf m50421x3c6fed6a2 = m50421x3c6fed6a();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m50421x3c6fed6a2, "getActivityContext(...)");
                e1Var.l(m50421x3c6fed6a2, str, i17);
                m50421x3c6fed6a = m50421x3c6fed6a();
                if (m50421x3c6fed6a != null) {
                    return;
                } else {
                    return;
                }
            }
        } catch (java.lang.Throwable th8) {
            th6 = th8;
            str = "";
        }
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.e1 e1Var2 = ya2.e1.f542005a;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf m50421x3c6fed6a22 = m50421x3c6fed6a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m50421x3c6fed6a22, "getActivityContext(...)");
        e1Var2.l(m50421x3c6fed6a22, str, i17);
        m50421x3c6fed6a = m50421x3c6fed6a();
        if (m50421x3c6fed6a != null || (mo273xed6858b4 = m50421x3c6fed6a.mo273xed6858b4()) == null) {
            return;
        }
        mo273xed6858b4.a(this);
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_STOP)
    /* renamed from: onActivityStopped */
    public final void m50986x59edc7df() {
        m50420x7b736e5c(null);
    }
}
