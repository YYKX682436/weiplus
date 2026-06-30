package hr3;

/* loaded from: classes11.dex */
public final class gg extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f365127d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f365128e;

    /* renamed from: f, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f365129f;

    /* renamed from: g, reason: collision with root package name */
    public final android.content.DialogInterface.OnCancelListener f365130g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gg(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f365127d = m158359x1e885992().getStringExtra("Contact_User");
        this.f365130g = new hr3.bg(this);
    }

    public final void O6(java.lang.String remarkName, yz5.a callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(remarkName, "remarkName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (!(j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2533xb4860a9e.C20215xc7f64cd()) == 1)) {
            callback.mo152xb9724478();
            return;
        }
        java.lang.String str = this.f365127d;
        if (str == null) {
            callback.mo152xb9724478();
        } else if (r26.n0.B(str, "@", false) && !com.p314xaae8f345.mm.p2621x8fb0427b.z3.E4(str)) {
            callback.mo152xb9724478();
        } else {
            this.f365128e = db5.e1.Q(m80379x76847179(), m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.iin), true, true, this.f365130g);
            this.f365129f = p3325xe03a0797.p3326xc267989b.l.d(v65.m.b(m158354x19263085()), p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new hr3.fg(this, remarkName, callback, null), 2, null);
        }
    }
}
