package mq0;

@j95.b
/* loaded from: classes7.dex */
public final class i0 extends i95.w implements mq0.c0 {

    /* renamed from: d, reason: collision with root package name */
    public static final mq0.h0 f412101d = new mq0.h0(null);

    public static void wi(mq0.i0 i0Var, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.util.Map map, int i17, java.lang.Object obj) {
        if ((i17 & 128) != 0) {
            str8 = null;
        }
        if ((i17 & 256) != 0) {
            map = null;
        }
        i0Var.getClass();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6688xbd4eea37 c6688xbd4eea37 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6688xbd4eea37();
        c6688xbd4eea37.f140239d = c6688xbd4eea37.b("BizName", str2, true);
        c6688xbd4eea37.f140240e = c6688xbd4eea37.b("BizScene", str3, true);
        c6688xbd4eea37.f140244i = c6688xbd4eea37.b("Action", str, true);
        c6688xbd4eea37.f140241f = c6688xbd4eea37.b("TraceId", str4, true);
        c6688xbd4eea37.f140242g = c6688xbd4eea37.b("FrameSetName", str5, true);
        c6688xbd4eea37.f140247l = c6688xbd4eea37.b("ImplType", str6, true);
        c6688xbd4eea37.f140243h = c6688xbd4eea37.b("ReportSource", str7, true);
        c6688xbd4eea37.f140245j = java.lang.System.currentTimeMillis();
        if (map == null || !(!map.isEmpty())) {
            if (!(str8 == null || str8.length() == 0)) {
                c6688xbd4eea37.f140246k = c6688xbd4eea37.b("ExtraJson", r26.i0.t(str8, ",", ";", false), true);
            }
        } else {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                pm0.b0.f(map, jSONObject);
                java.lang.String jSONObject2 = jSONObject.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                c6688xbd4eea37.f140246k = c6688xbd4eea37.b("ExtraJson", r26.i0.t(jSONObject2, ",", ";", false), true);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MBADFullLinkReporter", "extMap to JSON failed", e17);
            }
        }
        c6688xbd4eea37.l();
    }

    public void Ai(mq0.z action, java.lang.String bizName, java.lang.String bizScene, java.lang.String traceId, java.lang.String frameSetName, java.lang.String implType, mq0.b0 reportSource, java.util.Map extMap) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizScene, "bizScene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(traceId, "traceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetName, "frameSetName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(implType, "implType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportSource, "reportSource");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extMap, "extMap");
        java.lang.String a17 = mq0.h0.a(f412101d, action.f412184d, bizName, bizScene, traceId, frameSetName, implType, reportSource.f412072d, "extMap=" + extMap);
        if (r26.n0.N(implType)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MBADFullLinkReporter", "reportConversion: implType is blank, skip (non-target scenario), " + a17);
        } else {
            if (r26.n0.N(action.f412184d)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MBADFullLinkReporter", "reportConversion: action value is blank, skip, " + a17);
                return;
            }
            try {
                wi(this, action.f412184d, bizName, bizScene, traceId, frameSetName, implType, reportSource.f412072d, null, extMap, 128, null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MBADFullLinkReporter", "reportConversion " + a17);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MBADFullLinkReporter", "reportConversion failed, " + a17, e17);
            }
        }
    }

    public void Bi(java.lang.String action, java.lang.String bizName, java.lang.String bizScene, java.lang.String traceId, java.lang.String frameSetName, java.lang.String implType, java.lang.String reportSource, java.lang.String extraJson) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizScene, "bizScene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(traceId, "traceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetName, "frameSetName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(implType, "implType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportSource, "reportSource");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extraJson, "extraJson");
        java.lang.String a17 = mq0.h0.a(f412101d, action, bizName, bizScene, traceId, frameSetName, implType, reportSource, "extraJson=".concat(extraJson));
        if (r26.n0.N(action)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MBADFullLinkReporter", "reportFromFe: action is blank, skip, " + a17);
            return;
        }
        try {
            wi(this, action, bizName, bizScene, traceId, frameSetName, implType, reportSource, extraJson, null, 256, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MBADFullLinkReporter", "reportFromFe " + a17);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MBADFullLinkReporter", "reportFromFe failed, " + a17, e17);
        }
    }
}
