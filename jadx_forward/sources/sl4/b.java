package sl4;

/* loaded from: classes11.dex */
public final class b extends qp1.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sl4.g f490787a;

    public b(sl4.g gVar) {
        this.f490787a = gVar;
    }

    @Override // qp1.l0
    public void a() {
        sl4.g gVar = this.f490787a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(gVar.f490792n, "permissionEvent.onDialogShow");
        gVar.r0();
    }

    @Override // qp1.k0
    public void b(qp1.j0 permissionCheckResult) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permissionCheckResult, "permissionCheckResult");
        sl4.g gVar = this.f490787a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(gVar.f490792n, "permissionEvent.onCheckResult: " + permissionCheckResult);
        gVar.o0(permissionCheckResult);
    }

    @Override // qp1.l0
    public void c() {
        sl4.g gVar = this.f490787a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(gVar.f490792n, "permissionEvent.onClickCancel");
        gVar.p0();
    }

    @Override // qp1.l0
    public void d() {
        sl4.g gVar = this.f490787a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(gVar.f490792n, "permissionEvent.onClickSetting");
        gVar.q0();
    }
}
