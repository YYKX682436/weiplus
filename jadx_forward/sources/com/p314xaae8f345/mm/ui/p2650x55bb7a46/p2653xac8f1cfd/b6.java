package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes9.dex */
public class b6 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f280249d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 f280250e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.c6 f280251f;

    public b6(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.c6 c6Var, java.util.List list, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73) {
        this.f280251f = c6Var;
        this.f280249d = list;
        this.f280250e = c5303xc75d2f73;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        for (com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var : this.f280249d) {
            if (!f9Var.m2() && !f9Var.C2()) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = this.f280250e;
                am.c4 c4Var = c5303xc75d2f73.f135623g;
                int i18 = c4Var.f87850c;
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.c6 c6Var = this.f280251f;
                if (i18 == 14 && c4Var.f87848a.f452497f.size() == 0) {
                    c6Var.f280406d.o0();
                    return;
                }
                c6Var.b(c5303xc75d2f73);
                java.util.Iterator it = c6Var.f280406d.p0().iterator();
                while (it.hasNext()) {
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.e.c(com.p314xaae8f345.mm.ui.p2650x55bb7a46.c.Fav, com.p314xaae8f345.mm.ui.p2650x55bb7a46.d.Samll, (com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next(), 0);
                }
                return;
            }
        }
    }
}
