package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes9.dex */
public class y0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o72.r2 f101611d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavCleanUI f101612e;

    public y0(com.tencent.mm.plugin.fav.ui.FavCleanUI favCleanUI, o72.r2 r2Var) {
        this.f101612e = favCleanUI;
        this.f101611d = r2Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(this.f101612e.getContext(), "", this.f101612e.getContext().getString(com.tencent.mm.R.string.c_l), true, false, null);
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.fav.ui.x0(this, Q));
    }
}
