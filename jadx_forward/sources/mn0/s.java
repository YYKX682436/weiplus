package mn0;

/* loaded from: classes10.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f411328d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mn0.y f411329e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f411330f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f411331g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(boolean z17, mn0.y yVar, boolean z18, boolean z19) {
        super(0);
        this.f411328d = z17;
        this.f411329e = yVar;
        this.f411330f = z18;
        this.f411331g = z19;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        nn0.o oVar;
        boolean z17 = this.f411328d;
        mn0.y yVar = this.f411329e;
        if (z17) {
            com.p314xaae8f345.p2926x359365.C25485x5a0a6891 p17 = yVar.p();
            nn0.i iVar = p17 instanceof nn0.i ? (nn0.i) p17 : null;
            if (iVar != null && (oVar = iVar.f420117b) != null) {
                oVar.B(true);
            }
        }
        if (yVar.f411357z % 10 == 1) {
            if (yVar.k() > 0) {
                yVar.D = (((android.media.AudioManager) ((jz5.n) yVar.A).mo141623x754a37bb()).getStreamVolume(3) * 100) / yVar.k();
            }
            java.lang.StringBuilder sb6 = yVar.E;
            try {
                java.lang.String sb7 = sb6.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
                if (!r26.n0.B(sb7, "waveAdaptiveVEqConfig", false)) {
                    sb6.append("waveAdaptiveVEqConfig=" + yVar.f411357z + ';');
                    sb6.append("startPlayVolume=" + yVar.C + ';');
                    sb6.append("stopPlayVolume=" + yVar.D + ';');
                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder("AudioVolumeEqualizer, session_id:");
                    r45.p72 p72Var = yVar.P;
                    if (p72Var == null || (str = p72Var.m75945x2fec8307(1)) == null) {
                        str = "";
                    }
                    sb8.append(str);
                    sb8.append(", reportEndStr:");
                    sb8.append((java.lang.Object) sb6);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BaseLiveTXPlayer", sb8.toString());
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("api", "reportExternalBusinessData");
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.put("endReportData", sb6.toString());
                    jSONObject.put("params", jSONObject2);
                    java.lang.String jSONObject3 = jSONObject.toString();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
                    yVar.mo148052xd33a8dd4(jSONObject3);
                }
            } catch (org.json.JSONException unused) {
            }
        }
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder("txLivePlayer stopPlay isNeedClearLastImg=");
        boolean z18 = this.f411330f;
        sb9.append(z18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BaseLiveTXPlayer", sb9.toString());
        if (yVar.p() instanceof nn0.i) {
            com.p314xaae8f345.p2926x359365.C25485x5a0a6891 p18 = yVar.p();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(p18, "null cannot be cast to non-null type com.tencent.mm.live.core.core.postprocessor.customrender.CustomTXLivePlayer<*>");
            ((nn0.i) p18).e(z18, this.f411331g);
        } else {
            yVar.p().mo94537x66343656(z18);
        }
        yVar.f411344m = false;
        yVar.R = c01.id.c();
        return jz5.f0.f384359a;
    }
}
