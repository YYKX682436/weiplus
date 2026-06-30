package ch0;

/* loaded from: classes8.dex */
public final class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f122767d;

    public k0(int i17) {
        this.f122767d = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object m143895xf1229813;
        ch0.h hVar;
        int i17 = this.f122767d;
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            ch0.z zVar = (ch0.z) ((java.util.LinkedHashMap) ((yg0.o3) ((tg0.l1) i95.n0.c(tg0.l1.class))).f543764e.f122724a).get(java.lang.Integer.valueOf(i17));
            if (!(zVar instanceof ch0.z)) {
                zVar = null;
            }
            if (zVar != null && (hVar = zVar.f122806m) != null) {
                hVar.a();
            }
            if (zVar != null) {
                zVar.f122806m = null;
            }
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
        if (m143898xd4a2fc34 != null) {
            java.lang.String content = "dispose exception: " + m143898xd4a2fc34;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTSPlatformWebView", content);
        }
    }
}
