package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class rf extends db5.d5 {

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f214486b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View.OnClickListener f214487c;

    /* renamed from: d, reason: collision with root package name */
    public final long f214488d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f214489e;

    /* renamed from: f, reason: collision with root package name */
    public int f214490f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.a f214491g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rf(android.content.Context context, android.view.View.OnClickListener onClickListener) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f214486b = context;
        this.f214487c = onClickListener;
        this.f214488d = com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d;
        setContentView(android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.b4_, (android.view.ViewGroup) null));
        setClippingEnabled(false);
        setOutsideTouchable(true);
        getContentView().findViewById(com.p314xaae8f345.mm.R.id.ftg).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.of(this));
        if (context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).mo273xed6858b4().a(new p012xc85e97e9.p093xedfae76a.x() { // from class: com.tencent.mm.plugin.finder.view.FinderMusicTipsBubbleWindow$2
                @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
                /* renamed from: onDestroy */
                public final void m62277xac79a11b() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.rf rfVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.rf.this;
                    rfVar.dismiss();
                    ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) rfVar.f214486b).mo273xed6858b4().c(this);
                }
            });
        }
        this.f214491g = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.pf(this);
    }

    @Override // db5.d5, android.widget.PopupWindow
    public void dismiss() {
        super.dismiss();
        android.view.View contentView = getContentView();
        if (contentView != null) {
            contentView.removeCallbacks(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.qf(this.f214491g));
        }
    }
}
