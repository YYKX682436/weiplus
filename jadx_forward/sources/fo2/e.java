package fo2;

/* loaded from: classes2.dex */
public class e extends v92.g {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f346433c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity, java.lang.String finderAuthorUsername) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderAuthorUsername, "finderAuthorUsername");
        this.f346433c = finderAuthorUsername;
    }

    public boolean A() {
        return false;
    }

    public void B() {
    }

    public void C() {
    }

    @Override // v92.g
    public void b(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 bottomSheet) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bottomSheet, "bottomSheet");
        super.b(bottomSheet);
        bottomSheet.f293405n = new fo2.b(this, bottomSheet);
        bottomSheet.f293414s = new fo2.c(this);
    }

    @Override // v92.g
    public void h() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = this.f515691a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.lang.String username = this.f346433c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        java.lang.String format = java.lang.String.format("https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=%d&user_ID=%s", java.util.Arrays.copyOf(new java.lang.Object[]{87, username}, 2));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", format);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    @Override // v92.g
    public boolean o() {
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f346433c, xy2.c.e(this.f515691a));
    }

    @Override // v92.g
    public void r() {
        ya2.b2 b17 = ya2.h.f542017a.b(this.f346433c);
        if (b17 == null) {
            return;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f515691a;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = activityC0065xcd7aa112 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activityC0065xcd7aa112 : null;
        if (abstractActivityC21394xb3d2c0cf == null || hz2.d.f367846a.a(ya.a.f77453x4b357bf)) {
            return;
        }
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.q6(b17, abstractActivityC21394xb3d2c0cf, null), 3, null);
    }

    @Override // v92.g
    public void u() {
        if (this.f515692b == null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) this.f515691a, 1, true);
            b(k0Var);
            c(k0Var);
            k0Var.f293387d = new fo2.d(this);
            this.f515692b = k0Var;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var2 = this.f515692b;
        if (k0Var2 != null) {
            k0Var2.v();
        }
    }

    public boolean z() {
        return false;
    }
}
