package be1;

/* loaded from: classes7.dex */
public final class e1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f19461d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(boolean z17) {
        super(2);
        this.f19461d = z17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        android.content.Context context = (android.content.Context) obj;
        java.util.Map outRes = (java.util.Map) obj2;
        kotlin.jvm.internal.o.g(outRes, "outRes");
        if (context != null) {
            outRes.put("notificationAuthorized", be1.i1.a(be1.j1.f19478b, (!this.f19461d || android.os.Build.VERSION.SDK_INT < 28) ? new z2.n1(context).a() : be1.f0.f19469p.get()));
        }
        return jz5.f0.f302826a;
    }
}
