package on4;

/* loaded from: classes4.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6175x4c627f21 f428643d;

    public i(on4.j jVar, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6175x4c627f21 c6175x4c627f21) {
        this.f428643d = c6175x4c627f21;
    }

    @Override // java.lang.Runnable
    public void run() {
        ln4.g gVar = (ln4.g) i95.n0.c(ln4.g.class);
        gVar.m134976x2690a4ac();
        am.hz hzVar = this.f428643d.f136435g;
        java.lang.String str = hzVar.f88411a;
        java.lang.String str2 = hzVar.f88412b;
        java.lang.String str3 = hzVar.f88413c;
        int i17 = hzVar.f88414d;
        int i18 = hzVar.f88415e;
        java.lang.String str4 = hzVar.f88416f;
        byte[] bArr = hzVar.f88417g;
        pn4.q1 q1Var = gVar.f401441d;
        if (q1Var.f438734e.containsKey(str3)) {
            return;
        }
        pn4.p1 p1Var = new pn4.p1(str, str2, str3, i17, i18, str4, bArr);
        ((java.util.LinkedList) q1Var.f438733d).add(p1Var);
        q1Var.f438734e.put(str3, java.lang.Integer.valueOf(p1Var.f438713j));
        q1Var.a();
    }
}
