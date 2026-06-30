package by4;

/* loaded from: classes7.dex */
public final class e implements com.p314xaae8f345.p3210x3857dc.InterfaceC27825xd374e5c7 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f117917a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ref.WeakReference f117918b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.ref.WeakReference f117919c;

    public e(boolean z17, java.lang.ref.WeakReference webviewUIWeakRef, java.lang.ref.WeakReference viewWVWeakRef) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(webviewUIWeakRef, "webviewUIWeakRef");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewWVWeakRef, "viewWVWeakRef");
        this.f117917a = z17;
        this.f117918b = webviewUIWeakRef;
        this.f117919c = viewWVWeakRef;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.InterfaceC27825xd374e5c7
    /* renamed from: getSafeAreaRect */
    public android.graphics.Rect mo13580xb5346934(android.graphics.Rect rect) {
        int i17;
        int height;
        int height2;
        e3.d a17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) this.f117918b.get();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59) this.f117919c.get();
        if (viewOnCreateContextMenuListenerC19337x37f3384d == null || c22633x83752a59 == null) {
            return rect == null ? new android.graphics.Rect() : rect;
        }
        int[] s17 = pm0.v.s(c22633x83752a59);
        int m78524xe5345112 = viewOnCreateContextMenuListenerC19337x37f3384d.m78524xe5345112(0);
        android.view.ViewGroup m78528x3c38ee5b = viewOnCreateContextMenuListenerC19337x37f3384d.m78528x3c38ee5b();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22602x8bae1c88 c22602x8bae1c88 = m78528x3c38ee5b instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22602x8bae1c88 ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22602x8bae1c88) m78528x3c38ee5b : null;
        int i18 = s17[1];
        int i19 = i18 > m78524xe5345112 ? 0 : m78524xe5345112 - i18;
        if (this.f117917a && c22602x8bae1c88 != null && c22602x8bae1c88.getNavigationBarStrategy() == al5.q.f87521d) {
            android.view.View decorView = viewOnCreateContextMenuListenerC19337x37f3384d.getWindow().getDecorView();
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.g3 a18 = n3.b1.a(decorView);
            int i27 = (a18 == null || (a17 = a18.a(7)) == null) ? 0 : a17.f328580d;
            if (i27 != 0 && (height = s17[1] + c22633x83752a59.getHeight()) <= (height2 = c22602x8bae1c88.getHeight())) {
                i17 = java.lang.Math.max(0, i27 + (height - height2));
                android.graphics.Rect rect2 = new android.graphics.Rect(0, i19, 0, i17);
                rect2.toString();
                return rect2;
            }
        }
        i17 = 0;
        android.graphics.Rect rect22 = new android.graphics.Rect(0, i19, 0, i17);
        rect22.toString();
        return rect22;
    }
}
