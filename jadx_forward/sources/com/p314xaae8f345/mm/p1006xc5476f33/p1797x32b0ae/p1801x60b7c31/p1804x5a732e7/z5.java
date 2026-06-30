package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes12.dex */
public class z5 implements com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.a6 f225376a;

    public z5(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.a6 a6Var) {
        this.f225376a = a6Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.b
    public void a(java.lang.String str, int i17, int i18) {
        java.lang.String str2;
        if (str == null || !str.endsWith(".temp")) {
            str2 = str;
        } else {
            java.lang.String replace = str.replace(".temp", "");
            com.p314xaae8f345.mm.vfs.w6.w(str, replace);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiSaveToPhotosAlbum", "download videoPath:%s", replace);
            str2 = replace;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.a6 a6Var = this.f225376a;
        if (i17 == 0) {
            a6Var.f225038e.F(str2, a6Var.f225038e.E(str2), null, a6Var.f225036c, null);
        } else {
            if (i17 != 2) {
                return;
            }
            a6Var.f225038e.f224976f.a("saveToPhotosAlbum fail, download video failed");
        }
    }
}
