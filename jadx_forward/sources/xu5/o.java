package xu5;

/* loaded from: classes12.dex */
public class o implements qu5.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.os.Handler.Callback f538860a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f538861b = true;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f538862c = new java.util.concurrent.atomic.AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f538863d;

    /* renamed from: e, reason: collision with root package name */
    public final xu5.b f538864e;

    /* renamed from: f, reason: collision with root package name */
    public final android.os.Handler f538865f;

    /* renamed from: g, reason: collision with root package name */
    public final zu5.b f538866g;

    public o(xu5.b bVar, android.os.Handler.Callback callback) {
        xu5.e eVar = new xu5.e(this, android.os.Looper.getMainLooper());
        this.f538865f = eVar;
        this.f538866g = new zu5.b(android.os.Message.class, "recycleUnchecked", new java.lang.Class[0]);
        java.util.Objects.requireNonNull(bVar);
        this.f538864e = bVar;
        this.f538863d = bVar.f538835a;
        this.f538860a = callback;
        try {
            zu5.a aVar = new zu5.a(android.os.Handler.class, "mLooper");
            synchronized (aVar) {
                aVar.c(eVar, null, false);
            }
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }

    public xu5.n a(android.os.Message message) {
        return new xu5.n(this, message);
    }

    public void b(android.os.Message message) {
    }

    @Override // qu5.a
    /* renamed from: dispatchMessage */
    public void mo50277x8245362d(android.os.Message message) {
        if (message.getCallback() != null) {
            message.getCallback().run();
            return;
        }
        android.os.Handler.Callback callback = this.f538860a;
        if (callback == null || !callback.handleMessage(message)) {
            b(message);
        }
    }

    @Override // qu5.a
    /* renamed from: dump */
    public void mo50278x2f39f4(android.util.Printer printer, java.lang.String str) {
        printer.println(str + this.f538864e.f538836b.c().toString());
    }

    @Override // qu5.a
    /* renamed from: executeOrSendMessage */
    public boolean mo50279x9b89c07(android.os.Message message) {
        if (xu5.b.d() != this.f538864e) {
            return mo50308x2936bf5f(message);
        }
        mo50277x8245362d(message);
        return true;
    }

    @Override // qu5.a
    /* renamed from: getLooper */
    public android.os.Looper mo50280x23b2dd47() {
        return null;
    }

    @Override // qu5.a
    /* renamed from: getMessageName */
    public java.lang.String mo50281xa5c8d9fc(android.os.Message message) {
        return this.f538865f.getMessageName(message);
    }

    @Override // qu5.a
    /* renamed from: getSelf */
    public android.os.Handler mo50282xfb8537c2() {
        return null;
    }

    @Override // qu5.a
    /* renamed from: getSerial */
    public xu5.b mo50283x2f1920ea() {
        return this.f538864e;
    }

    @Override // qu5.a
    /* renamed from: getSerialTag */
    public java.lang.String mo50284xdd3e8650() {
        return this.f538863d;
    }

    @Override // qu5.a
    /* renamed from: hasMessages */
    public boolean mo50285x8fc9be06(int i17) {
        return this.f538864e.f538836b.b(new xu5.k(this, i17));
    }

    @Override // qu5.a
    /* renamed from: isQuit */
    public boolean mo50287xb9a7fe99() {
        return this.f538862c.get();
    }

    @Override // qu5.a
    /* renamed from: obtainMessage */
    public android.os.Message mo50288x733c63a2() {
        return this.f538865f.obtainMessage();
    }

    @Override // qu5.a
    /* renamed from: post */
    public boolean mo50293x3498a0(java.lang.Runnable runnable) {
        return this.f538865f.post(runnable);
    }

    @Override // qu5.a
    /* renamed from: postAtFrontOfQueue */
    public boolean mo50294x9395cba4(java.lang.Runnable runnable) {
        android.os.Handler handler = this.f538865f;
        return handler.sendMessageAtTime(android.os.Message.obtain(handler, runnable), Long.MIN_VALUE);
    }

    @Override // qu5.a
    /* renamed from: postAtTime */
    public boolean mo50295x41bd0e60(java.lang.Runnable runnable, long j17) {
        return this.f538865f.postAtTime(runnable, j17);
    }

    @Override // qu5.a
    /* renamed from: postDelayed */
    public boolean mo50297x7c4d7ca2(java.lang.Runnable runnable, long j17) {
        return this.f538865f.postDelayed(runnable, j17);
    }

    @Override // qu5.a
    /* renamed from: quit */
    public boolean mo50299x35224f() {
        if (!this.f538862c.compareAndSet(false, true)) {
            return false;
        }
        this.f538864e.f538836b.h(new xu5.m(this));
        return true;
    }

    @Override // qu5.a
    /* renamed from: removeCallbacks */
    public void mo50300x3fa464aa(java.lang.Runnable runnable) {
        this.f538864e.f538836b.h(new xu5.f(this, runnable));
    }

    @Override // qu5.a
    /* renamed from: removeCallbacksAndMessages */
    public void mo50302x6b17ad39(java.lang.Object obj) {
        this.f538864e.f538836b.h(new xu5.j(this, obj));
    }

    @Override // qu5.a
    /* renamed from: removeMessages */
    public void mo50303x856b99f0(int i17) {
        this.f538864e.f538836b.h(new xu5.h(this, i17));
    }

    @Override // qu5.a
    /* renamed from: sendEmptyMessage */
    public boolean mo50305x3d8a09a2(int i17) {
        return this.f538865f.sendEmptyMessage(i17);
    }

    @Override // qu5.a
    /* renamed from: sendEmptyMessageAtTime */
    public boolean mo50306x754635e2(int i17, long j17) {
        return this.f538865f.sendEmptyMessageAtTime(i17, j17);
    }

    @Override // qu5.a
    /* renamed from: sendEmptyMessageDelayed */
    public boolean mo50307xb9e94560(int i17, long j17) {
        return this.f538865f.sendEmptyMessageDelayed(i17, j17);
    }

    @Override // qu5.a
    /* renamed from: sendMessage */
    public boolean mo50308x2936bf5f(android.os.Message message) {
        return this.f538865f.sendMessage(message);
    }

    @Override // qu5.a
    /* renamed from: sendMessageAtFrontOfQueue */
    public boolean mo50309x6d91b823(android.os.Message message) {
        return this.f538865f.sendMessageAtTime(message, Long.MIN_VALUE);
    }

    @Override // qu5.a
    /* renamed from: sendMessageAtTime */
    public boolean mo50310xc5d0e9df(android.os.Message message, long j17) {
        xu5.n a17 = a(message);
        if (mo50287xb9a7fe99()) {
            ku5.o.f394130a.b(a17.f538857f, 0, this.f538863d, true);
            return false;
        }
        if (((ku5.t0) ku5.t0.f394148d).f394150a.get()) {
            ku5.o.f394130a.b(a17.f538857f, 0, this.f538863d, true);
            return false;
        }
        if (j17 != Long.MIN_VALUE) {
            long uptimeMillis = j17 - android.os.SystemClock.uptimeMillis();
            if (xu5.b.b() == this.f538864e) {
                ((ku5.t0) ku5.t0.f394148d).E(a17, uptimeMillis);
            } else {
                ((ku5.t0) ku5.t0.f394148d).l(a17, uptimeMillis, this.f538863d);
            }
        } else if (xu5.b.b() == this.f538864e) {
            ((ku5.t0) ku5.t0.f394148d).D(a17);
        } else {
            ((ku5.t0) ku5.t0.f394148d).j(a17, this.f538863d);
        }
        return true;
    }

    @Override // qu5.a
    /* renamed from: sendMessageDelayed */
    public boolean mo50311x7ab51103(android.os.Message message, long j17) {
        return this.f538865f.sendMessageDelayed(message, j17);
    }

    /* renamed from: toString */
    public java.lang.String m176002x9616526c() {
        return java.lang.String.format("SerialHandler(%s) %s", this.f538863d, getClass().getName());
    }

    @Override // qu5.a
    /* renamed from: obtainMessage */
    public android.os.Message mo50289x733c63a2(int i17) {
        return this.f538865f.obtainMessage(i17);
    }

    @Override // qu5.a
    /* renamed from: postAtTime */
    public boolean mo50296x41bd0e60(java.lang.Runnable runnable, java.lang.Object obj, long j17) {
        return this.f538865f.postAtTime(runnable, obj, j17);
    }

    @Override // qu5.a
    /* renamed from: postDelayed */
    public boolean mo50298x7c4d7ca2(java.lang.Runnable runnable, java.lang.Object obj, long j17) {
        android.os.Message obtain = android.os.Message.obtain(this.f538865f, runnable);
        obtain.obj = obj;
        return mo50311x7ab51103(obtain, j17);
    }

    @Override // qu5.a
    /* renamed from: hasMessages */
    public boolean mo50286x8fc9be06(int i17, java.lang.Object obj) {
        return this.f538864e.f538836b.b(new xu5.l(this, obj));
    }

    @Override // qu5.a
    /* renamed from: obtainMessage */
    public android.os.Message mo50292x733c63a2(int i17, java.lang.Object obj) {
        return this.f538865f.obtainMessage(i17, obj);
    }

    @Override // qu5.a
    /* renamed from: removeCallbacks */
    public void mo50301x3fa464aa(java.lang.Runnable runnable, java.lang.Object obj) {
        this.f538864e.f538836b.h(new xu5.g(this, runnable, obj));
    }

    @Override // qu5.a
    /* renamed from: removeMessages */
    public void mo50304x856b99f0(int i17, java.lang.Object obj) {
        this.f538864e.f538836b.h(new xu5.i(this, i17, obj));
    }

    @Override // qu5.a
    /* renamed from: obtainMessage */
    public android.os.Message mo50290x733c63a2(int i17, int i18, int i19) {
        return this.f538865f.obtainMessage(i17, i18, i19);
    }

    @Override // qu5.a
    /* renamed from: obtainMessage */
    public android.os.Message mo50291x733c63a2(int i17, int i18, int i19, java.lang.Object obj) {
        return this.f538865f.obtainMessage(i17, i18, i19, obj);
    }
}
