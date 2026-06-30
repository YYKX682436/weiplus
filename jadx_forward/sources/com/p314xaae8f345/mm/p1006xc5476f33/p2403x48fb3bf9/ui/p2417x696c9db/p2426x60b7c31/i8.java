package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes15.dex */
public class i8 implements com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a5 {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f266729a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f266730b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f266731c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f266732d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f266733e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.h8 f266734f;

    public i8(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.h8 h8Var) {
        this.f266734f = h8Var;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a5
    public void a(boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.h8 h8Var;
        this.f266732d = true;
        this.f266730b = z17;
        this.f266731c = z18;
        if (!this.f266733e || (h8Var = this.f266734f) == null) {
            return;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.w1) h8Var).a(this.f266729a, z17, z18);
    }

    public void b(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.h8 h8Var;
        this.f266729a = z17;
        this.f266733e = true;
        if (!this.f266732d || (h8Var = this.f266734f) == null) {
            return;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.w1) h8Var).a(z17, this.f266730b, this.f266731c);
    }
}
