package lx;

/* loaded from: classes4.dex */
public final class k5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f403371d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f403372e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, yz5.l lVar) {
        super(1);
        this.f403371d = c0Var;
        this.f403372e = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Object value = ((p3321xbce91901.C29043x91b2b43d) obj).getValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f403371d;
        if (!c0Var.f391645d) {
            c0Var.f391645d = true;
            this.f403372e.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(value));
        }
        return jz5.f0.f384359a;
    }
}
