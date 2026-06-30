package at0;

/* loaded from: classes10.dex */
public final class r extends ms0.c {

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f13626t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f13627u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(int i17, int i18, int i19) {
        super(0, 0, 0, 0, i17, i18, 15, null);
        this.f13626t = i17;
        this.f13627u = i19;
    }

    @Override // ms0.c
    public os0.a f() {
        return ts0.d.f421550a.a() ? new os0.e(this.f330945a, this.f330946b, this.f330947c, this.f330948d, this.f13626t, this.f330950f) : new os0.c(this.f330945a, this.f330946b, this.f330947c, this.f330948d, this.f13626t, this.f330950f);
    }

    @Override // ms0.c
    public is0.c g() {
        if (this.f13627u != 1) {
            return this.f330954j;
        }
        os0.a aVar = this.f330951g;
        if (aVar != null) {
            return aVar.f348000i;
        }
        return null;
    }
}
