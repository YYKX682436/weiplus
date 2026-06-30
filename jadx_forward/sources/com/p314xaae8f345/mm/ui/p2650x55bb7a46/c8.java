package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes15.dex */
public final class c8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21618x43234cfd f280051d;

    public c8(com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21618x43234cfd activityC21618x43234cfd) {
        this.f280051d = activityC21618x43234cfd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p689xc5a27af6.p742x782d98c9.C10597xb1f0d2 c10597xb1f0d2;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21618x43234cfd activityC21618x43234cfd = this.f280051d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.api.C13409xda58c12c c13409xda58c12c = activityC21618x43234cfd.B1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c13409xda58c12c);
        java.lang.String deviceId = c13409xda58c12c.f180331e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(deviceId, "deviceId");
        java.util.Iterator it = activityC21618x43234cfd.Q.iterator();
        while (true) {
            if (!it.hasNext()) {
                java.util.Iterator it6 = activityC21618x43234cfd.S.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        java.util.Iterator it7 = activityC21618x43234cfd.R.iterator();
                        while (true) {
                            if (!it7.hasNext()) {
                                c10597xb1f0d2 = null;
                                break;
                            } else {
                                c10597xb1f0d2 = (com.p314xaae8f345.mm.p689xc5a27af6.p742x782d98c9.C10597xb1f0d2) it7.next();
                                if (c10597xb1f0d2.f148119d.equals(deviceId)) {
                                    break;
                                }
                            }
                        }
                    } else {
                        c10597xb1f0d2 = (com.p314xaae8f345.mm.p689xc5a27af6.p742x782d98c9.C10597xb1f0d2) it6.next();
                        if (c10597xb1f0d2.f148119d.equals(deviceId)) {
                            break;
                        }
                    }
                }
            } else {
                c10597xb1f0d2 = (com.p314xaae8f345.mm.p689xc5a27af6.p742x782d98c9.C10597xb1f0d2) it.next();
                if (c10597xb1f0d2.f148119d.equals(deviceId)) {
                    break;
                }
            }
        }
        activityC21618x43234cfd.A1 = c10597xb1f0d2;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21618x43234cfd activityC21618x43234cfd2 = this.f280051d;
        activityC21618x43234cfd2.f279783z1 = true;
        android.view.ViewGroup viewGroup = activityC21618x43234cfd2.f279765o;
        if (viewGroup == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sendingDeviceLayout");
            throw null;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21618x43234cfd.c7(activityC21618x43234cfd2, viewGroup, 0, 0L, 2, null);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21618x43234cfd activityC21618x43234cfd3 = this.f280051d;
        android.view.ViewGroup viewGroup2 = activityC21618x43234cfd3.f279757e;
        if (viewGroup2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("deviceMainLayout");
            throw null;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21618x43234cfd.c7(activityC21618x43234cfd3, viewGroup2, 8, 0L, 2, null);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21618x43234cfd activityC21618x43234cfd4 = this.f280051d;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21618x43234cfd.b7(activityC21618x43234cfd4, activityC21618x43234cfd4.H1, null, null, null, 8, null);
    }
}
