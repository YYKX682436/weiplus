package com.tencent.mm.plugin.appbrand.config;

/* loaded from: classes7.dex */
public class WxaAttributes$WxaPluginCodeInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaPluginCodeInfo> CREATOR = new k91.q5();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f77433d;

    /* renamed from: e, reason: collision with root package name */
    public int f77434e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f77435f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f77436g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f77437h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f77438i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public long f77439m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f77440n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f77441o;

    public WxaAttributes$WxaPluginCodeInfo() {
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x009d A[Catch: JSONException -> 0x00d9, LOOP:1: B:33:0x0097->B:35:0x009d, LOOP_END, TryCatch #0 {JSONException -> 0x00d9, blocks: (B:6:0x0008, B:8:0x000e, B:10:0x0032, B:13:0x003a, B:14:0x0040, B:16:0x0046, B:21:0x004e, B:23:0x007b, B:27:0x0085, B:29:0x008f, B:33:0x0097, B:35:0x009d, B:37:0x00b7, B:39:0x00ae, B:45:0x0016, B:47:0x001a, B:48:0x001e), top: B:5:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List a(java.lang.Object r14) {
        /*
            java.lang.String r0 = "auto_update"
            java.lang.String r1 = "MicroMsg.AppBrand.WxaAttributes.WxaPluginCodeInfo"
            r2 = 0
            if (r14 != 0) goto L8
            return r2
        L8:
            boolean r3 = r14 instanceof java.lang.String     // Catch: org.json.JSONException -> Ld9
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L16
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch: org.json.JSONException -> Ld9
            java.lang.String r14 = (java.lang.String) r14     // Catch: org.json.JSONException -> Ld9
            r3.<init>(r14)     // Catch: org.json.JSONException -> Ld9
            goto L30
        L16:
            boolean r3 = r14 instanceof org.json.JSONArray     // Catch: org.json.JSONException -> Ld9
            if (r3 == 0) goto L1e
            r3 = r14
            org.json.JSONArray r3 = (org.json.JSONArray) r3     // Catch: org.json.JSONException -> Ld9
            goto L30
        L1e:
            java.lang.String r3 = "WxaPluginCodeInfo.optPluginCodeInfoList() invalid pluginCodeObj:%s"
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch: org.json.JSONException -> Ld9
            java.lang.Class r14 = r14.getClass()     // Catch: org.json.JSONException -> Ld9
            java.lang.String r14 = r14.getName()     // Catch: org.json.JSONException -> Ld9
            r6[r5] = r14     // Catch: org.json.JSONException -> Ld9
            com.tencent.mars.xlog.Log.e(r1, r3, r6)     // Catch: org.json.JSONException -> Ld9
            r3 = r2
        L30:
            if (r3 == 0) goto Ld8
            int r14 = r3.length()     // Catch: org.json.JSONException -> Ld9
            if (r14 != 0) goto L3a
            goto Ld8
        L3a:
            java.util.LinkedList r14 = new java.util.LinkedList     // Catch: org.json.JSONException -> Ld9
            r14.<init>()     // Catch: org.json.JSONException -> Ld9
            r6 = r5
        L40:
            int r7 = r3.length()     // Catch: org.json.JSONException -> Ld9
            if (r6 >= r7) goto Ld7
            org.json.JSONObject r7 = r3.getJSONObject(r6)     // Catch: org.json.JSONException -> Ld9
            if (r7 != 0) goto L4e
            goto Ld3
        L4e:
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaPluginCodeInfo r8 = new com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaPluginCodeInfo     // Catch: org.json.JSONException -> Ld9
            r8.<init>()     // Catch: org.json.JSONException -> Ld9
            java.util.List r9 = r8.f77438i     // Catch: org.json.JSONException -> Ld9
            java.lang.String r10 = "plugin_id"
            java.lang.String r10 = r7.optString(r10)     // Catch: org.json.JSONException -> Ld9
            r8.f77433d = r10     // Catch: org.json.JSONException -> Ld9
            java.lang.String r10 = "inner_version"
            int r10 = r7.optInt(r10)     // Catch: org.json.JSONException -> Ld9
            r8.f77434e = r10     // Catch: org.json.JSONException -> Ld9
            java.lang.String r10 = "md5"
            java.lang.String r10 = r7.optString(r10)     // Catch: org.json.JSONException -> Ld9
            r8.f77435f = r10     // Catch: org.json.JSONException -> Ld9
            java.lang.String r10 = "prefix_path"
            java.lang.String r10 = r7.optString(r10)     // Catch: org.json.JSONException -> Ld9
            r8.f77436g = r10     // Catch: org.json.JSONException -> Ld9
            boolean r10 = r7.optBoolean(r0)     // Catch: org.json.JSONException -> Ld9
            if (r10 != 0) goto L84
            int r10 = r7.optInt(r0, r5)     // Catch: org.json.JSONException -> Ld9
            if (r10 <= 0) goto L82
            goto L84
        L82:
            r10 = r5
            goto L85
        L84:
            r10 = r4
        L85:
            r8.f77437h = r10     // Catch: org.json.JSONException -> Ld9
            java.lang.String r10 = "contexts"
            org.json.JSONArray r10 = r7.optJSONArray(r10)     // Catch: org.json.JSONException -> Ld9
            if (r10 == 0) goto Lae
            int r11 = r10.length()     // Catch: org.json.JSONException -> Ld9
            if (r11 > 0) goto L96
            goto Lae
        L96:
            r11 = r5
        L97:
            int r12 = r10.length()     // Catch: org.json.JSONException -> Ld9
            if (r11 >= r12) goto Lb7
            int r12 = r10.optInt(r11)     // Catch: org.json.JSONException -> Ld9
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch: org.json.JSONException -> Ld9
            r13 = r9
            java.util.LinkedList r13 = (java.util.LinkedList) r13     // Catch: org.json.JSONException -> Ld9
            r13.add(r12)     // Catch: org.json.JSONException -> Ld9
            int r11 = r11 + 1
            goto L97
        Lae:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)     // Catch: org.json.JSONException -> Ld9
            java.util.LinkedList r9 = (java.util.LinkedList) r9     // Catch: org.json.JSONException -> Ld9
            r9.add(r10)     // Catch: org.json.JSONException -> Ld9
        Lb7:
            java.lang.String r9 = "dev_key"
            long r9 = r7.optLong(r9)     // Catch: org.json.JSONException -> Ld9
            r8.f77439m = r9     // Catch: org.json.JSONException -> Ld9
            java.lang.String r9 = "version_desc"
            java.lang.String r9 = r7.optString(r9)     // Catch: org.json.JSONException -> Ld9
            r8.f77440n = r9     // Catch: org.json.JSONException -> Ld9
            java.lang.String r9 = "semver"
            java.lang.String r7 = r7.optString(r9)     // Catch: org.json.JSONException -> Ld9
            r8.f77441o = r7     // Catch: org.json.JSONException -> Ld9
            r14.add(r8)     // Catch: org.json.JSONException -> Ld9
        Ld3:
            int r6 = r6 + 1
            goto L40
        Ld7:
            return r14
        Ld8:
            return r2
        Ld9:
            r14 = move-exception
            java.lang.String r0 = "parse json array, e = %s"
            java.lang.Object[] r14 = new java.lang.Object[]{r14}
            com.tencent.mars.xlog.Log.e(r1, r0, r14)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaPluginCodeInfo.a(java.lang.Object):java.util.List");
    }

    public static java.util.List b(java.util.List list, java.lang.Object obj, int i17) {
        java.util.List list2 = null;
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaWidgetInfo wxaAttributes$WxaWidgetInfo = (com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaWidgetInfo) it.next();
                if (wxaAttributes$WxaWidgetInfo.f77474d == i17) {
                    list2 = wxaAttributes$WxaWidgetInfo.f77477g;
                }
            }
        }
        return list2 == null ? a(obj) : list2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f77433d);
        parcel.writeInt(this.f77434e);
        parcel.writeString(this.f77435f);
        parcel.writeString(this.f77436g);
        parcel.writeByte(this.f77437h ? (byte) 1 : (byte) 0);
        parcel.writeList(this.f77438i);
        parcel.writeLong(this.f77439m);
        parcel.writeString(this.f77440n);
        parcel.writeString(this.f77441o);
    }

    public WxaAttributes$WxaPluginCodeInfo(android.os.Parcel parcel) {
        this.f77433d = parcel.readString();
        this.f77434e = parcel.readInt();
        this.f77435f = parcel.readString();
        this.f77436g = parcel.readString();
        this.f77437h = parcel.readByte() == 1;
        parcel.readList(this.f77438i, java.lang.Integer.class.getClassLoader());
        this.f77439m = parcel.readLong();
        this.f77440n = parcel.readString();
        this.f77441o = parcel.readString();
    }
}
