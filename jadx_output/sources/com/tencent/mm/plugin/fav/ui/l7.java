package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes3.dex */
public final class l7 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.z7 f101243d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f101244e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rl5.r f101245f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f101246g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f101247h;

    public l7(int i17, com.tencent.mm.plugin.fav.ui.z7 z7Var, java.lang.String str, rl5.r rVar, int i18, int i19, int i27) {
        this.f101243d = z7Var;
        this.f101244e = str;
        this.f101245f = rVar;
        this.f101246g = i19;
        this.f101247h = i27;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.fav.ui.z7 z7Var = this.f101243d;
        if (itemId != 1) {
            if (itemId == 2) {
                com.tencent.mm.ui.MMActivity mMActivity = z7Var.f101655a;
                java.lang.String string = mMActivity.getString(com.tencent.mm.R.string.f490369t2);
                com.tencent.mm.ui.MMActivity mMActivity2 = z7Var.f101655a;
                db5.e1.B(mMActivity, string, "", mMActivity2.getString(com.tencent.mm.R.string.f490367t0), mMActivity2.getString(com.tencent.mm.R.string.baz), new com.tencent.mm.plugin.fav.ui.k7(this.f101243d, this.f101244e, this.f101246g, this.f101247h, this.f101245f), null, com.tencent.mm.R.color.f479482a31);
                return;
            }
            return;
        }
        com.tencent.mm.plugin.fav.ui.n0 n0Var = com.tencent.mm.plugin.fav.ui.FavChangeTagUI.f100297e;
        com.tencent.mm.ui.MMActivity mMActivity3 = z7Var.f101655a;
        java.lang.String tag = this.f101244e;
        kotlin.jvm.internal.o.f(tag, "$tag");
        n0Var.a(mMActivity3, tag, new com.tencent.mm.plugin.fav.ui.j7(z7Var, tag, this.f101246g, this.f101247h));
        jx3.f.INSTANCE.d(29434, 3);
        this.f101245f.a();
    }
}
