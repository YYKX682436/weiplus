package ey2;

/* loaded from: classes2.dex */
public final class i2 extends pf5.o0 {

    /* renamed from: e, reason: collision with root package name */
    public final ey2.h2 f338927e = new ey2.h2(1);

    /* renamed from: f, reason: collision with root package name */
    public final ey2.h2 f338928f = new ey2.h2(3);

    /* renamed from: g, reason: collision with root package name */
    public final ey2.h2 f338929g = new ey2.h2(4);

    /* renamed from: h, reason: collision with root package name */
    public final ey2.h2 f338930h = new ey2.h2(10000);

    /* renamed from: i, reason: collision with root package name */
    public final ey2.h2 f338931i = new ey2.h2(9);

    /* renamed from: m, reason: collision with root package name */
    public final ey2.h2 f338932m = new ey2.h2(104);

    public final void N6(int i17, java.util.List list) {
        if (list == null) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[collectReadFeeds] commentScene=");
        sb6.append(i17);
        sb6.append(" readList=");
        sb6.append(list.size());
        sb6.append(" first=");
        so2.j5 j5Var = (so2.j5) kz5.n0.Z(list);
        sb6.append(pm0.v.u(j5Var != null ? j5Var.mo2128x1ed62e84() : 0L));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.TabStreamUnreadVM", sb6.toString());
        if (i17 != 1) {
            if (i17 == 25) {
                this.f338930h.b(list);
                return;
            }
            if (i17 != 120) {
                if (i17 != 171 && i17 != 155 && i17 != 156) {
                    switch (i17) {
                        case 17:
                            break;
                        case 18:
                            ey2.h2 h2Var = this.f338927e;
                            h2Var.b(list);
                            h2Var.a();
                            return;
                        case 19:
                        case 20:
                            ey2.h2 h2Var2 = this.f338929g;
                            h2Var2.b(list);
                            h2Var2.a();
                            return;
                        default:
                            return;
                    }
                }
                ey2.h2 h2Var3 = this.f338928f;
                h2Var3.b(list);
                h2Var3.a();
                return;
            }
        }
        this.f338932m.b(list);
    }

    public final boolean O6(long j17) {
        return this.f338928f.c(j17) || this.f338927e.c(j17) || this.f338929g.c(j17);
    }

    public final boolean P6(int i17, long j17) {
        if (i17 == 1) {
            return this.f338927e.c(j17);
        }
        if (i17 == 9) {
            return this.f338931i.c(j17);
        }
        if (i17 == 104) {
            return this.f338932m.c(j17);
        }
        if (i17 == 10000) {
            return this.f338930h.c(j17);
        }
        if (i17 == 3) {
            return this.f338928f.c(j17);
        }
        if (i17 != 4) {
            return true;
        }
        return this.f338929g.c(j17);
    }
}
