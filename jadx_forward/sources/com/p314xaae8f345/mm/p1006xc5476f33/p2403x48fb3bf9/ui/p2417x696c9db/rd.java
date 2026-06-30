package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes5.dex */
public final class rd implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.sd f268356d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.Window f268357e;

    public rd(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.sd sdVar, android.view.Window window) {
        this.f268356d = sdVar;
        this.f268357e = window;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.sd sdVar = this.f268356d;
        synchronized (sdVar.f268410b) {
            byte[] bArr = sdVar.f268410b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bArr, "<this>");
            int i17 = 0;
            for (byte b17 : bArr) {
                i17 += b17;
            }
            z17 = i17 >= 1;
        }
        try {
            if (z17) {
                this.f268357e.addFlags(8192);
            } else {
                this.f268357e.clearFlags(8192);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewWindowSecureHandler", "resetSecureFlagToWindow hidden?:" + z17 + ", exception:" + th6);
        }
    }
}
