package com.p314xaae8f345.mm.p983xc3c3c8ee.p984x633fb29;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/openim/model/OpenImKefuStartChattingResultReceiver;", "Landroid/os/ResultReceiver;", "l41/j2", "common-lib_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.openim.model.OpenImKefuStartChattingResultReceiver */
/* loaded from: classes8.dex */
public final class ResultReceiverC11209x6faff39d extends android.os.ResultReceiver {

    /* renamed from: d, reason: collision with root package name */
    public final l41.j2 f153824d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResultReceiverC11209x6faff39d(android.os.Handler handler, l41.j2 callback) {
        super(handler);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handler, "handler");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f153824d = callback;
    }

    @Override // android.os.ResultReceiver
    public void onReceiveResult(int i17, android.os.Bundle bundle) {
        this.f153824d.a(bundle);
    }
}
