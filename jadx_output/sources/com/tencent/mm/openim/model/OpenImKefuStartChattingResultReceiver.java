package com.tencent.mm.openim.model;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/openim/model/OpenImKefuStartChattingResultReceiver;", "Landroid/os/ResultReceiver;", "l41/j2", "common-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class OpenImKefuStartChattingResultReceiver extends android.os.ResultReceiver {

    /* renamed from: d, reason: collision with root package name */
    public final l41.j2 f72291d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenImKefuStartChattingResultReceiver(android.os.Handler handler, l41.j2 callback) {
        super(handler);
        kotlin.jvm.internal.o.g(handler, "handler");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f72291d = callback;
    }

    @Override // android.os.ResultReceiver
    public void onReceiveResult(int i17, android.os.Bundle bundle) {
        this.f72291d.a(bundle);
    }
}
