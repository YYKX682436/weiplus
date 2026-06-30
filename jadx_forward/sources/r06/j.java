package r06;

/* loaded from: classes16.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r06.l f449989d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(r06.l lVar) {
        super(1);
        this.f449989d = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        f26.c3 c3Var = (f26.c3) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c3Var);
        boolean z17 = false;
        if (!f26.s0.a(c3Var)) {
            o06.j i17 = c3Var.w0().i();
            if ((i17 instanceof o06.e2) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((o06.e2) i17).e(), this.f449989d)) {
                z17 = true;
            }
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
