package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes12.dex */
public class g6 implements com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.n6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.h6 f225120a;

    public g6(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.h6 h6Var) {
        this.f225120a = h6Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.n6
    public void a(java.lang.String str) {
        boolean isEmpty = android.text.TextUtils.isEmpty(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.h6 h6Var = this.f225120a;
        if (isEmpty) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiSaveToPhotosAlbum", "handleLivePhoto fail, cover path invalid");
            h6Var.f225135n.f224976f.a("saveToPhotosAlbum:fail_cover_invalid");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.o6 o6Var = h6Var.f225135n;
        java.lang.String str2 = h6Var.f225128d;
        java.lang.String str3 = h6Var.f225132h;
        java.lang.String str4 = h6Var.f225133i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.f6 f6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.f6(this, str);
        o6Var.getClass();
        if (!android.text.TextUtils.isEmpty(str3)) {
            java.lang.String zj6 = ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).zj(str2, o6Var.f224975e.f380557a, str3);
            if (!android.text.TextUtils.isEmpty(zj6) && com.p314xaae8f345.mm.vfs.w6.j(zj6)) {
                f6Var.a(zj6);
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiSaveToPhotosAlbum", "live video localId resolve fail. localId:%s resolved:%s", str3, zj6);
                f6Var.a(null);
                return;
            }
        }
        if (android.text.TextUtils.isEmpty(str4)) {
            f6Var.a(null);
            return;
        }
        if (!((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Kj(str4)) {
            if (com.p314xaae8f345.mm.vfs.w6.j(str4)) {
                f6Var.a(str4);
                return;
            } else if (str4.startsWith("http")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.d.a(str2, str4, new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.k6(o6Var, f6Var, str4));
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiSaveToPhotosAlbum", "live video file not found: %s", str4);
                f6Var.a(null);
                return;
            }
        }
        java.lang.String zj7 = ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).zj(str2, o6Var.f224975e.f380557a, str4);
        if (!android.text.TextUtils.isEmpty(zj7) && com.p314xaae8f345.mm.vfs.w6.j(zj7)) {
            f6Var.a(zj7);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiSaveToPhotosAlbum", "live video filePath-as-localId resolve fail. id:%s resolved:%s", str4, zj7);
            f6Var.a(null);
        }
    }
}
