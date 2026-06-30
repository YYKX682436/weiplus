package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class n5 implements n13.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s82.g f101289a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.p5 f101290b;

    public n5(com.tencent.mm.plugin.fav.ui.p5 p5Var, s82.g gVar) {
        this.f101290b = p5Var;
        this.f101289a = gVar;
    }

    @Override // n13.x
    public void a(boolean z17, java.lang.String str, android.os.Bundle bundle) {
        com.tencent.mm.plugin.fav.ui.p5 p5Var = this.f101290b;
        p5Var.f101335d.hideVKB();
        if (z17) {
            com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(p5Var.f101335d.getContext(), "", p5Var.f101335d.getString(com.tencent.mm.R.string.cax), true, false, null);
            com.tencent.mm.plugin.fav.ui.x5.i(p5Var.f101335d.getContext(), p5Var.f101335d.f100395f, str, bundle.getBoolean("is_group_to_do", false), this.f101289a.f404774a, new com.tencent.mm.plugin.fav.ui.m5(this, Q));
        }
    }
}
