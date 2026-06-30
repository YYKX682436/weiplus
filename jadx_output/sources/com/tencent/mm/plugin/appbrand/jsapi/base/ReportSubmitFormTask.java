package com.tencent.mm.plugin.appbrand.jsapi.base;

/* loaded from: classes4.dex */
public class ReportSubmitFormTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.base.ReportSubmitFormTask> CREATOR = new gb1.p();

    /* renamed from: f, reason: collision with root package name */
    public int f79849f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f79850g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f79851h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f79852i;

    /* renamed from: m, reason: collision with root package name */
    public int f79853m;

    /* renamed from: n, reason: collision with root package name */
    public int f79854n;

    public ReportSubmitFormTask() {
    }

    public static void B(com.tencent.mm.plugin.appbrand.jsapi.base.ReportSubmitFormTask reportSubmitFormTask, java.util.LinkedList linkedList) {
        linkedList.addAll(reportSubmitFormTask.C());
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.rf7 rf7Var = (r45.rf7) it.next();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("type", rf7Var.f384817d);
                jSONObject.put("appid", rf7Var.f384818e);
                jSONObject.put("formid", rf7Var.f384819f);
                jSONObject.put("pageid", rf7Var.f384820g);
                jSONObject.put("appstate", rf7Var.f384821h);
                jSONObject.put("appversion", rf7Var.f384822i);
                jSONArray.put(jSONObject);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ReportSubmitFormTask", e17.getMessage());
            }
        }
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_APP_BRAND_FAILED_FORMID_STRING, jSONArray.toString());
    }

    public final java.util.LinkedList C() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray((java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_APP_BRAND_FAILED_FORMID_STRING, null));
            for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
                r45.rf7 rf7Var = new r45.rf7();
                rf7Var.f384817d = jSONObject.getInt("type");
                rf7Var.f384818e = jSONObject.getString("appid");
                rf7Var.f384819f = jSONObject.getString("formid");
                rf7Var.f384820g = jSONObject.getString("pageid");
                rf7Var.f384821h = jSONObject.getInt("appstate");
                rf7Var.f384822i = jSONObject.getInt("appversion");
                linkedList.add(rf7Var);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ReportSubmitFormTask", e17.getMessage());
        }
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_APP_BRAND_FAILED_FORMID_STRING, "");
        return linkedList;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f79849f = parcel.readInt();
        this.f79850g = parcel.readString();
        this.f79851h = parcel.readString();
        this.f79852i = parcel.readString();
        this.f79853m = parcel.readInt();
        this.f79854n = parcel.readInt();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f79849f);
        parcel.writeString(this.f79850g);
        parcel.writeString(this.f79851h);
        parcel.writeString(this.f79852i);
        parcel.writeInt(this.f79853m);
        parcel.writeInt(this.f79854n);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ig();
        lVar.f70665b = new r45.jg();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/wxausrevent/batchrecordwxatemplatemsgevent";
        lVar.f70667d = 1129;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        r45.ig igVar = (r45.ig) a17.f70710a.f70684a;
        igVar.f377010d = new java.util.LinkedList();
        r45.rf7 rf7Var = new r45.rf7();
        rf7Var.f384817d = this.f79849f;
        rf7Var.f384818e = this.f79850g;
        rf7Var.f384819f = this.f79851h;
        rf7Var.f384820g = this.f79852i;
        rf7Var.f384821h = this.f79853m;
        rf7Var.f384822i = this.f79854n;
        igVar.f377010d.add(rf7Var);
        synchronized (getClass()) {
            igVar.f377010d.addAll(C());
        }
        com.tencent.mm.modelbase.z2.d(a17, new gb1.o(this, igVar), false);
    }

    public ReportSubmitFormTask(k91.z0 z0Var) {
        this.f79850g = z0Var.f305842e;
        this.f79853m = z0Var.f305852r.f75399d;
        this.f79854n = z0Var.f305852r.pkgVersion;
    }
}
