package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes15.dex */
public class JsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.media.JsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.media.f7();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f81672f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f81673g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f81674h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f81675i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f81676m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f81677n;

    /* renamed from: o, reason: collision with root package name */
    public int f81678o;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f81682s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.Runnable f81683t;

    /* renamed from: u, reason: collision with root package name */
    public android.app.Activity f81684u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsapi.l f81685v;

    /* renamed from: x, reason: collision with root package name */
    public i91.g f81687x;

    /* renamed from: y, reason: collision with root package name */
    public i91.h f81688y;

    /* renamed from: p, reason: collision with root package name */
    public int f81679p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f81680q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f81681r = 0;

    /* renamed from: w, reason: collision with root package name */
    public android.app.ProgressDialog f81686w = null;

    public JsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask() {
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f81672f = parcel.readString();
        this.f81673g = parcel.readString();
        this.f81675i = parcel.readString();
        this.f81676m = parcel.readString();
        this.f81677n = parcel.readString();
        this.f81678o = parcel.readInt();
        this.f81674h = parcel.readInt() == 1;
        this.f81679p = parcel.readInt();
        this.f81681r = parcel.readInt();
        this.f81680q = parcel.readInt();
        this.f81682s = parcel.readString();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f81672f);
        parcel.writeString(this.f81673g);
        parcel.writeString(this.f81675i);
        parcel.writeString(this.f81676m);
        parcel.writeString(this.f81677n);
        parcel.writeInt(this.f81678o);
        parcel.writeInt(this.f81674h ? 1 : 0);
        parcel.writeInt(this.f81679p);
        parcel.writeInt(this.f81681r);
        parcel.writeInt(this.f81680q);
        parcel.writeString(this.f81682s);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        int i17 = this.f81681r;
        if (i17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "CLIENT_EVENT_INIT");
            return;
        }
        if (i17 == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "CLIENT_EVENT_FINISH");
            android.app.ProgressDialog progressDialog = this.f81686w;
            if (progressDialog != null) {
                progressDialog.dismiss();
                this.f81686w = null;
            }
            java.lang.Runnable runnable = this.f81683t;
            if (runnable != null) {
                ((com.tencent.mm.plugin.appbrand.jsapi.media.u6) runnable).run();
                return;
            }
            return;
        }
        if (i17 == 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "CLIENT_EVENT_SHOW_DIALOG");
            android.app.Activity activity = this.f81684u;
            com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(activity, activity.getString(com.tencent.mm.R.string.f490573yv), this.f81684u.getString(com.tencent.mm.R.string.a2l), true, true, new com.tencent.mm.plugin.appbrand.jsapi.media.b7(this));
            this.f81686w = Q;
            Q.setOnKeyListener(new com.tencent.mm.plugin.appbrand.jsapi.media.e7(this));
            return;
        }
        if (i17 == 3) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "CLIENT_EVENT_PROGRESS");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("tempFilePath", this.f81673g);
            hashMap.put("percent", java.lang.Integer.valueOf(this.f81679p));
            java.lang.String jSONObject = new org.json.JSONObject(hashMap).toString();
            com.tencent.mm.plugin.appbrand.jsapi.media.y6 y6Var = new com.tencent.mm.plugin.appbrand.jsapi.media.y6(null);
            y6Var.u(this.f81685v);
            y6Var.f82374f = jSONObject;
            y6Var.m();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        i91.b bVar;
        java.util.Vector vector;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "runInMainProcess mainEvent:%d, clientEvent:%d", java.lang.Integer.valueOf(this.f81680q), java.lang.Integer.valueOf(this.f81681r));
        boolean z17 = false;
        if (this.f81680q == 1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiUploadEncryptedFileToCDN", "user cancel upload the file, remove callback");
            i91.d Ni = com.tencent.mm.plugin.appbrand.app.r9.Ni();
            i91.g gVar = this.f81687x;
            java.util.Vector vector2 = Ni.f289699b;
            if (vector2 != null && gVar != null) {
                vector2.remove(gVar);
            }
            i91.d Ni2 = com.tencent.mm.plugin.appbrand.app.r9.Ni();
            i91.h hVar = this.f81688y;
            java.util.Vector vector3 = Ni2.f289698a;
            if (vector3 != null && hVar != null) {
                vector3.remove(hVar);
            }
            com.tencent.mm.plugin.appbrand.app.r9.Ni().b(this.f81673g);
            this.f81680q = 0;
            this.f81681r = 1;
            c();
            return;
        }
        com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject d17 = com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager.d(this.f81672f, this.f81673g);
        if (d17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiUploadEncryptedFileToCDN", "getItemByLocalId return mediaObject is null, ");
            this.f81681r = 1;
            c();
            return;
        }
        i91.b bVar2 = new i91.b();
        bVar2.f289691a = d17.f76102d;
        bVar2.f289692b = d17.f76103e;
        java.lang.String str = this.f81673g;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        bVar2.f289694d = com.tencent.mm.modelcdntran.i2.b("appbrandmediafile", java.lang.System.currentTimeMillis(), str, str);
        com.tencent.mm.plugin.appbrand.app.r9.bj().a(bVar2);
        this.f81687x = new com.tencent.mm.plugin.appbrand.jsapi.media.z6(this);
        this.f81688y = new com.tencent.mm.plugin.appbrand.jsapi.media.a7(this, d17);
        i91.d Ni3 = com.tencent.mm.plugin.appbrand.app.r9.Ni();
        i91.g gVar2 = this.f81687x;
        java.util.Vector vector4 = Ni3.f289699b;
        if (vector4 != null && gVar2 != null && !vector4.contains(gVar2)) {
            vector4.add(gVar2);
        }
        i91.d Ni4 = com.tencent.mm.plugin.appbrand.app.r9.Ni();
        java.lang.String str2 = d17.f76102d;
        i91.h hVar2 = this.f81688y;
        Ni4.getClass();
        i91.e bj6 = com.tencent.mm.plugin.appbrand.app.r9.bj();
        bj6.getClass();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppbrandMediaCdnItemManager", "get by local id error, local id is null or nil");
            bVar = null;
        } else {
            bVar = (i91.b) bj6.f289701a.get(str2);
        }
        if (bVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppbrandCdnService", "addUploadTask get webview file chooser item  by local id failed : %s", str2);
        } else {
            if (hVar2 != null && (vector = Ni4.f289698a) != null && !vector.contains(hVar2)) {
                vector.add(hVar2);
            }
            bVar.f289696f = true;
            dn.m mVar = new dn.m();
            mVar.f241785d = "task_AppbrandCdnService_1";
            mVar.f241787f = Ni4.f289700c;
            mVar.f241786e = true;
            mVar.field_mediaId = bVar.f289694d;
            mVar.field_fullpath = bVar.f289692b;
            mVar.field_fileType = 10011;
            mVar.field_talker = "weixin";
            mVar.field_priority = 2;
            mVar.field_needStorage = true;
            mVar.field_isStreamMedia = false;
            mVar.field_appType = 0;
            mVar.field_bzScene = 0;
            mVar.field_force_aeskeycdn = true;
            mVar.field_trysafecdn = false;
            z17 = ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppbrandCdnService", "summersafecdn add upload cdn task : %b, force_aeskeycdn: %b, trysafecdn: %b, localid : %s ", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(mVar.field_force_aeskeycdn), java.lang.Boolean.valueOf(mVar.field_trysafecdn), str2);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "addUploadTask: add cdn upload task result : %b", java.lang.Boolean.valueOf(z17));
        if (z17) {
            if (this.f81674h) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "show the process dialog");
                this.f81681r = 2;
                c();
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiUploadEncryptedFileToCDN", "addUploadTask fail");
        this.f81681r = 1;
        i91.d Ni5 = com.tencent.mm.plugin.appbrand.app.r9.Ni();
        i91.g gVar3 = this.f81687x;
        java.util.Vector vector5 = Ni5.f289699b;
        if (vector5 != null && gVar3 != null) {
            vector5.remove(gVar3);
        }
        i91.d Ni6 = com.tencent.mm.plugin.appbrand.app.r9.Ni();
        i91.h hVar3 = this.f81688y;
        java.util.Vector vector6 = Ni6.f289698a;
        if (vector6 != null && hVar3 != null) {
            vector6.remove(hVar3);
        }
        com.tencent.mm.plugin.appbrand.app.r9.Ni().b(d17.f76102d);
        c();
    }

    public JsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask(android.os.Parcel parcel) {
        v(parcel);
    }
}
