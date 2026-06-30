package com.p314xaae8f345.p3085x8ea91595.p3087x2c0b7d03;

/* renamed from: com.tencent.tmassistantsdk.channel.TMAssistantSDKChannelDataItem */
/* loaded from: classes13.dex */
public class C26649x6e73f9ab {

    /* renamed from: DATEITEM_VERSION */
    public static final int f55968x6aefd23a = 1;

    /* renamed from: ENCRYPT_KEY */
    private static final java.lang.String f55969x95686545 = "&-*)Wb5_U,[^!9'+";

    /* renamed from: IPCDATA_MIN_VERSION */
    public static final int f55970xdcf2e292 = 1;
    private static final java.lang.String TAG = "MicroMsg.TMAssistantSDKChannelDataItem";

    /* renamed from: mDBIdentity */
    public int f55971x7e499b89 = -1;

    /* renamed from: mDataItemAction */
    public java.lang.String f55972x5687d440;

    /* renamed from: mDataItemEndTime */
    public long f55973x5fe5d57e;

    /* renamed from: mDataItemStartTime */
    public long f55974x1dda0005;

    /* renamed from: mDataItemType */
    public int f55975x2ce0dfc4;

    /* renamed from: mDataItemVersion */
    public int f55976xd4a7880e;

    /* renamed from: mHostPackageName */
    public java.lang.String f55977x7aead8fc;

    /* renamed from: mHostUserIdentity */
    public java.lang.String f55978x1d6b9dfe;

    /* renamed from: mHostVersion */
    public int f55979x37c1a363;

    /* renamed from: mIPCData */
    public byte[] f55980xdcdb3cb9;

    public C26649x6e73f9ab(java.lang.String str, int i17, java.lang.String str2, int i18, java.lang.String str3, long j17, long j18, int i19, byte[] bArr) {
        this.f55979x37c1a363 = 0;
        this.f55978x1d6b9dfe = "";
        this.f55975x2ce0dfc4 = 0;
        this.f55972x5687d440 = "";
        this.f55974x1dda0005 = 0L;
        this.f55973x5fe5d57e = 0L;
        this.f55976xd4a7880e = 0;
        this.f55980xdcdb3cb9 = null;
        this.f55977x7aead8fc = str;
        if (str == null) {
            this.f55977x7aead8fc = "";
        }
        this.f55979x37c1a363 = i17;
        this.f55978x1d6b9dfe = str2;
        if (str2 == null) {
            this.f55978x1d6b9dfe = "";
        }
        this.f55975x2ce0dfc4 = i18;
        this.f55972x5687d440 = str3;
        if (str3 == null) {
            this.f55972x5687d440 = "";
        }
        this.f55974x1dda0005 = j17;
        this.f55973x5fe5d57e = j18;
        this.f55976xd4a7880e = i19;
        this.f55980xdcdb3cb9 = bArr;
    }

    /* renamed from: getDataItemFromByte */
    public static com.p314xaae8f345.p3085x8ea91595.p3087x2c0b7d03.C26649x6e73f9ab m104810x6e23a045(byte[] bArr) {
        byte[] m105476x5bf1598d;
        java.lang.String string;
        if (bArr != null && bArr.length > 0 && (m105476x5bf1598d = new com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26776xa1a7bfb1().m105476x5bf1598d(bArr, f55969x95686545.getBytes())) != null) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(m105476x5bf1598d, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
                java.lang.String string2 = jSONObject.getString("mHostPackageName");
                int i17 = jSONObject.getInt("mHostVersion");
                java.lang.String string3 = jSONObject.getString("mHostUserIdentity");
                int i18 = jSONObject.getInt("mDataItemType");
                java.lang.String string4 = jSONObject.getString("mDataItemAction");
                long j17 = jSONObject.getLong("mDataItemStartTime");
                long j18 = jSONObject.getLong("mDataItemEndTime");
                int i19 = jSONObject.getInt("mDataItemVersion");
                return new com.p314xaae8f345.p3085x8ea91595.p3087x2c0b7d03.C26649x6e73f9ab(string2, i17, string3, i18, string4, j17, j18, i19, (i19 < 1 || (string = jSONObject.getString("mIPCData")) == null) ? null : com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26775x762c896f.m105458xb06291ee(string, 0));
            } catch (java.io.UnsupportedEncodingException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
            } catch (org.json.JSONException e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e18, "", new java.lang.Object[0]);
            }
        }
        return null;
    }

    /* renamed from: getBuffer */
    public byte[] m104811x12f2b736() {
        byte[] bytes;
        byte[] bArr;
        java.lang.String m105463xa74a7ea2;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("mHostPackageName", this.f55977x7aead8fc);
            jSONObject.put("mHostVersion", this.f55979x37c1a363);
            jSONObject.put("mHostUserIdentity", this.f55978x1d6b9dfe);
            jSONObject.put("mDataItemType", this.f55975x2ce0dfc4);
            jSONObject.put("mDataItemAction", this.f55972x5687d440);
            jSONObject.put("mDataItemStartTime", this.f55974x1dda0005);
            jSONObject.put("mDataItemEndTime", this.f55973x5fe5d57e);
            jSONObject.put("mDataItemVersion", this.f55976xd4a7880e);
            if (this.f55976xd4a7880e >= 1 && (bArr = this.f55980xdcdb3cb9) != null && (m105463xa74a7ea2 = com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26775x762c896f.m105463xa74a7ea2(bArr, 0)) != null) {
                jSONObject.put("mIPCData", m105463xa74a7ea2);
            }
            java.lang.String jSONObject2 = jSONObject.toString();
            if (jSONObject2 == null || (bytes = jSONObject2.getBytes(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c)) == null) {
                return null;
            }
            return new com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26776xa1a7bfb1().m105478xa0333265(bytes, f55969x95686545.getBytes());
        } catch (java.io.UnsupportedEncodingException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
            return null;
        } catch (org.json.JSONException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e18, "", new java.lang.Object[0]);
            return null;
        }
    }
}
