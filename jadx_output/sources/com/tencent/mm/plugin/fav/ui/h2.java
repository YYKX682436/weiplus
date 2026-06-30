package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class h2 implements n13.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s82.g f101126a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.j2 f101127b;

    public h2(com.tencent.mm.plugin.fav.ui.j2 j2Var, s82.g gVar) {
        this.f101127b = j2Var;
        this.f101126a = gVar;
    }

    @Override // n13.x
    public void a(boolean z17, java.lang.String str, android.os.Bundle bundle) {
        com.tencent.mm.plugin.fav.ui.j2 j2Var = this.f101127b;
        j2Var.f101193d.hideVKB();
        if (z17) {
            com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(j2Var.f101193d.getContext(), "", j2Var.f101193d.getString(com.tencent.mm.R.string.cax), true, false, null);
            com.tencent.mm.plugin.fav.ui.x5.i(j2Var.f101193d.getContext(), j2Var.f101193d.f100329f, str, bundle.getBoolean("is_group_to_do", false), this.f101126a.f404774a, new com.tencent.mm.plugin.fav.ui.g2(this, Q));
        }
    }
}
