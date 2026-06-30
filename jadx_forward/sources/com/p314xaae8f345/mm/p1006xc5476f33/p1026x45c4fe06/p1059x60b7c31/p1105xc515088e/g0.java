package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e;

/* loaded from: classes15.dex */
public class g0 implements tl1.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tl1.b f164266a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1229xc515088e.C12789x831bcd83 f164267b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.h0 f164268c;

    public g0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.h0 h0Var, tl1.b bVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1229xc515088e.C12789x831bcd83 c12789x831bcd83) {
        this.f164268c = h0Var;
        this.f164266a = bVar;
        this.f164267b = c12789x831bcd83;
    }

    @Override // tl1.t
    public void a(boolean z17, java.lang.Object obj) {
        this.f164266a.d(true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.h0 h0Var = this.f164268c;
        if (!z17) {
            h0Var.d("fail cancel", null);
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap(2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1229xc515088e.C12789x831bcd83 c12789x831bcd83 = this.f164267b;
        c12789x831bcd83.f173341e.e();
        hashMap.put("value", c12789x831bcd83.f173340d[c12789x831bcd83.f173343g]);
        c12789x831bcd83.f173341e.e();
        hashMap.put(ya.b.f77479x42930b2, java.lang.Integer.valueOf(c12789x831bcd83.f173343g));
        h0Var.d("ok", hashMap);
    }
}
