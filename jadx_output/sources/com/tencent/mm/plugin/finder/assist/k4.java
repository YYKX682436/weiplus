package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes2.dex */
public final class k4 implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.MenuItem f102310a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f102311b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f102312c;

    public k4(android.view.MenuItem menuItem, android.app.Activity activity, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f102310a = menuItem;
        this.f102311b = activity;
        this.f102312c = k0Var;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap != null) {
            pm0.v.X(new com.tencent.mm.plugin.finder.assist.j4(this.f102310a, this.f102311b, bitmap, this.f102312c));
        }
    }
}
