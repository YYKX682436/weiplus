package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2;

/* loaded from: classes2.dex */
public final class b0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.l0 f203794d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nr2.m f203795e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.l0 l0Var, nr2.m mVar) {
        super(1);
        this.f203794d = l0Var;
        this.f203795e = mVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ((java.lang.Boolean) obj).booleanValue();
        java.lang.String e17 = this.f203795e.e();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.l0 l0Var = this.f203794d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(l0Var.l(), 0, false, true);
        android.view.View inflate = android.view.LayoutInflater.from(l0Var.l()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dhn, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.bys);
        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.qej)).setText(e17);
        findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.i0(y1Var));
        y1Var.k(inflate);
        y1Var.s();
        return jz5.f0.f384359a;
    }
}
