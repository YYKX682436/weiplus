package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1069x2e06d1;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.base.ReportSubmitFormTask */
/* loaded from: classes4.dex */
public class C12015x8f4deb15 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1069x2e06d1.C12015x8f4deb15> f33889x681a0c0c = new gb1.p();

    /* renamed from: f, reason: collision with root package name */
    public int f161382f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f161383g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f161384h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f161385i;

    /* renamed from: m, reason: collision with root package name */
    public int f161386m;

    /* renamed from: n, reason: collision with root package name */
    public int f161387n;

    public C12015x8f4deb15() {
    }

    public static void B(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1069x2e06d1.C12015x8f4deb15 c12015x8f4deb15, java.util.LinkedList linkedList) {
        linkedList.addAll(c12015x8f4deb15.C());
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.rf7 rf7Var = (r45.rf7) it.next();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("type", rf7Var.f466350d);
                jSONObject.put("appid", rf7Var.f466351e);
                jSONObject.put("formid", rf7Var.f466352f);
                jSONObject.put("pageid", rf7Var.f466353g);
                jSONObject.put("appstate", rf7Var.f466354h);
                jSONObject.put("appversion", rf7Var.f466355i);
                jSONArray.put(jSONObject);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ReportSubmitFormTask", e17.getMessage());
            }
        }
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_APP_BRAND_FAILED_FORMID_STRING, jSONArray.toString());
    }

    public final java.util.LinkedList C() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray((java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_APP_BRAND_FAILED_FORMID_STRING, null));
            for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
                r45.rf7 rf7Var = new r45.rf7();
                rf7Var.f466350d = jSONObject.getInt("type");
                rf7Var.f466351e = jSONObject.getString("appid");
                rf7Var.f466352f = jSONObject.getString("formid");
                rf7Var.f466353g = jSONObject.getString("pageid");
                rf7Var.f466354h = jSONObject.getInt("appstate");
                rf7Var.f466355i = jSONObject.getInt("appversion");
                linkedList.add(rf7Var);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ReportSubmitFormTask", e17.getMessage());
        }
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_APP_BRAND_FAILED_FORMID_STRING, "");
        return linkedList;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        this.f161382f = parcel.readInt();
        this.f161383g = parcel.readString();
        this.f161384h = parcel.readString();
        this.f161385i = parcel.readString();
        this.f161386m = parcel.readInt();
        this.f161387n = parcel.readInt();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f161382f);
        parcel.writeString(this.f161383g);
        parcel.writeString(this.f161384h);
        parcel.writeString(this.f161385i);
        parcel.writeInt(this.f161386m);
        parcel.writeInt(this.f161387n);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.ig();
        lVar.f152198b = new r45.jg();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/wxausrevent/batchrecordwxatemplatemsgevent";
        lVar.f152200d = 1129;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        r45.ig igVar = (r45.ig) a17.f152243a.f152217a;
        igVar.f458543d = new java.util.LinkedList();
        r45.rf7 rf7Var = new r45.rf7();
        rf7Var.f466350d = this.f161382f;
        rf7Var.f466351e = this.f161383g;
        rf7Var.f466352f = this.f161384h;
        rf7Var.f466353g = this.f161385i;
        rf7Var.f466354h = this.f161386m;
        rf7Var.f466355i = this.f161387n;
        igVar.f458543d.add(rf7Var);
        synchronized (getClass()) {
            igVar.f458543d.addAll(C());
        }
        com.p314xaae8f345.mm.p944x882e457a.z2.d(a17, new gb1.o(this, igVar), false);
    }

    public C12015x8f4deb15(k91.z0 z0Var) {
        this.f161383g = z0Var.f387375e;
        this.f161386m = z0Var.f387385r.f156932d;
        this.f161387n = z0Var.f387385r.f33456x1c82a56c;
    }
}
