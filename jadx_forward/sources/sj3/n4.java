package sj3;

/* loaded from: classes14.dex */
public class n4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f490188d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sj3.a5 f490189e;

    public n4(sj3.a5 a5Var, boolean z17) {
        this.f490189e = a5Var;
        this.f490188d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        sj3.a5 a5Var = this.f490189e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16586x7058535b c16586x7058535b = a5Var.f489969z;
        boolean z17 = this.f490188d;
        c16586x7058535b.m67074xdd7d58e5(!z17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.j jVar = a5Var.f489953g;
        jVar.getClass();
        java.lang.String r17 = c01.z1.r();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getUsernameFromUserInfo(...)");
        sj3.j g17 = jVar.g(r17);
        if (g17 != null) {
            if (!(g17.f490110d != null)) {
                g17 = null;
            }
            if (g17 != null) {
                g17.o(z17 ? 0 : 8);
            }
        }
    }
}
