package p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296;

/* loaded from: classes15.dex */
public abstract class v {

    /* renamed from: c, reason: collision with root package name */
    public boolean f90528c;

    /* renamed from: e, reason: collision with root package name */
    public p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.t f90530e;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f90526a = new java.lang.Object();

    /* renamed from: b, reason: collision with root package name */
    public final android.media.session.MediaSession.Callback f90527b = new p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.u(this);

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f90529d = new java.lang.ref.WeakReference(null);

    public void a(p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.w wVar, android.os.Handler handler) {
        if (this.f90528c) {
            this.f90528c = false;
            handler.removeMessages(1);
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.C0049x5ee9be38 t17 = wVar.t();
            long j17 = t17 == null ? 0L : t17.f90489h;
            boolean z17 = t17 != null && t17.f90485d == 3;
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
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.w wVar;
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.t tVar;
        android.view.KeyEvent keyEvent;
        if (android.os.Build.VERSION.SDK_INT >= 27) {
            return false;
        }
        synchronized (this.f90526a) {
            wVar = (p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.w) this.f90529d.get();
            tVar = this.f90530e;
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
        } else if (this.f90528c) {
            tVar.removeMessages(1);
            this.f90528c = false;
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.C0049x5ee9be38 t17 = wVar.t();
            if (((t17 == null ? 0L : t17.f90489h) & 32) != 0) {
                h();
            }
        } else {
            this.f90528c = true;
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

    public void k(p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.w wVar, android.os.Handler handler) {
        synchronized (this.f90526a) {
            this.f90529d = new java.lang.ref.WeakReference(wVar);
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.t tVar = this.f90530e;
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.t tVar2 = null;
            if (tVar != null) {
                tVar.removeCallbacksAndMessages(null);
            }
            if (wVar != null && handler != null) {
                tVar2 = new p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.t(this, handler.getLooper());
            }
            this.f90530e = tVar2;
        }
    }
}
