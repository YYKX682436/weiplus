package j93;

/* loaded from: classes.dex */
public final class w extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f380058d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    public final void O6() {
        android.view.Window window;
        b93.l.a(b93.l.f100129a, m158359x1e885992().getIntExtra("key_label_click_source", 0), 4, 0, 0, 0, 28, null);
        db5.f3 f3Var = new db5.f3(m158354x19263085(), false);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a4 a4Var = f3Var.f293588d;
        if (a4Var != null && (window = a4Var.getWindow()) != null) {
            gh5.g.a(window);
        }
        f3Var.l(new j93.t(this));
        f3Var.L.setText(m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.mbc));
        java.lang.String m158362x2fec8307 = m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.mbc);
        android.widget.EditText editText = f3Var.M;
        editText.setHint(m158362x2fec8307);
        f3Var.N.setOnClickListener(new db5.c3(f3Var, new j93.u(this, f3Var)));
        f3Var.C();
        editText.postDelayed(new j93.v(f3Var, this), 100L);
    }
}
