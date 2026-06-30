package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class q3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v3 f195488d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v3 v3Var) {
        super(2);
        this.f195488d = v3Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String m76175x6d346f39;
        java.lang.Object cgi = (com.p314xaae8f345.mm.p944x882e457a.i) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cgi, "cgi");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19796x6abb1fc1) obj2, "<anonymous parameter 1>");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v3 v3Var = this.f195488d;
        if (v3Var.f194863o.f93138c != p012xc85e97e9.p093xedfae76a.n.DESTROYED) {
            if (cgi instanceof h81.b) {
                bq.z1 z1Var = (bq.z1) ((h81.b) cgi);
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa J2 = z1Var.J();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("update bg,user page isOnlyFetchUserInfo:");
                boolean z17 = z1Var.f105077v;
                sb6.append(z17);
                sb6.append(", local username:");
                sb6.append(((mm2.c1) v3Var.P0(mm2.c1.class)).f410385o);
                sb6.append(",req username:");
                java.lang.String str = z1Var.f105075t;
                sb6.append(str);
                sb6.append("，contact username:");
                sb6.append(J2 != null ? J2.m76197x6c03c64c() : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveAnchorAfterPlugin", sb6.toString());
                if (z17 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, ((mm2.c1) v3Var.P0(mm2.c1.class)).f410385o) && J2 != null && (m76175x6d346f39 = J2.m76175x6d346f39()) != null) {
                    v3Var.K1(m76175x6d346f39);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveAnchorAfterPlugin", "cgi is not IFinderUserPageCGI");
            }
        }
        return jz5.f0.f384359a;
    }
}
