package a90;

/* loaded from: classes5.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jm0.o f2409d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(jm0.o oVar) {
        super(0);
        this.f2409d = oVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return new com.tencent.mm.sdk.coroutines.SequenceLifecycleScope("Send_LocationMsgAsyncSendFSC", this.f2409d);
    }
}
