package lu4;

/* loaded from: classes7.dex */
public final class m extends lu4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final lu4.j f402974d = new lu4.j(null);

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f402975e = jz5.h.b(lu4.i.f402969d);

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f402976f = lp0.b.D() + "jsengine/trace/";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(lu4.c context) {
        super("wxJsEngine", context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00ea  */
    @android.webkit.JavascriptInterface
    /* renamed from: dump */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m146353x2f39f4(java.lang.String r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lu4.m.m146353x2f39f4(java.lang.String, java.lang.String):void");
    }

    @android.webkit.JavascriptInterface
    /* renamed from: getLogLevel */
    public final int m146354xf2ceb016() {
        return com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a2  */
    @android.webkit.JavascriptInterface
    /* renamed from: getNetWorkType */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m146355x6a054172() {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lu4.m.m146355x6a054172():java.lang.String");
    }

    @android.webkit.JavascriptInterface
    /* renamed from: getPlatform */
    public final java.lang.String m146356xeb97a5e9() {
        return com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f;
    }

    @android.webkit.JavascriptInterface
    /* renamed from: getSystemInfo */
    public final java.lang.String m146357x148d5373() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("devicesType", 2);
        jSONObject.put("osVersion", android.os.Build.VERSION.SDK_INT);
        jSONObject.put("brand", android.os.Build.BRAND);
        jSONObject.put("model", wo.w0.m());
        jz5.g gVar = lu4.e.f402966d;
        jSONObject.put("pixelRatio", java.lang.Float.valueOf(((java.lang.Number) ((jz5.n) lu4.e.f402966d).mo141623x754a37bb()).floatValue()));
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        return jSONObject2;
    }

    @android.webkit.JavascriptInterface
    /* renamed from: idkey */
    public final void m146358x5f6b764(long j17, long j18, long j19) {
        if (j17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f402964c, "idkey id can't be 0");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(j17, j18, j19);
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: idkeyList */
    public final void m146359x33688a22(java.lang.String idkeyList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(idkeyList, "idkeyList");
        cl0.e eVar = new cl0.e(idkeyList);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        int mo15056xbe0e3ae6 = eVar.mo15056xbe0e3ae6();
        for (int i17 = 0; i17 < mo15056xbe0e3ae6; i17++) {
            cl0.e a17 = eVar.a(i17);
            linkedList.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(a17.mo15053xfb822ef2(0), a17.mo15053xfb822ef2(1), a17.mo15053xfb822ef2(2)));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : linkedList) {
            if (((com.p314xaae8f345.p542x3306d5.smc.C4582x424c344) obj).m40327x4182ad1() > 0) {
                arrayList.add(obj);
            }
        }
        g0Var.j(new java.util.ArrayList(arrayList), false, false);
    }

    @android.webkit.JavascriptInterface
    public final void kv(int i17, java.lang.String data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f402964c, "kvStat id=" + i17 + ", data=" + data);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(i17, data);
    }

    @android.webkit.JavascriptInterface
    /* renamed from: reportCgi */
    public final void m146360xeaf036b1(java.lang.Number businessId, java.lang.String reqJson, java.lang.String callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(businessId, "businessId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reqJson, "reqJson");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f402964c, "reportCgi businessId=" + businessId);
        lx3.r.f403646a.a(businessId, reqJson, new lu4.k(this, callback), new lu4.l(this, callback));
    }

    @android.webkit.JavascriptInterface
    /* renamed from: userAgent */
    public final java.lang.String m146361x12900dfa() {
        java.lang.String a17 = ik1.l0.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, hy4.w.f367733f.a(), f402974d.a());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
        return a17;
    }
}
