package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public final class go implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ho f280651d;

    public go(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ho hoVar) {
        this.f280651d = hoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ho hoVar = this.f280651d;
        java.lang.String str = hoVar.f280724u;
        hoVar.getClass();
        if (str.length() == 0) {
            return;
        }
        if (hoVar.m0().length() == 0) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TAG", "updateOriginTextInternal() called with: text = " + str + " lastTransResult = " + hoVar.f280723t + " lastOriginText = " + hoVar.f280724u);
        hoVar.t0(str);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.C21668xed8974f2 c21668xed8974f2 = hoVar.f280716m;
        if (c21668xed8974f2 != null) {
            c21668xed8974f2.m79445xc54f6a7a(true);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("resultTv");
            throw null;
        }
    }
}
