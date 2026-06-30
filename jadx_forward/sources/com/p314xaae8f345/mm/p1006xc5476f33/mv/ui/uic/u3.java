package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class u3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h4 f233006d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f233007e;

    public u3(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h4 h4Var, int i17, int i18) {
        this.f233006d = h4Var;
        this.f233007e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h4 h4Var = this.f233006d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07 = h4Var.S6().p0(h4Var.f232702p);
        if (p07 == null) {
            return;
        }
        ((android.widget.TextView) p07.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.k1k)).setText(((fm3.q) h4Var.f232694e.get(h4Var.f232702p)).c(this.f233007e));
    }
}
