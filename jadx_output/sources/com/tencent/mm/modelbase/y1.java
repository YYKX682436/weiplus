package com.tencent.mm.modelbase;

/* loaded from: classes5.dex */
public class y1 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.r1 f70839a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(com.tencent.mm.modelbase.r1 r1Var, android.os.Looper looper) {
        super(looper);
        this.f70839a = r1Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        this.f70839a.g((com.tencent.mm.modelbase.m1) message.obj);
    }
}
