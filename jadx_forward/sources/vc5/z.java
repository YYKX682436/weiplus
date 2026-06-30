package vc5;

/* loaded from: classes5.dex */
public final class z implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f516889d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f516890e;

    public z(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352, int i17) {
        this.f516889d = c22699x3dcdb352;
        this.f516890e = i17;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        view.removeOnLayoutChangeListener(this);
        com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d.C4882xbb3d954a.Companion companion = com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d.C4882xbb3d954a.INSTANCE;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f516889d;
        int i39 = this.f516890e;
        com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d.C4882xbb3d954a.Companion.m42550x8c53ca37(companion, c22699x3dcdb352, i39 * 2, i39 * 2, i39 * 2, i39 * 2, false, 32, null);
    }
}
