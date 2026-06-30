package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class o2 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f101312d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f101313e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.p2 f101314f;

    public o2(com.tencent.mm.plugin.fav.ui.p2 p2Var, java.util.ArrayList arrayList, boolean z17) {
        this.f101314f = p2Var;
        this.f101312d = arrayList;
        this.f101313e = z17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.fav.ui.p2 p2Var = this.f101314f;
        com.tencent.mm.plugin.fav.ui.ec.a(p2Var.f101332a.getContext(), this.f101312d, new com.tencent.mm.plugin.fav.ui.n2(this), 25, null);
        com.tencent.mm.plugin.fav.ui.FavFilterUI favFilterUI = p2Var.f101332a;
        int i18 = com.tencent.mm.plugin.fav.ui.FavFilterUI.F;
        favFilterUI.X6();
        if (this.f101313e) {
            com.tencent.mm.plugin.fav.ui.FavFilterUI.U6(p2Var.f101332a);
        }
    }
}
