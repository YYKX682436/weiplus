package android.support.v4.media.session;

/* loaded from: classes15.dex */
public abstract class v {

    /* renamed from: c, reason: collision with root package name */
    public boolean f8995c;

    /* renamed from: e, reason: collision with root package name */
    public android.support.v4.media.session.t f8997e;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f8993a = new java.lang.Object();

    /* renamed from: b, reason: collision with root package name */
    public final android.media.session.MediaSession.Callback f8994b = new android.support.v4.media.session.u(this);

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f8996d = new java.lang.ref.WeakReference(null);

    public void a(android.support.v4.media.session.w wVar, android.os.Handler handler) {
        if (this.f8995c) {
            this.f8995c = false;
            handler.removeMessages(1);
            android.support.v4.media.session.PlaybackStateCompat t17 = wVar.t();
            long j17 = t17 == null ? 0L : t17.f8956h;
            boolean z17 = t17 != null && t17.f8952d == 3;
            boolean z18 = (516 & j17) != 0;
            boolean z19 = (j17 & 514) != 0;
            if (z17 && z19) {
                d();
            } else {
                if (z17 || !z18) {
                    return;
                }
                e();
            }
        }
    }

    public void b(java.lang.String str, android.os.Bundle bundle, android.os.ResultReceiver resultReceiver) {
    }

    public boolean c(android.content.Intent intent) {
        android.support.v4.media.session.w wVar;
        android.support.v4.media.session.t tVar;
        android.view.KeyEvent keyEvent;
        if (android.os.Build.VERSION.SDK_INT >= 27) {
            return false;
        }
        synchronized (this.f8993a) {
            wVar = (android.support.v4.media.session.w) this.f8996d.get();
            tVar = this.f8997e;
        }
        if (wVar == null || tVar == null || (keyEvent = (android.view.KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0) {
            return false;
        }
        c4.o0 d17 = wVar.d();
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 79 && keyCode != 85) {
            a(wVar, tVar);
            return false;
        }
        if (keyEvent.getRepeatCount() != 0) {
            a(wVar, tVar);
        } else if (this.f8995c) {
            tVar.removeMessages(1);
            this.f8995c = false;
            android.support.v4.media.session.PlaybackStateCompat t17 = wVar.t();
            if (((t17 == null ? 0L : t17.f8956h) & 32) != 0) {
                h();
            }
        } else {
            this.f8995c = true;
            tVar.sendMessageDelayed(tVar.obtainMessage(1, d17), android.view.ViewConfiguration.getDoubleTapTimeout());
        }
        return true;
    }

    public void d() {
    }

    public void e() {
    }

    public void f(java.lang.String str, android.os.Bundle bundle) {
    }

    public void g(long j17) {
    }

    public void h() {
    }

    public void i() {
    }

    public void j() {
    }

    public void k(android.support.v4.media.session.w wVar, android.os.Handler handler) {
        synchronized (this.f8993a) {
            this.f8996d = new java.lang.ref.WeakReference(wVar);
            android.support.v4.media.session.t tVar = this.f8997e;
            android.support.v4.media.session.t tVar2 = null;
            if (tVar != null) {
                tVar.removeCallbacksAndMessages(null);
            }
            if (wVar != null && handler != null) {
                tVar2 = new android.support.v4.media.session.t(this, handler.getLooper());
            }
            this.f8997e = tVar2;
        }
    }
}
