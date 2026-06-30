package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui;

/* loaded from: classes14.dex */
public class u0 implements j35.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.e f258528a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f258529b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f258530c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f258531d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.t0 f258532e;

    public u0(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.t0 t0Var, com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.e eVar, android.content.Intent intent, boolean z17, boolean z18) {
        this.f258532e = t0Var;
        this.f258528a = eVar;
        this.f258529b = intent;
        this.f258530c = z17;
        this.f258531d = z18;
    }

    @Override // j35.a
    public void a(com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.AbstractActivityC19626xce283566 abstractActivityC19626xce283566) {
        if (abstractActivityC19626xce283566 != null) {
            abstractActivityC19626xce283566.finish();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.e eVar = this.f258528a;
        eVar.d();
        if (eVar.a()) {
            this.f258532e.b(this.f258529b, this.f258530c, this.f258531d);
        }
    }

    @Override // j35.a
    public void b(com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.AbstractActivityC19626xce283566 abstractActivityC19626xce283566) {
        this.f258528a.b();
        if (abstractActivityC19626xce283566 != null) {
            abstractActivityC19626xce283566.finish();
        }
    }

    @Override // j35.a
    public void c(com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.AbstractActivityC19626xce283566 abstractActivityC19626xce283566) {
        this.f258528a.b();
        if (abstractActivityC19626xce283566 != null) {
            abstractActivityC19626xce283566.finish();
        }
    }
}
