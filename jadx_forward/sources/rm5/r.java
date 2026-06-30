package rm5;

/* loaded from: classes10.dex */
public final class r implements com.p314xaae8f345.tav.p2947x2eaf9f.C25655x2c777b52.ExportCallbackHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f479095a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f479096b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f479097c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rm5.v f479098d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f479099e;

    public r(yz5.l lVar, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, long j17, rm5.v vVar, yz5.p pVar) {
        this.f479095a = lVar;
        this.f479096b = c0Var;
        this.f479097c = j17;
        this.f479098d = vVar;
        this.f479099e = pVar;
    }

    @Override // com.p314xaae8f345.tav.p2947x2eaf9f.C25655x2c777b52.ExportCallbackHandler
    /* renamed from: handlerCallback */
    public final void mo96356xc562f1af(com.p314xaae8f345.tav.p2947x2eaf9f.C25655x2c777b52 c25655x2c777b52) {
        yz5.a aVar;
        com.p314xaae8f345.tav.p2947x2eaf9f.C25655x2c777b52.AssetExportSessionStatus m96327x2fe4f2e8 = c25655x2c777b52.m96327x2fe4f2e8();
        int m96317xe591acbc = c25655x2c777b52.m96317xe591acbc();
        float m96324x402effa3 = c25655x2c777b52.m96324x402effa3();
        boolean z17 = m96327x2fe4f2e8 == com.p314xaae8f345.tav.p2947x2eaf9f.C25655x2c777b52.AssetExportSessionStatus.AssetExportSessionStatusExporting;
        boolean z18 = m96327x2fe4f2e8 == com.p314xaae8f345.tav.p2947x2eaf9f.C25655x2c777b52.AssetExportSessionStatus.AssetExportSessionStatusCompleted;
        if (z17) {
            yz5.l lVar = this.f479095a;
            if (lVar != null) {
                lVar.mo146xb9724478(java.lang.Float.valueOf(m96324x402effa3));
                return;
            }
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("export finish: finish:");
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f479096b;
        sb6.append(c0Var.f391645d);
        sb6.append(" status:");
        sb6.append(m96327x2fe4f2e8);
        sb6.append(", progress:");
        sb6.append(m96324x402effa3);
        sb6.append(", cost:");
        sb6.append(android.os.SystemClock.elapsedRealtime() - this.f479097c);
        xm5.b.c("VideoComposition", sb6.toString(), new java.lang.Object[0]);
        if (c0Var.f391645d) {
            return;
        }
        c0Var.f391645d = true;
        rm5.v vVar = this.f479098d;
        if (vVar.f479122q && (aVar = vVar.f479126u) != null) {
            aVar.mo152xb9724478();
        }
        yz5.p pVar = this.f479099e;
        if (pVar != null) {
            pVar.mo149xb9724478(java.lang.Boolean.valueOf(z18), java.lang.Integer.valueOf(m96317xe591acbc));
        }
        if (z18) {
            return;
        }
        vVar.d();
    }
}
