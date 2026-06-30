package ad5;

/* loaded from: classes5.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.q f3216d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ad5.d f3217e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f3218f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(yz5.q qVar, ad5.d dVar, java.util.List list) {
        super(0);
        this.f3216d = qVar;
        this.f3217e = dVar;
        this.f3218f = list;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yz5.q qVar = this.f3216d;
        if (qVar != null) {
            qVar.invoke(this.f3217e, ad5.i.f3267a, this.f3218f);
        }
        return jz5.f0.f302826a;
    }
}
