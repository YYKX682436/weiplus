package xt2;

/* loaded from: classes3.dex */
public final class j implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xt2.m f538341d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f538342e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v65.n f538343f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f538344g;

    public j(xt2.m mVar, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, v65.n nVar, android.widget.ImageView imageView) {
        this.f538341d = mVar;
        this.f538342e = h0Var;
        this.f538343f = nVar;
        this.f538344g = imageView;
    }

    @Override // ym5.w1
    public void a(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        if (c22789xd23e9a9b != null) {
            c22789xd23e9a9b.i(this);
            this.f538344g.setVisibility(0);
            c22789xd23e9a9b.setVisibility(8);
        }
        java.lang.String str = this.f538341d.f538415n;
        java.lang.String str2 = "play animate cancel " + ((java.lang.String) this.f538342e.f391656d);
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, str2, null);
        this.f538343f.a(null);
    }

    @Override // ym5.w1
    public void b(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        java.lang.String str = this.f538341d.f538415n;
        java.lang.String str2 = "play animate start " + ((java.lang.String) this.f538342e.f391656d);
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, str2, null);
    }

    @Override // ym5.w1
    public void c(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        if (c22789xd23e9a9b != null) {
            c22789xd23e9a9b.i(this);
            this.f538344g.setVisibility(0);
            c22789xd23e9a9b.setVisibility(8);
        }
        java.lang.String str = this.f538341d.f538415n;
        java.lang.String str2 = "play animate end " + ((java.lang.String) this.f538342e.f391656d);
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, str2, null);
        this.f538343f.a(null);
    }

    @Override // ym5.w1
    public void e(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
    }
}
