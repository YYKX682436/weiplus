package q23;

/* loaded from: classes.dex */
public final class a implements q23.f {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f441340a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f441341b;

    public a(android.view.ViewGroup parent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.egs, parent, true);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate;
        this.f441340a = (android.view.ViewGroup) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.scj);
        this.f441341b = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.scd);
    }

    @Override // q23.f
    public void a(int i17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f441341b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22699x3dcdb352);
        if (i17 == 2) {
            c22699x3dcdb352.s(com.p314xaae8f345.mm.R.raw.f80509x41acf4b, com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an);
        } else {
            if (i17 == 0 || i17 == 1) {
                c22699x3dcdb352.s(com.p314xaae8f345.mm.R.raw.f79784x46563237, com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an);
            } else if (i17 == 3) {
                c22699x3dcdb352.s(com.p314xaae8f345.mm.R.raw.f80509x41acf4b, com.p314xaae8f345.mm.R.C30859x5a72f63.abx);
            }
        }
        android.view.ViewGroup viewGroup = this.f441340a;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        if (viewGroup != null) {
            viewGroup.setBackground(null);
        }
        if (i17 == 0) {
            if (viewGroup == null) {
                return;
            }
            viewGroup.setEnabled(false);
        } else if (i17 == 1) {
            if (viewGroup == null) {
                return;
            }
            viewGroup.setEnabled(true);
        } else if (i17 == 2) {
            if (viewGroup == null) {
                return;
            }
            viewGroup.setEnabled(true);
        } else {
            if (i17 != 3 || viewGroup == null) {
                return;
            }
            viewGroup.setEnabled(false);
        }
    }

    @Override // q23.f
    /* renamed from: reset */
    public void mo159458x6761d4f() {
        android.view.ViewGroup viewGroup = this.f441340a;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setVisibility(8);
    }
}
