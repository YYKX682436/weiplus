package df2;

/* loaded from: classes3.dex */
public final class pu extends dk2.cb {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ df2.qu f312644b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pu(df2.qu quVar, java.lang.Class cls) {
        super(cls);
        this.f312644b = quVar;
    }

    @Override // dk2.cb
    public void b(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        r45.h84 h84Var;
        java.util.LinkedList m75941xfb821914;
        r45.g84 g84Var;
        r45.h84 h84Var2;
        java.util.LinkedList m75941xfb8219142;
        r45.g84 g84Var2;
        r45.h84 h84Var3;
        java.util.LinkedList m75941xfb8219143;
        r45.g84 g84Var3;
        java.util.LinkedList m75941xfb8219144;
        r45.g84 g84Var4;
        r45.ad2 result = (r45.ad2) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        java.util.LinkedList<r45.t72> m75941xfb8219145 = result.m75941xfb821914(0);
        if (m75941xfb8219145 != null) {
            df2.qu quVar = this.f312644b;
            for (r45.t72 t72Var : m75941xfb8219145) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSyncResourcePackageController", "#startPolling package_type=" + t72Var.m75939xb282bd08(0));
                switch (t72Var.m75939xb282bd08(0)) {
                    case 1:
                        java.util.LinkedList m75941xfb8219146 = t72Var.m75941xfb821914(1);
                        if (m75941xfb8219146 != null && (h84Var = (r45.h84) kz5.n0.Z(m75941xfb8219146)) != null && (m75941xfb821914 = h84Var.m75941xfb821914(4)) != null && (g84Var = (r45.g84) kz5.n0.Z(m75941xfb821914)) != null) {
                            ko0.l lVar = ko0.l.f391403a;
                            java.lang.String m75945x2fec8307 = g84Var.m75945x2fec8307(1);
                            if (m75945x2fec8307 == null) {
                                m75945x2fec8307 = "";
                            }
                            java.lang.String m75945x2fec83072 = g84Var.m75945x2fec8307(2);
                            lVar.e(m75945x2fec8307, m75945x2fec83072 != null ? m75945x2fec83072 : "");
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.d(quVar, null, null, new df2.nu(null), 3, null);
                            break;
                        }
                        break;
                    case 2:
                        java.util.LinkedList m75941xfb8219147 = t72Var.m75941xfb821914(1);
                        if (m75941xfb8219147 != null && (h84Var2 = (r45.h84) kz5.n0.Z(m75941xfb8219147)) != null && (m75941xfb8219142 = h84Var2.m75941xfb821914(4)) != null && (g84Var2 = (r45.g84) kz5.n0.Z(m75941xfb8219142)) != null) {
                            ko0.l0 l0Var = ko0.l0.f391411a;
                            java.lang.String m75945x2fec83073 = g84Var2.m75945x2fec8307(1);
                            if (m75945x2fec83073 == null) {
                                m75945x2fec83073 = "";
                            }
                            java.lang.String m75945x2fec83074 = g84Var2.m75945x2fec8307(2);
                            l0Var.d(m75945x2fec83073, m75945x2fec83074 != null ? m75945x2fec83074 : "");
                            break;
                        }
                        break;
                    case 3:
                        java.util.LinkedList m75941xfb8219148 = t72Var.m75941xfb821914(1);
                        if (m75941xfb8219148 != null && (h84Var3 = (r45.h84) kz5.n0.Z(m75941xfb8219148)) != null && (m75941xfb8219143 = h84Var3.m75941xfb821914(4)) != null && (g84Var3 = (r45.g84) kz5.n0.Z(m75941xfb8219143)) != null) {
                            ko0.c0 c0Var = ko0.c0.f391358a;
                            java.lang.String m75945x2fec83075 = g84Var3.m75945x2fec8307(1);
                            if (m75945x2fec83075 == null) {
                                m75945x2fec83075 = "";
                            }
                            java.lang.String m75945x2fec83076 = g84Var3.m75945x2fec8307(2);
                            c0Var.i(m75945x2fec83075, m75945x2fec83076 != null ? m75945x2fec83076 : "");
                            break;
                        }
                        break;
                    case 4:
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSyncResourcePackageController", "#startPolling MMFinderLiveResourcePackageType_StreamDecor done");
                        uh2.c.f509486a.a(t72Var.m75941xfb821914(1));
                        break;
                    case 5:
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSyncResourcePackageController", "#startPolling MMFinderLiveResourcePackageType_VisionEffects done");
                        vh2.c.f518574a.a(t72Var.m75941xfb821914(1));
                        break;
                    case 6:
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSyncResourcePackageController", "#startPolling MMFinderLiveResourcePackageType_GiftResource done");
                        java.util.LinkedList m75941xfb8219149 = t72Var.m75941xfb821914(1);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219149, "getResource_list(...)");
                        r45.h84 h84Var4 = (r45.h84) kz5.n0.Z(m75941xfb8219149);
                        if (h84Var4 != null && (m75941xfb8219144 = h84Var4.m75941xfb821914(4)) != null && (g84Var4 = (r45.g84) kz5.n0.Z(m75941xfb8219144)) != null) {
                            java.lang.String m75945x2fec83077 = g84Var4.m75945x2fec8307(1);
                            if (m75945x2fec83077 == null) {
                                m75945x2fec83077 = "";
                            }
                            java.lang.String m75945x2fec83078 = g84Var4.m75945x2fec8307(2);
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.d(quVar, null, null, new df2.ou(quVar, m75945x2fec83077, m75945x2fec83078 != null ? m75945x2fec83078 : "", null), 3, null);
                            break;
                        }
                        break;
                }
            }
        }
    }
}
