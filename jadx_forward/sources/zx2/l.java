package zx2;

/* loaded from: classes2.dex */
public class l implements zx2.a0 {

    /* renamed from: a, reason: collision with root package name */
    public com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff f558586a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.C22785xca931918 f558587b;

    /* renamed from: c, reason: collision with root package name */
    public p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe f558588c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f558589d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.C15436x4c00d79 f558590e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 f558591f;

    @Override // zx2.a0
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.C15436x4c00d79 a() {
        return this.f558590e;
    }

    @Override // zx2.a0
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 b() {
        return this.f558591f;
    }

    @Override // zx2.a0
    public void c(android.view.Window window) {
        android.view.View findViewById;
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe;
        com.p314xaae8f345.mm.p2776x373aa5.C22785xca931918 c22785xca931918;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(window, "window");
        android.view.View findViewById2 = d() != -1 ? window.findViewById(d()) : null;
        if (findViewById2 == null || (findViewById = findViewById2.findViewById(com.p314xaae8f345.mm.R.id.f78240xeb4d83f5)) == null) {
            findViewById = window.findViewById(com.p314xaae8f345.mm.R.id.f78240xeb4d83f5);
        }
        this.f558589d = findViewById;
        android.view.View findViewById3 = findViewById2 != null ? findViewById2.findViewById(com.p314xaae8f345.mm.R.id.nup) : null;
        if (findViewById3 == null) {
            findViewById3 = window.findViewById(com.p314xaae8f345.mm.R.id.nup);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        }
        if (findViewById3 instanceof com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff) {
            this.f558586a = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff) findViewById3;
        } else if (findViewById3 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.C15436x4c00d79) {
            this.f558590e = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.C15436x4c00d79) findViewById3;
        }
        if (findViewById2 == null || (c1190x18d3c3fe = (p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe) findViewById2.findViewById(com.p314xaae8f345.mm.R.id.f569103p16)) == null) {
            c1190x18d3c3fe = (p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe) window.findViewById(com.p314xaae8f345.mm.R.id.f569103p16);
        }
        this.f558588c = c1190x18d3c3fe;
        if (findViewById2 == null || (c22785xca931918 = (com.p314xaae8f345.mm.p2776x373aa5.C22785xca931918) findViewById2.findViewById(com.p314xaae8f345.mm.R.id.nuq)) == null) {
            c22785xca931918 = (com.p314xaae8f345.mm.p2776x373aa5.C22785xca931918) window.findViewById(com.p314xaae8f345.mm.R.id.nuq);
        }
        this.f558587b = c22785xca931918;
        if (findViewById2 == null || (c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) findViewById2.findViewById(com.p314xaae8f345.mm.R.id.f566877hd3)) == null) {
            c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) window.findViewById(com.p314xaae8f345.mm.R.id.f566877hd3);
        }
        this.f558591f = c22849x81a93d25;
    }

    @Override // zx2.a0
    public p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe e() {
        return this.f558588c;
    }

    @Override // zx2.a0
    public android.view.View f() {
        return this.f558589d;
    }

    @Override // zx2.a0
    public com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff g() {
        return this.f558586a;
    }

    @Override // zx2.a0
    /* renamed from: getLayoutId */
    public int mo58748x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ba7;
    }

    @Override // zx2.a0
    public com.p314xaae8f345.mm.p2776x373aa5.C22785xca931918 h() {
        return this.f558587b;
    }
}
