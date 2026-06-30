package eg2;

/* loaded from: classes3.dex */
public final class p extends eg2.c0 {

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f334139g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f334140h;

    /* renamed from: i, reason: collision with root package name */
    public int f334141i;

    /* renamed from: m, reason: collision with root package name */
    public eg2.b1 f334142m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f334143n;

    /* renamed from: o, reason: collision with root package name */
    public yz5.l f334144o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f334145p;

    /* renamed from: q, reason: collision with root package name */
    public long f334146q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(ju3.d0 status, android.view.ViewGroup parent, qc0.a editContext) {
        super(status, parent, editContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(editContext, "editContext");
        this.f334141i = 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
    
        if (r1.a() == true) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r3 = this;
            eg2.b1 r0 = r3.f334142m
            if (r0 == 0) goto L1d
            kotlinx.coroutines.r2 r1 = r0.f334111c
            if (r1 == 0) goto L10
            boolean r1 = r1.a()
            r2 = 1
            if (r1 != r2) goto L10
            goto L11
        L10:
            r2 = 0
        L11:
            if (r2 == 0) goto L1d
            r0.a()
            java.lang.String r0 = "MicroMsg.FinderCoverHDTaskPlugin"
            java.lang.String r1 = "cancelled running HD task"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)
        L1d:
            r0 = 0
            r3.f334142m = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: eg2.p.a():void");
    }

    @Override // yt3.r2
    /* renamed from: onAttach */
    public void mo10988x3b13c504() {
        android.view.ViewGroup viewGroup = this.f334078e;
        android.content.Context context = viewGroup.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        this.f334140h = xy2.c.e(context);
        qc0.a aVar = this.f334079f;
        android.os.Bundle bundle = aVar.f442881c.M;
        this.f334139g = bundle != null ? bundle.getString("original_image_path") : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624 = aVar.f442881c;
        android.os.Bundle bundle2 = c16993xacc19624.M;
        this.f334145p = bundle2 != null ? bundle2.getString("original_cdn_url") : null;
        android.os.Bundle bundle3 = c16993xacc19624.M;
        boolean z17 = true;
        this.f334141i = bundle3 != null ? bundle3.getInt("hd_scene", 1) : 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderCoverHDTaskPlugin", "onAttach, coverUrl=" + this.f334139g + ", existingCdnUrl=" + this.f334145p + ", scene=" + this.f334141i);
        android.os.Bundle bundle4 = c16993xacc19624.M;
        if (!(bundle4 != null ? bundle4.getBoolean("enable_cover_enhance", false) : false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderCoverHDTaskPlugin", "cover enhance disabled by switch, skip HD task");
            return;
        }
        java.lang.String str = this.f334139g;
        java.lang.String str2 = this.f334140h;
        if (!(str == null || str.length() == 0)) {
            if (str2 != null && str2.length() != 0) {
                z17 = false;
            }
            if (!z17) {
                a();
                ju3.d0 d0Var = this.f334077d;
                p3325xe03a0797.p3326xc267989b.y0 y0Var = d0Var instanceof p3325xe03a0797.p3326xc267989b.y0 ? (p3325xe03a0797.p3326xc267989b.y0) d0Var : null;
                if (y0Var == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FinderCoverHDTaskPlugin", "status is not CoroutineScope, skip HD task");
                    return;
                }
                android.content.Context context2 = viewGroup.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                eg2.b1 b1Var = new eg2.b1(y0Var, str2, str, context2, this.f334141i, this.f334145p, new eg2.o(this));
                if (b1Var.f334110b.get()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FinderLiveHDTaskProcessor", "start: already cancelled, skip");
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveHDTaskProcessor", "start: finderUsername=" + b1Var.f334071f + ", localImagePath=" + b1Var.f334072g + ", scene=" + b1Var.f334074i);
                    eg2.o oVar = (eg2.o) b1Var.f334076k;
                    oVar.getClass();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderCoverHDTaskPlugin", "HD task started");
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    eg2.p pVar = oVar.f334137a;
                    pVar.f334146q = currentTimeMillis;
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(pVar.f334078e.getContext(), null, false, 3, null);
                    pVar.f334143n = f17;
                    android.widget.TextView textView = f17.f293537d;
                    if (textView != null) {
                        textView.setVisibility(8);
                    }
                    b1Var.f334111c = p3325xe03a0797.p3326xc267989b.l.d(b1Var.f334070e, null, null, new eg2.a1(b1Var, null), 3, null);
                }
                this.f334142m = b1Var;
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderCoverHDTaskPlugin", "no coverUrl or finderUsername, skip HD task");
    }

    @Override // yt3.r2
    /* renamed from: onDetach */
    public void mo10989x3f5eee52() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderCoverHDTaskPlugin", "onDetach");
        a();
    }

    @Override // yt3.r2
    /* renamed from: release */
    public void mo9065x41012807() {
        a();
    }
}
