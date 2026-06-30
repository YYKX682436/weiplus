package ci2;

/* loaded from: classes10.dex */
public final class n extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final ci2.o f123223d;

    /* renamed from: e, reason: collision with root package name */
    public final fg2.p f123224e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f123225f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f123226g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f123227h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(android.content.Context context, ci2.o service) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        this.f123223d = service;
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e9i, (android.view.ViewGroup) this, false);
        addView(inflate);
        int i17 = com.p314xaae8f345.mm.R.id.th7;
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.th7);
        if (c1073x7e08a787 != null) {
            i17 = com.p314xaae8f345.mm.R.id.th8;
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375 c0092xf45d4375 = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.th8);
            if (c0092xf45d4375 != null) {
                i17 = com.p314xaae8f345.mm.R.id.th9;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502 c14246xaa893502 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.th9);
                if (c14246xaa893502 != null) {
                    i17 = com.p314xaae8f345.mm.R.id.qrn;
                    android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.qrn);
                    if (imageView != null) {
                        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7872 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) inflate;
                        this.f123224e = new fg2.p(c1073x7e08a7872, c1073x7e08a787, c0092xf45d4375, c14246xaa893502, imageView);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatVoiceRoomPreviewContentLayout", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
                        android.view.ViewTreeObserver viewTreeObserver = c1073x7e08a7872.getViewTreeObserver();
                        if (viewTreeObserver != null) {
                            viewTreeObserver.addOnGlobalLayoutListener(new ci2.k(this));
                            return;
                        }
                        return;
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i17)));
    }

    /* renamed from: getService */
    public final ci2.o m14915xb411027f() {
        return this.f123223d;
    }

    /* renamed from: getView */
    public final android.view.View m14916xfb86a31b() {
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = this.f123224e.f343733a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c1073x7e08a787, "getRoot(...)");
        return c1073x7e08a787;
    }
}
