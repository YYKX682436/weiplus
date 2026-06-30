package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes12.dex */
public final class i7 implements com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.k7 f225149a;

    public i7(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.k7 k7Var) {
        this.f225149a = k7Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.b
    public final void a(java.lang.String str, int i17, int i18) {
        if (str != null && r26.i0.n(str, ".temp", false)) {
            java.lang.String t17 = r26.i0.t(str, ".temp", "", false);
            com.p314xaae8f345.mm.vfs.w6.w(str, t17);
            str = t17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiShareMediaToTimeline", "download video filePath: %s", str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.k7 k7Var = this.f225149a;
        if (i17 != 0) {
            if (i17 != 2) {
                k7Var.f224976f.a("download video cancel");
                return;
            } else {
                k7Var.f224976f.a("download video fail");
                return;
            }
        }
        if (k7Var.f225176n.length() == 0) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            k7Var.B(str, "");
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            k7Var.C(str);
        }
    }
}
