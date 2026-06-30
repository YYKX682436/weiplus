package z35;

/* loaded from: classes4.dex */
public final class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19719xa864b110 f551579d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f551580e;

    public u0(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19719xa864b110 c19719xa864b110, int i17) {
        this.f551579d = c19719xa864b110;
        this.f551580e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19719xa864b110 c19719xa864b110 = this.f551579d;
        int mTotalTimeMs = (int) (((c19719xa864b110.getMTotalTimeMs() * this.f551580e) / 2500) / 1000);
        int i17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19719xa864b110.U;
        c19719xa864b110.getClass();
        int i18 = mTotalTimeMs / 3600;
        int i19 = mTotalTimeMs % 3600;
        int i27 = i19 / 60;
        int i28 = i19 % 60;
        java.lang.String r17 = i65.a.r(c19719xa864b110.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.pc_);
        java.lang.String r18 = i65.a.r(c19719xa864b110.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.pca);
        java.lang.String r19 = i65.a.r(c19719xa864b110.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.pcb);
        java.lang.String str3 = "";
        if (i18 > 0) {
            str = i18 + r17;
        } else {
            str = "";
        }
        if (i27 > 0) {
            str2 = i27 + r18;
        } else {
            str2 = "";
        }
        if (i28 > 0) {
            str3 = i28 + r19;
        }
        c19719xa864b110.m75651x418325a0().announceForAccessibility(str + str2 + str3);
    }
}
