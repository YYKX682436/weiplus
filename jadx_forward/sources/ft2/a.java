package ft2;

/* loaded from: classes5.dex */
public abstract class a {
    public static final boolean a(java.lang.String str, java.lang.String str2) {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, str2)) {
            return true;
        }
        if (str == null || str.length() == 0) {
            if (str2 == null || str2.length() == 0) {
                return true;
            }
        }
        return false;
    }

    public static final java.lang.String b(java.lang.String str, java.lang.String str2) {
        boolean z17 = true;
        if (str.length() == 0) {
            return str2 == null ? "" : str2;
        }
        if (str2 != null && str2.length() != 0) {
            z17 = false;
        }
        if (z17) {
            return str;
        }
        return str + '_' + str2;
    }

    public static final org.json.JSONObject c(r45.xp2 xp2Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(xp2Var, "<this>");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            jSONObject.put("startTs", xp2Var.m75942xfb822ef2(3));
            jSONObject.put("endTs", xp2Var.m75942xfb822ef2(4));
            jSONObject.put("duration", xp2Var.m75942xfb822ef2(4) - xp2Var.m75942xfb822ef2(3));
            jSONObject.put(dm.i4.f66865x76d1ec5a, xp2Var.m75945x2fec8307(2));
            if (xp2Var.m75939xb282bd08(5) >= 0) {
                jSONObject.put("endType", xp2Var.m75939xb282bd08(5));
            }
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        return jSONObject;
    }
}
