package ob1;

/* loaded from: classes7.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f425540a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f425541b;

    /* renamed from: c, reason: collision with root package name */
    public final int f425542c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedHashMap f425543d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f425544e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f425545f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f425546g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Boolean f425547h;

    public f(java.lang.String str, java.lang.String str2) {
        this.f425540a = str;
        this.f425541b = str2;
        this.f425547h = null;
    }

    public org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("deviceId", this.f425541b);
        jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, this.f425540a);
        jSONObject.put("RSSI", this.f425542c);
        java.lang.Boolean bool = this.f425547h;
        if (bool != null) {
            jSONObject.put("connectable", bool);
        }
        byte[] bArr = new byte[0];
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.LinkedHashMap linkedHashMap = this.f425543d;
        if (linkedHashMap != null && !linkedHashMap.isEmpty()) {
            for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
                int intValue = ((java.lang.Integer) entry.getKey()).intValue();
                byte[] bArr2 = {(byte) (intValue & 255), (byte) ((intValue >> 8) & 255)};
                byte[] bArr3 = (byte[]) entry.getValue();
                byte[] bArr4 = new byte[bArr.length + 2 + bArr3.length];
                java.lang.System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
                java.lang.System.arraycopy(bArr2, 0, bArr4, bArr.length, 2);
                java.lang.System.arraycopy(bArr3, 0, bArr4, bArr.length + 2, bArr3.length);
                bArr = bArr4;
            }
        }
        sb6.append(new java.lang.String(android.util.Base64.encode(bArr, 2)));
        jSONObject.put("advertisData", sb6);
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.List list = this.f425544e;
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(((android.os.ParcelUuid) it.next()).getUuid().toString().toUpperCase());
            }
        }
        jSONObject.put("advertisServiceUUIDs", jSONArray);
        jSONObject.put("localName", this.f425545f);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        java.util.Map map = this.f425546g;
        if (map != null && map.size() > 0) {
            for (android.os.ParcelUuid parcelUuid : map.keySet()) {
                jSONObject2.put(parcelUuid.getUuid().toString().toUpperCase(), new java.lang.String(android.util.Base64.encode((byte[]) map.get(parcelUuid), 2)));
            }
        }
        jSONObject.put("serviceData", jSONObject2);
        return jSONObject;
    }

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.sdk.p1074x35c67d.C12040xecd7293c c12040xecd7293c) {
        java.lang.String name = c12040xecd7293c.a().getName();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f425540a = name == null ? "" : name;
        java.lang.String address = c12040xecd7293c.a().getAddress();
        this.f425541b = address == null ? "" : address;
        this.f425542c = c12040xecd7293c.f161641f;
        this.f425547h = c12040xecd7293c.f161643h;
        pb1.z zVar = c12040xecd7293c.f161640e;
        if (zVar != null) {
            this.f425543d = zVar.f434704h;
            this.f425544e = zVar.f434698b;
            java.lang.String str = zVar.f434702f;
            this.f425545f = str != null ? str : "";
            this.f425546g = zVar.f434700d;
            return;
        }
        this.f425545f = "";
    }
}
