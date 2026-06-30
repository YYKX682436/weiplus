package com.p314xaae8f345.p362xadfe2b3.p363x208df1fe.p364x10b44e6c;

/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.p362xadfe2b3.p363x208df1fe.p364x10b44e6c.c f127519a = new com.p314xaae8f345.p362xadfe2b3.p363x208df1fe.p364x10b44e6c.c();

    /* renamed from: b, reason: collision with root package name */
    public static volatile com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3348x2f9a2ba0 f127520b;

    public final synchronized void a(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PayLoadingManager", "showPayLoading " + z17);
        if (z17 && f127520b != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PayLoadingManager", "Loading dialog already showing, skipping");
            return;
        }
        if (!z17 && f127520b == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PayLoadingManager", "Loading dialog already hidden, skipping");
            return;
        }
        if (z17) {
            f127520b = new com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3348x2f9a2ba0();
            new com.p314xaae8f345.p362xadfe2b3.p363x208df1fe.p364x10b44e6c.b();
            com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3348x2f9a2ba0 c3348x2f9a2ba0 = f127520b;
            if (c3348x2f9a2ba0 != null) {
                c3348x2f9a2ba0.mo27055x9174fd6e(true);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PayLoadingManager", "Payment loading dialog shown");
        } else {
            com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3348x2f9a2ba0 c3348x2f9a2ba02 = f127520b;
            if (c3348x2f9a2ba02 != null) {
                c3348x2f9a2ba02.mo27049x63a3b28a();
            }
            f127520b = null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PayLoadingManager", "Payment loading dialog dismissed");
        }
    }
}
