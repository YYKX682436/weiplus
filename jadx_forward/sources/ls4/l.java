package ls4;

/* loaded from: classes8.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls4.u f402610d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ls4.u uVar) {
        super(1);
        this.f402610d = uVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ns4.c0 it = (ns4.c0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        ls4.u uVar = this.f402610d;
        ns4.c0 c0Var = uVar.f402635c;
        if (c0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("consumePanel");
            throw null;
        }
        c0Var.f420997c.q();
        pr4.l lVar = uVar.f402633a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = new ns4.f0(lVar.f439564l, lVar.f439554b).f421051a;
        y1Var.f293570s = new ls4.k(uVar);
        y1Var.s();
        return jz5.f0.f384359a;
    }
}
