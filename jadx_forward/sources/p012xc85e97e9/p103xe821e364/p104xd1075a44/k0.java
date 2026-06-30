package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* loaded from: classes15.dex */
public class k0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.n0 f93640d;

    public k0(p012xc85e97e9.p103xe821e364.p104xd1075a44.n0 n0Var) {
        this.f93640d = n0Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, int i18) {
        int computeHorizontalScrollOffset = c1163xf1deaba4.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = c1163xf1deaba4.computeVerticalScrollOffset();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.n0 n0Var = this.f93640d;
        int computeVerticalScrollRange = n0Var.f93697y.computeVerticalScrollRange();
        int i19 = n0Var.f93696x;
        int i27 = computeVerticalScrollRange - i19;
        int i28 = n0Var.f93679d;
        n0Var.f93698z = i27 > 0 && i19 >= i28;
        int computeHorizontalScrollRange = n0Var.f93697y.computeHorizontalScrollRange();
        int i29 = n0Var.f93695w;
        boolean z17 = computeHorizontalScrollRange - i29 > 0 && i29 >= i28;
        n0Var.A = z17;
        boolean z18 = n0Var.f93698z;
        if (!z18 && !z17) {
            if (n0Var.B != 0) {
                n0Var.f(0);
                return;
            }
            return;
        }
        if (z18) {
            float f17 = i19;
            n0Var.f93690r = (int) ((f17 * (computeVerticalScrollOffset + (f17 / 2.0f))) / computeVerticalScrollRange);
            n0Var.f93689q = java.lang.Math.min(i19, (i19 * i19) / computeVerticalScrollRange);
        }
        if (n0Var.A) {
            float f18 = computeHorizontalScrollOffset;
            float f19 = i29;
            n0Var.f93693u = (int) ((f19 * (f18 + (f19 / 2.0f))) / computeHorizontalScrollRange);
            n0Var.f93692t = java.lang.Math.min(i29, (i29 * i29) / computeHorizontalScrollRange);
        }
        int i37 = n0Var.B;
        if (i37 == 0 || i37 == 1) {
            n0Var.f(1);
        }
    }
}
