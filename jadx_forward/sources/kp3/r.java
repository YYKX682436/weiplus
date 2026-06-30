package kp3;

/* loaded from: classes14.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kp3.x f392570d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f392571e;

    public r(kp3.x xVar, byte[] bArr) {
        this.f392570d = xVar;
        this.f392571e = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.Result m120542xed8d1e6f;
        double d17;
        this.f392570d.f392586i.set(true);
        kp3.x xVar = this.f392570d;
        android.util.Size size = xVar.f392585h;
        if (size == null) {
            xVar.f392586i.set(false);
            return;
        }
        try {
            com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d c27879x64e6240d = xVar.f392583f;
            m120542xed8d1e6f = c27879x64e6240d != null ? c27879x64e6240d.m120542xed8d1e6f(this.f392571e, size.getWidth(), size.getHeight()) : null;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PalmPrintCameraSettingUIC", "[setPreviewCallback] verify failed： " + e17.getMessage());
            if (!this.f392570d.f392588n.get()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PalmPrintCameraSettingUIC", "[setPreviewCallback] verify failed, final exit");
                jp3.g.f382533a.i(this.f392570d.m158354x19263085(), 80012, "ERR_PALM_SDK_VERIFY", (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
            }
        }
        if (m120542xed8d1e6f == null) {
            this.f392570d.f392586i.set(false);
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).B(new kp3.o(this.f392570d, m120542xed8d1e6f));
        kp3.x xVar2 = this.f392570d;
        android.graphics.RectF rectF = m120542xed8d1e6f.f61438x3c324836;
        xVar2.getClass();
        if (rectF != null) {
            if (rectF.left > 0.0f) {
                if (rectF.bottom > 0.0f) {
                    double d18 = xVar2.f392595u;
                    if (d18 > 0.0d) {
                        d17 = xVar2.f392596v;
                        if (d17 > 0.0d) {
                            float f17 = 2;
                            xVar2.f392593s = (float) ((r6 + ((rectF.right - r6) / f17)) * d18);
                            float f18 = rectF.top;
                            xVar2.f392594t = (float) ((f18 + ((r8 - f18) / f17)) * d17);
                        }
                    }
                }
            }
        }
        kp3.x xVar3 = this.f392570d;
        if (!xVar3.f392592r && m120542xed8d1e6f.f61435x4e2913f8) {
            xVar3.f392592r = true;
            xVar3.f392597w = java.lang.System.currentTimeMillis();
            ((ku5.t0) ku5.t0.f394148d).B(new kp3.p(this.f392570d));
            kp3.x xVar4 = this.f392570d;
            p3325xe03a0797.p3326xc267989b.l.d(xVar4.f392581d, null, null, new kp3.q(xVar4, null), 3, null);
        }
        if (m120542xed8d1e6f.f61436x5f2170e4) {
            this.f392570d.f392598x = java.lang.System.currentTimeMillis();
        }
        if (m120542xed8d1e6f.f61441xb1ca1d28 == com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.Tip.f61486x5d02d2e) {
            kp3.x.P6(this.f392570d);
        }
        this.f392570d.f392586i.set(false);
    }
}
