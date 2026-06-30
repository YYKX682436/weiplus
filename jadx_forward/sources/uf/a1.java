package uf;

/* loaded from: classes7.dex */
public final class a1 extends b06.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ uf.c1 f508502b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(java.lang.Object obj, uf.c1 c1Var) {
        super(obj);
        this.f508502b = c1Var;
    }

    @Override // b06.b
    public void c(f06.v property, java.lang.Object obj, java.lang.Object obj2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(property, "property");
        x91.h hVar = (x91.h) obj2;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b((x91.h) obj, hVar) || hVar.f534180a == null) {
            return;
        }
        uf.c1 c1Var = this.f508502b;
        c1Var.getClass();
        ((ku5.t0) ku5.t0.f394148d).g(new uf.x0(c1Var, hVar));
        uf.c1 c1Var2 = this.f508502b;
        uf.p0 p0Var = new uf.p0(c1Var2);
        java.util.Iterator it = c1Var2.f508517c.iterator();
        while (it.hasNext()) {
            p0Var.mo146xb9724478(it.next());
        }
        java.util.Iterator it6 = this.f508502b.f508518d.iterator();
        while (it6.hasNext()) {
            p0Var.mo146xb9724478(it6.next());
        }
        yz5.a aVar = this.f508502b.f508519e;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }
}
