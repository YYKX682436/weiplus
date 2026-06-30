package ju1;

/* loaded from: classes10.dex */
public final class d implements i4.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ju1.p0 f383237a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f383238b;

    public d(ju1.p0 p0Var, int i17) {
        this.f383237a = p0Var;
        this.f383238b = i17;
    }

    @Override // i4.h
    public final void a(i4.j jVar) {
        int i17 = this.f383238b;
        ju1.p0 p0Var = this.f383237a;
        if (jVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardViewUtils", "getPrimaryColor, palette generated fail");
            ((ju1.b) p0Var).a(i17);
            return;
        }
        i4.i iVar = jVar.f369892d;
        if (iVar != null) {
            ((ju1.b) p0Var).a(iVar.f369882d);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardViewUtils", "getPrimaryColor, palette generated but swatch is null");
            ((ju1.b) p0Var).a(i17);
        }
    }
}
