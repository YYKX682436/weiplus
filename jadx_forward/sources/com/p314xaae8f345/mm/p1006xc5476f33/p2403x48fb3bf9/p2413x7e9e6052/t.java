package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052;

/* loaded from: classes15.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f264879a = null;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.s f264880b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f264881c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f264882d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f264883e;

    public t() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f264881c = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5969xdb95834b>(a0Var) { // from class: com.tencent.mm.plugin.webview.modeltools.LicenceScanner$1
            {
                this.f39173x3fe91575 = 2058274619;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5969xdb95834b c5969xdb95834b) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5969xdb95834b c5969xdb95834b2 = c5969xdb95834b;
                if (!(c5969xdb95834b2 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5969xdb95834b) || c5969xdb95834b2.f136267g.f89933a != 1) {
                    return false;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.t tVar = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.t.this;
                java.lang.String str = tVar.f264879a;
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.s sVar = tVar.f264880b;
                if (sVar != null) {
                    sVar.b(str);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.t.a(tVar);
                return false;
            }
        };
        this.f264882d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5960xee159aa6>(a0Var) { // from class: com.tencent.mm.plugin.webview.modeltools.LicenceScanner$2
            {
                this.f39173x3fe91575 = 582289590;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5960xee159aa6 c5960xee159aa6) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5960xee159aa6 c5960xee159aa62 = c5960xee159aa6;
                if (!(c5960xee159aa62 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5960xee159aa6)) {
                    return false;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.t tVar = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.t.this;
                if (!com.p314xaae8f345.p592x631407a.api.C4727x8a3e11bd.f20066xde09966f.equals(tVar.f264879a)) {
                    return false;
                }
                am.ps psVar = c5960xee159aa62.f136259g;
                int i17 = psVar.f89190b;
                if (i17 == 0) {
                    java.lang.String str = tVar.f264879a;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.s sVar = tVar.f264880b;
                    if (sVar != null) {
                        sVar.b(str);
                    }
                } else if (i17 == 1) {
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(psVar.f89189a)) {
                        java.lang.String str2 = tVar.f264879a;
                        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.s sVar2 = tVar.f264880b;
                        if (sVar2 != null) {
                            sVar2.a(str2);
                        }
                    } else {
                        try {
                            org.json.JSONObject jSONObject = new org.json.JSONObject();
                            jSONObject.put("bankcard_number", c5960xee159aa62.f136259g.f89189a);
                            java.lang.String str3 = tVar.f264879a;
                            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.s sVar3 = tVar.f264880b;
                            if (sVar3 != null) {
                                sVar3.c(str3, jSONObject, null);
                            }
                        } catch (org.json.JSONException e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LicenceScanner", "type = bankcard, add cardNum into json, exp = %s ", e17);
                            java.lang.String str4 = tVar.f264879a;
                            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.s sVar4 = tVar.f264880b;
                            if (sVar4 != null) {
                                sVar4.a(str4);
                            }
                        }
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.t.a(tVar);
                return false;
            }
        };
        this.f264883e = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5964xc2df36f0>(a0Var) { // from class: com.tencent.mm.plugin.webview.modeltools.LicenceScanner$3
            {
                this.f39173x3fe91575 = 630715104;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5964xc2df36f0 c5964xc2df36f0) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5964xc2df36f0 c5964xc2df36f02 = c5964xc2df36f0;
                if (!(c5964xc2df36f02 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5964xc2df36f0)) {
                    return false;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.t tVar = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.t.this;
                if (!tVar.f264879a.equalsIgnoreCase(c5964xc2df36f02.f136261g.f89370a)) {
                    return false;
                }
                am.rs rsVar = c5964xc2df36f02.f136261g;
                int i17 = rsVar.f89371b;
                if (i17 == 0) {
                    java.lang.String str = tVar.f264879a;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.s sVar = tVar.f264880b;
                    if (sVar != null) {
                        sVar.a(str);
                    }
                } else if (i17 == 2) {
                    java.lang.String str2 = tVar.f264879a;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.s sVar2 = tVar.f264880b;
                    if (sVar2 != null) {
                        sVar2.b(str2);
                    }
                } else {
                    try {
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(null)) {
                            java.lang.String str3 = tVar.f264879a;
                            android.graphics.Bitmap bitmap = rsVar.f89372c;
                            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.s sVar3 = tVar.f264880b;
                            if (sVar3 != null) {
                                sVar3.c(str3, null, bitmap);
                            }
                        } else {
                            org.json.JSONObject jSONObject = new org.json.JSONObject((java.lang.String) null);
                            java.lang.String str4 = tVar.f264879a;
                            android.graphics.Bitmap bitmap2 = rsVar.f89372c;
                            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.s sVar4 = tVar.f264880b;
                            if (sVar4 != null) {
                                sVar4.c(str4, jSONObject, bitmap2);
                            }
                        }
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LicenceScanner", "Failed to parse json string: %s", e17.getMessage());
                        java.lang.String str5 = tVar.f264879a;
                        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.s sVar5 = tVar.f264880b;
                        if (sVar5 != null) {
                            sVar5.a(str5);
                        }
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.t.a(tVar);
                return false;
            }
        };
    }

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.t tVar) {
        tVar.f264880b = null;
        tVar.f264881c.mo48814x2efc64();
        tVar.f264882d.mo48814x2efc64();
        tVar.f264883e.mo48814x2efc64();
    }

    public boolean b(java.lang.String str, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.s sVar) {
        boolean equalsIgnoreCase = com.p314xaae8f345.p592x631407a.api.C4727x8a3e11bd.f20066xde09966f.equalsIgnoreCase(str);
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = this.f264881c;
        if (equalsIgnoreCase) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("BaseScanUI_select_scan_mode", 7);
            intent.putExtra("scan_bankcard_with_confirm_ui", true);
            intent.addFlags(268435456);
            j45.l.j(context, "scanner", ".ui.ScanCardUI", intent, null);
            this.f264880b = sVar;
            this.f264879a = com.p314xaae8f345.p592x631407a.api.C4727x8a3e11bd.f20066xde09966f;
            abstractC20980x9b9ad01d.mo48813x58998cd();
            this.f264882d.mo48813x58998cd();
            return true;
        }
        if (!"identity_pay_auth".equalsIgnoreCase(str)) {
            return false;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("BaseScanUI_select_scan_mode", 11);
        j45.l.j(context, "scanner", ".ui.ScanCardUI", intent2, null);
        this.f264880b = sVar;
        this.f264879a = "identity_pay_auth";
        abstractC20980x9b9ad01d.mo48813x58998cd();
        this.f264883e.mo48813x58998cd();
        return true;
    }
}
