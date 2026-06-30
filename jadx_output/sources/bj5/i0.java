package bj5;

/* loaded from: classes.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bj5.k0 f21190d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(bj5.k0 k0Var) {
        super(0);
        this.f21190d = k0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return (android.support.v4.os.ResultReceiver) this.f21190d.getIntent().getParcelableExtra("key_result_receiver");
    }
}
