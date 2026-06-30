package com.tencent.mm.plugin.appbrand;

/* loaded from: classes12.dex */
public final class ff implements qu5.a {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f78053a = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Handler f78054b;

    public ff() {
        this.f78054b = android.os.Build.VERSION.SDK_INT >= 28 ? android.os.Handler.createAsync(android.os.Looper.getMainLooper()) : null;
    }

    @Override // qu5.a
    public void dispatchMessage(android.os.Message message) {
        this.f78053a.dispatchMessage(message);
    }

    @Override // qu5.a
    public void dump(android.util.Printer printer, java.lang.String str) {
        this.f78053a.dump(printer, str);
    }

    @Override // qu5.a
    public boolean executeOrSendMessage(android.os.Message message) {
        return this.f78053a.executeOrSendMessage(message);
    }

    @Override // qu5.a
    public android.os.Looper getLooper() {
        return this.f78053a.getLooper();
    }

    @Override // qu5.a
    public java.lang.String getMessageName(android.os.Message message) {
        return this.f78053a.getMessageName(message);
    }

    @Override // qu5.a
    public android.os.Handler getSelf() {
        return this.f78053a.getSelf();
    }

    @Override // qu5.a
    public xu5.b getSerial() {
        return this.f78053a.getSerial();
    }

    @Override // qu5.a
    public java.lang.String getSerialTag() {
        return this.f78053a.getSerialTag();
    }

    @Override // qu5.a
    public boolean hasMessages(int i17) {
        return this.f78053a.hasMessages(i17);
    }

    @Override // qu5.a
    public boolean isQuit() {
        return this.f78053a.isQuit();
    }

    @Override // qu5.a
    public android.os.Message obtainMessage() {
        return this.f78053a.obtainMessage();
    }

    @Override // qu5.a
    public boolean post(java.lang.Runnable runnable) {
        return this.f78053a.post(runnable);
    }

    @Override // qu5.a
    public boolean postAtFrontOfQueue(java.lang.Runnable runnable) {
        return this.f78053a.postAtFrontOfQueue(runnable);
    }

    @Override // qu5.a
    public boolean postAtTime(java.lang.Runnable runnable, long j17) {
        return this.f78053a.postAtTime(runnable, j17);
    }

    @Override // qu5.a
    public boolean postDelayed(java.lang.Runnable runnable, long j17) {
        return this.f78053a.postDelayed(runnable, j17);
    }

    @Override // qu5.a
    public boolean quit() {
        return this.f78053a.quit();
    }

    @Override // qu5.a
    public void removeCallbacks(java.lang.Runnable runnable, java.lang.Object obj) {
        this.f78053a.removeCallbacks(runnable, obj);
    }

    @Override // qu5.a
    public void removeCallbacksAndMessages(java.lang.Object obj) {
        this.f78053a.removeCallbacksAndMessages(obj);
        android.os.Handler handler = this.f78054b;
        if (handler != null) {
            handler.removeCallbacksAndMessages(obj);
        }
    }

    @Override // qu5.a
    public void removeMessages(int i17) {
        this.f78053a.removeMessages(i17);
    }

    @Override // qu5.a
    public boolean sendEmptyMessage(int i17) {
        return this.f78053a.sendEmptyMessage(i17);
    }

    @Override // qu5.a
    public boolean sendEmptyMessageAtTime(int i17, long j17) {
        return this.f78053a.sendEmptyMessageAtTime(i17, j17);
    }

    @Override // qu5.a
    public boolean sendEmptyMessageDelayed(int i17, long j17) {
        return this.f78053a.sendEmptyMessageDelayed(i17, j17);
    }

    @Override // qu5.a
    public boolean sendMessage(android.os.Message message) {
        return this.f78053a.sendMessage(message);
    }

    @Override // qu5.a
    public boolean sendMessageAtFrontOfQueue(android.os.Message message) {
        return this.f78053a.sendMessageAtFrontOfQueue(message);
    }

    @Override // qu5.a
    public boolean sendMessageAtTime(android.os.Message message, long j17) {
        return this.f78053a.sendMessageAtTime(message, j17);
    }

    @Override // qu5.a
    public boolean sendMessageDelayed(android.os.Message message, long j17) {
        return this.f78053a.sendMessageDelayed(message, j17);
    }

    @Override // qu5.a
    public boolean hasMessages(int i17, java.lang.Object obj) {
        return this.f78053a.hasMessages(i17, obj);
    }

    @Override // qu5.a
    public android.os.Message obtainMessage(int i17) {
        return this.f78053a.obtainMessage(i17);
    }

    @Override // qu5.a
    public boolean postAtTime(java.lang.Runnable runnable, java.lang.Object obj, long j17) {
        return this.f78053a.postAtTime(runnable, obj, j17);
    }

    @Override // qu5.a
    public boolean postDelayed(java.lang.Runnable runnable, java.lang.Object obj, long j17) {
        return this.f78053a.postDelayed(runnable, obj, j17);
    }

    @Override // qu5.a
    public void removeCallbacks(java.lang.Runnable runnable) {
        if (runnable == null) {
            return;
        }
        this.f78053a.removeCallbacks(runnable);
        android.os.Handler handler = this.f78054b;
        if (handler != null) {
            handler.removeCallbacks(runnable);
        }
    }

    @Override // qu5.a
    public void removeMessages(int i17, java.lang.Object obj) {
        this.f78053a.removeMessages(i17, obj);
    }

    @Override // qu5.a
    public android.os.Message obtainMessage(int i17, int i18, int i19) {
        return this.f78053a.obtainMessage(i17, i18, i19);
    }

    @Override // qu5.a
    public android.os.Message obtainMessage(int i17, int i18, int i19, java.lang.Object obj) {
        return this.f78053a.obtainMessage(i17, i18, i19, obj);
    }

    @Override // qu5.a
    public android.os.Message obtainMessage(int i17, java.lang.Object obj) {
        return this.f78053a.obtainMessage(i17, obj);
    }
}
