package com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1;

/* loaded from: classes16.dex */
public class v extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.y f294204a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.y yVar, android.os.Looper looper) {
        super(looper);
        this.f294204a = yVar;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        this.f294204a.a(message.what, message.obj);
    }
}
