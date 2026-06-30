package bg2;

/* loaded from: classes3.dex */
public final class h2 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.n2 f20128d;

    public h2(bg2.n2 n2Var) {
        this.f20128d = n2Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        cm2.t tVar;
        bg2.n2 n2Var = this.f20128d;
        kotlinx.coroutines.flow.j2 j2Var = n2Var.f20323f;
        r45.qc2 Y6 = n2Var.Y6((j2Var == null || (tVar = (cm2.t) ((kotlinx.coroutines.flow.h3) j2Var).getValue()) == null) ? null : zl2.r4.f473950a.J2(tVar));
        com.tencent.mars.xlog.Log.i(n2Var.f20322e, "[updatePollingData] update polling extBUf = " + Y6.getByteString(1) + ", current_promoting_id = " + Y6.getLong(0) + ", promote_info_buffer = " + Y6.getByteString(2) + ", ext_buffer = " + Y6.getByteString(1));
        bg2.g2 g2Var = (bg2.g2) n2Var.N6(bg2.g2.class);
        if (g2Var != null) {
            g2Var.b7(10, Y6);
        }
        return jz5.f0.f302826a;
    }
}
