package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes12.dex */
public class l6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f225194d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f225195e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f225196f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f225197g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.m6 f225198h;

    public l6(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.m6 m6Var, boolean z17, java.lang.String str, int i17, java.lang.String str2) {
        this.f225198h = m6Var;
        this.f225194d = z17;
        this.f225195e = str;
        this.f225196f = i17;
        this.f225197g = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f225194d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.m6 m6Var = this.f225198h;
        if (z17) {
            java.lang.String str = this.f225195e;
            if (!android.text.TextUtils.isEmpty(str) && com.p314xaae8f345.mm.vfs.w6.j(str)) {
                java.lang.String E = m6Var.f225216b.E(str);
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("liveVideoFilePath", str);
                hashMap.put("liveVideoLocalId", E);
                hashMap.put("err_msg", "image saveToPhotosAlbum:ok");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiSaveToPhotosAlbum", "composeLivePhoto success, exportPath=%s, ret=%s", str, hashMap.toString());
                m6Var.f225216b.G(str, true, false);
                m6Var.f225216b.f224976f.b(hashMap);
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.o6.A(m6Var.f225216b, E, m6Var.f225215a);
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiSaveToPhotosAlbum", "composeLivePhoto fail, internalCode=%d msg=%s", java.lang.Integer.valueOf(this.f225196f), this.f225197g);
        m6Var.f225216b.f224976f.a("saveToPhotosAlbum:fail_make_live_photo_failed");
    }
}
