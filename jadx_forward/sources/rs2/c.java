package rs2;

/* loaded from: classes2.dex */
public final class c extends zx2.l {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rs2.f f480858g;

    public c(rs2.f fVar) {
        this.f480858g = fVar;
    }

    @Override // zx2.l, zx2.a0
    public void c(android.view.Window window) {
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(window, "window");
        this.f558589d = null;
        rs2.f fVar = this.f480858g;
        android.view.View m80380x71e92c1d = fVar.m80380x71e92c1d();
        android.view.View findViewById = m80380x71e92c1d != null ? m80380x71e92c1d.findViewById(com.p314xaae8f345.mm.R.id.nup) : null;
        if (findViewById == null) {
            findViewById = window.findViewById(com.p314xaae8f345.mm.R.id.nup);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        }
        if (findViewById instanceof com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff) {
            this.f558586a = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff) findViewById;
        } else if (findViewById instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.C15436x4c00d79) {
            this.f558590e = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.C15436x4c00d79) findViewById;
        }
        android.view.View m80380x71e92c1d2 = fVar.m80380x71e92c1d();
        if (m80380x71e92c1d2 == null || (c1190x18d3c3fe = (p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe) m80380x71e92c1d2.findViewById(com.p314xaae8f345.mm.R.id.f569103p16)) == null) {
            c1190x18d3c3fe = (p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe) window.findViewById(com.p314xaae8f345.mm.R.id.f569103p16);
        }
        this.f558588c = c1190x18d3c3fe;
    }

    @Override // zx2.a0
    public int d() {
        return com.p314xaae8f345.mm.R.id.f568015ld3;
    }

    @Override // zx2.l, zx2.a0
    public android.view.View f() {
        return null;
    }

    @Override // zx2.l, zx2.a0
    /* renamed from: getLayoutId */
    public int mo58748x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dse;
    }
}
