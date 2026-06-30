package fp0;

/* loaded from: classes10.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fp0.o f346796d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fp0.d f346797e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(fp0.o oVar, fp0.d dVar) {
        super(0);
        this.f346796d = oVar;
        this.f346797e = dVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Object obj;
        fp0.o oVar = this.f346796d;
        java.util.Iterator it = oVar.f346806e.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((fp0.d) ((fp0.q) obj).f346808a).d(), this.f346797e.d())) {
                break;
            }
        }
        fp0.q qVar = (fp0.q) obj;
        if (qVar != null) {
            oVar.f346806e.remove(qVar);
        }
        return jz5.f0.f384359a;
    }
}
