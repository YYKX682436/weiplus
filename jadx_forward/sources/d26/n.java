package d26;

/* loaded from: classes16.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f307562a;

    /* renamed from: b, reason: collision with root package name */
    public final e26.w f307563b;

    /* renamed from: c, reason: collision with root package name */
    public final e26.x f307564c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d26.x f307565d;

    public n(d26.x xVar) {
        this.f307565d = xVar;
        java.util.List list = xVar.f307586h.f369191z;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "getEnumEntryList(...)");
        int d17 = kz5.b1.d(kz5.d0.q(list, 10));
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17 < 16 ? 16 : d17);
        for (java.lang.Object obj : list) {
            linkedHashMap.put(b26.t0.b(xVar.f307593r.f99049b, ((i16.c0) obj).f368911g), obj);
        }
        this.f307562a = linkedHashMap;
        d26.x xVar2 = this.f307565d;
        this.f307563b = ((e26.u) xVar2.f307593r.f99048a.f99016a).d(new d26.l(this, xVar2));
        this.f307564c = ((e26.u) this.f307565d.f307593r.f99048a.f99016a).b(new d26.m(this));
    }
}
