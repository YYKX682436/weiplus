package vd2;

@j95.b
/* loaded from: classes2.dex */
public final class p2 extends i95.w implements ss5.f0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f517384d = "Finder.FinderLivePreloadFeatureService";

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Vector f517385e = new java.util.Vector();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Vector f517386f = new java.util.Vector();

    public final java.lang.String wi(r45.nw1 nw1Var) {
        ko0.t tVar = ko0.t.f391436a;
        java.lang.String m75945x2fec8307 = nw1Var.m75945x2fec8307(3);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        java.lang.String d17 = tVar.d(m75945x2fec8307);
        java.lang.String u17 = pm0.v.u(nw1Var.m75942xfb822ef2(0));
        if ((d17 == null || d17.length() == 0) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(u17, "0")) {
            return null;
        }
        return u17 + '_' + d17;
    }
}
