package cj4;

/* loaded from: classes11.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj4.a0 f42007d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(cj4.a0 a0Var) {
        super(0);
        this.f42007d = a0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return ((android.app.Activity) this.f42007d.w()).getWindow().getDecorView();
    }
}
