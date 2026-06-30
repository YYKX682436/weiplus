package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/j1;", "Lcom/tencent/mm/plugin/appbrand/ipc/v;", "Lcom/tencent/mm/plugin/appbrand/jsapi/SetTextStatusParams;", "setTextStatusParams", "Lbi4/d1;", "b", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "request", "Ljz5/f0;", "handleRequest", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class j1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v {
    private final bi4.d1 b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11953xb3fd7a47 setTextStatusParams) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        pj4.j0 j0Var = new pj4.j0();
        j0Var.f436672d = "7";
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("appId", setTextStatusParams.f160210n);
        java.lang.String str = setTextStatusParams.f160211o;
        jSONObject.put(dm.i4.f66875xa013b0d5, str);
        java.lang.String str2 = setTextStatusParams.f160206g;
        jSONObject.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, str2);
        int i17 = setTextStatusParams.f160213q;
        jSONObject.put("version", i17);
        int i18 = setTextStatusParams.f160212p;
        jSONObject.put("versionType", i18);
        java.lang.String str3 = setTextStatusParams.f160215s;
        jSONObject.put("headImageURL", str3);
        java.lang.String str4 = setTextStatusParams.f160217u;
        jSONObject.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099, str4);
        j0Var.f436674f = jSONObject.toString();
        pj4.x1 x1Var = new pj4.x1();
        java.lang.String str5 = setTextStatusParams.f160210n;
        x1Var.f436863d = str5;
        x1Var.f436864e = str2;
        x1Var.f436865f = str;
        x1Var.f436866g = i18;
        x1Var.f436867h = i17;
        x1Var.f436868i = str3;
        x1Var.f436869m = str4;
        j0Var.f436675g = android.util.Base64.encodeToString(x1Var.mo14344x5f01b1f6(), 2);
        linkedList.add(j0Var);
        pj4.j0 j0Var2 = new pj4.j0();
        j0Var2.f436672d = "3";
        j0Var2.f436674f = "https://support.weixin.qq.com/security/readtemplate?t=w_security_center_website/upgrade&scene=1#wechat_redirect";
        linkedList.add(j0Var2);
        bi4.c1 c1Var = new bi4.c1();
        c1Var.g(setTextStatusParams.f160214r);
        c1Var.e("http://wxapp.tc.qq.com/258/20304/stodownload?m=78b18448b71e7f791aad33ecee51e533&filekey=30340201010420301e0202010204025348041078b18448b71e7f791aad33ecee51e53302020ad5040d00000004627466730000000131&hy=SH&storeid=32303231303432373134313731383030306535393731303030303030303037636638353130393030303030313032&bizid=1023");
        c1Var.d(setTextStatusParams.f160208i);
        c1Var.b(setTextStatusParams.f160203d);
        c1Var.f102567a.f436471e = setTextStatusParams.f160204e;
        c1Var.h(setTextStatusParams.f160207h);
        c1Var.a(setTextStatusParams.f160205f);
        c1Var.f102567a.f436484u = setTextStatusParams.f160209m;
        c1Var.c(linkedList);
        if (setTextStatusParams.f160216t) {
            c1Var.f(str5 + "@minigame");
        } else {
            c1Var.f(str5 + "@weapp");
        }
        bi4.d1 d1Var = c1Var.f102567a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d1Var, "build(...)");
        return d1Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v
    /* renamed from: handleRequest */
    public void mo50332x63bc5f47(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c abstractC11887x3610e10c) {
        if (!(abstractC11887x3610e10c instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11909x6e248f19)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiSetTextStatus", "handleRequest, request is not DoSetTextStatusRequest");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiSetTextStatus", "handleRequest, setTextStatus");
        bi4.d1 b17 = b(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11909x6e248f19) abstractC11887x3610e10c).getSetTextStatusParams());
        if (!b17.f436485v) {
            b17.f436485v = true;
        }
        xe0.g0 g0Var = (xe0.g0) i95.n0.c(xe0.g0.class);
        if (g0Var != null) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p765xa4f4bf5f.C10691x3b04d9e9) g0Var).Ri(m50421x3c6fed6a(), b17, new com.p314xaae8f345.mm.p689xc5a27af6.p765xa4f4bf5f.ResultReceiverC10692xf58669db(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.i1(this)));
        }
        m50420x7b736e5c(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11910xa766f3aa());
    }
}
