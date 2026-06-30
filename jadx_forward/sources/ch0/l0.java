package ch0;

/* loaded from: classes8.dex */
public final class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f122769d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ch0.n0 f122770e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f122771f;

    public l0(boolean z17, ch0.n0 n0Var, long j17) {
        this.f122769d = z17;
        this.f122770e = n0Var;
        this.f122771f = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object m143895xf1229813;
        ch0.h hVar;
        boolean z17 = this.f122769d;
        ch0.n0 n0Var = this.f122770e;
        long j17 = this.f122771f;
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            tg0.k1 Ri = ((yg0.o3) ((tg0.l1) i95.n0.c(tg0.l1.class))).Ri();
            jz5.f0 f0Var = null;
            ch0.z zVar = Ri instanceof ch0.z ? (ch0.z) Ri : null;
            if (zVar != null && (hVar = zVar.f122806m) != null) {
                java.lang.String content = "flutter filter click, show: " + z17;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSPlatformWebView", content);
                hVar.g(z17 ? 8 : 0);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.InterfaceC27574x746b60f.Callback callback = n0Var.f122777a;
            if (callback != null) {
                callback.mo117738xc9b6723b(j17, 0);
                f0Var = jz5.f0.f384359a;
            }
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
        if (m143898xd4a2fc34 != null) {
            java.lang.String content2 = "notifyFilterShowOrHideAsync exception: " + m143898xd4a2fc34;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content2, "content");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTSPlatformWebView", content2);
        }
    }
}
