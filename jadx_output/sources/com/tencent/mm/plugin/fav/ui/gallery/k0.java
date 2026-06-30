package com.tencent.mm.plugin.fav.ui.gallery;

/* loaded from: classes12.dex */
public class k0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f100988d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f100989e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.gallery.h0 f100990f;

    public k0(com.tencent.mm.plugin.fav.ui.gallery.h0 h0Var, java.util.ArrayList arrayList, boolean z17) {
        this.f100990f = h0Var;
        this.f100988d = arrayList;
        this.f100989e = z17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.fav.ui.gallery.h0 h0Var = this.f100990f;
        android.app.Activity activity = h0Var.f100952l;
        com.tencent.mm.plugin.fav.ui.gallery.j0 j0Var = new com.tencent.mm.plugin.fav.ui.gallery.j0(this);
        java.util.ArrayList arrayList = this.f100988d;
        com.tencent.mm.plugin.fav.ui.ec.a(activity, arrayList, j0Var, 27, null);
        if (this.f100989e) {
            com.tencent.mm.plugin.fav.ui.FavSearchUI.e7(h0Var.f100952l);
        }
        com.tencent.mm.plugin.fav.ui.gallery.y0 y0Var = h0Var.f100955o;
        if (y0Var != null) {
            y0Var.n4(0, arrayList.size());
        }
    }
}
