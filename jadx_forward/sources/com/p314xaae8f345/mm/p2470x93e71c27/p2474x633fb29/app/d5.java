package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app;

/* loaded from: classes15.dex */
public class d5 implements com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.c5 {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f270389a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f270390b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f270391c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f270392d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.b5 f270393e;

    public d5(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.b5 b5Var) {
        this.f270393e = b5Var;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a5
    public void a(boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.b5 b5Var;
        this.f270391c = true;
        this.f270390b = z17;
        if (!this.f270392d || (b5Var = this.f270393e) == null) {
            return;
        }
        b5Var.a(this.f270389a, z17);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.c5
    public void b(boolean z17) {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.b5 b5Var;
        this.f270389a = z17;
        this.f270392d = true;
        if (!this.f270391c || (b5Var = this.f270393e) == null) {
            return;
        }
        b5Var.a(z17, this.f270390b);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.c5
    /* renamed from: reset */
    public void mo75138x6761d4f() {
        this.f270391c = false;
        this.f270390b = false;
        this.f270392d = false;
        this.f270389a = false;
    }
}
