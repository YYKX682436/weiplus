package com.tencent.mm.plugin.fav.ui.gallery;

/* loaded from: classes12.dex */
public class s0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f101076d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f101077e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.gallery.t0 f101078f;

    public s0(com.tencent.mm.plugin.fav.ui.gallery.t0 t0Var, java.util.ArrayList arrayList, boolean z17) {
        this.f101078f = t0Var;
        this.f101076d = arrayList;
        this.f101077e = z17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.fav.ui.gallery.t0 t0Var = this.f101078f;
        android.app.Activity activity = t0Var.f101081a.f100952l;
        com.tencent.mm.plugin.fav.ui.gallery.r0 r0Var = new com.tencent.mm.plugin.fav.ui.gallery.r0(this);
        java.util.ArrayList arrayList = this.f101076d;
        com.tencent.mm.plugin.fav.ui.ec.a(activity, arrayList, r0Var, 27, null);
        if (this.f101077e) {
            com.tencent.mm.plugin.fav.ui.FavSearchUI.e7(t0Var.f101081a.f100952l);
        }
        com.tencent.mm.plugin.fav.ui.gallery.y0 y0Var = t0Var.f101081a.f100955o;
        if (y0Var != null) {
            y0Var.n4(0, arrayList.size());
        }
    }
}
