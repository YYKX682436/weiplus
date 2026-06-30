package d26;

/* loaded from: classes16.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d26.x f307583d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(d26.x xVar) {
        super(0);
        this.f307583d = xVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Object obj;
        d26.x xVar = this.f307583d;
        if (xVar.f307592q.h()) {
            r16.g gVar = new r16.g(xVar, o06.x1.f423537a, false);
            gVar.C0(xVar.k());
            return gVar;
        }
        java.util.List list = xVar.f307586h.f369187v;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "getConstructorList(...)");
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!k16.f.f384979n.c(((i16.r) obj).f369238g).booleanValue()) {
                break;
            }
        }
        i16.r rVar = (i16.r) obj;
        if (rVar != null) {
            return xVar.f307593r.f99056i.d(rVar, true);
        }
        return null;
    }
}
