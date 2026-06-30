package go2;

/* loaded from: classes2.dex */
public final class b1 extends zx2.l {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ go2.d1 f355488g;

    public b1(go2.d1 d1Var) {
        this.f355488g = d1Var;
    }

    @Override // zx2.l, zx2.a0
    public void c(android.view.Window window) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(window, "window");
        super.c(window);
        go2.d1 d1Var = this.f355488g;
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe = (p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe) d1Var.m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.q0q);
        if (c1190x18d3c3fe == null) {
            c1190x18d3c3fe = (p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe) window.findViewById(com.p314xaae8f345.mm.R.id.q0q);
        }
        this.f558588c = c1190x18d3c3fe;
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff) d1Var.m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.q0o);
        if (c2718xca2902ff == null) {
            c2718xca2902ff = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff) window.findViewById(com.p314xaae8f345.mm.R.id.q0o);
        }
        this.f558586a = c2718xca2902ff;
        com.p314xaae8f345.mm.p2776x373aa5.C22785xca931918 c22785xca931918 = (com.p314xaae8f345.mm.p2776x373aa5.C22785xca931918) d1Var.m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.q0p);
        if (c22785xca931918 == null) {
            c22785xca931918 = (com.p314xaae8f345.mm.p2776x373aa5.C22785xca931918) window.findViewById(com.p314xaae8f345.mm.R.id.q0p);
        }
        this.f558587b = c22785xca931918;
    }

    @Override // zx2.l, zx2.a0
    /* renamed from: getLayoutId */
    public int mo58748x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dcc;
    }
}
