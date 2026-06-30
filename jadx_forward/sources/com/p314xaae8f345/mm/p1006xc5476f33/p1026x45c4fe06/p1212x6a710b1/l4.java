package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1;

/* loaded from: classes7.dex */
public final class l4 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.sc {

    /* renamed from: a, reason: collision with root package name */
    public boolean f172037a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.o4 f172038b;

    public l4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.o4 o4Var) {
        this.f172038b = o4Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.hc hcVar = o4Var.f172056a.f156329e;
        if (hcVar != null) {
            b(hcVar);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.sc
    public void a() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.sc
    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.hc container) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        if (this.f172037a) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.o4 o4Var = this.f172038b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o4Var.f172057b, "onAttachedToRuntimeContainer, first blood");
        o4Var.a();
        this.f172037a = true;
    }
}
