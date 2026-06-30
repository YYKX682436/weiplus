package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app;

/* loaded from: classes8.dex */
public class m extends dm.m0 {

    /* renamed from: f2, reason: collision with root package name */
    public static final l75.e0 f270516f2 = dm.m0.m125212x3593deb(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m.class);

    /* renamed from: e2, reason: collision with root package name */
    public java.util.Map f270517e2;

    public m() {
        this.f67370x28d45f97 = "";
        this.f67372x453d1e07 = "";
        this.f67366xc9d6017c = "";
        this.f67369x5e556d3a = "";
        this.f67376xfead224a = "";
        this.f67379x119cf7dc = 0;
        this.f67380x32aac1e7 = "";
        this.f67386xa1e9e82c = "";
        this.f67391x10a0fed7 = 4;
        this.f67390xda9bc3b3 = "";
        this.f67383x15b870c = 0L;
        this.f67373x634ac1e1 = "";
        this.f67375x634ac3bb = "";
        this.f67374x634ac23b = "";
        this.f67367xdf182e4c = "";
        this.f67368xdf183026 = "";
        this.f67378x454032b6 = "";
        this.f67384x996f3ea = "";
        this.f67381x731b46d9 = 0;
        this.f67371xa2e856b6 = 0;
        this.I = "";
        this.H = "";
        this.A = true;
        z0("");
        A0("");
        this.R = "";
        this.S = "";
        this.A = true;
    }

    public java.util.List D0(java.lang.String str) {
        if (this.f270517e2 == null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f67385x9b127804)) {
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(this.f67385x9b127804);
                for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                    org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
                    java.lang.String optString = jSONObject.optString("PackageName");
                    java.lang.String optString2 = jSONObject.optString("AndroidSignature");
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
                        if (this.f270517e2 == null) {
                            this.f270517e2 = new java.util.HashMap();
                        }
                        java.util.List list = (java.util.List) ((java.util.HashMap) this.f270517e2).get(optString);
                        if (list == null) {
                            list = new java.util.ArrayList();
                        }
                        list.add(optString2);
                        ((java.util.HashMap) this.f270517e2).put(optString, list);
                    }
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppInfo", "getPackageInfos failed:" + e17.getMessage());
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String str2 = this.f67386xa1e9e82c;
        if (str2 != null && str2.equals(str)) {
            arrayList.add(this.f67390xda9bc3b3);
        }
        java.util.Map map = this.f270517e2;
        if (map != null && ((java.util.HashMap) map).containsKey(str)) {
            arrayList.addAll((java.util.Collection) ((java.util.HashMap) this.f270517e2).get(str));
        }
        return arrayList;
    }

    public boolean F0() {
        return "wx7302cee7c7d6d7d6".equals(this.f67370x28d45f97);
    }

    public boolean G0() {
        return this.f67388x728ca6b != 0;
    }

    @Override // dm.m0, l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f67378x454032b6) && (this.f67378x454032b6.startsWith("1") || this.f67378x454032b6.startsWith("6"))) {
            this.f67378x454032b6 = "," + this.f67378x454032b6;
        }
        return super.mo9763xeb27878e();
    }

    /* renamed from: equals */
    public boolean m75174xb2c87fbf(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m) {
            return ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m) obj).f67370x28d45f97.equals(this.f67370x28d45f97);
        }
        return false;
    }

    @Override // dm.m0, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f270516f2;
    }

    /* renamed from: hashCode */
    public int m75175x8cdac1b() {
        return !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f67370x28d45f97) ? this.f67370x28d45f97.hashCode() : super.hashCode();
    }

    public boolean k() {
        java.lang.String[] split;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f67378x454032b6) && (split = this.f67378x454032b6.split(",")) != null && split.length != 0) {
            for (java.lang.String str : split) {
                if (str.equals("1")) {
                    return true;
                }
            }
        }
        return false;
    }
}
