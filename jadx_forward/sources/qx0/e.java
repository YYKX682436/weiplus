package qx0;

/* loaded from: classes5.dex */
public final class e extends db5.d5 {

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f448805b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f448806c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f448807d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.a f448808e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(android.content.Context context, qx0.b bVar) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f448805b = context;
        setContentView(android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.die, (android.view.ViewGroup) null));
        android.view.View findViewById = getContentView().findViewById(com.p314xaae8f345.mm.R.id.oqc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.view.View findViewById2 = getContentView().findViewById(com.p314xaae8f345.mm.R.id.hk9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f448806c = findViewById2;
        setOutsideTouchable(true);
        getContentView().setOnClickListener(new qx0.a(this));
        if (context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).mo273xed6858b4().a(new p012xc85e97e9.p093xedfae76a.x() { // from class: com.tencent.mm.mj_publisher.finder.shoot_composing.guide.StartShootingGuideBubble$2
                @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
                /* renamed from: onDestroy */
                public final void m47390xac79a11b() {
                    qx0.e eVar = qx0.e.this;
                    eVar.dismiss();
                    ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) eVar.f448805b).mo273xed6858b4().c(this);
                }
            });
        }
        this.f448808e = new qx0.c(this);
    }

    @Override // db5.d5, android.widget.PopupWindow
    public void dismiss() {
        super.dismiss();
        android.view.View contentView = getContentView();
        if (contentView != null) {
            contentView.removeCallbacks(new qx0.d(this.f448808e));
        }
    }
}
