package i04;

/* loaded from: classes8.dex */
public final class e {
    public e(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final i04.f a(org.json.JSONObject json, j04.f fVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(json, "json");
        java.lang.String string = json.getString(dm.i4.f66865x76d1ec5a);
        int i17 = json.getInt("i");
        java.lang.String string2 = json.getString("cb");
        long j17 = json.getLong("t");
        boolean z17 = json.getBoolean("o");
        try {
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MTimer", e17, "getKV error", new java.lang.Object[0]);
        }
        if (fVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            return new i04.f(string, i17, fVar, j17, z17);
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTimer", "%s, newTask not offline type", json.toString());
            return null;
        }
        java.lang.Object newInstance = java.lang.Class.forName(string2).newInstance();
        if (newInstance != null && (newInstance instanceof j04.f)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            return new i04.f(string, i17, (j04.f) newInstance, j17, z17);
        }
        return null;
    }
}
