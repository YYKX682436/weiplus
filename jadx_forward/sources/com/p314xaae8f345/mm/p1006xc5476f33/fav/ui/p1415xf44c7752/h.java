package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752;

/* loaded from: classes12.dex */
public final class h implements zb0.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.b1 f182471a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.o f182472b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182473c;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.b1 b1Var, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.o oVar, java.lang.String str) {
        this.f182471a = b1Var;
        this.f182472b = oVar;
        this.f182473c = str;
    }

    @Override // zb0.a0
    public void a(java.lang.String srcPath, java.lang.String destPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(srcPath, "srcPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(destPath, "destPath");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[BatchSave] Image saved successfully, favId: ");
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.b1 b1Var = this.f182471a;
        sb6.append(b1Var.f182430a.f67643xc8a07680);
        sb6.append(", localId: ");
        sb6.append(b1Var.f182430a.f67645x88be67a1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavDataBatchSaveLogic", sb6.toString());
        this.f182472b.e(true, b1Var);
    }

    @Override // zb0.a0
    public void b(java.lang.String srcPath, java.lang.String destPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(srcPath, "srcPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(destPath, "destPath");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[BatchSave] Failed to save image, favId: ");
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.b1 b1Var = this.f182471a;
        sb6.append(b1Var.f182430a.f67643xc8a07680);
        sb6.append(", localId: ");
        sb6.append(b1Var.f182430a.f67645x88be67a1);
        sb6.append(", path: ");
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(this.f182473c);
        java.lang.String str = a17.f294812f;
        if (str != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        java.lang.String str2 = a17.f294812f;
        int lastIndexOf = str2.lastIndexOf("/");
        if (lastIndexOf >= 0) {
            str2 = str2.substring(lastIndexOf + 1);
        }
        sb6.append(str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavDataBatchSaveLogic", sb6.toString());
        this.f182472b.e(false, b1Var);
    }
}
