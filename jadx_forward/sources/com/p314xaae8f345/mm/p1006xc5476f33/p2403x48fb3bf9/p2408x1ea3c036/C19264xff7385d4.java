package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.plugin.webview.luggage.LuggageWebViewLongClickHelper$QBarLogicTask */
/* loaded from: classes8.dex */
public class C19264xff7385d4 implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p794xb0fa9b5e.r f263666d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.Map f263667e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f263668f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f263669g;

    private C19264xff7385d4() {
        com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f263668f = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7>(a0Var) { // from class: com.tencent.mm.plugin.webview.luggage.LuggageWebViewLongClickHelper$QBarLogicTask.1
            {
                this.f39173x3fe91575 = 812146647;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7 c5886xd11a0be7) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7 c5886xd11a0be72 = c5886xd11a0be7;
                if (!(c5886xd11a0be72 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7)) {
                    return false;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.C19264xff7385d4 c19264xff7385d4 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.C19264xff7385d4.this;
                java.util.Map map = c19264xff7385d4.f263667e;
                if (map != null) {
                    if (!((java.util.HashMap) map).containsKey(c5886xd11a0be72.f136194g.f87901a)) {
                        return false;
                    }
                }
                java.util.Map map2 = c19264xff7385d4.f263667e;
                if (map2 != null) {
                    ((java.util.HashMap) map2).remove(c5886xd11a0be72.f136194g.f87901a);
                }
                com.p314xaae8f345.mm.vfs.w6.h(c5886xd11a0be72.f136194g.f87901a);
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.s6 s6Var = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.s6.f273431a;
                java.lang.String e17 = s6Var.e(c5886xd11a0be72);
                int c17 = s6Var.c(c5886xd11a0be72);
                int d17 = s6Var.d(c5886xd11a0be72);
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("file_path", c5886xd11a0be72.f136194g.f87901a);
                bundle.putString("result", e17);
                bundle.putInt("code_type", c17);
                bundle.putInt("code_version", d17);
                c19264xff7385d4.f263666d.a(bundle);
                return false;
            }
        };
        this.f263669g = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5885x60bd3c7>(a0Var) { // from class: com.tencent.mm.plugin.webview.luggage.LuggageWebViewLongClickHelper$QBarLogicTask.2
            {
                this.f39173x3fe91575 = 1700407223;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5885x60bd3c7 c5885x60bd3c7) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5885x60bd3c7 c5885x60bd3c72 = c5885x60bd3c7;
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.C19264xff7385d4 c19264xff7385d4 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.C19264xff7385d4.this;
                java.util.Map map = c19264xff7385d4.f263667e;
                if (map != null) {
                    if (!((java.util.HashMap) map).containsKey(c5885x60bd3c72.f136193g.f87811a)) {
                        return false;
                    }
                }
                java.util.Map map2 = c19264xff7385d4.f263667e;
                if (map2 != null) {
                    ((java.util.HashMap) map2).remove(c5885x60bd3c72.f136193g.f87811a);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.QBarLogicTask", "delete qb recog fail: %s", c5885x60bd3c72.f136193g.f87811a);
                com.p314xaae8f345.mm.vfs.w6.h(c5885x60bd3c72.f136193g.f87811a);
                return false;
            }
        };
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        this.f263666d = rVar;
        int i17 = bundle.getInt("type");
        java.lang.String string = bundle.getString("img_path");
        int i18 = bundle.getInt("x_down");
        int i19 = bundle.getInt("y_down");
        if (i17 == 1) {
            if (this.f263667e == null) {
                this.f263667e = new java.util.HashMap();
                this.f263668f.mo48813x58998cd();
                this.f263669g.mo48813x58998cd();
            }
            c01.l2 c17 = c01.n2.d().c("basescanui@datacenter", true);
            c17.i("key_basescanui_screen_position", java.lang.Boolean.TRUE);
            c17.i("key_basescanui_screen_x", java.lang.Float.valueOf(i18));
            c17.i("key_basescanui_screen_y", java.lang.Float.valueOf(i19));
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5884x4c2d9184 c5884x4c2d9184 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5884x4c2d9184();
            am.aq aqVar = c5884x4c2d9184.f136192g;
            aqVar.f87708b = string;
            aqVar.f87707a = java.lang.System.currentTimeMillis();
            c5884x4c2d9184.e();
            ((java.util.HashMap) this.f263667e).put(string, 1);
            return;
        }
        if (i17 == 2) {
            java.util.Map map = this.f263667e;
            if (map == null || !((java.util.HashMap) map).containsKey(string)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.QBarLogicTask", "%s is not recognizing", string);
                return;
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5226x932022f1 c5226x932022f1 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5226x932022f1();
            c5226x932022f1.f135559g.getClass();
            c5226x932022f1.e();
            ((java.util.HashMap) this.f263667e).remove(string);
            com.p314xaae8f345.mm.vfs.w6.h(string);
            return;
        }
        if (i17 != 3) {
            if (i17 != 4) {
                return;
            }
            java.lang.String string2 = bundle.getString("wxa_result");
            int i27 = bundle.getInt("wxa_code_type", 0);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.QBarLogicTask", "resultStr is null");
                return;
            } else {
                ((jd0.q2) ((kd0.x2) i95.n0.c(kd0.x2.class))).getClass();
                new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.y().a(i27, new kd0.f2(string2)).a(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.s3(this));
                return;
            }
        }
        java.lang.String string3 = bundle.getString("result");
        java.lang.String string4 = bundle.getString("url");
        java.lang.String string5 = bundle.getString("imageUrl");
        int i28 = bundle.getInt("codeType");
        int i29 = bundle.getInt("codeVersion");
        java.lang.String string6 = bundle.getString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1);
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ActivityC19304x577b8b34.class);
        intent.setFlags(872415232);
        intent.putExtra("key_string_for_scan", string3);
        intent.putExtra("key_string_for_url", string4);
        intent.putExtra("key_string_for_image_url", string5);
        intent.putExtra("key_codetype_for_scan", i28);
        intent.putExtra("key_codeversion_for_scan", i29);
        intent.putExtra("key_file_path_for_scan", string6);
        intent.putExtra("key_delete_file_after_deal", true);
        java.lang.String string7 = bundle.getString("preUsername");
        java.lang.String string8 = bundle.getString("preChatName");
        java.lang.String string9 = bundle.getString("rawUrl");
        java.lang.String a17 = c01.n2.a("WebviewQrCode");
        c01.l2 c18 = c01.n2.d().c(a17, true);
        c18.i("preUsername", string7);
        c18.i("preChatName", string8);
        c18.i("url", string4);
        c18.i("Contact_Sub_Scene", java.lang.Integer.valueOf(((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).p(string4) ? 1 : 6));
        c18.i("Contact_Scene_Note", string4);
        c18.i("rawUrl", string9);
        intent.putExtra("img_gallery_session_id", a17);
        java.lang.String string10 = bundle.getString("pre_username");
        if (string10 != null && c01.e2.G(string10)) {
            intent.putExtra("key_string_for_from_username", string10);
        }
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/webview/luggage/LuggageWebViewLongClickHelper$QBarLogicTask", "reqDealQBarResult", "(Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/webview/luggage/LuggageWebViewLongClickHelper$QBarLogicTask", "reqDealQBarResult", "(Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
