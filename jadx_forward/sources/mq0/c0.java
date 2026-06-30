package mq0;

/* loaded from: classes7.dex */
public interface c0 extends i95.m {
    public static final /* synthetic */ int T0 = 0;

    static void Xa(mq0.c0 c0Var, mq0.z action, java.lang.String bizName, java.lang.String bizScene, java.lang.String str, java.lang.String str2, mq0.a0 implType, mq0.b0 b0Var, java.util.Map map, int i17, java.lang.Object obj) {
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: report");
        }
        java.lang.String traceId = (i17 & 8) != 0 ? "" : str;
        java.lang.String frameSetName = (i17 & 16) == 0 ? str2 : "";
        mq0.b0 reportSource = (i17 & 64) != 0 ? mq0.b0.f412070e : b0Var;
        java.util.Map extMap = (i17 & 128) != 0 ? kz5.q0.f395534d : map;
        mq0.i0 i0Var = (mq0.i0) c0Var;
        i0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizScene, "bizScene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(traceId, "traceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetName, "frameSetName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(implType, "implType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportSource, "reportSource");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extMap, "extMap");
        java.lang.String a17 = mq0.h0.a(mq0.i0.f412101d, action.f412184d, bizName, bizScene, traceId, frameSetName, implType.f412067d, reportSource.f412072d, "extMap=" + extMap);
        if (r26.n0.N(action.f412184d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MBADFullLinkReporter", "report: action value is blank, skip, " + a17);
            return;
        }
        try {
            str5 = traceId;
            str6 = frameSetName;
            str3 = "MBADFullLinkReporter";
            str4 = a17;
        } catch (java.lang.Exception e17) {
            e = e17;
            str3 = "MBADFullLinkReporter";
            str4 = a17;
        }
        try {
            mq0.i0.wi(i0Var, action.f412184d, bizName, bizScene, str5, str6, implType.f412067d, reportSource.f412072d, null, extMap, 128, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "report " + str4);
        } catch (java.lang.Exception e18) {
            e = e18;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str3, "report failed, " + str4, e);
        }
    }

    static /* synthetic */ void ig(mq0.c0 c0Var, mq0.z zVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, mq0.b0 b0Var, java.util.Map map, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportConversion");
        }
        ((mq0.i0) c0Var).Ai(zVar, str, str2, (i17 & 8) != 0 ? "" : str3, (i17 & 16) != 0 ? "" : str4, str5, (i17 & 64) != 0 ? mq0.b0.f412070e : b0Var, (i17 & 128) != 0 ? kz5.q0.f395534d : map);
    }
}
