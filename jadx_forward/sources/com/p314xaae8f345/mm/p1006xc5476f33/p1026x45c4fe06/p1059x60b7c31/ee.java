package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

@mk0.a
/* loaded from: classes7.dex */
final class ee implements com.p314xaae8f345.mm.p794xb0fa9b5e.i<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11945x7657f959, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11946x584a00d1> {

    /* renamed from: d, reason: collision with root package name */
    public boolean f162343d = false;

    private ee() {
    }

    public final void a(final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11945x7657f959 c11945x7657f959, final com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar, boolean z17) {
        java.lang.String str = z17 ? c11945x7657f959.f160176e : c11945x7657f959.f160175d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShowImageOperateSheet", "doRecognizeLogic mIsBakPathUsed:%b useBak:%b path:%s", java.lang.Boolean.valueOf(this.f162343d), java.lang.Boolean.valueOf(z17), str);
        this.f162343d = z17;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            if (rVar != null) {
                rVar.a(null);
                return;
            }
            return;
        }
        final ik1.b0 b0Var = new ik1.b0();
        final ik1.b0 b0Var2 = new ik1.b0();
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        final java.lang.String str2 = str;
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7> abstractC20980x9b9ad01d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7>(this, a0Var) { // from class: com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognize$1
            {
                this.f39173x3fe91575 = 812146647;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7 c5886xd11a0be7) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7 c5886xd11a0be72 = c5886xd11a0be7;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShowImageOperateSheet", "IPCQRCodeRecognize callback");
                if (b0Var.f373357a != null) {
                    ((com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d) b0Var.f373357a).mo48814x2efc64();
                }
                if (b0Var2.f373357a != null) {
                    ((com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d) b0Var2.f373357a).mo48814x2efc64();
                }
                if (!str2.equals(c5886xd11a0be72.f136194g.f87901a)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiShowImageOperateSheet", "IPCQRCodeRecognize file path no same recognizeFilePath:%s filePath:%s", str2, c5886xd11a0be72.f136194g.f87901a);
                    return false;
                }
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.s6 s6Var = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.s6.f273431a;
                java.lang.String e17 = s6Var.e(c5886xd11a0be72);
                int c17 = s6Var.c(c5886xd11a0be72);
                int d17 = s6Var.d(c5886xd11a0be72);
                if (rVar == null) {
                    return false;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11946x584a00d1 c11946x584a00d1 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11946x584a00d1();
                c11946x584a00d1.f160177d = e17;
                c11946x584a00d1.f160178e = c5886xd11a0be72.f136194g.f87901a;
                c11946x584a00d1.f160179f = c17;
                c11946x584a00d1.f160180g = d17;
                c11946x584a00d1.f160181h = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.s6.b(c5886xd11a0be72);
                rVar.a(c11946x584a00d1);
                return false;
            }
        };
        b0Var.f373357a = abstractC20980x9b9ad01d;
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5885x60bd3c7> abstractC20980x9b9ad01d2 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5885x60bd3c7>(a0Var) { // from class: com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognize$2
            {
                this.f39173x3fe91575 = 1700407223;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5885x60bd3c7 c5885x60bd3c7) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5885x60bd3c7 c5885x60bd3c72 = c5885x60bd3c7;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShowImageOperateSheet", "IPCQRCodeRecognize failed : mIsBakPathUsed:%b", java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ee.this.f162343d));
                if (b0Var.f373357a != null) {
                    ((com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d) b0Var.f373357a).mo48814x2efc64();
                }
                if (b0Var2.f373357a != null) {
                    ((com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d) b0Var2.f373357a).mo48814x2efc64();
                }
                if (!str2.equals(c5885x60bd3c72.f136193g.f87811a)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiShowImageOperateSheet", "IPCQRCodeRecognize failed : file path no same recognizeFilePath:%s filePath:%s", str2, c5885x60bd3c72.f136193g.f87811a);
                    return false;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ee eeVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ee.this;
                if (eeVar.f162343d) {
                    return false;
                }
                eeVar.a(c11945x7657f959, rVar, true);
                return false;
            }
        };
        b0Var2.f373357a = abstractC20980x9b9ad01d2;
        abstractC20980x9b9ad01d.mo48813x58998cd();
        abstractC20980x9b9ad01d2.mo48813x58998cd();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5884x4c2d9184 c5884x4c2d9184 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5884x4c2d9184();
        c5884x4c2d9184.f136192g.f87707a = java.lang.System.currentTimeMillis();
        am.aq aqVar = c5884x4c2d9184.f136192g;
        aqVar.f87708b = str;
        aqVar.f87710d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.md.f163136j;
        c5884x4c2d9184.e();
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11945x7657f959 c11945x7657f959 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11945x7657f959) obj;
        if (c11945x7657f959 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiShowImageOperateSheet", "IPCQRCodeRecognize data null");
        } else {
            a(c11945x7657f959, rVar, false);
        }
    }
}
