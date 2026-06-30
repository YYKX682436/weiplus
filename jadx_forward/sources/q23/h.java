package q23;

/* loaded from: classes.dex */
public final class h implements q23.f {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f441347a;

    public h(android.view.ViewGroup parent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.egt, parent, true);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        this.f441347a = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) ((android.view.ViewGroup) inflate).findViewById(com.p314xaae8f345.mm.R.id.tzn);
    }

    @Override // q23.f
    public void a(int i17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f441347a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22699x3dcdb352);
        if (i17 == 2) {
            c22699x3dcdb352.s(com.p314xaae8f345.mm.R.raw.f80509x41acf4b, com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an);
        } else if (i17 == 1) {
            c22699x3dcdb352.s(com.p314xaae8f345.mm.R.raw.f79784x46563237, com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an);
        } else if (i17 == 3) {
            c22699x3dcdb352.s(com.p314xaae8f345.mm.R.raw.f80509x41acf4b, com.p314xaae8f345.mm.R.C30859x5a72f63.f77909xe61cad90);
        }
    }

    @Override // q23.f
    /* renamed from: reset */
    public void mo159458x6761d4f() {
    }
}
