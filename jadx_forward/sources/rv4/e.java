package rv4;

/* loaded from: classes12.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv4.k f481992d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f481993e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(rv4.k kVar, java.util.List list) {
        super(2);
        this.f481992d = kVar;
        this.f481993e = list;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String key = (java.lang.String) obj;
        org.json.JSONObject value = (org.json.JSONObject) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(pv4.a.d(value, "nickname"), this.f481992d.f482041f)) {
            this.f481993e.add(key);
        }
        return jz5.f0.f384359a;
    }
}
