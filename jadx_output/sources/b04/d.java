package b04;

/* loaded from: classes5.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b04.f f16884d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b04.f fVar) {
        super(0);
        this.f16884d = fVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Integer.valueOf(this.f16884d.getIntent().getIntExtra("key_enter_scene", 0));
    }
}
