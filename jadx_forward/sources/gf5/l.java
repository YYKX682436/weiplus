package gf5;

/* loaded from: classes11.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gf5.n f352939d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(gf5.n nVar) {
        super(0);
        this.f352939d = nVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        lz5.m mVar = new lz5.m();
        gf5.n nVar = this.f352939d;
        for (gf5.b0 b0Var : (java.util.List) nVar.f352953m.mo141623x754a37bb()) {
            gf5.z zVar = b0Var.f352913a;
            java.util.Iterator it = b0Var.f352914b.iterator();
            while (it.hasNext()) {
                mVar.putIfAbsent(nVar.f((java.lang.String) it.next()), zVar);
            }
        }
        return kz5.b1.b(mVar);
    }
}
