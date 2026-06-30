package ls4;

/* loaded from: classes8.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls4.u f402603d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ls4.u uVar) {
        super(1);
        this.f402603d = uVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ns4.c0 it = (ns4.c0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        it.f420997c.q();
        boolean b17 = it.b();
        ls4.u uVar = this.f402603d;
        if (b17) {
            ls4.u.b(uVar);
        } else {
            uVar.getClass();
            js4.n nVar = new js4.n();
            nVar.f383082g = js4.m.DIRECT_CHARGE;
            ns4.c0 c0Var = uVar.f402635c;
            if (c0Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("consumePanel");
                throw null;
            }
            ns4.d0 d0Var = c0Var.f420996b;
            r45.js3 js3Var = d0Var.f421029c;
            nVar.f383081f = js3Var.f459622h.f457525e.f459212d;
            pr4.l lVar = uVar.f402633a;
            nVar.f383083h = lVar.f439562j - d0Var.f421028b;
            nVar.f383080e = js3Var.f459621g;
            nVar.f383077b = lVar.f439553a;
            nVar.f383085j = false;
            boolean b18 = it.b();
            ns4.d0 d0Var2 = it.f420996b;
            nVar.f383086k = b18 ? 0L : d0Var2.f421027a.f439562j - d0Var2.f421028b;
            nVar.f383087l = d0Var2.f421029c;
            nVar.f383079d = new ls4.f(uVar);
            ((ms4.z) ((js4.i) gm0.j1.s(js4.i.class))).d(lVar.f439554b, nVar);
        }
        return jz5.f0.f384359a;
    }
}
