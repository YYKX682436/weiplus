package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* renamed from: com.tencent.mm.ui.conversation.MainUIView */
/* loaded from: classes11.dex */
public class C22377x93874272 extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f288917d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f288918e;

    /* renamed from: f, reason: collision with root package name */
    public volatile long f288919f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f288920g;

    /* renamed from: h, reason: collision with root package name */
    public volatile long f288921h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Runnable f288922i;

    public C22377x93874272(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f288917d = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.myLooper());
        this.f288918e = false;
        this.f288919f = 0L;
        this.f288920g = false;
        this.f288921h = 800L;
        this.f288922i = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.k7(this);
    }

    public final void a() {
        synchronized (this) {
            boolean z17 = this.f288920g;
            this.f288920g = false;
            this.f288918e = false;
            this.f288919f = 0L;
            this.f288917d.mo50300x3fa464aa(this.f288922i);
            if (z17) {
                this.f288917d.mo50294x9395cba4(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.l7(this));
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MainUIView", "Resume requestLayout() suspend.");
    }

    @Override // android.widget.RelativeLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        boolean z17 = false;
        if (this.f288918e) {
            synchronized (this) {
                if (this.f288918e) {
                    long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f288919f;
                    if (currentTimeMillis > 0 && currentTimeMillis <= this.f288921h) {
                        z17 = true;
                    }
                }
            }
        }
        if (!z17) {
            super.requestLayout();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MainUIView", "Suspend a layout request.");
        synchronized (this) {
            this.f288920g = true;
        }
    }

    public C22377x93874272(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f288917d = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.myLooper());
        this.f288918e = false;
        this.f288919f = 0L;
        this.f288920g = false;
        this.f288921h = 800L;
        this.f288922i = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.k7(this);
    }
}
