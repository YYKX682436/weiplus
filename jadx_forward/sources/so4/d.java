package so4;

/* loaded from: classes10.dex */
public final class d implements wm5.f {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f492304a = "";

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rm5.v f492305b;

    public d(rm5.v vVar) {
        this.f492305b = vVar;
    }

    @Override // wm5.f
    public void a(long j17) {
        java.lang.Object obj;
        java.lang.String str;
        so4.g gVar = so4.g.f492309a;
        so4.a aVar = so4.g.f492313e;
        if ((aVar != null ? aVar.f492299a : null) != null) {
            java.util.Iterator it = this.f492305b.f479117l.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                rm5.j jVar = (rm5.j) obj;
                if (jVar.f479035d <= j17 && jVar.f479036e > j17) {
                    break;
                }
            }
            rm5.j jVar2 = (rm5.j) obj;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(jVar2 != null ? jVar2.f479032a : null, this.f492304a)) {
                return;
            }
            so4.g gVar2 = so4.g.f492309a;
            int a17 = gVar2.a(jVar2 != null ? jVar2.f479032a : null);
            if (((java.util.ArrayList) so4.g.f492317i).contains(java.lang.Integer.valueOf(a17))) {
                gVar2.g(a17);
            }
            if (jVar2 == null || (str = jVar2.f479032a) == null) {
                str = "";
            }
            this.f492304a = str;
        }
    }

    @Override // wm5.f
    public void b() {
    }
}
