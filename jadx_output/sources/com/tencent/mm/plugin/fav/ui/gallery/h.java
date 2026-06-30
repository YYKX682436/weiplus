package com.tencent.mm.plugin.fav.ui.gallery;

/* loaded from: classes12.dex */
public final class h implements zb0.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.gallery.b1 f100938a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.gallery.o f100939b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f100940c;

    public h(com.tencent.mm.plugin.fav.ui.gallery.b1 b1Var, com.tencent.mm.plugin.fav.ui.gallery.o oVar, java.lang.String str) {
        this.f100938a = b1Var;
        this.f100939b = oVar;
        this.f100940c = str;
    }

    @Override // zb0.a0
    public void a(java.lang.String srcPath, java.lang.String destPath) {
        kotlin.jvm.internal.o.g(srcPath, "srcPath");
        kotlin.jvm.internal.o.g(destPath, "destPath");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[BatchSave] Image saved successfully, favId: ");
        com.tencent.mm.plugin.fav.ui.gallery.b1 b1Var = this.f100938a;
        sb6.append(b1Var.f100897a.field_id);
        sb6.append(", localId: ");
        sb6.append(b1Var.f100897a.field_localId);
        com.tencent.mars.xlog.Log.i("MicroMsg.FavDataBatchSaveLogic", sb6.toString());
        this.f100939b.e(true, b1Var);
    }

    @Override // zb0.a0
    public void b(java.lang.String srcPath, java.lang.String destPath) {
        kotlin.jvm.internal.o.g(srcPath, "srcPath");
        kotlin.jvm.internal.o.g(destPath, "destPath");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[BatchSave] Failed to save image, favId: ");
        com.tencent.mm.plugin.fav.ui.gallery.b1 b1Var = this.f100938a;
        sb6.append(b1Var.f100897a.field_id);
        sb6.append(", localId: ");
        sb6.append(b1Var.f100897a.field_localId);
        sb6.append(", path: ");
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(this.f100940c);
        java.lang.String str = a17.f213279f;
        if (str != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        java.lang.String str2 = a17.f213279f;
        int lastIndexOf = str2.lastIndexOf("/");
        if (lastIndexOf >= 0) {
            str2 = str2.substring(lastIndexOf + 1);
        }
        sb6.append(str2);
        com.tencent.mars.xlog.Log.e("MicroMsg.FavDataBatchSaveLogic", sb6.toString());
        this.f100939b.e(false, b1Var);
    }
}
