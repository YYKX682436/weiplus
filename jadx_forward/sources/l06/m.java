package l06;

/* loaded from: classes15.dex */
public class m implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l06.o f396418d;

    public m(l06.o oVar) {
        this.f396418d = oVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        n16.g gVar = (n16.g) obj;
        r06.x0 l17 = this.f396418d.l();
        n16.c cVar = l06.x.f396489k;
        y16.s sVar = ((r06.o0) l17.Q(cVar)).f450032m;
        if (sVar == null) {
            l06.o.a(11);
            throw null;
        }
        o06.j e17 = ((y16.a) sVar).e(gVar, w06.d.f523479d);
        if (e17 == null) {
            throw new java.lang.AssertionError("Built-in class " + cVar.c(gVar) + " is not found");
        }
        if (e17 instanceof o06.g) {
            return (o06.g) e17;
        }
        throw new java.lang.AssertionError("Must be a class descriptor " + gVar + ", but was " + e17);
    }
}
