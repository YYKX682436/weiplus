package uw4;

/* loaded from: classes8.dex */
public class e extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.q1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ uw4.n f513259b;

    public e(uw4.n nVar) {
        this.f513259b = nVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.q1, com.p314xaae8f345.p3210x3857dc.p3215x21ffc6bd.C27839xa92bc749
    /* renamed from: onMiscCallBack */
    public java.lang.Object mo52190xdaaffcf0(java.lang.String str, android.os.Bundle bundle) {
        uw4.n nVar = this.f513259b;
        java.lang.ref.WeakReference weakReference = nVar.K;
        if (weakReference == null || weakReference.get() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageMMWebViewCoreImpl", "page is null");
            return super.mo52190xdaaffcf0(str, bundle);
        }
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageMMWebViewCoreImpl", "method is null");
            return super.mo52190xdaaffcf0(str, bundle);
        }
        if (str.equals("getDrawable")) {
            java.lang.String string = bundle.getString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56317xb68cafb1);
            int i17 = bundle.getInt("resourceId");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string) && i17 > 0) {
                try {
                    return j65.j.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageManager().getResourcesForApplication(string), i17);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuggageMMWebViewCoreImpl", "get resource for package : %s, fail, : %s", string, e17.getMessage());
                }
            }
        }
        if (str.equals("getShareUrl")) {
            try {
                java.lang.String p17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) nVar.K.get()).f263711J.p(nVar.mo120156xb5887639());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageMMWebViewCoreImpl", "getShareUrl by x5 core, shareurl = %s", p17);
                return p17;
            } catch (java.lang.Exception unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuggageMMWebViewCoreImpl", "getShare url failed");
            }
        }
        if (str.equals("supportImagePreview")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageMMWebViewCoreImpl", "supportImagePreview");
            return java.lang.Boolean.TRUE;
        }
        if (str.equals("imagePreview")) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.x0.b(bundle, ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) nVar.K.get()).f263713p, null, ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) nVar.K.get()).f488190n.getBoolean("show_full_screen", false));
            return java.lang.Boolean.TRUE;
        }
        if (!str.equals("closeImagePreview")) {
            return super.mo52190xdaaffcf0(str, bundle);
        }
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.x0.f264894b;
        new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5275xae8d45b5().e();
        return java.lang.Boolean.TRUE;
    }
}
