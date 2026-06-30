package lf3;

/* loaded from: classes3.dex */
public final class y extends lf3.o implements lf3.j {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f399874d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2740x696c9db.s4 f399875e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f399876f;

    /* renamed from: g, reason: collision with root package name */
    public lf3.i f399877g;

    /* renamed from: h, reason: collision with root package name */
    public long f399878h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f399875e = new com.p314xaae8f345.mm.ui.p2740x696c9db.s4(activity);
    }

    @Override // lf3.j
    public void E2(android.view.View contentView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentView, "contentView");
        lf3.x xVar = new lf3.x(this);
        android.view.View view = this.f399874d;
        if (view == null) {
            return;
        }
        view.animate().setDuration(200L).setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator()).alpha(0.0f).setListener(new lf3.u(this)).start();
        contentView.animate().setDuration(200L).setInterpolator(new android.view.animation.DecelerateInterpolator(1.2f)).alpha(0.0f).setUpdateListener(new lf3.v(this)).setListener(new lf3.w(xVar)).start();
    }

    @Override // lf3.j
    public void N3(lf3.i iVar) {
        this.f399877g = iVar;
    }

    @Override // lf3.o
    public int T6() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ejd;
    }

    @Override // lf3.j
    public void d3(float f17) {
        android.view.View view = this.f399874d;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(f17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/media/PageAnimationComponent", "setBgAlpha", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/media/PageAnimationComponent", "setBgAlpha", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        lf3.i iVar = this.f399877g;
        if (iVar != null) {
            ((yh5.e) iVar).V6(f17);
        }
    }

    @Override // lf3.j
    public void m6(android.view.View contentView, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentView, "contentView");
        android.content.Intent intent = m158354x19263085().getIntent();
        if (intent == null || this.f399874d == null || this.f399876f) {
            return;
        }
        this.f399876f = true;
        int intExtra = intent.getIntExtra("img_gallery_top", 0);
        int intExtra2 = intent.getIntExtra("img_gallery_left", 0);
        int intExtra3 = intent.getIntExtra("img_gallery_width", 0);
        int intExtra4 = intent.getIntExtra("img_gallery_height", 0);
        if (intExtra == 0 && intExtra2 == 0 && intExtra3 == 0 && intExtra4 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MediaGallery.PageAnimationComponent", "get image location info failed");
            return;
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.s4 s4Var = this.f399875e;
        s4Var.e(intExtra2, intExtra, intExtra3, intExtra4);
        s4Var.f292232f = i17;
        s4Var.f292233g = i18;
        s4Var.c(contentView, this.f399874d, new lf3.t(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        this.f399878h = java.lang.System.currentTimeMillis();
    }

    @Override // lf3.o, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onViewCreated */
    public void mo47092x594b1124(android.view.View contentView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentView, "contentView");
        super.mo47092x594b1124(contentView);
        this.f399874d = contentView.findViewById(com.p314xaae8f345.mm.R.id.ght);
    }
}
