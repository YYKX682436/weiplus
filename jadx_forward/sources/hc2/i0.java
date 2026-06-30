package hc2;

/* loaded from: classes.dex */
public abstract class i0 {
    public static final void a(r45.k74 k74Var, java.util.Map queries) {
        org.json.JSONObject jSONObject;
        java.lang.Object m143895xf1229813;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(k74Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(queries, "queries");
        java.lang.String m75945x2fec8307 = k74Var.m75945x2fec8307(2);
        if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
            jSONObject = new org.json.JSONObject();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderExt", "litepp appendQueries, query:" + m75945x2fec8307);
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new org.json.JSONObject(m75945x2fec8307));
            } catch (java.lang.Throwable th6) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
            }
            if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
                m143895xf1229813 = null;
            }
            jSONObject = (org.json.JSONObject) m143895xf1229813;
            if (jSONObject == null) {
                jSONObject = new org.json.JSONObject();
            }
        }
        try {
            for (java.util.Map.Entry entry : queries.entrySet()) {
                jSONObject.put((java.lang.String) entry.getKey(), entry.getValue());
            }
            k74Var.set(2, jSONObject.toString());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderExt", "liteapp appendQueries err: " + e17);
        }
    }
}
