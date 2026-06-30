package com.tencent.mm.modelcdntran;

/* loaded from: classes12.dex */
public final class n3 extends x65.l {

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f71110h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(androidx.lifecycle.y lifecycleOwner) {
        super(lifecycleOwner);
        kotlin.jvm.internal.o.g(lifecycleOwner, "lifecycleOwner");
        this.f71110h = jz5.h.b(new com.tencent.mm.modelcdntran.m3(lifecycleOwner));
    }

    @Override // x65.l
    public java.lang.String e() {
        return "MicroMsg.CdnMediaFSC";
    }

    @Override // x65.l
    public com.tencent.mm.sdk.coroutines.LifecycleScope j() {
        return (com.tencent.mm.sdk.coroutines.LifecycleScope) ((jz5.n) this.f71110h).getValue();
    }

    @Override // x65.l
    public kotlinx.coroutines.sync.m k() {
        return kotlinx.coroutines.sync.p.a(5, 0, 2, null);
    }

    @Override // x65.a
    public java.lang.String name() {
        return "RecordMediaDownloadGroup";
    }
}
