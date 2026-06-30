package uf;

/* loaded from: classes7.dex */
public final class t0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uf.c1 f508636d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(uf.c1 c1Var) {
        super(1);
        this.f508636d = c1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        gg1.i it = (gg1.i) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        x91.c cVar = it.f353101a.f534180a;
        java.lang.String str = cVar != null ? cVar.f534174i : null;
        x91.c cVar2 = this.f508636d.c().f534180a;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, cVar2 != null ? cVar2.f534174i : null)) {
            it.f353104d = false;
            it.f353103c = false;
            it.f353102b = true;
        }
        return jz5.f0.f384359a;
    }
}
