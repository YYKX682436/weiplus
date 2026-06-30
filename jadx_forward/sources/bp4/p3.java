package bp4;

/* loaded from: classes10.dex */
public final class p3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bp4.z3 f104876d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(bp4.z3 z3Var) {
        super(1);
        this.f104876d = z3Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        if (!((java.lang.Boolean) obj).booleanValue()) {
            bp4.z3 z3Var = this.f104876d;
            boolean z17 = z3Var.f104979r;
            yz5.l lVar = z3Var.f104981t;
            if (z17) {
                if (lVar != null) {
                    ((bp4.s3) lVar).mo146xb9724478(z3Var.f104976o.get(z3Var.f104980s));
                }
            } else if (lVar != null) {
                ((bp4.s3) lVar).mo146xb9724478(java.lang.Float.valueOf(z3Var.f104978q));
            }
        }
        return jz5.f0.f384359a;
    }
}
