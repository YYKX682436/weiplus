package av5;

/* loaded from: classes16.dex */
public class h0 extends av5.m0 {

    /* renamed from: e, reason: collision with root package name */
    public final av5.g0 f95914e;

    /* renamed from: f, reason: collision with root package name */
    public final int f95915f;

    /* renamed from: g, reason: collision with root package name */
    public final int f95916g;

    /* renamed from: h, reason: collision with root package name */
    public final int f95917h;

    public h0(int i17, av5.g0 g0Var, int i18, int i19, int i27) {
        super(i17);
        this.f95914e = g0Var;
        this.f95915f = i18;
        this.f95916g = i19;
        this.f95917h = i27;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        av5.h0 h0Var = (av5.h0) obj;
        av5.g0 g0Var = h0Var.f95914e;
        av5.g0 g0Var2 = this.f95914e;
        return g0Var2 != g0Var ? g0Var2.compareTo(g0Var) : cv5.c.f(this.f95916g, h0Var.f95916g);
    }
}
