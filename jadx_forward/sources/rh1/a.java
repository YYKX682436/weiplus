package rh1;

/* loaded from: classes7.dex */
public class a extends jk3.v {

    /* renamed from: x, reason: collision with root package name */
    public final r45.qs0 f477155x;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11890x81fbda57 f477156y;

    public a(ak3.c cVar) {
        super(cVar);
        this.f477155x = new r45.qs0();
        this.f477156y = null;
    }

    @Override // jk3.v, jk3.b
    public void C(boolean z17, int i17) {
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandFilesMultiTaskHelper", "onMenuFloatBallSelected, enter float ball");
            l(null, true);
            this.f477156y.T6(null);
        }
    }

    public void c0(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandFilesMultiTaskHelper", "update processName: %s", str);
        r45.qs0 qs0Var = this.f477155x;
        if (qs0Var != null) {
            qs0Var.set(4, str);
            try {
                this.f381610a.f66790x225a93cf = qs0Var.mo14344x5f01b1f6();
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandFilesMultiTaskHelper", "updateAppid", e17);
            }
        }
        J();
    }
}
