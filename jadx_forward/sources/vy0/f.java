package vy0;

/* loaded from: classes5.dex */
public final class f implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f522944a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f522945b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f522946c;

    public f(java.lang.String str, yz5.l lVar, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var) {
        this.f522944a = str;
        this.f522945b = lVar;
        this.f522946c = z2Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3
    public final void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MaasPermissionCheckHelp", "requestPermission ok");
        vy0.g.f522947a.b().putBoolean(this.f522944a + "_enabled", true);
        this.f522945b.mo146xb9724478(java.lang.Boolean.TRUE);
        vy0.e eVar = vy0.e.f522943a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = this.f522946c;
        z2Var.l(eVar);
        z2Var.B();
    }
}
