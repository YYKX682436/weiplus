package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes13.dex */
public class k5 implements android.media.AudioManager.OnModeChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.l5 f274342a;

    public k5(com.p314xaae8f345.mm.sdk.p2603x2137b148.l5 l5Var, com.p314xaae8f345.mm.sdk.p2603x2137b148.g5 g5Var) {
        this.f274342a = l5Var;
    }

    @Override // android.media.AudioManager.OnModeChangedListener
    public void onModeChanged(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PhoneStatusWatcher", "onModeChanged, mode: %d", java.lang.Integer.valueOf(i17));
        int i18 = 1;
        if (i17 != 1) {
            i18 = 2;
            if (i17 != 2) {
                i18 = 0;
            }
        }
        if (((java.util.ArrayList) this.f274342a.f274370d).size() > 0) {
            for (com.p314xaae8f345.mm.sdk.p2603x2137b148.h5 h5Var : (com.p314xaae8f345.mm.sdk.p2603x2137b148.h5[]) ((java.util.ArrayList) this.f274342a.f274370d).toArray(new com.p314xaae8f345.mm.sdk.p2603x2137b148.h5[((java.util.ArrayList) this.f274342a.f274370d).size()])) {
                h5Var.a(i18);
            }
        }
        for (fs.q qVar : ((fs.c) fs.g.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.j5.class)).all()) {
            if (fs.g.d(fs.g.f347619c, qVar)) {
                ((ll3.n0) ((com.p314xaae8f345.mm.sdk.p2603x2137b148.j5) ((fs.n) qVar.get()))).b(i18);
            }
        }
    }
}
