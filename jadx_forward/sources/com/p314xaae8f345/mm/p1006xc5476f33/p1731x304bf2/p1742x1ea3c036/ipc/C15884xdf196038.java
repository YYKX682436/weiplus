package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ipc;

/* renamed from: com.tencent.mm.plugin.game.luggage.ipc.CommonLogicTask */
/* loaded from: classes8.dex */
public class C15884xdf196038 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ipc.C15884xdf196038> f36927x681a0c0c = new w43.c();

    /* renamed from: f, reason: collision with root package name */
    public android.os.Bundle f221103f = new android.os.Bundle();

    /* renamed from: g, reason: collision with root package name */
    public int f221104g;

    public C15884xdf196038() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        this.f221104g = parcel.readInt();
        this.f221103f = parcel.readBundle(getClass().getClassLoader());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f221104g);
        parcel.writeBundle(this.f221103f);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        int i17;
        switch (this.f221104g) {
            case 1:
                android.os.Bundle bundle = this.f221103f;
                if (bundle != null) {
                    boolean z17 = bundle.getBoolean("permission_allow", false);
                    java.lang.String string = this.f221103f.getString("url");
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ComonLogicTask", "ACTIVITY_JUMP_HANDLER, url is null");
                        return;
                    } else {
                        ((com.p314xaae8f345.mm.app.p622xc5476f33.j) o25.z1.a()).c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, string, z17, null);
                        break;
                    }
                }
                break;
            case 2:
                android.os.Bundle bundle2 = this.f221103f;
                if (bundle2 != null) {
                    int[] intArray = bundle2.getIntArray("getConfigStgKey");
                    if (intArray != null && intArray.length != 0) {
                        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
                        for (int i18 : intArray) {
                            gm0.j1.i();
                            java.lang.String str = (java.lang.String) gm0.j1.u().c().l(i18, null);
                            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                            if (str == null) {
                                str = "";
                            }
                            arrayList.add(str);
                        }
                        this.f221103f.putStringArrayList("getConfigStgValue", arrayList);
                        break;
                    } else {
                        return;
                    }
                }
                break;
            case 3:
                android.os.Bundle bundle3 = this.f221103f;
                if (bundle3 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.Zi().b(bundle3.getString(dm.i4.f66867x2a5c95c7));
                    if (b17 != null) {
                        this.f221103f.putParcelable("item", b17);
                        break;
                    }
                }
                break;
            case 4:
                boolean z19 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_open_webview_allow_download_file, 1) == 1;
                if (this.f221103f == null) {
                    this.f221103f = new android.os.Bundle();
                }
                this.f221103f.putBoolean("allowDownloadFile", z19);
                break;
            case 5:
                try {
                    i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("EnableWebviewScanQRCode"), 1);
                } catch (java.lang.Exception unused) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ComonLogicTask", "getIntValFromDynamicConfig parseInt failed, val: EnableWebviewScanQRCode");
                    i17 = 1;
                }
                this.f221103f.putBoolean("allow_webview_scan", i17 == 1);
                break;
            case 6:
                this.f221103f.putBoolean("has_set_uin", gm0.j1.a());
                break;
            case 8:
                this.f221103f.putString("file_path", com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.o5.e(this.f221103f.getString(dm.i4.f66867x2a5c95c7)));
                break;
            case 9:
                java.lang.String string2 = this.f221103f.getString("game_hv_menu_appid");
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5571xfff98751 c5571xfff98751 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5571xfff98751();
                am.le leVar = c5571xfff98751.f135891g;
                leVar.f88776a = 3;
                leVar.f88777b = string2;
                c5571xfff98751.e();
                this.f221103f.putString("game_hv_menu_pbcache", c5571xfff98751.f135892h.f88874a);
                break;
            case 10:
                m53.i5 p17 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.p();
                if (p17 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2424x304bf2.C19410x64c9504 c19410x64c9504 = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2424x304bf2.C19410x64c9504();
                    c19410x64c9504.f266295d = p17.f405328d;
                    c19410x64c9504.f266296e = p17.f405329e;
                    c19410x64c9504.f266297f = p17.f405330f;
                    this.f221103f.putParcelable("game_setting_params", c19410x64c9504);
                    break;
                }
                break;
            case 11:
                sx4.v.a(this.f221103f);
                break;
        }
        c();
    }

    public C15884xdf196038(android.os.Parcel parcel) {
        v(parcel);
    }
}
