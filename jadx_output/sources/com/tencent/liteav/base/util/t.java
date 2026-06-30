package com.tencent.liteav.base.util;

/* loaded from: classes14.dex */
public final class t extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    private int f46467a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f46468b;

    /* renamed from: c, reason: collision with root package name */
    private final com.tencent.liteav.base.util.t.a f46469c;

    /* loaded from: classes14.dex */
    public interface a {
        void onTimeout();
    }

    public t(android.os.Looper looper, com.tencent.liteav.base.util.t.a aVar) {
        super(looper);
        this.f46468b = false;
        this.f46469c = aVar;
    }

    public final synchronized void a(int i17) {
        a();
        this.f46467a = i17;
        this.f46468b = true;
        sendEmptyMessageDelayed(0, 0L);
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        synchronized (this) {
            if (this.f46468b) {
                removeMessages(0);
                sendEmptyMessageDelayed(0, this.f46467a);
                com.tencent.liteav.base.util.t.a aVar = this.f46469c;
                if (aVar != null) {
                    aVar.onTimeout();
                }
            }
        }
    }

    public final synchronized void a() {
        while (hasMessages(0)) {
            removeMessages(0);
        }
        this.f46468b = false;
    }
}
