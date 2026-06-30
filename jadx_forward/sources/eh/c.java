package eh;

/* loaded from: classes7.dex */
public final class c extends d8.l {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ eh.d f334400g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d8.i iVar, e8.a aVar, eh.d dVar) {
        super(iVar, aVar);
        this.f334400g = dVar;
    }

    @Override // d8.l
    public f8.d a(java.io.InputStream ins) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ins, "ins");
        f8.d a17 = super.a(ins);
        f8.c cVar = a17.f341605a;
        f8.c cVar2 = f8.c.UNKNOWN;
        if (cVar == cVar2) {
            eh.d dVar = this.f334400g;
            g8.g.f350942a.w(dVar.f334401g, "hy: unknown type. judge svg", new java.lang.Object[0]);
            try {
                s7.t2 g17 = new s7.r3().g(ins, true);
                if (g17 != null) {
                    a17.f341605a = f8.c.CUSTOM;
                    this.f308439a = com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.EnumC1595xee8a129.Legacy;
                    b(new eh.b(g17, this));
                }
            } catch (s7.g3 e17) {
                g8.g.c(dVar.f334401g, e17, "hy: not svg image. return as failed", new java.lang.Object[0]);
                a17.f341605a = cVar2;
            }
        }
        return a17;
    }
}
