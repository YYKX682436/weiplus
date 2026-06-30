package be1;

/* loaded from: classes7.dex */
public final class e1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f100994d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(boolean z17) {
        super(2);
        this.f100994d = z17;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        android.content.Context context = (android.content.Context) obj;
        java.util.Map outRes = (java.util.Map) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRes, "outRes");
        if (context != null) {
            outRes.put("notificationAuthorized", be1.i1.a(be1.j1.f101011b, (!this.f100994d || android.os.Build.VERSION.SDK_INT < 28) ? new z2.n1(context).a() : be1.f0.f101002p.get()));
        }
        return jz5.f0.f384359a;
    }
}
