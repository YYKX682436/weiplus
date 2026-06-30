package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes2.dex */
public final class j4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.MenuItem f183812d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f183813e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f183814f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f183815g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(android.view.MenuItem menuItem, android.app.Activity activity, android.graphics.Bitmap bitmap, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var) {
        super(0);
        this.f183812d = menuItem;
        this.f183813e = activity;
        this.f183814f = bitmap;
        this.f183815g = k0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        this.f183812d.setIcon(new android.graphics.drawable.BitmapDrawable(this.f183813e.getResources(), this.f183814f));
        boolean z17 = false;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = this.f183815g;
        if (k0Var != null) {
            android.content.Context context = k0Var.f293403m;
            if ((context == null || ((context instanceof android.app.Activity) && (((android.app.Activity) context).isFinishing() || ((android.app.Activity) k0Var.f293403m).isDestroyed()))) ? false : true) {
                z17 = true;
            }
        }
        if (z17) {
            k0Var.j();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMenuUtil", "addSameStyleMenu fail,context invalid!");
        }
        return jz5.f0.f384359a;
    }
}
