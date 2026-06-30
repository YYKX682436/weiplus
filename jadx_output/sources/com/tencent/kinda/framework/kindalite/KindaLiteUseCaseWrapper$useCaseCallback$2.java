package com.tencent.kinda.framework.kindalite;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/tencent/kinda/gen/UseCaseCallback;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class KindaLiteUseCaseWrapper$useCaseCallback$2 extends kotlin.jvm.internal.q implements yz5.a {
    final /* synthetic */ com.tencent.kinda.framework.kindalite.KindaLiteUseCaseWrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KindaLiteUseCaseWrapper$useCaseCallback$2(com.tencent.kinda.framework.kindalite.KindaLiteUseCaseWrapper kindaLiteUseCaseWrapper) {
        super(0);
        this.this$0 = kindaLiteUseCaseWrapper;
    }

    @Override // yz5.a
    public final com.tencent.kinda.gen.UseCaseCallback invoke() {
        final com.tencent.kinda.framework.kindalite.KindaLiteUseCaseWrapper kindaLiteUseCaseWrapper = this.this$0;
        return new com.tencent.kinda.gen.UseCaseCallback() { // from class: com.tencent.kinda.framework.kindalite.KindaLiteUseCaseWrapper$useCaseCallback$2.1
            @Override // com.tencent.kinda.gen.UseCaseCallback
            public final void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
                com.tencent.kinda.gen.VoidITransmitKvDataCallback voidITransmitKvDataCallback;
                voidITransmitKvDataCallback = com.tencent.kinda.framework.kindalite.KindaLiteUseCaseWrapper.this.callback;
                if (voidITransmitKvDataCallback != null) {
                    voidITransmitKvDataCallback.call(iTransmitKvData);
                }
            }
        };
    }
}
