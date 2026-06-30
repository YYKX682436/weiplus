package d04;

/* loaded from: classes15.dex */
public final class d3 implements e04.z2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17337xb9c9eb33 f306938a;

    public d3(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17337xb9c9eb33 c17337xb9c9eb33) {
        this.f306938a = c17337xb9c9eb33;
    }

    @Override // e04.z2
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17337xb9c9eb33 c17337xb9c9eb33 = this.f306938a;
        c17337xb9c9eb33.f241336w = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanSharedMaskView", "onShowTaskEnd isFlashShow: %b, showToast: %b", java.lang.Boolean.valueOf(c17337xb9c9eb33.f241337x), java.lang.Boolean.valueOf(c17337xb9c9eb33.B));
        if (c17337xb9c9eb33.f241337x) {
            return;
        }
        if (!c17337xb9c9eb33.B) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17337xb9c9eb33.d(c17337xb9c9eb33, true, null, 2, null);
            return;
        }
        c17337xb9c9eb33.B = false;
        if (c17337xb9c9eb33.f241335v == null) {
            e04.c3 c3Var = new e04.c3();
            android.widget.TextView textView = c17337xb9c9eb33.f241323g;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("scanToast");
                throw null;
            }
            c3Var.f327411a = textView;
            c3Var.f327412b = 2000L;
            c3Var.f327413c = new d04.e3(c17337xb9c9eb33);
            c17337xb9c9eb33.f241335v = c3Var;
        }
        e04.c3 c3Var2 = c17337xb9c9eb33.f241335v;
        if (c3Var2 != null) {
            c3Var2.b(true);
        }
    }

    @Override // e04.z2
    public void b(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17337xb9c9eb33 c17337xb9c9eb33 = this.f306938a;
        android.widget.TextView textView = c17337xb9c9eb33.f241321e;
        if (textView != null) {
            textView.setShadowLayer(10.0f, 0.0f, 0.0f, c17337xb9c9eb33.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77636xad7ef29));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("scanTitle");
            throw null;
        }
    }

    @Override // e04.z2
    public void c(boolean z17) {
        this.f306938a.f241336w = true;
    }

    @Override // e04.z2
    public void d(boolean z17) {
    }
}
