package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1086x5c28046;

/* loaded from: classes13.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f162371d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.v75 f162372e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1086x5c28046.g f162373f;

    public d(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, r45.v75 v75Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1086x5c28046.g gVar) {
        this.f162371d = u3Var;
        this.f162372e = v75Var;
        this.f162373f = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jz5.f0 f0Var;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f162371d;
        if (u3Var.isShowing()) {
            u3Var.dismiss();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1086x5c28046.g gVar = this.f162373f;
        r45.v75 v75Var = this.f162372e;
        if (v75Var != null) {
            int i17 = v75Var.f469497d;
            java.lang.String str = v75Var.f469498e;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            java.lang.String str2 = str == null ? "" : str;
            java.lang.String str3 = v75Var.f469499f;
            java.lang.String str4 = str3 == null ? "" : str3;
            java.lang.String str5 = v75Var.f469500g;
            java.lang.String str6 = str5 == null ? "" : str5;
            java.lang.String str7 = v75Var.f469503m;
            java.lang.String str8 = str7 == null ? "" : str7;
            java.lang.String str9 = v75Var.f469502i;
            java.lang.String str10 = str9 == null ? "" : str9;
            java.lang.String str11 = v75Var.f469501h;
            if (str11 == null) {
                str11 = "";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1086x5c28046.C12087xb35414e9 c12087xb35414e9 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1086x5c28046.C12087xb35414e9(i17, str2, str4, str6, str8, str10, str11);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenDesignerProfile.FetchDesignerProxyTask", "handleRequest, getDesignerInfo success");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1086x5c28046.C12086xa4bbbb46 c12086xa4bbbb46 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1086x5c28046.C12086xa4bbbb46();
            c12086xa4bbbb46.f162346d = true;
            c12086xa4bbbb46.f162347e = c12087xb35414e9;
            gVar.m50420x7b736e5c(c12086xa4bbbb46);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiOpenDesignerProfile.FetchDesignerProxyTask", "handleRequest, getDesignerInfo result is null");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1086x5c28046.C12086xa4bbbb46 c12086xa4bbbb462 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1086x5c28046.C12086xa4bbbb46();
            c12086xa4bbbb462.f162346d = false;
            gVar.m50420x7b736e5c(c12086xa4bbbb462);
        }
    }
}
