package b04;

/* loaded from: classes3.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b04.j0 f16911d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(b04.j0 j0Var) {
        super(0);
        this.f16911d = j0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Integer.valueOf(this.f16911d.getIntent().getIntExtra("key_enter_scene", 0));
    }
}
