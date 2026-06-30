package b16;

/* loaded from: classes16.dex */
public final class w0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b16.f1 f98791d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(b16.f1 f1Var) {
        super(1);
        this.f98791d = f1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        n16.g name = (n16.g) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        b16.f1 f1Var = this.f98791d;
        b16.f1 f1Var2 = f1Var.f98697c;
        if (f1Var2 != null) {
            return (java.util.Collection) ((e26.r) f1Var2.f98700f).mo146xb9724478(name);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((b16.d) ((e26.o) f1Var.f98699e).mo152xb9724478()).b(name).iterator();
        while (it.hasNext()) {
            z06.h t17 = f1Var.t((e16.q) it.next());
            if (f1Var.r(t17)) {
                ((y06.m) f1Var.f98696b.f82182a.f82154g).getClass();
                arrayList.add(t17);
            }
        }
        f1Var.j(arrayList, name);
        return arrayList;
    }
}
