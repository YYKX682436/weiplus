package oz5;

/* loaded from: classes14.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final oz5.k f431861d = new oz5.k();

    public k() {
        super(2);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        oz5.d dVar;
        oz5.l acc = (oz5.l) obj;
        oz5.i element = (oz5.i) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(acc, "acc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(element, "element");
        oz5.l mo7095xafa9a7cf = acc.mo7095xafa9a7cf(element.mo7094xb5884f29());
        oz5.m mVar = oz5.m.f431862d;
        if (mo7095xafa9a7cf == mVar) {
            return element;
        }
        int i17 = oz5.f.Y0;
        oz5.e eVar = oz5.e.f431860d;
        oz5.f fVar = (oz5.f) mo7095xafa9a7cf.get(eVar);
        if (fVar == null) {
            dVar = new oz5.d(mo7095xafa9a7cf, element);
        } else {
            oz5.l mo7095xafa9a7cf2 = mo7095xafa9a7cf.mo7095xafa9a7cf(eVar);
            if (mo7095xafa9a7cf2 == mVar) {
                return new oz5.d(element, fVar);
            }
            dVar = new oz5.d(new oz5.d(mo7095xafa9a7cf2, element), fVar);
        }
        return dVar;
    }
}
