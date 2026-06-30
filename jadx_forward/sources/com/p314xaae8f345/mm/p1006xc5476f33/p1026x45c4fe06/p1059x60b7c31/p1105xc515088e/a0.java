package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e;

/* loaded from: classes15.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f164242d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tl1.j f164243e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.b0 f164244f;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.b0 b0Var, int i17, tl1.j jVar) {
        this.f164244f = b0Var;
        this.f164242d = i17;
        this.f164243e = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.b0 b0Var = this.f164244f;
        tl1.b b17 = b0Var.b(false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1229xc515088e.C12786x94e8a515 c12786x94e8a515 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1229xc515088e.C12786x94e8a515) ((b17 == null || !com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1229xc515088e.C12786x94e8a515.class.isInstance(b17.m166746x2a2c2b84())) ? null : b17.m166746x2a2c2b84());
        if (c12786x94e8a515 == null) {
            b0Var.d("fail picker not exists", null);
        } else {
            c12786x94e8a515.d(this.f164242d, this.f164243e);
            b0Var.d("ok", null);
        }
    }
}
