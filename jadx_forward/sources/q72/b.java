package q72;

/* loaded from: classes9.dex */
public abstract class b {
    public static r45.qp0 a(java.lang.String str, java.util.Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        r45.qp0 qp0Var = new r45.qp0();
        qp0Var.f465695d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str + ".itemshowtype"), -1);
        qp0Var.f465709u = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str + ".ispaysubscribe"), -1);
        qp0Var.f465696e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str + ".nativepage"), 0);
        qp0Var.f465697f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str + ".width"), 0);
        qp0Var.f465698g = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str + ".height"), 0);
        qp0Var.f465699h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str + ".pubtime"), 0);
        qp0Var.f465700i = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str + ".duration"), 0);
        qp0Var.f465704p = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str + ".funcflag"), 0);
        qp0Var.f465701m = (java.lang.String) map.get(str + ".vid");
        qp0Var.f465702n = (java.lang.String) map.get(str + ".srcusername");
        qp0Var.f465703o = (java.lang.String) map.get(str + ".srcdisplayname");
        qp0Var.f465706r = (java.lang.String) map.get(str + ".cover");
        return qp0Var;
    }

    public static r45.qp0 b(java.lang.String str, java.util.Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        r45.qp0 qp0Var = new r45.qp0();
        qp0Var.f465701m = (java.lang.String) map.get(str + ".vid");
        qp0Var.f465708t = (java.lang.String) map.get(str + ".videourl");
        qp0Var.f465707s = (java.lang.String) map.get(str + ".mpurl");
        qp0Var.f465702n = (java.lang.String) map.get(str + ".bizusrname");
        qp0Var.f465703o = (java.lang.String) map.get(str + ".biznickname");
        qp0Var.f465706r = (java.lang.String) map.get(str + ".thumburl");
        qp0Var.f465697f = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L((java.lang.String) map.get(str + ".thumbwidth"), 0.0f);
        qp0Var.f465698g = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L((java.lang.String) map.get(str + ".thumbheight"), 0.0f);
        qp0Var.f465700i = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L((java.lang.String) map.get(str + ".duration"), 0.0f);
        return qp0Var;
    }

    public static java.lang.String c(r45.qp0 qp0Var) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("<appmsgshareitem><vid>");
        if (qp0Var == null) {
            return "";
        }
        stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(qp0Var.f465701m));
        stringBuffer.append("</vid><srcusername>");
        stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(qp0Var.f465702n));
        stringBuffer.append("</srcusername><srcdisplayname>");
        stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(qp0Var.f465703o));
        stringBuffer.append("</srcdisplayname><cover>");
        stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(qp0Var.f465706r));
        stringBuffer.append("</cover><itemshowtype>");
        stringBuffer.append(qp0Var.f465695d);
        stringBuffer.append("</itemshowtype><ispaysubscribe>");
        stringBuffer.append(qp0Var.f465709u);
        stringBuffer.append("</ispaysubscribe><nativepage>");
        stringBuffer.append(qp0Var.f465696e);
        stringBuffer.append("</nativepage><width>");
        stringBuffer.append(qp0Var.f465697f);
        stringBuffer.append("</width><height>");
        stringBuffer.append(qp0Var.f465698g);
        stringBuffer.append("</height><pubtime>");
        stringBuffer.append(qp0Var.f465699h);
        stringBuffer.append("</pubtime><duration>");
        stringBuffer.append(qp0Var.f465700i);
        stringBuffer.append("</duration><funcflag>");
        stringBuffer.append(qp0Var.f465704p);
        stringBuffer.append("</funcflag></appmsgshareitem>");
        return stringBuffer.toString();
    }
}
