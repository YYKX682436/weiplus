package com.p314xaae8f345.tav.p2959x5befac44.p2964xcbe10e0a;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\b\u0010\u0006\u001a\u00020\u0002H$R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/tencent/tav/decoder/thread/ReActionHandlerThread;", "Landroid/os/HandlerThread;", "Ljz5/f0;", "start", "action", "release", "doAction", "", "TAG", "Ljava/lang/String;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "<init>", "(Ljava/lang/String;)V", "tav-foundation_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.tav.decoder.thread.ReActionHandlerThread */
/* loaded from: classes16.dex */
public abstract class AbstractHandlerThreadC25817xd0622a0b extends android.os.HandlerThread {
    private final java.lang.String TAG;
    private android.os.Handler handler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractHandlerThreadC25817xd0622a0b(java.lang.String name) {
        super(name);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        this.TAG = "ReHandlerThread-".concat(name);
    }

    /* renamed from: action */
    public final void m97940xab2f7e36() {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.v(this.TAG, "action: " + this + ' ' + hashCode());
        android.os.Handler handler = this.handler;
        if (handler != null) {
            handler.post(new java.lang.Runnable() { // from class: com.tencent.tav.decoder.thread.ReActionHandlerThread$action$1
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.tav.p2959x5befac44.p2964xcbe10e0a.AbstractHandlerThreadC25817xd0622a0b.this.mo96678xf85da2a1();
                }
            });
        }
    }

    /* renamed from: doAction */
    public abstract void mo96678xf85da2a1();

    /* renamed from: release */
    public final synchronized void m97941x41012807() {
        android.os.Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        quitSafely();
    }

    @Override // java.lang.Thread
    public void start() {
        super.start();
        this.handler = new android.os.Handler(getLooper());
    }
}
