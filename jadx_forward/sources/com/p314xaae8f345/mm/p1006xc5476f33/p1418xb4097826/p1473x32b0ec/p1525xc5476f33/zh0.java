package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class zh0 implements oe0.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ai0 f196880a;

    public zh0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ai0 ai0Var) {
        this.f196880a = ai0Var;
    }

    @Override // oe0.w
    public void a(java.lang.String action, org.json.JSONObject params) {
        java.util.LinkedList m75941xfb821914;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ai0 ai0Var = this.f196880a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ai0Var.f193422q, "finderLiveCallback action:".concat(action));
        switch (action.hashCode()) {
            case -1556964046:
                if (action.equals("beforeLiveToastAction")) {
                    pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.yh0(params, ai0Var));
                    return;
                }
                return;
            case -1031113918:
                if (action.equals("dynamicCardFirstFrameAction")) {
                    java.lang.String optString = params.optString("frameSetName");
                    java.lang.String str = ai0Var.f193422q;
                    r45.yq1 yq1Var = ai0Var.f193423r.f202042r;
                    r45.y63 y63Var = yq1Var != null ? (r45.y63) yq1Var.m75936x14adae67(0) : null;
                    if (y63Var == null || (m75941xfb821914 = y63Var.m75941xfb821914(0)) == null) {
                        return;
                    }
                    java.util.Iterator it = m75941xfb821914.iterator();
                    while (it.hasNext()) {
                        if (r26.i0.q(((r45.x63) it.next()).m75945x2fec8307(3), optString, false, 2, null)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ai0Var.f193422q, "frameFirstRender frameSetName:" + optString + " hideLoading!");
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.z10 z10Var = ai0Var.f193423r;
                            z10Var.getClass();
                            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.t10(z10Var));
                        }
                    }
                    return;
                }
                return;
            case -69720490:
                if (action.equals("dynamicCardServerLost")) {
                    pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.xh0(ai0Var));
                    return;
                }
                return;
            case 125053251:
                if (action.equals("closePlayTogetherActionSheet")) {
                    pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wh0(ai0Var, params));
                    return;
                }
                return;
            default:
                return;
        }
    }
}
