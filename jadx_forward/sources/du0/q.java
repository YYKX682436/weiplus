package du0;

/* loaded from: classes.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ du0.i0 f324951d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(du0.i0 i0Var) {
        super(1);
        this.f324951d = i0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.ze2 ze2Var = (r45.ze2) obj;
        du0.i0 i0Var = this.f324951d;
        yz5.l lVar = i0Var.f324897f;
        if (lVar != null) {
            lVar.mo146xb9724478(ze2Var);
        }
        i0Var.f324895d = false;
        return jz5.f0.f384359a;
    }
}
