package com.tencent.mm.modelcdntran;

/* loaded from: classes11.dex */
public final class m3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.y f71094d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(androidx.lifecycle.y yVar) {
        super(0);
        this.f71094d = yVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return new com.tencent.mm.sdk.coroutines.LifecycleScope("RecordMediaDownloadGroup", this.f71094d, 5);
    }
}
