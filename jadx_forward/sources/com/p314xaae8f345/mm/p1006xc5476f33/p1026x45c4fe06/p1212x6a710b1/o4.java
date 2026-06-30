package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1;

/* loaded from: classes7.dex */
public final class o4 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f172056a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f172057b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f172058c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentSkipListSet f172059d;

    public o4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 runtime) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        this.f172056a = runtime;
        java.lang.String str = "MicroMsg.AppBrand.SafeScreenShotRecordSwitcher#" + hashCode();
        this.f172057b = str;
        this.f172059d = new java.util.concurrent.ConcurrentSkipListSet(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.n4.f172050d);
        java.lang.String str2 = runtime.f156336n;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "<init>, appId: " + str2);
        runtime.F.f169270a.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.l4(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.a(str2, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.m4(this));
    }

    public final boolean a() {
        android.app.Activity r07 = this.f172056a.r0();
        android.view.Window window = r07 != null ? r07.getWindow() : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f172057b, "disableSafeScreenShotRecordInner, window: " + window);
        if (window == null) {
            return false;
        }
        window.clearFlags(8192);
        return true;
    }

    public final boolean b() {
        android.app.Activity r07 = this.f172056a.r0();
        android.view.Window window = r07 != null ? r07.getWindow() : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f172057b, "enableSafeScreenShotRecordInner, window: " + window);
        if (window == null) {
            return false;
        }
        window.addFlags(8192);
        return true;
    }

    public final void c(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f172057b, "runtimeSwitch.set " + this.f172058c + " -> " + z17);
        this.f172058c = z17;
        java.util.Iterator it = this.f172059d.iterator();
        while (it.hasNext()) {
            ((yz5.l) it.next()).mo146xb9724478(java.lang.Boolean.valueOf(this.f172058c));
        }
    }
}
