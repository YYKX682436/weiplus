package com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002;

/* loaded from: classes14.dex */
public final class t extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    private int f128000a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f128001b;

    /* renamed from: c, reason: collision with root package name */
    private final com.tencent.liteav.base.util.t.a f128002c;

    /* loaded from: classes14.dex */
    public interface a {
        /* renamed from: onTimeout */
        void mo29580x1554e82();
    }

    public t(android.os.Looper looper, com.tencent.liteav.base.util.t.a aVar) {
        super(looper);
        this.f128001b = false;
        this.f128002c = aVar;
    }

    public final synchronized void a(int i17) {
        a();
        this.f128000a = i17;
        this.f128001b = true;
        sendEmptyMessageDelayed(0, 0L);
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        synchronized (this) {
            if (this.f128001b) {
                removeMessages(0);
                sendEmptyMessageDelayed(0, this.f128000a);
                com.tencent.liteav.base.util.t.a aVar = this.f128002c;
                if (aVar != null) {
                    aVar.mo29580x1554e82();
                }
            }
        }
    }

    public final synchronized void a() {
        while (hasMessages(0)) {
            removeMessages(0);
        }
        this.f128001b = false;
    }
}
