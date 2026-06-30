package com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5;

/* loaded from: classes7.dex */
public class s0 extends org.p3343x72743996.net.mm.AbstractC29635x248bc59f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.t0 f129063a;

    public s0(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.t0 t0Var) {
        this.f129063a = t0Var;
    }

    @Override // org.p3343x72743996.net.mm.AbstractC29635x248bc59f
    /* renamed from: checkMatchIP */
    public boolean mo32140x2e80ff84(java.lang.String str) {
        return uh1.j0.u(str) == 2;
    }

    @Override // org.p3343x72743996.net.mm.AbstractC29635x248bc59f
    /* renamed from: getAbsolutePathFromJSTempFile */
    public org.p3343x72743996.net.mm.C29637x7f45871a mo32141x771c5455(java.lang.String str) {
        com.p314xaae8f345.mm.vfs.r6 r6Var;
        try {
            r6Var = this.f129063a.f129070c.mo48802x59eafec1().mo49620x1d537609(str);
        } catch (java.lang.NullPointerException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CronetBinding", "getAbsolutePathFromJSTempFile fail: " + android.util.Log.getStackTraceString(e17));
            r6Var = null;
        }
        return r6Var == null ? new org.p3343x72743996.net.mm.C29637x7f45871a(600005, "file doesn't exist", "") : new org.p3343x72743996.net.mm.C29637x7f45871a(0, "ok", r6Var.o());
    }

    @Override // org.p3343x72743996.net.mm.AbstractC29635x248bc59f
    /* renamed from: getDownloadDomains */
    public java.lang.String[] mo32142x69753c51() {
        return (java.lang.String[]) this.f129063a.f129069b.f509285s.toArray(new java.lang.String[0]);
    }

    @Override // org.p3343x72743996.net.mm.AbstractC29635x248bc59f
    /* renamed from: getDownloadMaxFileSize */
    public int mo32143x3f1c2843() {
        return this.f129063a.f129069b.f509291y;
    }

    @Override // org.p3343x72743996.net.mm.AbstractC29635x248bc59f
    /* renamed from: getReferer */
    public java.lang.String mo32144x7e7a14f7() {
        return this.f129063a.f129069b.D;
    }

    @Override // org.p3343x72743996.net.mm.AbstractC29635x248bc59f
    /* renamed from: getRequestDomains */
    public java.lang.String[] mo32145xed7c0796() {
        return (java.lang.String[]) this.f129063a.f129069b.f509282p.toArray(new java.lang.String[0]);
    }

    @Override // org.p3343x72743996.net.mm.AbstractC29635x248bc59f
    /* renamed from: getTempFileDir */
    public java.lang.String mo32146x7659b9c7() {
        return com.p314xaae8f345.mm.vfs.w6.i("wcf://networkfiles/", true);
    }

    @Override // org.p3343x72743996.net.mm.AbstractC29635x248bc59f
    /* renamed from: getUploadDomains */
    public java.lang.String[] mo32147x6bf07738() {
        return (java.lang.String[]) this.f129063a.f129069b.f509284r.toArray(new java.lang.String[0]);
    }

    @Override // org.p3343x72743996.net.mm.AbstractC29635x248bc59f
    /* renamed from: getUserVisibleDownloadMaxFileSize */
    public int mo32148x529cac8() {
        return this.f129063a.f129069b.f509292z;
    }

    @Override // org.p3343x72743996.net.mm.AbstractC29635x248bc59f
    /* renamed from: moveFileToJSFile */
    public org.p3343x72743996.net.mm.C29637x7f45871a mo32149x7a3728ad(java.lang.String str, java.lang.String str2) {
        jc1.d dVar;
        try {
            dVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.c2.D(this.f129063a.f129070c.C0(), new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str)), str2, null);
        } catch (java.lang.NullPointerException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CronetBinding", "moveFileToJSFile fail: " + android.util.Log.getStackTraceString(e17));
            dVar = new jc1.d(-1, "save file failed " + e17.getMessage());
        }
        return !"ok".equals(dVar.f380437b) ? new org.p3343x72743996.net.mm.C29637x7f45871a(603300, dVar.f380437b, "") : new org.p3343x72743996.net.mm.C29637x7f45871a(0, "ok", "");
    }

    @Override // org.p3343x72743996.net.mm.AbstractC29635x248bc59f
    /* renamed from: moveFileToJSTempDir */
    public org.p3343x72743996.net.mm.C29637x7f45871a mo32150x36be7b48(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 j1Var;
        ik1.b0 b0Var = new ik1.b0();
        try {
            j1Var = this.f129063a.f129070c.mo48802x59eafec1().mo49619x6aa75256(new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str)), str2, true, b0Var);
        } catch (java.lang.NullPointerException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CronetBinding", "moveFileToJSTempDir fail: " + android.util.Log.getStackTraceString(e17));
            j1Var = null;
        }
        return j1Var == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.ERR_EXCEED_DIRECTORY_MAX_SIZE ? new org.p3343x72743996.net.mm.C29637x7f45871a(603301, "fail:exceed max file size", "") : j1Var != com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.OK ? new org.p3343x72743996.net.mm.C29637x7f45871a(603300, "fail:download save file error", "") : new org.p3343x72743996.net.mm.C29637x7f45871a(0, "ok", (java.lang.String) b0Var.f373357a);
    }

    @Override // org.p3343x72743996.net.mm.AbstractC29635x248bc59f
    /* renamed from: onHeaderReceived */
    public void mo32151x5957fb4d(java.lang.String str, java.lang.String str2, int i17) {
        try {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5164x497885b6 c5164x497885b6 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5164x497885b6();
            am.u uVar = c5164x497885b6.f135514g;
            uVar.f89578a = str;
            uVar.f89580c = new org.json.JSONObject(str2);
            uVar.f89579b = java.lang.String.valueOf(i17);
            c5164x497885b6.e();
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CronetBinding", "onHeaderReceived: " + e17.getMessage());
        }
    }

    @Override // org.p3343x72743996.net.mm.AbstractC29635x248bc59f
    /* renamed from: onRequestCreated */
    public void mo32152xfd799d18(java.lang.String str, int i17) {
        this.f129063a.f129071d.incrementAndGet();
    }

    @Override // org.p3343x72743996.net.mm.AbstractC29635x248bc59f
    /* renamed from: onRequestFinished */
    public void mo32153x1d116842(java.lang.String str, int i17) {
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.t0 t0Var = this.f129063a;
        int decrementAndGet = t0Var.f129071d.decrementAndGet();
        if (decrementAndGet < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CronetBinding", "onRequestFinished count:%d warning", java.lang.Integer.valueOf(decrementAndGet));
            t0Var.f129071d.set(0);
        }
    }

    @Override // org.p3343x72743996.net.mm.AbstractC29635x248bc59f
    /* renamed from: onUserVisibleTaskCanceled */
    public void mo32154xad158c26(java.lang.String str, int i17) {
    }

    @Override // org.p3343x72743996.net.mm.AbstractC29635x248bc59f
    /* renamed from: onUserVisibleTaskFailed */
    public void mo32155x66ca1b0a(java.lang.String str, int i17) {
    }

    @Override // org.p3343x72743996.net.mm.AbstractC29635x248bc59f
    /* renamed from: onUserVisibleTaskProgressUpdate */
    public void mo32156xef333b23(java.lang.String str, int i17, int i18, long j17, long j18) {
    }

    @Override // org.p3343x72743996.net.mm.AbstractC29635x248bc59f
    /* renamed from: onUserVisibleTaskStart */
    public void mo32157x1494aff5(java.lang.String str, int i17) {
    }

    @Override // org.p3343x72743996.net.mm.AbstractC29635x248bc59f
    /* renamed from: onUserVisibleTaskSucceeded */
    public void mo32158x1192ac74(java.lang.String str, int i17) {
    }

    @Override // org.p3343x72743996.net.mm.AbstractC29635x248bc59f
    /* renamed from: shouldCheckDomains */
    public boolean mo32159xda85b35a() {
        return this.f129063a.f129069b.f509273d;
    }

    @Override // org.p3343x72743996.net.mm.AbstractC29635x248bc59f
    /* renamed from: shouldEnableWildcardDomainMatch */
    public boolean mo32160x62a6d431() {
        return j62.e.g().i("clicfg_weapp_android_allow_wildcard_domain_check", 0, true, true) == 1;
    }
}
