package dv2;

/* loaded from: classes2.dex */
public final class v1 extends zx2.l {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dv2.w1 f325498g;

    public v1(dv2.w1 w1Var) {
        this.f325498g = w1Var;
    }

    @Override // zx2.l, zx2.a0
    public void c(android.view.Window window) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(window, "window");
        dv2.w1 w1Var = this.f325498g;
        this.f558588c = (p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe) w1Var.m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.f568369v33);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.C15436x4c00d79 c15436x4c00d79 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.C15436x4c00d79) w1Var.m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.f568367v31);
        this.f558590e = c15436x4c00d79;
        android.view.ViewGroup.LayoutParams layoutParams = c15436x4c00d79 != null ? c15436x4c00d79.getLayoutParams() : null;
        if (layoutParams != null) {
            layoutParams.height = w1Var.m158361x893a2f6f().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.an6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.C15436x4c00d79 c15436x4c00d792 = this.f558590e;
        if (c15436x4c00d792 != null) {
            c15436x4c00d792.setLayoutParams(layoutParams);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.C15436x4c00d79 c15436x4c00d793 = this.f558590e;
        if (c15436x4c00d793 != null) {
            int dimension = (int) w1Var.m158361x893a2f6f().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);
            int dimension2 = (int) w1Var.m158361x893a2f6f().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);
            c15436x4c00d793.f214637h = dimension;
            c15436x4c00d793.f214638i = 0;
            c15436x4c00d793.f214639m = dimension2;
            c15436x4c00d793.f214640n = 0;
            c15436x4c00d793.e();
        }
    }

    @Override // zx2.a0
    public int d() {
        return com.p314xaae8f345.mm.R.id.f568368v32;
    }

    @Override // zx2.l, zx2.a0
    /* renamed from: getLayoutId */
    public int mo58748x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ee7;
    }
}
