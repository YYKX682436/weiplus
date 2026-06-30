package dc;

/* loaded from: classes16.dex */
public class c extends dc.j {

    /* renamed from: h, reason: collision with root package name */
    public final long f310137h;

    public c(long j17, dc.o oVar, long j18) {
        super(j17, oVar);
        this.f310137h = j18;
    }

    public java.util.List m() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        ((ec.b) h()).f332461d = this.f310137h;
        for (dc.e i17 = i(); i17 != null; i17 = i17.o()) {
            for (dc.f fVar : i17.f310142n) {
                arrayList.add(new dc.b(fVar, l(fVar.f310147a)));
            }
        }
        return arrayList;
    }

    /* renamed from: toString */
    public final java.lang.String m123891x9616526c() {
        java.lang.String str = i().f310139h;
        long j17 = this.f310166f.f310158i.f310192f;
        long j18 = this.f310164d;
        return java.lang.String.format("%s@%d (0x%x)", str, java.lang.Long.valueOf(j17 & j18), java.lang.Long.valueOf(this.f310166f.f310158i.f310192f & j18));
    }
}
