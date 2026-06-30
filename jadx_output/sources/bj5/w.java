package bj5;

/* loaded from: classes.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bj5.y f21241d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(bj5.y yVar) {
        super(0);
        this.f21241d = yVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return (android.support.v4.os.ResultReceiver) this.f21241d.getIntent().getParcelableExtra("key_result_receiver");
    }
}
