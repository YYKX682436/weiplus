package gp4;

/* loaded from: classes10.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bv3.d f355944d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(bv3.d dVar) {
        super(1);
        this.f355944d = dVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 it = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        bv3.d dVar = it.f257153e;
        dVar.getClass();
        bv3.d tr6 = this.f355944d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tr6, "tr");
        if (dVar.c() >= tr6.c()) {
            tr6 = dVar;
            dVar = tr6;
        }
        return java.lang.Boolean.valueOf((dVar.c() == tr6.c() && dVar.b() == tr6.b()) || dVar.b() > tr6.c());
    }
}
