package vu0;

/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final pp0.s0 f521639a;

    /* renamed from: b, reason: collision with root package name */
    public final vu0.c f521640b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p482xca9708e2.C4197x7df5f634 f521641c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f521642d;

    /* renamed from: e, reason: collision with root package name */
    public final vu0.h f521643e;

    /* renamed from: f, reason: collision with root package name */
    public ru0.g f521644f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f521645g;

    public k(pp0.s0 s0Var, vu0.c requestListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestListener, "requestListener");
        this.f521639a = s0Var;
        this.f521640b = requestListener;
        com.p314xaae8f345.p457x3304c6.p482xca9708e2.C4197x7df5f634 c4197x7df5f634 = new com.p314xaae8f345.p457x3304c6.p482xca9708e2.C4197x7df5f634();
        java.util.HashSet hashSet = c4197x7df5f634.f130092h;
        hashSet.add("commandID");
        c4197x7df5f634.f130085a = 4502;
        hashSet.add("URL");
        c4197x7df5f634.f130087c = "/ilink/ilinkapp/maas/materials/list";
        hashSet.add("timeoutMillis");
        c4197x7df5f634.f130086b = 10000;
        hashSet.add("retryCount");
        c4197x7df5f634.f130088d = 0;
        hashSet.add("limitFlow");
        c4197x7df5f634.f130089e = false;
        hashSet.add("limitFrequency");
        c4197x7df5f634.f130090f = false;
        this.f521641c = c4197x7df5f634;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("result_type", "1");
        hashMap.put("max_result_count", "1");
        hashMap.put("interim_results", "1");
        hashMap.put("stable_results", "1");
        hashMap.put("voice_file_type", "1");
        hashMap.put("voice_encode_type", "1");
        this.f521642d = hashMap;
        this.f521643e = new vu0.h(this);
        this.f521645g = new java.util.LinkedHashMap();
    }

    public static final org.json.JSONObject a(vu0.k kVar, java.lang.String str, java.nio.ByteBuffer byteBuffer, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b, int i17, int i18) {
        java.lang.Object m143895xf1229813;
        vu0.h hVar = kVar.f521643e;
        if (byteBuffer == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AudioRecognitionService", "parseResponse2Json: responseData == null");
            hVar.c(str, vu0.u.f521697i);
            return null;
        }
        x36.o oVar = x36.o.f533228g;
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        x36.o oVar2 = new x36.o(bArr);
        java.nio.charset.Charset forName = java.nio.charset.Charset.forName(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(forName, "forName(...)");
        java.lang.String str2 = new java.lang.String(oVar2.f533232f, forName);
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new org.json.JSONObject(str2));
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
        if (m143898xd4a2fc34 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AudioRecognitionService", "parseResponse2Json: utf8 " + str2 + ' ' + m143898xd4a2fc34 + " requestId " + str);
            hVar.c(str, vu0.u.f521697i);
        }
        if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
            m143895xf1229813 = null;
        }
        org.json.JSONObject jSONObject = (org.json.JSONObject) m143895xf1229813;
        if (jSONObject == null) {
            return null;
        }
        jSONObject.toString();
        int optInt = jSONObject.optInt("ret", -1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AudioRecognitionService", "parseResponse2Json: response ret = " + optInt);
        if (optInt == 0 || optInt == 30604) {
            return jSONObject;
        }
        hVar.c(str, vu0.u.f521697i);
        return null;
    }
}
