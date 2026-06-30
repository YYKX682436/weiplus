package bj5;

/* loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bj5.n f21189d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(bj5.n nVar) {
        super(0);
        this.f21189d = nVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return (android.support.v4.os.ResultReceiver) this.f21189d.getIntent().getParcelableExtra("key_result_receiver");
    }
}
