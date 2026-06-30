package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes13.dex */
public class s extends u32.q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f99056b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.tencent.mm.plugin.exdevice.model.d0 d0Var, int i17, java.lang.Runnable runnable) {
        super(i17);
        this.f99056b = runnable;
    }

    @Override // u32.q
    public void a() {
        this.f99056b.run();
    }
}
