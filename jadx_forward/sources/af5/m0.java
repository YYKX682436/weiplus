package af5;

/* loaded from: classes9.dex */
public final class m0 implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22093x7ffc29ba f86131d;

    public m0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22093x7ffc29ba c22093x7ffc29ba) {
        this.f86131d = c22093x7ffc29ba;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22093x7ffc29ba c22093x7ffc29ba = this.f86131d;
        if (c22093x7ffc29ba.m80110x1cddf0a2().c().getWidth() == c22093x7ffc29ba.m80110x1cddf0a2().b().getWidth() && c22093x7ffc29ba.m80110x1cddf0a2().c().getHeight() == c22093x7ffc29ba.m80110x1cddf0a2().b().getHeight()) {
            return;
        }
        c22093x7ffc29ba.post(new af5.l0(c22093x7ffc29ba));
    }
}
