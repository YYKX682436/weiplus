package z35;

/* loaded from: classes4.dex */
public final class d implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19716x17d12db2 f551540d;

    public d(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19716x17d12db2 c19716x17d12db2) {
        this.f551540d = c19716x17d12db2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        android.graphics.Point point = new android.graphics.Point();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19716x17d12db2 c19716x17d12db2 = this.f551540d;
        android.view.Display display = c19716x17d12db2.getDisplay();
        if (display != null) {
            display.getSize(point);
        }
        int i39 = i19 - i17;
        int i47 = i27 - i18;
        if (c19716x17d12db2.getBarDynamicExpandSize().x != i39 || c19716x17d12db2.getBarDynamicExpandSize().y != i47) {
            c19716x17d12db2.m75629x680f8709(new android.graphics.Point(i39, i47));
        }
        if (i17 == i28 && i18 == i29 && i19 == i37 && i27 == i38) {
            return;
        }
        c19716x17d12db2.b(false);
    }
}
