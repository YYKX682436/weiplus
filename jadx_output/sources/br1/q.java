package br1;

/* loaded from: classes11.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c01.o8 f23635d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f23636e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hr1.a f23637f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(c01.o8 o8Var, java.lang.String str, hr1.a aVar) {
        super(0);
        this.f23635d = o8Var;
        this.f23636e = str;
        this.f23637f = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        c01.o8 o8Var = this.f23635d;
        if (o8Var != null) {
            o8Var.a(this.f23636e, this.f23637f != null);
        }
        return jz5.f0.f302826a;
    }
}
