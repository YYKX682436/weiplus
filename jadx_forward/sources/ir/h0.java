package ir;

/* loaded from: classes12.dex */
public final class h0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ir.i0 f375395d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(ir.i0 i0Var) {
        super(1);
        this.f375395d = i0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.v75 v75Var = (r45.v75) obj;
        if (v75Var != null) {
            ir.i0 i0Var = this.f375395d;
            r45.v75 v75Var2 = i0Var.f375400c;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(v75Var2 != null ? java.lang.Integer.valueOf(v75Var2.f469497d) : null, java.lang.Integer.valueOf(v75Var.f469497d))) {
                i0Var.f375400c = v75Var;
                i0Var.f375402e = true;
            }
        }
        return jz5.f0.f384359a;
    }
}
