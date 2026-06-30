package x3;

/* loaded from: classes15.dex */
public final class h extends x3.j {
    @Override // x3.j
    public int a(android.view.View view, int i17, int i18) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        int baseline = view.getBaseline();
        if (baseline == -1) {
            return Integer.MIN_VALUE;
        }
        return baseline;
    }

    @Override // x3.j
    public x3.n b() {
        return new x3.g(this);
    }

    @Override // x3.j
    public java.lang.String c() {
        return "BASELINE";
    }

    @Override // x3.j
    public int d(android.view.View view, int i17) {
        return 0;
    }
}
