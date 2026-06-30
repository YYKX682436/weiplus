package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public final class d9 implements com.p314xaae8f345.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.e9 f266592a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f266593b;

    public d9(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.e9 e9Var, nw4.y2 y2Var) {
        this.f266592a = e9Var;
        this.f266593b = y2Var;
    }

    @Override // com.p314xaae8f345.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PrivateCommonApiHandler", "onResult: " + i17);
        nw4.y2 y2Var = this.f266593b;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.e9 e9Var = this.f266592a;
        if (i17 == -1) {
            e9Var.f266617a.i5(y2Var, "ok", kz5.c1.k(new jz5.l("err_msg", "ok"), new jz5.l("uploadResult", "uploadFinished"), new jz5.l("totalSize", "0")));
        } else {
            e9Var.f266617a.i5(y2Var, "ok", kz5.c1.k(new jz5.l("err_msg", "ok"), new jz5.l("uploadResult", "uploading"), new jz5.l("totalSize", "0")));
        }
    }
}
