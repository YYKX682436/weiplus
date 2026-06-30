package ym5;

/* loaded from: classes10.dex */
public final class p5 implements dn5.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ym5.y5 f545000a;

    public p5(ym5.y5 y5Var) {
        this.f545000a = y5Var;
    }

    @Override // dn5.f
    public final void a(int i17) {
        ym5.y5 y5Var = this.f545000a;
        java.lang.String str = y5Var.f545114x;
        y5Var.f544891u.getCurMode();
        if (y5Var.f544891u.getCurMode() != 3) {
            y5Var.f544890t.setTextColor(i17);
        } else {
            y5Var.f544891u.setTag(java.lang.Integer.valueOf(i17));
            y5Var.f544890t.mo82626x630fd73d(i17);
        }
    }
}
