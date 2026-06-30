package r06;

/* loaded from: classes15.dex */
public final class v0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r06.x0 f450077d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(r06.x0 x0Var) {
        super(0);
        this.f450077d = x0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        r06.x0 x0Var = this.f450077d;
        r06.t0 t0Var = x0Var.f450085m;
        if (t0Var == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Dependencies of module ");
            java.lang.String str = x0Var.mo132800xfb82e301().f415702d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "toString(...)");
            sb6.append(str);
            sb6.append(" were not set before querying module content");
            throw new java.lang.AssertionError(sb6.toString());
        }
        x0Var.j0();
        java.util.List list = ((r06.u0) t0Var).f450070a;
        list.contains(x0Var);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((r06.x0) it.next()).getClass();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it6 = list.iterator();
        while (it6.hasNext()) {
            o06.e1 e1Var = ((r06.x0) it6.next()).f450086n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(e1Var);
            arrayList.add(e1Var);
        }
        return new r06.u(arrayList, "CompositeProvider@ModuleDescriptor for " + x0Var.mo132800xfb82e301());
    }
}
