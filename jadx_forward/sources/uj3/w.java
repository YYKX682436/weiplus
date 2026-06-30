package uj3;

/* loaded from: classes9.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uj3.z f509911d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f509912e;

    public w(uj3.z zVar, java.lang.String str) {
        this.f509911d = zVar;
        this.f509912e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        uj3.z zVar = this.f509911d;
        android.widget.RelativeLayout relativeLayout = zVar.f509927a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        android.content.Context context = zVar.f509936j;
        java.lang.Long l17 = null;
        sb6.append(context != null ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b6r) : null);
        sb6.append(',');
        com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        java.lang.String str = this.f509912e;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = Bi.n(str, true);
        sb6.append(n17 != null ? n17.P0() : null);
        relativeLayout.setContentDescription(sb6.toString());
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(zVar.f509934h, str)) {
            return;
        }
        if (str != null) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            l17 = java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime());
        }
        zVar.f509935i = l17;
        zVar.f509933g = str;
        zVar.f509934h = str;
        zVar.f509935i = java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime());
    }
}
