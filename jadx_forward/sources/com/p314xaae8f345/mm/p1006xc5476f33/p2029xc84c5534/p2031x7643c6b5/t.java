package com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5;

/* loaded from: classes12.dex */
public class t extends hm0.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f239841d;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17196xafa566d5 c17196xafa566d5, java.lang.Runnable runnable) {
        this.f239841d = runnable;
    }

    @Override // hm0.t
    public void b() {
        if (android.os.Build.VERSION.SDK_INT < 28 || !android.os.Process.isIsolated()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KVCommCrossProcessReceiver", "Delay post");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17196xafa566d5.f239657a.mo50293x3498a0(this.f239841d);
        }
    }
}
