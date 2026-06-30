package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae;

/* loaded from: classes.dex */
public class l0 implements com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ServiceC19302xd3c5b06e f265075a;

    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ServiceC19302xd3c5b06e serviceC19302xd3c5b06e) {
        this.f265075a = serviceC19302xd3c5b06e;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m0
    public void a(boolean z17, int i17, int i18, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewStubService", "onWebView cdn callback progress, upload : %b, mediaType : %d, percent : %d, localid : %s, mediaId : %s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, str2);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ServiceC19302xd3c5b06e serviceC19302xd3c5b06e = this.f265075a;
        if (z17) {
            try {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("webview_jssdk_file_item_local_id", str);
                bundle.putInt("webview_jssdk_file_item_progreess", i18);
                java.util.Iterator it = ((java.util.ArrayList) serviceC19302xd3c5b06e.f265019i).iterator();
                while (it.hasNext()) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19336x1603547) it.next()).f265328d.mo70207xf5bc2045(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46349x3142bb26, bundle);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewStubService", "notify upload image failed :%s", e17.getMessage());
            }
        }
        if (i17 == 1) {
            if (z17) {
                try {
                    android.os.Bundle bundle2 = new android.os.Bundle();
                    bundle2.putString("webview_jssdk_file_item_local_id", str);
                    bundle2.putInt("webview_jssdk_file_item_progreess", i18);
                    java.util.Iterator it6 = ((java.util.ArrayList) serviceC19302xd3c5b06e.f265019i).iterator();
                    while (it6.hasNext()) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19336x1603547) it6.next()).f265328d.mo70207xf5bc2045(2003, bundle2);
                    }
                    return;
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewStubService", "notify upload image failed :%s", e18.getMessage());
                    return;
                }
            }
            try {
                android.os.Bundle bundle3 = new android.os.Bundle();
                bundle3.putString("webview_jssdk_file_item_server_id", str2);
                bundle3.putInt("webview_jssdk_file_item_progreess", i18);
                java.util.Iterator it7 = ((java.util.ArrayList) serviceC19302xd3c5b06e.f265019i).iterator();
                while (it7.hasNext()) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19336x1603547) it7.next()).f265328d.mo70207xf5bc2045(2004, bundle3);
                }
                return;
            } catch (java.lang.Exception e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewStubService", "notify download image failed :%s", e19.getMessage());
                return;
            }
        }
        if (i17 != 2) {
            if (i17 != 4) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewStubService", "unsupport media type : %d", java.lang.Integer.valueOf(i17));
                return;
            }
            if (z17) {
                try {
                    android.os.Bundle bundle4 = new android.os.Bundle();
                    bundle4.putString("webview_jssdk_file_item_local_id", str);
                    bundle4.putInt("webview_jssdk_file_item_progreess", i18);
                    java.util.Iterator it8 = ((java.util.ArrayList) serviceC19302xd3c5b06e.f265019i).iterator();
                    while (it8.hasNext()) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19336x1603547) it8.next()).f265328d.mo70207xf5bc2045(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46355x206ed2ef, bundle4);
                    }
                    return;
                } catch (java.lang.Exception e27) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewStubService", "notify upload video failed :%s", e27.getMessage());
                    return;
                }
            }
            return;
        }
        if (z17) {
            try {
                android.os.Bundle bundle5 = new android.os.Bundle();
                bundle5.putString("webview_jssdk_file_item_local_id", str);
                bundle5.putInt("webview_jssdk_file_item_progreess", i18);
                java.util.Iterator it9 = ((java.util.ArrayList) serviceC19302xd3c5b06e.f265019i).iterator();
                while (it9.hasNext()) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19336x1603547) it9.next()).f265328d.mo70207xf5bc2045(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46359x61685111, bundle5);
                }
                return;
            } catch (java.lang.Exception e28) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewStubService", "notify upload voice failed :%s", e28.getMessage());
                return;
            }
        }
        try {
            android.os.Bundle bundle6 = new android.os.Bundle();
            bundle6.putString("webview_jssdk_file_item_server_id", str2);
            bundle6.putInt("webview_jssdk_file_item_progreess", i18);
            java.util.Iterator it10 = ((java.util.ArrayList) serviceC19302xd3c5b06e.f265019i).iterator();
            while (it10.hasNext()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19336x1603547) it10.next()).f265328d.mo70207xf5bc2045(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46357xe9bcaf57, bundle6);
            }
        } catch (java.lang.Exception e29) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewStubService", "notify download voice failed :%s", e29.getMessage());
        }
    }
}
