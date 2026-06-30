package com.tencent.mm.plugin.address.ui;

/* loaded from: classes9.dex */
public final class e1 implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u60.g f74538d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.address.ui.l1 f74539e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f74540f;

    public e1(u60.g gVar, com.tencent.mm.plugin.address.ui.l1 l1Var, android.widget.TextView textView) {
        this.f74538d = gVar;
        this.f74539e = l1Var;
        this.f74540f = textView;
    }

    @Override // i11.c
    public final boolean onGetLocation(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectAddressDialog", "loc result: " + z17 + ", lng:" + f17 + ", lat:" + f18);
        com.tencent.mm.plugin.address.ui.l1 l1Var = this.f74539e;
        u60.g gVar = this.f74538d;
        if (z17) {
            ((i11.g) ((t60.e) gVar).wi()).b(new u60.h(f18, f17, true), l1Var.F);
        } else {
            this.f74540f.setText(com.tencent.mm.R.string.iei);
        }
        ((t60.e) gVar).getClass();
        i11.h.e().m(l1Var.E);
        return false;
    }
}
