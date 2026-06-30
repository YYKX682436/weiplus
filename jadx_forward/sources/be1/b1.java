package be1;

/* loaded from: classes7.dex */
public final class b1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final be1.b1 f100989d = new be1.b1();

    public b1() {
        super(2);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        android.content.Context context = (android.content.Context) obj;
        java.util.Map outRes = (java.util.Map) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRes, "outRes");
        if (context != null) {
            outRes.put("cameraAuthorized", be1.i1.a(be1.j1.f101011b, nf.t.b(context, null, "android.permission.CAMERA")));
        }
        return jz5.f0.f384359a;
    }
}
