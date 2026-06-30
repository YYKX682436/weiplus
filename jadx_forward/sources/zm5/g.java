package zm5;

/* loaded from: classes3.dex */
public final class g extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f555751d;

    /* renamed from: e, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f555752e;

    /* renamed from: f, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f555753f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f555754g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f555751d = jz5.h.b(new zm5.a(activity));
        this.f555754g = jz5.h.b(new zm5.b(activity));
    }

    public final com.p314xaae8f345.mm.p2776x373aa5.p2780x317b13.C22826xe8196528 O6() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f555751d).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (com.p314xaae8f345.mm.p2776x373aa5.p2780x317b13.C22826xe8196528) mo141623x754a37bb;
    }

    public final void P6(java.lang.String imagePath, java.lang.String keyword) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imagePath, "imagePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyword, "keyword");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryFloatLayerUIC", "showFloatLayer >> imagePath: " + imagePath + ", keyword: " + keyword);
        if (keyword.length() > 0) {
            p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f555752e;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            p3325xe03a0797.p3326xc267989b.r2 r2Var2 = this.f555753f;
            if (r2Var2 != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var2, null, 1, null);
            }
            if (O6().getVisibility() == 0) {
                O6().setVisibility(8);
            }
            this.f555753f = p3325xe03a0797.p3326xc267989b.l.d(p012xc85e97e9.p093xedfae76a.d1.a(this), null, null, new zm5.f(this, imagePath, keyword, null), 3, null);
        }
    }
}
