package be1;

/* loaded from: classes7.dex */
public final class c1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final be1.c1 f100991d = new be1.c1();

    public c1() {
        super(2);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        android.content.Context context = (android.content.Context) obj;
        java.util.Map outRes = (java.util.Map) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRes, "outRes");
        if (context != null) {
            outRes.put("locationAuthorized", be1.i1.a(be1.j1.f101011b, nf.t.b(context, null, "android.permission.ACCESS_FINE_LOCATION")));
        }
        return jz5.f0.f384359a;
    }
}
