package xt2;

/* loaded from: classes3.dex */
public final class w3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xt2.z3 f538619d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(xt2.z3 z3Var) {
        super(0);
        this.f538619d = z3Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        xt2.z3 z3Var = this.f538619d;
        tt2.i iVar = z3Var.f538683q;
        java.util.ArrayList arrayList = iVar.f503467h;
        try {
            java.util.Iterator it = arrayList.iterator();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "iterator(...)");
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(next, "next(...)");
                tt2.e eVar = (tt2.e) next;
                if (eVar.f503406b) {
                    it.remove();
                    iVar.f503468i.add(iVar.M(eVar.f503405a));
                }
            }
            iVar.K(arrayList, "after deleteProducts");
        } catch (java.lang.Exception e17) {
            hc2.c.a(e17, "FinderLiveShoppingEditAdapter,deleteProducts:");
        }
        z3Var.f538683q.m8146xced61ae5();
        z3Var.a(false);
        z3Var.b();
        return jz5.f0.f384359a;
    }
}
