package com.p314xaae8f345.mm.ui;

/* loaded from: classes8.dex */
public class y4 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.C21357x5e7365bb f294108a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(com.p314xaae8f345.mm.ui.C21357x5e7365bb c21357x5e7365bb, android.os.Looper looper) {
        super(looper);
        this.f294108a = c21357x5e7365bb;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        if (message.what != 1) {
            return;
        }
        com.p314xaae8f345.mm.ui.C21357x5e7365bb c21357x5e7365bb = this.f294108a;
        if (c21357x5e7365bb.f278189w != null) {
            c21357x5e7365bb.B1(true);
        }
    }
}
