package zt5;

/* loaded from: classes14.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    public long f557146a;

    /* renamed from: b, reason: collision with root package name */
    public int f557147b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f557148c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f557149d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f557150e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f557151f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f557152g;

    public r(java.lang.String str, java.lang.String str2) {
        this.f557146a = -1L;
        this.f557147b = -1;
        this.f557148c = "";
        this.f557149d = "";
        this.f557151f = null;
        this.f557152g = "";
        this.f557150e = str;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            if (jSONObject.has("certs")) {
                org.json.JSONArray optJSONArray = jSONObject.optJSONArray("certs");
                if (optJSONArray.length() < 2) {
                    zt5.h.b("Soter.SoterPubKeyModel", "certificates train not enough", new java.lang.Object[0]);
                }
                zt5.h.c("Soter.SoterPubKeyModel", "certs size: [%d]", java.lang.Integer.valueOf(optJSONArray.length()));
                this.f557151f = new java.util.ArrayList();
                for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                    this.f557151f.add(optJSONArray.getString(i17));
                }
                try {
                    zt5.a.a((java.security.cert.X509Certificate) java.security.cert.CertificateFactory.getInstance("X.509").generateCertificate(new java.io.ByteArrayInputStream(((java.lang.String) this.f557151f.get(0)).getBytes())), this);
                } catch (java.lang.Exception e17) {
                    zt5.h.d("Soter.SoterPubKeyModel", e17, "soter: loadDeviceInfo from attestationCert failed");
                }
                jSONObject.put("cpu_id", this.f557148c);
                jSONObject.put("uid", this.f557147b);
                jSONObject.put("counter", this.f557146a);
                this.f557150e = jSONObject.toString();
            } else {
                this.f557146a = jSONObject.optLong("counter");
                this.f557147b = jSONObject.optInt("uid");
                this.f557148c = jSONObject.optString("cpu_id");
                this.f557149d = jSONObject.optString("pub_key");
            }
        } catch (java.lang.Exception unused) {
            zt5.h.b("Soter.SoterPubKeyModel", "soter: pub key model failed", new java.lang.Object[0]);
        }
        this.f557152g = str2;
    }

    /* renamed from: toString */
    public java.lang.String m179464x9616526c() {
        return "SoterPubKeyModel{counter=" + this.f557146a + ", uid=" + this.f557147b + ", cpu_id='" + this.f557148c + "', pub_key_in_x509='" + this.f557149d + "', rawJson='" + this.f557150e + "', signature='" + this.f557152g + "'}";
    }

    public r(java.security.cert.Certificate[] certificateArr) {
        this.f557146a = -1L;
        this.f557147b = -1;
        this.f557148c = "";
        this.f557149d = "";
        this.f557150e = "";
        this.f557151f = null;
        this.f557152g = "";
        if (certificateArr != null) {
            try {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                for (int i17 = 0; i17 < certificateArr.length; i17++) {
                    java.security.cert.Certificate certificate = certificateArr[i17];
                    android.util.Base64.encodeToString(certificate.getEncoded(), 2);
                    java.lang.String b17 = zt5.a.b(certificate);
                    if (i17 == 0) {
                        try {
                            zt5.a.a((java.security.cert.X509Certificate) certificate, this);
                        } catch (java.lang.Exception e17) {
                            zt5.h.d("Soter.SoterPubKeyModel", e17, "soter: loadDeviceInfo from attestationCert failed");
                        }
                    }
                    jSONArray.put(b17);
                    arrayList.add(b17);
                }
                this.f557151f = arrayList;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("certs", jSONArray);
                jSONObject.put("cpu_id", this.f557148c);
                jSONObject.put("uid", this.f557147b);
                jSONObject.put("counter", this.f557146a);
                this.f557150e = jSONObject.toString();
            } catch (java.lang.Exception unused) {
                zt5.h.b("Soter.SoterPubKeyModel", "soter: pub key model failed", new java.lang.Object[0]);
            }
        }
    }
}
