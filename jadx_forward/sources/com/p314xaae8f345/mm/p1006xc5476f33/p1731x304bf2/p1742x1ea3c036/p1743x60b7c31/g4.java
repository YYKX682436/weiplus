package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes8.dex */
class g4 implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    private g4() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.lang.String string = bundle.getString("url");
        java.lang.String string2 = bundle.getString(dm.i4.f66867x2a5c95c7);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.x3.f221307e = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.x3.g("bundle", null);
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putBoolean(ya.b.f77504xbb80cbe3, true);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
            r53.y.a().e(null, string, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.e4(this, bundle2, rVar));
            return;
        }
        ((yg0.u4) ((zg0.r3) i95.n0.c(zg0.r3.class))).getClass();
        java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.o5.d(string2);
        if (!android.text.TextUtils.isEmpty(d17)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.x3.i(d17, string2, null, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.f4(this, bundle2, rVar));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSaveImageToPhotosAlbum", "saveToPhotosAlbum fail, filePath is null");
        bundle2.putBoolean(ya.b.f77504xbb80cbe3, false);
        bundle2.putString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56296xc5686afb, "saveToPhotosAlbum fail, filePath is null");
        rVar.a(bundle2);
    }
}
