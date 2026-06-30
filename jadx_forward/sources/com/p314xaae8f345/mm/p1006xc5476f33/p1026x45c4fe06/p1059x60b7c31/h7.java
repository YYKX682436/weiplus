package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes15.dex */
public class h7 implements com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a5 {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f162808a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f162809b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f162810c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f162811d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.g7 f162812e;

    public h7(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.g7 g7Var) {
        this.f162812e = g7Var;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a5
    public void a(boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.g7 g7Var;
        this.f162810c = true;
        this.f162809b = z17;
        if (!this.f162811d || (g7Var = this.f162812e) == null) {
            return;
        }
        g7Var.a(this.f162808a, z17);
    }

    public void b(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.g7 g7Var;
        this.f162808a = z17;
        this.f162811d = true;
        if (!this.f162810c || (g7Var = this.f162812e) == null) {
            return;
        }
        g7Var.a(z17, this.f162809b);
    }
}
