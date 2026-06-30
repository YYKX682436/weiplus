package be1;

/* loaded from: classes7.dex */
public final class d1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final be1.d1 f100993d = new be1.d1();

    public d1() {
        super(2);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        android.content.Context context = (android.content.Context) obj;
        java.util.Map outRes = (java.util.Map) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRes, "outRes");
        if (context != null) {
            outRes.put("microphoneAuthorized", be1.i1.a(be1.j1.f101011b, nf.t.b(context, null, "android.permission.RECORD_AUDIO")));
        }
        return jz5.f0.f384359a;
    }
}
