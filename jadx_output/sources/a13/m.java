package a13;

/* loaded from: classes.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a13.t f557d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(a13.t tVar) {
        super(1);
        this.f557d = tVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        yz5.l callback = (yz5.l) obj;
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f557d.b(false, false, true, new a13.l(callback));
        return jz5.f0.f302826a;
    }
}
