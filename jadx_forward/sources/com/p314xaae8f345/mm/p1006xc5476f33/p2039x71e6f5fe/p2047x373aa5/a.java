package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5;

/* loaded from: classes13.dex */
public class a extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.C17341x37ecb966 f241453a;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.C17341x37ecb966 c17341x37ecb966) {
        this.f241453a = c17341x37ecb966;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.C17341x37ecb966 c17341x37ecb966 = this.f241453a;
        c17341x37ecb966.f241399i = currentTimeMillis;
        c17341x37ecb966.f241394d = java.util.Arrays.copyOf(c17341x37ecb966.f241395e, 4);
        c17341x37ecb966.invalidate();
    }
}
