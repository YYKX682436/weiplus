package n3;

/* loaded from: classes14.dex */
public class a3 extends n3.z2 {
    public a3(n3.g3 g3Var, android.view.WindowInsets windowInsets) {
        super(g3Var, windowInsets);
    }

    @Override // n3.d3
    public n3.g3 a() {
        return n3.g3.i(this.f415979c.consumeDisplayCutout(), null);
    }

    @Override // n3.y2, n3.d3
    /* renamed from: equals */
    public boolean mo148918xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3.a3)) {
            return false;
        }
        n3.a3 a3Var = (n3.a3) obj;
        return java.util.Objects.equals(this.f415979c, a3Var.f415979c) && java.util.Objects.equals(this.f415983g, a3Var.f415983g);
    }

    @Override // n3.d3
    public n3.l f() {
        android.view.DisplayCutout displayCutout = this.f415979c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new n3.l(displayCutout);
    }

    @Override // n3.d3
    /* renamed from: hashCode */
    public int mo148919x8cdac1b() {
        return this.f415979c.hashCode();
    }

    public a3(n3.g3 g3Var, n3.a3 a3Var) {
        super(g3Var, a3Var);
    }
}
