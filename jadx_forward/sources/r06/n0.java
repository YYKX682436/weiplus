package r06;

/* loaded from: classes15.dex */
public final class n0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r06.o0 f450022d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(r06.o0 o0Var) {
        super(0);
        this.f450022d = o0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        r06.o0 o0Var = this.f450022d;
        e26.x xVar = o0Var.f450031i;
        f06.v[] vVarArr = r06.o0.f450027n;
        if (((java.lang.Boolean) e26.b0.a(xVar, o0Var, vVarArr[1])).booleanValue()) {
            return y16.r.f540506b;
        }
        java.util.List list = (java.util.List) e26.b0.a(o0Var.f450030h, o0Var, vVarArr[0]);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((o06.d1) it.next()).V());
        }
        r06.x0 x0Var = o0Var.f450028f;
        n16.c cVar = o0Var.f450029g;
        java.util.List u07 = kz5.n0.u0(arrayList, new r06.k1(x0Var, cVar));
        return y16.c.f540459d.a("package view scope for " + cVar + " in " + x0Var.mo132800xfb82e301(), u07);
    }
}
