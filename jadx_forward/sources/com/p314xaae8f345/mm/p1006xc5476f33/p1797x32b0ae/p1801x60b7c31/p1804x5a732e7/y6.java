package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes12.dex */
public class y6 implements com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f225369a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f225370b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.c7 f225371c;

    public y6(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.c7 c7Var, java.lang.String str, java.lang.String str2) {
        this.f225371c = c7Var;
        this.f225369a = str;
        this.f225370b = str2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.b
    public void a(java.lang.String str, int i17, int i18) {
        if (str != null && str.endsWith(".temp")) {
            java.lang.String replace = str.replace(".temp", "");
            com.p314xaae8f345.mm.vfs.w6.w(str, replace);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiSendFileMessage", "download videoPath:%s", replace);
            str = replace;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.c7 c7Var = this.f225371c;
        if (i17 == 0) {
            c7Var.C(str, c7Var.A(str), this.f225369a, this.f225370b);
        } else {
            if (i17 != 2) {
                return;
            }
            c7Var.f224976f.a("sendFileMessage fail, download video failed");
        }
    }
}
