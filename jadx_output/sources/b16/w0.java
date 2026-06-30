package b16;

/* loaded from: classes16.dex */
public final class w0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b16.f1 f17258d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(b16.f1 f1Var) {
        super(1);
        this.f17258d = f1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        n16.g name = (n16.g) obj;
        kotlin.jvm.internal.o.g(name, "name");
        b16.f1 f1Var = this.f17258d;
        b16.f1 f1Var2 = f1Var.f17164c;
        if (f1Var2 != null) {
            return (java.util.Collection) ((e26.r) f1Var2.f17167f).invoke(name);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((b16.d) ((e26.o) f1Var.f17166e).invoke()).b(name).iterator();
        while (it.hasNext()) {
            z06.h t17 = f1Var.t((e16.q) it.next());
            if (f1Var.r(t17)) {
                ((y06.m) f1Var.f17163b.f649a.f621g).getClass();
                arrayList.add(t17);
            }
        }
        f1Var.j(arrayList, name);
        return arrayList;
    }
}
