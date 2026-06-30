package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.JsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask */
/* loaded from: classes15.dex */
public class C12168x62e4d433 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12168x62e4d433> f34470x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.f7();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f163205f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f163206g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f163207h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f163208i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f163209m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f163210n;

    /* renamed from: o, reason: collision with root package name */
    public int f163211o;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f163215s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.Runnable f163216t;

    /* renamed from: u, reason: collision with root package name */
    public android.app.Activity f163217u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f163218v;

    /* renamed from: x, reason: collision with root package name */
    public i91.g f163220x;

    /* renamed from: y, reason: collision with root package name */
    public i91.h f163221y;

    /* renamed from: p, reason: collision with root package name */
    public int f163212p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f163213q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f163214r = 0;

    /* renamed from: w, reason: collision with root package name */
    public android.app.ProgressDialog f163219w = null;

    public C12168x62e4d433() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        this.f163205f = parcel.readString();
        this.f163206g = parcel.readString();
        this.f163208i = parcel.readString();
        this.f163209m = parcel.readString();
        this.f163210n = parcel.readString();
        this.f163211o = parcel.readInt();
        this.f163207h = parcel.readInt() == 1;
        this.f163212p = parcel.readInt();
        this.f163214r = parcel.readInt();
        this.f163213q = parcel.readInt();
        this.f163215s = parcel.readString();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f163205f);
        parcel.writeString(this.f163206g);
        parcel.writeString(this.f163208i);
        parcel.writeString(this.f163209m);
        parcel.writeString(this.f163210n);
        parcel.writeInt(this.f163211o);
        parcel.writeInt(this.f163207h ? 1 : 0);
        parcel.writeInt(this.f163212p);
        parcel.writeInt(this.f163214r);
        parcel.writeInt(this.f163213q);
        parcel.writeString(this.f163215s);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        int i17 = this.f163214r;
        if (i17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "CLIENT_EVENT_INIT");
            return;
        }
        if (i17 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "CLIENT_EVENT_FINISH");
            android.app.ProgressDialog progressDialog = this.f163219w;
            if (progressDialog != null) {
                progressDialog.dismiss();
                this.f163219w = null;
            }
            java.lang.Runnable runnable = this.f163216t;
            if (runnable != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.u6) runnable).run();
                return;
            }
            return;
        }
        if (i17 == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "CLIENT_EVENT_SHOW_DIALOG");
            android.app.Activity activity = this.f163217u;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), this.f163217u.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a2l), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.b7(this));
            this.f163219w = Q;
            Q.setOnKeyListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.e7(this));
            return;
        }
        if (i17 == 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "CLIENT_EVENT_PROGRESS");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("tempFilePath", this.f163206g);
            hashMap.put("percent", java.lang.Integer.valueOf(this.f163212p));
            java.lang.String jSONObject = new org.json.JSONObject(hashMap).toString();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.y6 y6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.y6(null);
            y6Var.u(this.f163218v);
            y6Var.f163907f = jSONObject;
            y6Var.m();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        i91.b bVar;
        java.util.Vector vector;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "runInMainProcess mainEvent:%d, clientEvent:%d", java.lang.Integer.valueOf(this.f163213q), java.lang.Integer.valueOf(this.f163214r));
        boolean z17 = false;
        if (this.f163213q == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiUploadEncryptedFileToCDN", "user cancel upload the file, remove callback");
            i91.d Ni = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Ni();
            i91.g gVar = this.f163220x;
            java.util.Vector vector2 = Ni.f371232b;
            if (vector2 != null && gVar != null) {
                vector2.remove(gVar);
            }
            i91.d Ni2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Ni();
            i91.h hVar = this.f163221y;
            java.util.Vector vector3 = Ni2.f371231a;
            if (vector3 != null && hVar != null) {
                vector3.remove(hVar);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Ni().b(this.f163206g);
            this.f163213q = 0;
            this.f163214r = 1;
            c();
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11693xc4fcf5fe d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11694xde197cf.d(this.f163205f, this.f163206g);
        if (d17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiUploadEncryptedFileToCDN", "getItemByLocalId return mediaObject is null, ");
            this.f163214r = 1;
            c();
            return;
        }
        i91.b bVar2 = new i91.b();
        bVar2.f371224a = d17.f157635d;
        bVar2.f371225b = d17.f157636e;
        java.lang.String str = this.f163206g;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        bVar2.f371227d = com.p314xaae8f345.mm.p947xba6de98f.i2.b("appbrandmediafile", java.lang.System.currentTimeMillis(), str, str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.bj().a(bVar2);
        this.f163220x = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.z6(this);
        this.f163221y = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.a7(this, d17);
        i91.d Ni3 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Ni();
        i91.g gVar2 = this.f163220x;
        java.util.Vector vector4 = Ni3.f371232b;
        if (vector4 != null && gVar2 != null && !vector4.contains(gVar2)) {
            vector4.add(gVar2);
        }
        i91.d Ni4 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Ni();
        java.lang.String str2 = d17.f157635d;
        i91.h hVar2 = this.f163221y;
        Ni4.getClass();
        i91.e bj6 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.bj();
        bj6.getClass();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppbrandMediaCdnItemManager", "get by local id error, local id is null or nil");
            bVar = null;
        } else {
            bVar = (i91.b) bj6.f371234a.get(str2);
        }
        if (bVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppbrandCdnService", "addUploadTask get webview file chooser item  by local id failed : %s", str2);
        } else {
            if (hVar2 != null && (vector = Ni4.f371231a) != null && !vector.contains(hVar2)) {
                vector.add(hVar2);
            }
            bVar.f371229f = true;
            dn.m mVar = new dn.m();
            mVar.f323318d = "task_AppbrandCdnService_1";
            mVar.f323320f = Ni4.f371233c;
            mVar.f323319e = true;
            mVar.f69601xaca5bdda = bVar.f371227d;
            mVar.f69595x6d25b0d9 = bVar.f371225b;
            mVar.f69592xf1ebe47b = 10011;
            mVar.f69618x114ef53e = "weixin";
            mVar.f69609xd84b8349 = 2;
            mVar.f69606xccdbf540 = true;
            mVar.f69597x853bb235 = false;
            mVar.f69580x454032b6 = 0;
            mVar.f69584x89a4c0cf = 0;
            mVar.f69594x4b409164 = true;
            mVar.f69621xf91593ca = false;
            z17 = ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppbrandCdnService", "summersafecdn add upload cdn task : %b, force_aeskeycdn: %b, trysafecdn: %b, localid : %s ", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(mVar.f69594x4b409164), java.lang.Boolean.valueOf(mVar.f69621xf91593ca), str2);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "addUploadTask: add cdn upload task result : %b", java.lang.Boolean.valueOf(z17));
        if (z17) {
            if (this.f163207h) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "show the process dialog");
                this.f163214r = 2;
                c();
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiUploadEncryptedFileToCDN", "addUploadTask fail");
        this.f163214r = 1;
        i91.d Ni5 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Ni();
        i91.g gVar3 = this.f163220x;
        java.util.Vector vector5 = Ni5.f371232b;
        if (vector5 != null && gVar3 != null) {
            vector5.remove(gVar3);
        }
        i91.d Ni6 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Ni();
        i91.h hVar3 = this.f163221y;
        java.util.Vector vector6 = Ni6.f371231a;
        if (vector6 != null && hVar3 != null) {
            vector6.remove(hVar3);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Ni().b(d17.f157635d);
        c();
    }

    public C12168x62e4d433(android.os.Parcel parcel) {
        v(parcel);
    }
}
