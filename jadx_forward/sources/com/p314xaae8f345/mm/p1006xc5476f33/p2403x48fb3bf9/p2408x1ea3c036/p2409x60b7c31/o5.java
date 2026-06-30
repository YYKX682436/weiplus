package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes12.dex */
public class o5 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "uploadMediaFile";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public int c() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void d(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void e(sd.b bVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUploadMediaFile", "invokeInOwn");
        java.lang.String optString = bVar.f488130b.f426039c.optString("appId");
        java.lang.String optString2 = bVar.f488130b.f426039c.optString(dm.i4.f66867x2a5c95c7);
        boolean z17 = bVar.f488130b.f426039c.optInt("isShowProgressTips", 0) == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUploadMediaFile", "uploadMediaFile, appid = %s, localid = %s, isShowProgressTips = %b", optString, optString2, java.lang.Boolean.valueOf(z17));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiUploadMediaFile", "appId or localid is null or nil.");
            bVar.c("missing arguments", null);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.l6 l6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.l6();
        sd.d dVar = bVar.f488129a;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) dVar).f488143d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.n5 n5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.n5(this, bVar, l6Var);
        l6Var.f263919a = abstractActivityC21394xb3d2c0cf;
        l6Var.f263920b = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) dVar;
        l6Var.f263921c = optString;
        l6Var.f263922d = optString2;
        l6Var.f263923e = z17;
        l6Var.f263924f = n5Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2411x36f002.g.a(optString2);
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UploadMediaFileHelp", "item is null");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.n5) l6Var.f263924f).a(false, null);
            return;
        }
        if (a17.f264275n == 1) {
            l6Var.c();
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17.f264271g) || !com.p314xaae8f345.mm.vfs.w6.j(a17.f264271g)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UploadMediaFileHelp", "origFilePath is not exist");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.n5) l6Var.f263924f).a(false, null);
        } else {
            if (com.p314xaae8f345.mm.p971x6de15a2e.y2.a(l6Var.f263919a)) {
                l6Var.d();
                return;
            }
            java.lang.String h07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h0((int) com.p314xaae8f345.mm.vfs.w6.k(a17.f264271g));
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = l6Var.f263919a;
            db5.e1.H(abstractActivityC21394xb3d2c0cf2, abstractActivityC21394xb3d2c0cf2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l6k, h07), l6Var.f263919a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), false, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.u5(l6Var), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.v5(l6Var));
        }
    }
}
