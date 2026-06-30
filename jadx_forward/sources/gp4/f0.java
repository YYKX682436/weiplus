package gp4;

/* loaded from: classes10.dex */
public final class f0 implements zu3.f {

    /* renamed from: a, reason: collision with root package name */
    public float f355936a;

    /* renamed from: b, reason: collision with root package name */
    public float f355937b;

    /* renamed from: c, reason: collision with root package name */
    public final int f355938c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f355939d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2331x84359257.C18801xf3fcf614 f355940e;

    public f0(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2331x84359257.C18801xf3fcf614 c18801xf3fcf614) {
        this.f355940e = c18801xf3fcf614;
        this.f355938c = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // zu3.f
    public void a(android.view.View itemView, android.view.MotionEvent event) {
        gp4.m m72582xd4d63606;
        gp4.m m72582xd4d636062;
        gp4.m m72582xd4d636063;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        int actionMasked = event.getActionMasked();
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2331x84359257.C18801xf3fcf614 c18801xf3fcf614 = this.f355940e;
        if (actionMasked == 0) {
            this.f355936a = event.getX();
            this.f355937b = event.getY();
            this.f355939d = false;
            c18801xf3fcf614.removeCallbacks(c18801xf3fcf614.I);
            c18801xf3fcf614.q(itemView, true);
            yz5.l timeEditMenuChangeListener = c18801xf3fcf614.getTimeEditMenuChangeListener();
            if (timeEditMenuChangeListener != null) {
                timeEditMenuChangeListener.mo146xb9724478(java.lang.Boolean.TRUE);
                return;
            }
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                float abs = java.lang.Math.abs(event.getX() - this.f355936a);
                int i17 = this.f355938c;
                if (abs > i17 || java.lang.Math.abs(event.getY() - this.f355937b) > i17) {
                    this.f355939d = true;
                    int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2331x84359257.C18801xf3fcf614.L;
                    c18801xf3fcf614.getClass();
                    m72582xd4d636063 = c18801xf3fcf614.m72582xd4d63606();
                    m72582xd4d636063.setVisibility(4);
                    return;
                }
                return;
            }
            if (actionMasked != 3) {
                return;
            }
        }
        if (c18801xf3fcf614.f257496x != null) {
            c18801xf3fcf614.post(new gp4.e0(c18801xf3fcf614));
            return;
        }
        if (c18801xf3fcf614.f257497y != null) {
            m72582xd4d63606 = c18801xf3fcf614.m72582xd4d63606();
            if (m72582xd4d63606.getVisibility() == 0 && (c18801xf3fcf614.f257497y instanceof zu3.b0)) {
                m72582xd4d636062 = c18801xf3fcf614.m72582xd4d63606();
                yz5.a m131978x366ee5ad = m72582xd4d636062.m131978x366ee5ad();
                if (m131978x366ee5ad != null) {
                    m131978x366ee5ad.mo152xb9724478();
                    return;
                }
                return;
            }
            if (!this.f355939d) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2331x84359257.C18801xf3fcf614.i(c18801xf3fcf614, itemView, true);
                return;
            }
            c18801xf3fcf614.q(c18801xf3fcf614.f257497y, false);
            yz5.l timeEditMenuChangeListener2 = c18801xf3fcf614.getTimeEditMenuChangeListener();
            if (timeEditMenuChangeListener2 != null) {
                timeEditMenuChangeListener2.mo146xb9724478(java.lang.Boolean.FALSE);
            }
        }
    }
}
