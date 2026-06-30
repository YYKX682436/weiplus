package pg2;

/* loaded from: classes3.dex */
public final class a0 extends mn0.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ug5.v f435613d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f435614e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nn0.c f435615f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.ka4 f435616g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ pg2.j0 f435617h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f435618i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ mn0.l0 f435619m;

    public a0(ug5.v vVar, java.lang.String str, nn0.c cVar, r45.ka4 ka4Var, pg2.j0 j0Var, android.content.Context context, mn0.l0 l0Var) {
        this.f435613d = vVar;
        this.f435614e = str;
        this.f435615f = cVar;
        this.f435616g = ka4Var;
        this.f435617h = j0Var;
        this.f435618i = context;
        this.f435619m = l0Var;
    }

    @Override // com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1
    /* renamed from: onNetStatus */
    public void mo15382x3bee38d0(android.os.Bundle bundle) {
    }

    @Override // mn0.a, com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1
    /* renamed from: onPlayEvent */
    public void mo15376x8cd414a7(int i17, android.os.Bundle bundle) {
        super.mo15376x8cd414a7(i17, bundle);
        if (i17 == -2304) {
            qg2.e.f444332a.b(this.f435614e);
            return;
        }
        if (i17 == 2009) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(bundle != null ? bundle.getInt("EVT_PARAM1") : 0);
            ug5.v vVar = this.f435613d;
            vVar.f("key_video_w", valueOf);
            vVar.f("key_video_h", java.lang.Integer.valueOf(bundle != null ? bundle.getInt("EVT_PARAM2") : 0));
            return;
        }
        if (i17 != 2103) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSurfaceViewService", "onWarningReconnect:");
        qg2.e eVar = qg2.e.f444332a;
        pg2.j0 j0Var = this.f435617h;
        android.content.Context context = this.f435618i;
        mn0.l0 l0Var = this.f435619m;
        eVar.c("preloadStartLivePlayer.Surface", this.f435615f, this.f435616g, j0Var.Ui(context, l0Var != null ? l0Var.f411306d : 0L, l0Var != null ? l0Var.f411305c : 0L));
    }
}
