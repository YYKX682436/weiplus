package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public final class h9 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f162814a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f162815b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.i9 f162816c;

    public h9(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.i9 i9Var) {
        this.f162814a = lVar;
        this.f162815b = i17;
        this.f162816c = i9Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.u
    /* renamed from: onReceiveResult */
    public void mo50331x8a4d1541(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11888x1a859600 abstractC11888x1a859600) {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11928xba1e0e3e c11928xba1e0e3e = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11928xba1e0e3e) abstractC11888x1a859600;
        if (this.f162814a.mo48798x74292566() != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.m6.a(this.f162814a.mo48798x74292566()).f167246f = false;
        }
        if (c11928xba1e0e3e == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f162814a;
            int i17 = this.f162815b;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.i9 i9Var = this.f162816c;
            i9Var.getClass();
            str2 = android.text.TextUtils.isEmpty(null) ? "cancel" : null;
            str = str2 != null ? str2 : "";
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 1);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            lVar.a(i17, i9Var.u(str, jSONObject));
            return;
        }
        if (c11928xba1e0e3e.f160116e == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar2 = this.f162814a;
            int i18 = this.f162815b;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.i9 i9Var2 = this.f162816c;
            i9Var2.getClass();
            str2 = android.text.TextUtils.isEmpty(null) ? "cancel" : null;
            str = str2 != null ? str2 : "";
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 1);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            lVar2.a(i18, i9Var2.u(str, jSONObject2));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar3 = this.f162814a;
        int i19 = this.f162815b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.i9 i9Var3 = this.f162816c;
        i9Var3.getClass();
        java.lang.String str5 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        str = str5 != null ? str5 : "";
        java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        try {
            jSONObject3.put("errno", 0);
        } catch (java.lang.Exception e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
        }
        lVar3.a(i19, i9Var3.u(str, jSONObject3));
    }
}
