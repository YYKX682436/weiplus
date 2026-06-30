package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9;

/* loaded from: classes15.dex */
public class e1 implements com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a5 {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f160484a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f160485b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f160486c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f160487d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.d1 f160488e;

    public e1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.d1 d1Var) {
        this.f160488e = d1Var;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a5
    public void a(boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.d1 d1Var;
        this.f160486c = true;
        this.f160485b = z17;
        if (!this.f160487d || (d1Var = this.f160488e) == null) {
            return;
        }
        d1Var.a(this.f160484a, z17);
    }

    public void b(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.d1 d1Var;
        this.f160484a = z17;
        this.f160487d = true;
        if (!this.f160486c || (d1Var = this.f160488e) == null) {
            return;
        }
        d1Var.a(z17, this.f160485b);
    }
}
