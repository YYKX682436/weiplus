package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class r4 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f101371d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f101372e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.s4 f101373f;

    public r4(com.tencent.mm.plugin.fav.ui.s4 s4Var, java.util.ArrayList arrayList, boolean z17) {
        this.f101373f = s4Var;
        this.f101371d = arrayList;
        this.f101372e = z17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.fav.ui.s4 s4Var = this.f101373f;
        com.tencent.mm.plugin.fav.ui.ec.a(s4Var.f101434a.getContext(), this.f101371d, new com.tencent.mm.plugin.fav.ui.q4(this), 26, null);
        com.tencent.mm.plugin.fav.ui.FavSearchUI favSearchUI = s4Var.f101434a;
        int i18 = com.tencent.mm.plugin.fav.ui.FavSearchUI.N;
        favSearchUI.a7();
        if (this.f101372e) {
            com.tencent.mm.plugin.fav.ui.FavSearchUI.e7(s4Var.f101434a.getContext());
        }
    }
}
