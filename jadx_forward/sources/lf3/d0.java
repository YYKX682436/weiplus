package lf3;

/* loaded from: classes3.dex */
public final class d0 extends lf3.n {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        m158354x19263085().getWindow().clearFlags(2048);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = m158354x19263085 instanceof com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 ? (com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37) m158354x19263085 : null;
        if (abstractActivityC22579xbed01a37 != null) {
            if (abstractActivityC22579xbed01a37.m81217xb3833cfe()) {
                android.view.Window window = abstractActivityC22579xbed01a37.getWindow();
                if (fp.e0.c() || fp.e0.i() || fp.e0.e()) {
                    window.setFlags(134218752, 134218752);
                } else {
                    window.setFlags(134217728, 134217728);
                }
                abstractActivityC22579xbed01a37.mo64405x4dab7448(0);
                android.view.View decorView = abstractActivityC22579xbed01a37.getWindow().getDecorView();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decorView, "getDecorView(...)");
                decorView.getSystemUiVisibility();
                decorView.setSystemUiVisibility(1028);
                p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = abstractActivityC22579xbed01a37.mo2533x106ab264();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo2533x106ab264);
                mo2533x106ab264.o();
            } else {
                if (fp.h.c(19)) {
                    abstractActivityC22579xbed01a37.getWindow().setFlags(201327616, 201327616);
                } else {
                    abstractActivityC22579xbed01a37.getWindow().setFlags(1024, 1024);
                }
                abstractActivityC22579xbed01a37.m78568xd7114f24();
            }
            abstractActivityC22579xbed01a37.mo78514x143f1b92().I();
        }
    }
}
