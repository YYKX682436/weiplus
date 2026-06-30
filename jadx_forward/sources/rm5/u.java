package rm5;

/* loaded from: classes10.dex */
public final class u implements com.p314xaae8f345.tav.p2947x2eaf9f.C25659xe2dfb08b.ExportCallbackHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f479102a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f479103b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.q f479104c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rm5.v f479105d;

    public u(yz5.l lVar, long j17, yz5.q qVar, rm5.v vVar) {
        this.f479102a = lVar;
        this.f479103b = j17;
        this.f479104c = qVar;
        this.f479105d = vVar;
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.C25659xe2dfb08b.ExportCallbackHandler
    /* renamed from: handlerCallback */
    public final void mo96511xc562f1af(com.p314xaae8f345.tav.p2947x2eaf9f.C25659xe2dfb08b c25659xe2dfb08b) {
        com.p314xaae8f345.tav.p2947x2eaf9f.C25655x2c777b52.AssetExportSessionStatus assetExportSessionStatus = c25659xe2dfb08b.f47304xcacdcff2;
        int m96475xe591acbc = c25659xe2dfb08b.m96475xe591acbc();
        float f17 = c25659xe2dfb08b.f47301xc454c22d;
        int i17 = assetExportSessionStatus == null ? -1 : rm5.t.f479101a[assetExportSessionStatus.ordinal()];
        if (i17 == 1) {
            yz5.l lVar = this.f479102a;
            if (lVar != null) {
                lVar.mo146xb9724478(java.lang.Float.valueOf(f17));
                return;
            }
            return;
        }
        yz5.q qVar = this.f479104c;
        if (i17 == 2) {
            xm5.b.c("VideoComposition", "export completed: " + f17 + ", cost:" + (android.os.SystemClock.elapsedRealtime() - this.f479103b), new java.lang.Object[0]);
            if (qVar != null) {
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                java.lang.Integer valueOf = java.lang.Integer.valueOf(m96475xe591acbc);
                java.util.ArrayList<com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2953x3164ae.C25719xdaa2a3bb> m96478xa9d6b3a7 = c25659xe2dfb08b.m96478xa9d6b3a7();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m96478xa9d6b3a7, "getIndicatorInfo(...)");
                qVar.mo147xb9724478(bool, valueOf, m96478xa9d6b3a7);
                return;
            }
            return;
        }
        if (i17 == 3) {
            xm5.b.c("VideoComposition", "export canceled: " + f17, new java.lang.Object[0]);
            yz5.a aVar = this.f479105d.f479126u;
            if (aVar != null) {
                if (aVar != null) {
                    aVar.mo152xb9724478();
                    return;
                }
                return;
            } else {
                if (qVar != null) {
                    java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
                    java.lang.Integer valueOf2 = java.lang.Integer.valueOf(m96475xe591acbc);
                    java.util.ArrayList<com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2953x3164ae.C25719xdaa2a3bb> m96478xa9d6b3a72 = c25659xe2dfb08b.m96478xa9d6b3a7();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m96478xa9d6b3a72, "getIndicatorInfo(...)");
                    qVar.mo147xb9724478(bool2, valueOf2, m96478xa9d6b3a72);
                    return;
                }
                return;
            }
        }
        if (i17 == 4 || i17 == 5) {
            xm5.b.c("VideoComposition", "export failed: status:" + assetExportSessionStatus + ", progress:" + f17, new java.lang.Object[0]);
            if (qVar != null) {
                java.lang.Boolean bool3 = java.lang.Boolean.FALSE;
                java.lang.Integer valueOf3 = java.lang.Integer.valueOf(m96475xe591acbc);
                java.util.ArrayList<com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2953x3164ae.C25719xdaa2a3bb> m96478xa9d6b3a73 = c25659xe2dfb08b.m96478xa9d6b3a7();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m96478xa9d6b3a73, "getIndicatorInfo(...)");
                qVar.mo147xb9724478(bool3, valueOf3, m96478xa9d6b3a73);
                return;
            }
            return;
        }
        xm5.b.c("VideoComposition", "export failed other status:" + assetExportSessionStatus + ", progress:" + f17, new java.lang.Object[0]);
        if (qVar != null) {
            java.lang.Boolean bool4 = java.lang.Boolean.FALSE;
            java.lang.Integer valueOf4 = java.lang.Integer.valueOf(m96475xe591acbc);
            java.util.ArrayList<com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2953x3164ae.C25719xdaa2a3bb> m96478xa9d6b3a74 = c25659xe2dfb08b.m96478xa9d6b3a7();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m96478xa9d6b3a74, "getIndicatorInfo(...)");
            qVar.mo147xb9724478(bool4, valueOf4, m96478xa9d6b3a74);
        }
    }
}
