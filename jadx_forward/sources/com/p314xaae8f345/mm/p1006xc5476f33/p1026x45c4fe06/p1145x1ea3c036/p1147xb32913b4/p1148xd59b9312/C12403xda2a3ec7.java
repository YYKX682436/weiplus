package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/luggage/export/functionalpage/WechatNativeExtraDataInvokeFunctionalPage;", "Landroid/os/Parcelable;", "Ll81/p0;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.WechatNativeExtraDataInvokeFunctionalPage */
/* loaded from: classes7.dex */
public final class C12403xda2a3ec7 implements android.os.Parcelable, l81.p0 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.C12403xda2a3ec7> f35084x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.n0();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f167091d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f167092e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f167093f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f167094g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f167095h;

    /* renamed from: i, reason: collision with root package name */
    public int f167096i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f167097m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f167098n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f167099o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f167100p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f167101q;

    /* renamed from: r, reason: collision with root package name */
    public int f167102r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f167103s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f167104t;

    public C12403xda2a3ec7(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z17, int i17, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, int i18, java.lang.String str10, java.lang.String str11) {
        this.f167091d = str;
        this.f167092e = str2;
        this.f167093f = str3;
        this.f167094g = str4;
        this.f167095h = z17;
        this.f167096i = i17;
        this.f167097m = str5;
        this.f167098n = str6;
        this.f167099o = str7;
        this.f167100p = str8;
        this.f167101q = str9;
        this.f167102r = i18;
        this.f167103s = str10;
        this.f167104t = str11;
    }

    @Override // l81.p0
    public java.lang.String a() {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("invokeTicket", this.f167091d);
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, this.f167092e);
            jSONObject.put("args", this.f167093f);
            jSONObject.put("jsapiType", this.f167094g);
            jSONObject.put("isGame", this.f167095h);
            jSONObject.put("wxa_scene", this.f167096i);
            jSONObject.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56317xb68cafb1, this.f167097m);
            jSONObject.put("callbackActivity", this.f167098n);
            jSONObject.put("transitiveData", this.f167099o);
            jSONObject.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, this.f167100p);
            jSONObject.put("instanceId", this.f167101q);
            jSONObject.put("debugMode", this.f167102r);
            jSONObject.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, this.f167103s);
            jSONObject.put("currentH5Url", this.f167104t);
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(jSONObject2);
            return jSONObject2;
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.WechatNativeExtraDataInvokeFunctionalPage", e17, "", new java.lang.Object[0]);
            return "{}";
        }
    }

    public final void b(org.json.JSONObject obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        this.f167091d = obj.getString("invokeTicket");
        this.f167092e = obj.getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
        this.f167097m = obj.getString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56317xb68cafb1);
        this.f167093f = obj.getString("args");
        this.f167094g = obj.getString("jsapiType");
        this.f167095h = obj.optBoolean("isGame");
        this.f167096i = obj.getInt("wxa_scene");
        this.f167098n = obj.getString("callbackActivity");
        this.f167099o = obj.optString("transitiveData");
        this.f167100p = obj.optString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984);
        this.f167101q = obj.optString("instanceId");
        this.f167102r = obj.optInt("debugMode");
        this.f167103s = obj.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        this.f167104t = obj.optString("currentH5Url");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f167091d);
        out.writeString(this.f167092e);
        out.writeString(this.f167093f);
        out.writeString(this.f167094g);
        out.writeInt(this.f167095h ? 1 : 0);
        out.writeInt(this.f167096i);
        out.writeString(this.f167097m);
        out.writeString(this.f167098n);
        out.writeString(this.f167099o);
        out.writeString(this.f167100p);
        out.writeString(this.f167101q);
        out.writeInt(this.f167102r);
        out.writeString(this.f167103s);
        out.writeString(this.f167104t);
    }

    public /* synthetic */ C12403xda2a3ec7(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z17, int i17, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, int i18, java.lang.String str10, java.lang.String str11, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i19 & 1) != 0 ? null : str, (i19 & 2) != 0 ? null : str2, (i19 & 4) != 0 ? null : str3, (i19 & 8) != 0 ? null : str4, (i19 & 16) != 0 ? false : z17, (i19 & 32) != 0 ? 0 : i17, (i19 & 64) != 0 ? null : str5, (i19 & 128) != 0 ? null : str6, (i19 & 256) != 0 ? null : str7, (i19 & 512) != 0 ? null : str8, (i19 & 1024) != 0 ? null : str9, (i19 & 2048) == 0 ? i18 : 0, (i19 & 4096) != 0 ? null : str10, (i19 & 8192) == 0 ? str11 : null);
    }
}
