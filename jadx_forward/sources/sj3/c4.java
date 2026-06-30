package sj3;

/* loaded from: classes14.dex */
public final class c4 implements j35.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.e f489983a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sj3.d4 f489984b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f489985c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f489986d;

    public c4(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.e eVar, sj3.d4 d4Var, android.content.Intent intent, boolean z17) {
        this.f489983a = eVar;
        this.f489984b = d4Var;
        this.f489985c = intent;
        this.f489986d = z17;
    }

    @Override // j35.a
    public void a(com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.AbstractActivityC19626xce283566 abstractActivityC19626xce283566) {
        if (abstractActivityC19626xce283566 != null) {
            abstractActivityC19626xce283566.finish();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.e eVar = this.f489983a;
        eVar.d();
        if (eVar.a()) {
            this.f489984b.f(this.f489985c, this.f489986d);
        }
    }

    @Override // j35.a
    public void b(com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.AbstractActivityC19626xce283566 abstractActivityC19626xce283566) {
        this.f489983a.b();
        if (abstractActivityC19626xce283566 != null) {
            abstractActivityC19626xce283566.finish();
        }
    }

    @Override // j35.a
    public void c(com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.AbstractActivityC19626xce283566 abstractActivityC19626xce283566) {
        this.f489983a.b();
        if (abstractActivityC19626xce283566 != null) {
            abstractActivityC19626xce283566.finish();
        }
    }
}
