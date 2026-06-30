package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes2.dex */
public final class j4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.MenuItem f102279d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f102280e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f102281f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f102282g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(android.view.MenuItem menuItem, android.app.Activity activity, android.graphics.Bitmap bitmap, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        super(0);
        this.f102279d = menuItem;
        this.f102280e = activity;
        this.f102281f = bitmap;
        this.f102282g = k0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f102279d.setIcon(new android.graphics.drawable.BitmapDrawable(this.f102280e.getResources(), this.f102281f));
        boolean z17 = false;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f102282g;
        if (k0Var != null) {
            android.content.Context context = k0Var.f211870m;
            if ((context == null || ((context instanceof android.app.Activity) && (((android.app.Activity) context).isFinishing() || ((android.app.Activity) k0Var.f211870m).isDestroyed()))) ? false : true) {
                z17 = true;
            }
        }
        if (z17) {
            k0Var.j();
        } else {
            com.tencent.mars.xlog.Log.i("FinderMenuUtil", "addSameStyleMenu fail,context invalid!");
        }
        return jz5.f0.f302826a;
    }
}
