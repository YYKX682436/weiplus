package hc1;

/* loaded from: classes7.dex */
public final class g implements com.p314xaae8f345.mm.p2470x93e71c27.ui.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hc1.i f361826a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f361827b;

    public g(hc1.i iVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var) {
        this.f361826a = iVar;
        this.f361827b = e9Var;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void a(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        this.f361826a.f361832g.x(str, this.f361827b);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void b() {
        this.f361826a.f361832g.x("[DELETE_EMOTION]", this.f361827b);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void c(boolean z17) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void d() {
        this.f361826a.f361832g.x("[DONE_EMOTION]", this.f361827b);
    }
}
