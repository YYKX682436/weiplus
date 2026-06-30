package k33;

/* loaded from: classes4.dex */
public abstract class b extends db5.d5 {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f385389j = 0;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f385390b;

    /* renamed from: c, reason: collision with root package name */
    public long f385391c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Runnable f385392d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Rect f385393e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f385394f;

    /* renamed from: g, reason: collision with root package name */
    public int f385395g;

    /* renamed from: h, reason: collision with root package name */
    public long f385396h;

    /* renamed from: i, reason: collision with root package name */
    public long f385397i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.content.Context context, boolean z17, long j17) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f385390b = context;
        this.f385391c = j17;
        this.f385393e = new android.graphics.Rect();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasAlbumTipPopup", "init: ");
        setOutsideTouchable(z17);
        android.view.LayoutInflater from = android.view.LayoutInflater.from(context);
        r23.m mVar = (r23.m) this;
        if (mVar.f450374l == 0) {
            mVar.f450374l = com.p314xaae8f345.mm.R.C30864xbddafb2a.dm7;
        }
        setContentView(from.inflate(mVar.f450374l, (android.view.ViewGroup) null));
        if (context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).mo273xed6858b4().a(new p012xc85e97e9.p093xedfae76a.x() { // from class: com.tencent.mm.plugin.gallery.view.AbsAutoDismissTipsPopup$startObserveLifecycle$1
                @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
                /* renamed from: onDestroy */
                public final void m63720xac79a11b() {
                    k33.b bVar = k33.b.this;
                    bVar.getClass();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasAlbumTipPopup", "life onDestroy: ");
                    bVar.dismiss();
                    ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) bVar.f385390b).mo273xed6858b4().c(this);
                }

                @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_RESUME)
                /* renamed from: onResume */
                public final void m63721x57429eec() {
                    k33.b bVar = k33.b.this;
                    bVar.getClass();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasAlbumTipPopup", "life onResume: ");
                    bVar.b();
                }

                @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_START)
                /* renamed from: onStart */
                public final void m63722xb05099c3() {
                    k33.b.this.getClass();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasAlbumTipPopup", "life onStart: ");
                }

                @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_STOP)
                /* renamed from: onStop */
                public final void m63723xc39f8281() {
                    k33.b bVar = k33.b.this;
                    bVar.getClass();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasAlbumTipPopup", "life onStop: ");
                    bVar.a();
                }
            });
        }
    }

    public final void a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("removeDismissTask: ");
        java.lang.Runnable runnable = this.f385392d;
        sb6.append(runnable != null ? java.lang.Integer.valueOf(runnable.hashCode()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasAlbumTipPopup", sb6.toString());
        if (this.f385392d != null) {
            this.f385391c -= java.lang.System.currentTimeMillis() - this.f385396h;
            android.view.View contentView = getContentView();
            if (contentView != null) {
                contentView.removeCallbacks(this.f385392d);
            }
            this.f385392d = null;
        }
    }

    public final void b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startDismissTask: ");
        java.lang.Runnable runnable = this.f385392d;
        sb6.append(runnable != null ? java.lang.Integer.valueOf(runnable.hashCode()) : null);
        sb6.append(", ");
        sb6.append(this.f385391c);
        sb6.append(", ");
        sb6.append(isShowing());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasAlbumTipPopup", sb6.toString());
        if (isShowing() && this.f385392d == null && this.f385391c > 0) {
            this.f385392d = new k33.a(this);
            android.view.View contentView = getContentView();
            if (contentView != null) {
                contentView.postDelayed(this.f385392d, this.f385391c);
            }
            this.f385396h = java.lang.System.currentTimeMillis();
        }
    }

    @Override // db5.d5, android.widget.PopupWindow
    public void dismiss() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasAlbumTipPopup", "dismiss: ");
        super.dismiss();
        a();
    }
}
