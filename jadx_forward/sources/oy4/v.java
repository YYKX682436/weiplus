package oy4;

@j95.b
/* loaded from: classes5.dex */
public final class v extends i95.w implements dk0.i, qk.u7 {

    /* renamed from: d, reason: collision with root package name */
    public static ny4.f f431614d;

    public float[] wi(float[] data, java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        long m83698x630f29e = com.p314xaae8f345.mm.p2825x7e128009.C22966xc1fa7682.m83698x630f29e(path, 2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FeatureApiImpl", "getMusicRecResult init ret " + m83698x630f29e);
        if (m83698x630f29e != 0) {
            float[] m83697xbf7da7a0 = com.p314xaae8f345.mm.p2825x7e128009.C22966xc1fa7682.m83697xbf7da7a0(m83698x630f29e, data);
            com.p314xaae8f345.mm.p2825x7e128009.C22966xc1fa7682.m83699x46fb07b9(m83698x630f29e);
            return m83697xbf7da7a0;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("ret", m83698x630f29e);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(31890, "MusicRec", 8, jSONObject2, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        return new float[0];
    }
}
