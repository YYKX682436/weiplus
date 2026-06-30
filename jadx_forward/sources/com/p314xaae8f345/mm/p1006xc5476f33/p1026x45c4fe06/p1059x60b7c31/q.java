package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public class q extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.u1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164374b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 f164375c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164376d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f164377e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0 f164378f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.os.Looper f164379g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m f164380h;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m mVar, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var, java.lang.String str2, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0 c0Var, android.os.Looper looper) {
        this.f164380h = mVar;
        this.f164374b = str;
        this.f164375c = k0Var;
        this.f164376d = str2;
        this.f164377e = i17;
        this.f164378f = c0Var;
        this.f164379g = looper;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.j
    public void a() {
        java.lang.String o17;
        if (android.text.TextUtils.isEmpty(this.f165032a)) {
            android.os.Looper looper = this.f164379g;
            if (looper != null && looper != android.os.Looper.myLooper()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.Cif cif = this.f164380h.f163116p;
                int i17 = this.f164377e;
                synchronized (cif) {
                    if (!cif.f162850b) {
                        cif.f162851c.put(i17, java.lang.System.currentTimeMillis());
                    }
                }
                new android.os.Handler(this.f164379g).post(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p(this, this));
                return;
            }
            boolean c17 = this.f164380h.c(this.f164375c.k(), this.f164378f);
            if (!c17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandComponentImpl", "invoke handler.proceed() log[%s] api[%s], callbackId[%d], component not running", this.f164380h.b0(), this.f164375c, java.lang.Integer.valueOf(this.f164377e));
            }
            if (c17) {
                try {
                    org.json.JSONObject c07 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m.c0(this.f164380h, this.f164374b);
                    try {
                        org.json.JSONObject c08 = !android.text.TextUtils.isEmpty(this.f164376d) ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m.c0(this.f164380h, this.f164376d.trim()) : null;
                        if (c07 != null && c07.optBoolean("noCallback", false)) {
                            this.f164380h.f163121u.put(java.lang.Integer.valueOf(this.f164377e), java.lang.Boolean.TRUE);
                        }
                        o17 = c07 == null ? this.f164375c.o("fail:invalid data") : this.f164380h.r0(this.f164375c, c07, c08, this.f164377e, this.f164378f);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m mVar = this.f164380h;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var = this.f164375c;
                        java.lang.String str = this.f164374b;
                        java.lang.String str2 = this.f164376d;
                        int i18 = this.f164377e;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k kVar = mVar.f163111h;
                        if (kVar != null) {
                            kVar.a(k0Var, str, str2, i18, o17);
                        }
                    } catch (java.lang.OutOfMemoryError e17) {
                        java.lang.Object[] objArr = new java.lang.Object[2];
                        objArr[0] = this.f164375c.k();
                        java.lang.String str3 = this.f164376d;
                        objArr[1] = java.lang.Integer.valueOf((str3 != null ? str3 : "").length());
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandComponentImpl", "invokeImpl() parsePrivateDataStr, api[%s], privateData.length[%d]", objArr);
                        throw e17;
                    }
                } catch (java.lang.OutOfMemoryError e18) {
                    java.lang.Object[] objArr2 = new java.lang.Object[2];
                    objArr2[0] = this.f164375c.k();
                    java.lang.String str4 = this.f164374b;
                    objArr2[1] = java.lang.Integer.valueOf((str4 != null ? str4 : "").length());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandComponentImpl", "invokeImpl() parseDataStr oom, api[%s], data_length[%d]", objArr2);
                    throw e18;
                }
            } else {
                o17 = this.f164375c.o("fail:interrupted");
            }
            if (android.text.TextUtils.isEmpty(o17)) {
                return;
            }
            this.f165032a = o17;
            if (this.f164375c instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m mVar2 = this.f164380h;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0 c0Var = this.f164378f;
            if (c0Var == null) {
                c0Var = mVar2.mo50357xcd94f799();
            }
            mVar2.d0(this.f164377e, o17, c0Var);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.j
    public void b(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(this.f165032a) && !android.text.TextUtils.isEmpty(str)) {
            this.f165032a = str;
            if (this.f164375c instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m mVar = this.f164380h;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0 c0Var = this.f164378f;
            if (c0Var == null) {
                c0Var = mVar.mo50357xcd94f799();
            }
            mVar.d0(this.f164377e, str, c0Var);
        }
    }
}
