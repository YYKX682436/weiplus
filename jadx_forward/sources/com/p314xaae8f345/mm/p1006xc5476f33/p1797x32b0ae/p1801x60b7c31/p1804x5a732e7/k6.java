package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes12.dex */
public class k6 implements com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.n6 f225170a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f225171b;

    public k6(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.o6 o6Var, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.n6 n6Var, java.lang.String str) {
        this.f225170a = n6Var;
        this.f225171b = str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.b
    public void a(java.lang.String str, int i17, int i18) {
        if (str != null && str.endsWith(".temp")) {
            java.lang.String replace = str.replace(".temp", "");
            com.p314xaae8f345.mm.vfs.w6.w(str, replace);
            str = replace;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.n6 n6Var = this.f225170a;
        if (i17 == 0 && !android.text.TextUtils.isEmpty(str) && com.p314xaae8f345.mm.vfs.w6.j(str)) {
            n6Var.a(str);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiSaveToPhotosAlbum", "live video cdn download fail. url:%s errCode:%d", this.f225171b, java.lang.Integer.valueOf(i17));
            n6Var.a(null);
        }
    }
}
