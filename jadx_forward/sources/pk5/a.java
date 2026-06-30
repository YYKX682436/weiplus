package pk5;

/* loaded from: classes2.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.vas.p2743x9da2e250.AbstractC22586x21703f69 f438077d;

    public a(com.p314xaae8f345.mm.ui.vas.p2743x9da2e250.AbstractC22586x21703f69 abstractC22586x21703f69) {
        this.f438077d = abstractC22586x21703f69;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.vas.p2743x9da2e250.AbstractC22586x21703f69 abstractC22586x21703f69 = this.f438077d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(abstractC22586x21703f69.getF292665d(), "[onViewFocused] " + abstractC22586x21703f69.getClass().getSimpleName() + '@' + abstractC22586x21703f69.m7479x8cdac1b() + " focusState=" + abstractC22586x21703f69.f292666e);
        java.util.Iterator it = abstractC22586x21703f69.f292667f.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9) it.next()).mo58275xd317978f();
        }
    }
}
