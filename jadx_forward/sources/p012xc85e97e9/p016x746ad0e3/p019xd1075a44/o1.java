package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* loaded from: classes15.dex */
public class o1 extends p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0099x7ccac81e implements p012xc85e97e9.p016x746ad0e3.p019xd1075a44.m1 {

    /* renamed from: J, reason: collision with root package name */
    public static final java.lang.reflect.Method f91198J;
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.m1 I;

    static {
        try {
            f91198J = android.widget.PopupWindow.class.getDeclaredMethod("setTouchModal", java.lang.Boolean.TYPE);
        } catch (java.lang.NoSuchMethodException unused) {
        }
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.m1
    public void a(o.r rVar, android.view.MenuItem menuItem) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.m1 m1Var = this.I;
        if (m1Var != null) {
            m1Var.a(rVar, menuItem);
        }
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.m1
    public void b(o.r rVar, android.view.MenuItem menuItem) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.m1 m1Var = this.I;
        if (m1Var != null) {
            m1Var.b(rVar, menuItem);
        }
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0099x7ccac81e
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.b1 c(android.content.Context context, boolean z17) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.n1 n1Var = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.n1(context, z17);
        n1Var.m2868xe86c18ce(this);
        return n1Var;
    }
}
