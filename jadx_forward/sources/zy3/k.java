package zy3;

/* loaded from: classes7.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f559189a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[][] f559190b;

    /* renamed from: c, reason: collision with root package name */
    public org.json.JSONObject f559191c;

    /* renamed from: d, reason: collision with root package name */
    public org.json.JSONObject f559192d;

    /* renamed from: e, reason: collision with root package name */
    public final zy3.m f559193e;

    /* renamed from: f, reason: collision with root package name */
    public final zy3.j f559194f;

    public k(int i17, int i18, java.lang.String session, byte[] image, int i19, java.lang.String certPem, java.lang.String baseRequest, zy3.j callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(session, "session");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(image, "image");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(certPem, "certPem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(baseRequest, "baseRequest");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f559189a = "MicroMsg.HttpSceneBizScanImage";
        this.f559191c = new org.json.JSONObject();
        this.f559192d = new org.json.JSONObject();
        this.f559193e = new zy3.m(null, new zy3.a(null, null, null, null, 0), null);
        byte[][] m121943x94e577a1 = com.p3249xcbb51f6b.ndk.C28022x73d433fe.m121931x9cf0d20b().m121943x94e577a1();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m121943x94e577a1, "sm2GenKeyPair(...)");
        this.f559190b = m121943x94e577a1;
        this.f559194f = callback;
        java.util.HashMap hashMap = new java.util.HashMap();
        com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetRequestParams cronetRequestParams = new com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetRequestParams();
        zy3.i iVar = new zy3.i(this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HttpSceneBizScanImage", "startHttpOcr");
        if (2 > m121943x94e577a1.length || m121943x94e577a1[0] == null || m121943x94e577a1[1] == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.HttpSceneBizScanImage", "Sm2GenKeyPair.operate,keyPair is illegal");
            ((az3.a) callback).a(3, 10007, "Sm2GenKeyPair.operate,KeyPair is illegal");
            return;
        }
        cronetRequestParams.url = "https://pay.wechatpay.cn/userinformation/wechatregv2/ocrgetbankcardinfo";
        cronetRequestParams.f18174xbfc5d0e1 = "POST";
        cronetRequestParams.f18181xe78dee5f = 1;
        hashMap.put("img_data", android.util.Base64.encodeToString(com.p3249xcbb51f6b.ndk.C28022x73d433fe.m121931x9cf0d20b().m121941x2b87a22d(image, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h(certPem)), 2));
        hashMap.put("ocr_type", java.lang.Integer.valueOf(i17));
        hashMap.put(ya.b.f77502x92235c1b, java.lang.Integer.valueOf(i18));
        hashMap.put("seq_num", java.lang.Integer.valueOf(i19));
        hashMap.put("session_key", session);
        hashMap.put("client_pub_key", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(m121943x94e577a1[1]));
        hashMap.put("base_request", new org.json.JSONObject(baseRequest));
        java.lang.String jSONObject = new org.json.JSONObject(hashMap).toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
        byte[] bytes = jSONObject.getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        cronetRequestParams.f18159x6574fc6c = bytes;
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("Accept-Encoding", "gzip,compress,br,deflate");
        hashMap2.put("charset", com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
        hashMap2.put("User-Agent", ik1.l0.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "", (ik1.k0) nd.f.a(ik1.k0.class)));
        hashMap2.put("Content-Length", java.lang.String.valueOf(cronetRequestParams.f18159x6574fc6c.length));
        cronetRequestParams.m37968xeb7416ae(hashMap2);
        zy3.h hVar = new zy3.h(cronetRequestParams, iVar);
        zy3.g gVar = new zy3.g(hVar, java.lang.System.currentTimeMillis());
        com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetRequestParams cronetRequestParams2 = hVar.f559187c;
        com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetHttpsCreateResult m37962x5ffa1e0c = com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.m37962x5ffa1e0c(cronetRequestParams2, gVar);
        java.lang.String str = hVar.f559185a;
        if (m37962x5ffa1e0c == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "Http Request,CornetHttpsCreateResult is null");
        } else {
            if (m37962x5ffa1e0c.f18157x23aa2e05 != 0) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "sendCronetRequest prepare to send https request success,requestid:%s,url:%s", m37962x5ffa1e0c.f18158xcb7ef180, cronetRequestParams2.url);
        }
    }
}
