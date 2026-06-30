package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* renamed from: com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem */
/* loaded from: classes8.dex */
public abstract class AbstractC19284xdca64a7 implements android.os.Parcelable {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f264268d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f264269e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f264270f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f264271g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f264272h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f264273i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f264274m;

    /* renamed from: n, reason: collision with root package name */
    public int f264275n;

    /* renamed from: o, reason: collision with root package name */
    public int f264276o;

    /* renamed from: p, reason: collision with root package name */
    public int f264277p;

    /* renamed from: q, reason: collision with root package name */
    public int f264278q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.k4 f264279r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f264280s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f264281t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f264282u;

    /* renamed from: v, reason: collision with root package name */
    public android.os.Bundle f264283v;

    public AbstractC19284xdca64a7() {
        this.f264281t = true;
        this.f264282u = true;
        this.f264283v = new android.os.Bundle();
    }

    public org.json.JSONObject a() {
        java.lang.String jSONObject;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("appId", this.f264268d);
            jSONObject2.put(dm.i4.f66867x2a5c95c7, this.f264269e);
            jSONObject2.put("thumbFilePath", this.f264270f);
            jSONObject2.put("origFilePath", this.f264271g);
            jSONObject2.put("serverId", this.f264272h);
            jSONObject2.put("mediaId", this.f264273i);
            jSONObject2.put(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56084x2da4207, this.f264274m);
            jSONObject2.put("mediaType", this.f264275n);
            jSONObject2.put("size", this.f264276o);
            jSONObject2.put("width", this.f264277p);
            jSONObject2.put("height", this.f264278q);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.k4 k4Var = this.f264279r;
            if (k4Var != null) {
                jSONObject2.put("cdnInfo", k4Var.a());
            }
            jSONObject2.put("upload", this.f264280s);
            jSONObject2.put("needCompress", this.f264281t);
            jSONObject2.put("needUploadCDNInfo", this.f264282u);
            android.os.Bundle bundle = this.f264283v;
            if (bundle == null) {
                jSONObject = "";
            } else {
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                try {
                    for (java.lang.String str : bundle.keySet()) {
                        jSONObject3.put(str, bundle.get(str));
                    }
                } catch (org.json.JSONException unused) {
                }
                jSONObject = jSONObject3.toString();
            }
            jSONObject2.put("extra", jSONObject);
        } catch (org.json.JSONException unused2) {
        }
        return jSONObject2;
    }

    public abstract java.lang.String b();

    public abstract java.lang.String c();

    public void d(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.f264268d = jSONObject.optString("appId");
        this.f264269e = jSONObject.optString(dm.i4.f66867x2a5c95c7);
        this.f264270f = jSONObject.optString("thumbFilePath");
        this.f264271g = jSONObject.optString("origFilePath");
        this.f264272h = jSONObject.optString("serverId");
        this.f264273i = jSONObject.optString("mediaId");
        this.f264274m = jSONObject.optString(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56084x2da4207);
        this.f264275n = jSONObject.optInt("mediaType");
        this.f264276o = jSONObject.optInt("size");
        this.f264277p = jSONObject.optInt("width");
        this.f264278q = jSONObject.optInt("height");
        java.lang.String optString = jSONObject.optString("cdnInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.k4 k4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.k4();
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(optString);
            k4Var.f38729xf11df5f5 = jSONObject2.optString("aesKey");
            k4Var.f38730xf9dbbe9c = jSONObject2.optString("fileId");
            k4Var.f38732x419c440e = jSONObject2.optString("fileUrl");
            k4Var.f38731x17c343e7 = jSONObject2.optInt("fileLength");
        } catch (org.json.JSONException unused) {
        }
        this.f264279r = k4Var;
        this.f264280s = jSONObject.optBoolean("upload");
        this.f264281t = jSONObject.optBoolean("needCompress", true);
        this.f264282u = jSONObject.optBoolean("needUploadCDNInfo", true);
        java.lang.String optString2 = jSONObject.optString("extra");
        android.os.Bundle bundle = new android.os.Bundle();
        if (optString2 != null && !optString2.isEmpty()) {
            try {
                org.json.JSONObject jSONObject3 = new org.json.JSONObject(optString2);
                java.util.Iterator<java.lang.String> keys = jSONObject3.keys();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    java.lang.Object obj = jSONObject3.get(next);
                    if (obj instanceof java.lang.String) {
                        bundle.putString(next, (java.lang.String) obj);
                    } else if (obj instanceof java.lang.Integer) {
                        bundle.putInt(next, ((java.lang.Integer) obj).intValue());
                    } else if (obj instanceof java.lang.Long) {
                        bundle.putLong(next, ((java.lang.Long) obj).longValue());
                    } else if (obj instanceof java.lang.Boolean) {
                        bundle.putBoolean(next, ((java.lang.Boolean) obj).booleanValue());
                    } else if (obj instanceof java.lang.Byte) {
                        bundle.putByte(next, ((java.lang.Byte) obj).byteValue());
                    } else if (obj instanceof java.lang.Character) {
                        bundle.putChar(next, ((java.lang.Character) obj).charValue());
                    } else if (obj instanceof java.lang.Float) {
                        bundle.putFloat(next, ((java.lang.Float) obj).floatValue());
                    } else if (obj instanceof java.lang.Short) {
                        bundle.putShort(next, ((java.lang.Short) obj).shortValue());
                    } else if (obj instanceof java.lang.Double) {
                        bundle.putDouble(next, ((java.lang.Double) obj).doubleValue());
                    } else {
                        bundle.putString(next, obj.toString());
                    }
                }
            } catch (org.json.JSONException unused2) {
            }
        }
        this.f264283v = bundle;
    }

    public void e(dn.h hVar) {
        if (this.f264279r == null) {
            this.f264279r = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.k4();
        }
        if (hVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewJSSDKFileItem", "sceneResult info is null");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.k4 k4Var = this.f264279r;
        k4Var.f38729xf11df5f5 = hVar.f69502xf11df5f5;
        k4Var.f38730xf9dbbe9c = hVar.f69522xf9dbbe9c;
        k4Var.f38732x419c440e = hVar.f69524x419c440e;
        k4Var.f38731x17c343e7 = (int) hVar.f69523x17c343e7;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f264268d);
        parcel.writeString(this.f264269e);
        parcel.writeString(this.f264270f);
        parcel.writeString(this.f264271g);
        parcel.writeInt(this.f264275n);
        parcel.writeInt(this.f264276o);
        parcel.writeInt(this.f264277p);
        parcel.writeInt(this.f264278q);
        parcel.writeBundle(this.f264283v);
    }

    public AbstractC19284xdca64a7(android.os.Parcel parcel) {
        this.f264281t = true;
        this.f264282u = true;
        this.f264283v = new android.os.Bundle();
        this.f264268d = parcel.readString();
        this.f264269e = parcel.readString();
        this.f264270f = parcel.readString();
        this.f264271g = parcel.readString();
        this.f264275n = parcel.readInt();
        this.f264276o = parcel.readInt();
        this.f264277p = parcel.readInt();
        this.f264278q = parcel.readInt();
        this.f264283v = parcel.readBundle();
    }
}
