package be1;

/* loaded from: classes7.dex */
public final class b1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final be1.b1 f19456d = new be1.b1();

    public b1() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        android.content.Context context = (android.content.Context) obj;
        java.util.Map outRes = (java.util.Map) obj2;
        kotlin.jvm.internal.o.g(outRes, "outRes");
        if (context != null) {
            outRes.put("cameraAuthorized", be1.i1.a(be1.j1.f19478b, nf.t.b(context, null, "android.permission.CAMERA")));
        }
        return jz5.f0.f302826a;
    }
}
