package com.tencent.luggage.sdk.jsapi.component.service;

/* loaded from: classes7.dex */
public class s0 extends org.chromium.net.mm.CronetJsBinding {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.jsapi.component.service.t0 f47530a;

    public s0(com.tencent.luggage.sdk.jsapi.component.service.t0 t0Var) {
        this.f47530a = t0Var;
    }

    @Override // org.chromium.net.mm.CronetJsBinding
    public boolean checkMatchIP(java.lang.String str) {
        return uh1.j0.u(str) == 2;
    }

    @Override // org.chromium.net.mm.CronetJsBinding
    public org.chromium.net.mm.FileOpResult getAbsolutePathFromJSTempFile(java.lang.String str) {
        com.tencent.mm.vfs.r6 r6Var;
        try {
            r6Var = this.f47530a.f47537c.getFileSystem().getAbsoluteFile(str);
        } catch (java.lang.NullPointerException e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.CronetBinding", "getAbsolutePathFromJSTempFile fail: " + android.util.Log.getStackTraceString(e17));
            r6Var = null;
        }
        return r6Var == null ? new org.chromium.net.mm.FileOpResult(600005, "file doesn't exist", "") : new org.chromium.net.mm.FileOpResult(0, "ok", r6Var.o());
    }

    @Override // org.chromium.net.mm.CronetJsBinding
    public java.lang.String[] getDownloadDomains() {
        return (java.lang.String[]) this.f47530a.f47536b.f427752s.toArray(new java.lang.String[0]);
    }

    @Override // org.chromium.net.mm.CronetJsBinding
    public int getDownloadMaxFileSize() {
        return this.f47530a.f47536b.f427758y;
    }

    @Override // org.chromium.net.mm.CronetJsBinding
    public java.lang.String getReferer() {
        return this.f47530a.f47536b.D;
    }

    @Override // org.chromium.net.mm.CronetJsBinding
    public java.lang.String[] getRequestDomains() {
        return (java.lang.String[]) this.f47530a.f47536b.f427749p.toArray(new java.lang.String[0]);
    }

    @Override // org.chromium.net.mm.CronetJsBinding
    public java.lang.String getTempFileDir() {
        return com.tencent.mm.vfs.w6.i("wcf://networkfiles/", true);
    }

    @Override // org.chromium.net.mm.CronetJsBinding
    public java.lang.String[] getUploadDomains() {
        return (java.lang.String[]) this.f47530a.f47536b.f427751r.toArray(new java.lang.String[0]);
    }

    @Override // org.chromium.net.mm.CronetJsBinding
    public int getUserVisibleDownloadMaxFileSize() {
        return this.f47530a.f47536b.f427759z;
    }

    @Override // org.chromium.net.mm.CronetJsBinding
    public org.chromium.net.mm.FileOpResult moveFileToJSFile(java.lang.String str, java.lang.String str2) {
        jc1.d dVar;
        try {
            dVar = com.tencent.mm.plugin.appbrand.jsapi.file.c2.D(this.f47530a.f47537c.C0(), new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str)), str2, null);
        } catch (java.lang.NullPointerException e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.CronetBinding", "moveFileToJSFile fail: " + android.util.Log.getStackTraceString(e17));
            dVar = new jc1.d(-1, "save file failed " + e17.getMessage());
        }
        return !"ok".equals(dVar.f298904b) ? new org.chromium.net.mm.FileOpResult(603300, dVar.f298904b, "") : new org.chromium.net.mm.FileOpResult(0, "ok", "");
    }

    @Override // org.chromium.net.mm.CronetJsBinding
    public org.chromium.net.mm.FileOpResult moveFileToJSTempDir(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.appbrand.appstorage.j1 j1Var;
        ik1.b0 b0Var = new ik1.b0();
        try {
            j1Var = this.f47530a.f47537c.getFileSystem().createTempFileFrom(new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str)), str2, true, b0Var);
        } catch (java.lang.NullPointerException e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.CronetBinding", "moveFileToJSTempDir fail: " + android.util.Log.getStackTraceString(e17));
            j1Var = null;
        }
        return j1Var == com.tencent.mm.plugin.appbrand.appstorage.j1.ERR_EXCEED_DIRECTORY_MAX_SIZE ? new org.chromium.net.mm.FileOpResult(603301, "fail:exceed max file size", "") : j1Var != com.tencent.mm.plugin.appbrand.appstorage.j1.OK ? new org.chromium.net.mm.FileOpResult(603300, "fail:download save file error", "") : new org.chromium.net.mm.FileOpResult(0, "ok", (java.lang.String) b0Var.f291824a);
    }

    @Override // org.chromium.net.mm.CronetJsBinding
    public void onHeaderReceived(java.lang.String str, java.lang.String str2, int i17) {
        try {
            com.tencent.mm.autogen.events.AppBrandNetWorkReqHeaderReceivedEvent appBrandNetWorkReqHeaderReceivedEvent = new com.tencent.mm.autogen.events.AppBrandNetWorkReqHeaderReceivedEvent();
            am.u uVar = appBrandNetWorkReqHeaderReceivedEvent.f53981g;
            uVar.f8045a = str;
            uVar.f8047c = new org.json.JSONObject(str2);
            uVar.f8046b = java.lang.String.valueOf(i17);
            appBrandNetWorkReqHeaderReceivedEvent.e();
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CronetBinding", "onHeaderReceived: " + e17.getMessage());
        }
    }

    @Override // org.chromium.net.mm.CronetJsBinding
    public void onRequestCreated(java.lang.String str, int i17) {
        this.f47530a.f47538d.incrementAndGet();
    }

    @Override // org.chromium.net.mm.CronetJsBinding
    public void onRequestFinished(java.lang.String str, int i17) {
        com.tencent.luggage.sdk.jsapi.component.service.t0 t0Var = this.f47530a;
        int decrementAndGet = t0Var.f47538d.decrementAndGet();
        if (decrementAndGet < 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.CronetBinding", "onRequestFinished count:%d warning", java.lang.Integer.valueOf(decrementAndGet));
            t0Var.f47538d.set(0);
        }
    }

    @Override // org.chromium.net.mm.CronetJsBinding
    public void onUserVisibleTaskCanceled(java.lang.String str, int i17) {
    }

    @Override // org.chromium.net.mm.CronetJsBinding
    public void onUserVisibleTaskFailed(java.lang.String str, int i17) {
    }

    @Override // org.chromium.net.mm.CronetJsBinding
    public void onUserVisibleTaskProgressUpdate(java.lang.String str, int i17, int i18, long j17, long j18) {
    }

    @Override // org.chromium.net.mm.CronetJsBinding
    public void onUserVisibleTaskStart(java.lang.String str, int i17) {
    }

    @Override // org.chromium.net.mm.CronetJsBinding
    public void onUserVisibleTaskSucceeded(java.lang.String str, int i17) {
    }

    @Override // org.chromium.net.mm.CronetJsBinding
    public boolean shouldCheckDomains() {
        return this.f47530a.f47536b.f427740d;
    }

    @Override // org.chromium.net.mm.CronetJsBinding
    public boolean shouldEnableWildcardDomainMatch() {
        return j62.e.g().i("clicfg_weapp_android_allow_wildcard_domain_check", 0, true, true) == 1;
    }
}
