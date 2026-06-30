package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class n5 implements n13.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s82.g f182822a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p5 f182823b;

    public n5(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p5 p5Var, s82.g gVar) {
        this.f182823b = p5Var;
        this.f182822a = gVar;
    }

    @Override // n13.x
    public void a(boolean z17, java.lang.String str, android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p5 p5Var = this.f182823b;
        p5Var.f182868d.mo48674x36654fab();
        if (z17) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(p5Var.f182868d.mo55332x76847179(), "", p5Var.f182868d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cax), true, false, null);
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.x5.i(p5Var.f182868d.mo55332x76847179(), p5Var.f182868d.f181928f, str, bundle.getBoolean("is_group_to_do", false), this.f182822a.f486307a, new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.m5(this, Q));
        }
    }
}
