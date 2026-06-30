package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final long f293316a;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Handler f293317b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f293318c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Runnable f293319d;

    public f(long j17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f293316a = (i17 & 1) != 0 ? 300L : j17;
        this.f293317b = new android.os.Handler(android.os.Looper.getMainLooper());
    }

    public final void a() {
        java.lang.Runnable runnable = this.f293319d;
        android.os.Handler handler = this.f293317b;
        if (runnable != null) {
            handler.removeCallbacks(runnable);
        }
        this.f293319d = null;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            handler.post(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d(this));
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f293318c;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        this.f293318c = null;
    }

    public final void b(android.content.Context context, java.lang.CharSequence charSequence, boolean z17, int i17, android.content.DialogInterface.OnCancelListener onCancelListener) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e eVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e(context, this, charSequence, z17, i17, onCancelListener);
        this.f293319d = eVar;
        this.f293317b.postDelayed(eVar, this.f293316a);
    }
}
