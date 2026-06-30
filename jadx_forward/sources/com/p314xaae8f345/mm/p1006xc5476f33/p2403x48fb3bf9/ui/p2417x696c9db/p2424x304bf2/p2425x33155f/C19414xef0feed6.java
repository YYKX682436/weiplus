package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2424x304bf2.p2425x33155f;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.game.menu.GameMenuView */
/* loaded from: classes8.dex */
public class C19414xef0feed6 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f266300d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.LayoutInflater f266301e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f266302f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f266303g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f266304h;

    /* renamed from: i, reason: collision with root package name */
    public tx4.q f266305i;

    /* renamed from: m, reason: collision with root package name */
    public tx4.f f266306m;

    /* renamed from: n, reason: collision with root package name */
    public tx4.d f266307n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f266308o;

    public C19414xef0feed6(android.content.Context context) {
        super(context, null);
        this.f266308o = false;
        this.f266300d = context;
        this.f266301e = android.view.LayoutInflater.from(context);
        android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f266308o = displayMetrics.widthPixels > displayMetrics.heightPixels;
        b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
    
        if (((r5.f504241d.size() + 1) / 2) > 4) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2424x304bf2.p2425x33155f.C19414xef0feed6 r12) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2424x304bf2.p2425x33155f.C19414xef0feed6.a(com.tencent.mm.plugin.webview.ui.tools.game.menu.GameMenuView):void");
    }

    public final void b() {
        android.view.View inflate;
        boolean z17 = this.f266308o;
        android.view.LayoutInflater layoutInflater = this.f266301e;
        if (z17) {
            setOrientation(0);
            layoutInflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570688bh4, (android.view.ViewGroup) this, true);
            inflate = layoutInflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570685bh1, (android.view.ViewGroup) this, true);
        } else {
            setOrientation(1);
            layoutInflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570689bh5, (android.view.ViewGroup) this, true);
            inflate = layoutInflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570686bh2, (android.view.ViewGroup) this, true);
        }
        this.f266302f = inflate.findViewById(com.p314xaae8f345.mm.R.id.gnb);
        this.f266303g = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.gna);
        this.f266304h = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.gnc);
    }

    /* renamed from: setAdapter */
    public void m74481x6cab2c8d(tx4.q qVar) {
        this.f266305i = qVar;
        qVar.registerDataSetObserver(new tx4.m(this));
        qVar.notifyDataSetChanged();
    }

    /* renamed from: setDismissListener */
    public void m74482x2051c9c(tx4.d dVar) {
        this.f266307n = dVar;
    }

    /* renamed from: setGameMenuItemSelectedListener */
    public void m74483xa30ef135(tx4.f fVar) {
        this.f266306m = fVar;
    }

    public C19414xef0feed6(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f266308o = false;
        this.f266300d = context;
        b();
    }
}
