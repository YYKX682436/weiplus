package gm0;

/* renamed from: gm0.b0$$b */
/* loaded from: classes12.dex */
public final /* synthetic */ class C28424x57b5d14 implements l75.j0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gm0.b0 f354700a;

    public /* synthetic */ C28424x57b5d14(gm0.b0 b0Var) {
        this.f354700a = b0Var;
    }

    public final void a() {
        com.p314xaae8f345.mm.p2621x8fb0427b.cb cbVar = this.f354700a.f354689i;
        if (cbVar != null) {
            cbVar.f275358d.A("TablesVersion", "delete from TablesVersion");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MMKernel.CoreStorage", "tablesVersionStorage is null");
        }
    }
}
