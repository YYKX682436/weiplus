package tb1;

/* loaded from: classes7.dex */
public final class l0 implements tb1.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tb1.m0 f498443a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t f498444b;

    public l0(tb1.m0 m0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar) {
        this.f498443a = m0Var;
        this.f498444b = tVar;
    }

    @Override // tb1.z
    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertCameraWC", "onRelease");
        tb1.m0 m0Var = this.f498443a;
        mi1.w0 w0Var = m0Var.f498445i;
        if (w0Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(w0Var);
            w0Var.mo147359x63a3b28a();
            m0Var.f498445i = null;
        }
    }

    @Override // tb1.z
    /* renamed from: onInit */
    public void mo166108xc39adf8f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertCameraWC", "onInit");
        tb1.m0 m0Var = this.f498443a;
        if (m0Var.f498445i == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar = this.f498444b;
            if (tVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) {
                m0Var.f498445i = mi1.c.a(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) tVar).t3()).h(mi1.d.CAMERA);
            }
        }
    }
}
