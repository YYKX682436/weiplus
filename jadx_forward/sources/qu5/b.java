package qu5;

/* loaded from: classes12.dex */
public final class b implements qu5.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.os.Handler f448365a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f448366b = new java.util.concurrent.atomic.AtomicBoolean();

    public b(android.os.Handler handler) {
        this.f448365a = handler;
    }

    @Override // qu5.a
    /* renamed from: dispatchMessage */
    public void mo50277x8245362d(android.os.Message message) {
        this.f448365a.dispatchMessage(message);
    }

    @Override // qu5.a
    /* renamed from: dump */
    public void mo50278x2f39f4(android.util.Printer printer, java.lang.String str) {
        this.f448365a.dump(printer, str);
    }

    @Override // qu5.a
    /* renamed from: executeOrSendMessage */
    public boolean mo50279x9b89c07(android.os.Message message) {
        if (mo50287xb9a7fe99()) {
            return false;
        }
        if (mo50280x23b2dd47() != android.os.Looper.myLooper()) {
            return mo50308x2936bf5f(message);
        }
        this.f448365a.dispatchMessage(message);
        return true;
    }

    @Override // qu5.a
    /* renamed from: getLooper */
    public android.os.Looper mo50280x23b2dd47() {
        return this.f448365a.getLooper();
    }

    @Override // qu5.a
    /* renamed from: getMessageName */
    public java.lang.String mo50281xa5c8d9fc(android.os.Message message) {
        return this.f448365a.getMessageName(message);
    }

    @Override // qu5.a
    /* renamed from: getSelf */
    public android.os.Handler mo50282xfb8537c2() {
        return this.f448365a;
    }

    @Override // qu5.a
    /* renamed from: getSerial */
    public xu5.b mo50283x2f1920ea() {
        return null;
    }

    @Override // qu5.a
    /* renamed from: getSerialTag */
    public java.lang.String mo50284xdd3e8650() {
        return null;
    }

    @Override // qu5.a
    /* renamed from: hasMessages */
    public boolean mo50285x8fc9be06(int i17) {
        return this.f448365a.hasMessages(i17);
    }

    @Override // qu5.a
    /* renamed from: isQuit */
    public boolean mo50287xb9a7fe99() {
        return this.f448366b.get();
    }

    @Override // qu5.a
    /* renamed from: obtainMessage */
    public android.os.Message mo50288x733c63a2() {
        return this.f448365a.obtainMessage();
    }

    @Override // qu5.a
    /* renamed from: post */
    public boolean mo50293x3498a0(java.lang.Runnable runnable) {
        return this.f448365a.post(runnable);
    }

    @Override // qu5.a
    /* renamed from: postAtFrontOfQueue */
    public boolean mo50294x9395cba4(java.lang.Runnable runnable) {
        return this.f448365a.postAtFrontOfQueue(runnable);
    }

    @Override // qu5.a
    /* renamed from: postAtTime */
    public boolean mo50295x41bd0e60(java.lang.Runnable runnable, long j17) {
        return this.f448365a.postAtTime(runnable, j17);
    }

    @Override // qu5.a
    /* renamed from: postDelayed */
    public boolean mo50297x7c4d7ca2(java.lang.Runnable runnable, long j17) {
        return this.f448365a.postDelayed(runnable, j17);
    }

    @Override // qu5.a
    /* renamed from: quit */
    public boolean mo50299x35224f() {
        if (!this.f448366b.compareAndSet(false, true)) {
            return false;
        }
        mo50302x6b17ad39(null);
        if (mo50280x23b2dd47() != null) {
            ku5.o.f394132c.w("WrapperHandler", "Do you want to quit this looper thread? You'd better get this Looper to quit.", new java.lang.Object[0]);
        }
        return true;
    }

    @Override // qu5.a
    /* renamed from: removeCallbacks */
    public void mo50300x3fa464aa(java.lang.Runnable runnable) {
        this.f448365a.removeCallbacks(runnable);
    }

    @Override // qu5.a
    /* renamed from: removeCallbacksAndMessages */
    public void mo50302x6b17ad39(java.lang.Object obj) {
        this.f448365a.removeCallbacksAndMessages(obj);
    }

    @Override // qu5.a
    /* renamed from: removeMessages */
    public void mo50303x856b99f0(int i17) {
        this.f448365a.removeMessages(i17);
    }

    @Override // qu5.a
    /* renamed from: sendEmptyMessage */
    public boolean mo50305x3d8a09a2(int i17) {
        return this.f448365a.sendEmptyMessage(i17);
    }

    @Override // qu5.a
    /* renamed from: sendEmptyMessageAtTime */
    public boolean mo50306x754635e2(int i17, long j17) {
        return this.f448365a.sendEmptyMessageAtTime(i17, j17);
    }

    @Override // qu5.a
    /* renamed from: sendEmptyMessageDelayed */
    public boolean mo50307xb9e94560(int i17, long j17) {
        return this.f448365a.sendEmptyMessageDelayed(i17, j17);
    }

    @Override // qu5.a
    /* renamed from: sendMessage */
    public boolean mo50308x2936bf5f(android.os.Message message) {
        return this.f448365a.sendMessage(message);
    }

    @Override // qu5.a
    /* renamed from: sendMessageAtFrontOfQueue */
    public boolean mo50309x6d91b823(android.os.Message message) {
        return this.f448365a.sendMessageAtFrontOfQueue(message);
    }

    @Override // qu5.a
    /* renamed from: sendMessageAtTime */
    public boolean mo50310xc5d0e9df(android.os.Message message, long j17) {
        if (mo50287xb9a7fe99()) {
            return false;
        }
        return this.f448365a.sendMessageAtTime(message, j17);
    }

    @Override // qu5.a
    /* renamed from: sendMessageDelayed */
    public boolean mo50311x7ab51103(android.os.Message message, long j17) {
        return this.f448365a.sendMessageDelayed(message, j17);
    }

    /* renamed from: toString */
    public java.lang.String m160905x9616526c() {
        return this.f448365a.toString();
    }

    @Override // qu5.a
    /* renamed from: hasMessages */
    public boolean mo50286x8fc9be06(int i17, java.lang.Object obj) {
        return this.f448365a.hasMessages(i17, obj);
    }

    @Override // qu5.a
    /* renamed from: obtainMessage */
    public android.os.Message mo50289x733c63a2(int i17) {
        return this.f448365a.obtainMessage(i17);
    }

    @Override // qu5.a
    /* renamed from: postAtTime */
    public boolean mo50296x41bd0e60(java.lang.Runnable runnable, java.lang.Object obj, long j17) {
        return this.f448365a.postAtTime(runnable, obj, j17);
    }

    @Override // qu5.a
    /* renamed from: postDelayed */
    public boolean mo50298x7c4d7ca2(java.lang.Runnable runnable, java.lang.Object obj, long j17) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return this.f448365a.postDelayed(runnable, obj, j17);
        }
        throw new java.lang.RuntimeException("Call requires API level 28 (current min is 19): android.os.Handler#postDelayed");
    }

    @Override // qu5.a
    /* renamed from: removeCallbacks */
    public void mo50301x3fa464aa(java.lang.Runnable runnable, java.lang.Object obj) {
        this.f448365a.removeCallbacks(runnable, obj);
    }

    @Override // qu5.a
    /* renamed from: removeMessages */
    public void mo50304x856b99f0(int i17, java.lang.Object obj) {
        this.f448365a.removeMessages(i17, obj);
    }

    @Override // qu5.a
    /* renamed from: obtainMessage */
    public android.os.Message mo50292x733c63a2(int i17, java.lang.Object obj) {
        return this.f448365a.obtainMessage(i17, obj);
    }

    @Override // qu5.a
    /* renamed from: obtainMessage */
    public android.os.Message mo50290x733c63a2(int i17, int i18, int i19) {
        return this.f448365a.obtainMessage(i17, i18, i19);
    }

    @Override // qu5.a
    /* renamed from: obtainMessage */
    public android.os.Message mo50291x733c63a2(int i17, int i18, int i19, java.lang.Object obj) {
        return this.f448365a.obtainMessage(i17, i18, i19, obj);
    }
}
