package com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1;

/* loaded from: classes16.dex */
public class w extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.y f294205a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.y yVar, android.os.Looper looper) {
        super(looper);
        this.f294205a = yVar;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        synchronized (this.f294205a.f294210e) {
            com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.x xVar = this.f294205a.f294211f;
            if (xVar != null) {
                ((com.p314xaae8f345.mm.p2771x14b5ed1d.p2772x2e06d1.e) xVar).a(message.what, message.obj);
            }
            this.f294205a.f294210e.notify();
        }
    }
}
