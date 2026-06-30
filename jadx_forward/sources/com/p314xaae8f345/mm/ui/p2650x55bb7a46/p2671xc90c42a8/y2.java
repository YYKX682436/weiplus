package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes9.dex */
public class y2 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 f284092d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f284093e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n3 f284094f;

    public y2(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n3 n3Var, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73, java.util.List list) {
        this.f284094f = n3Var;
        this.f284092d = c5303xc75d2f73;
        this.f284093e = list;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = this.f284092d;
        am.c4 c4Var = c5303xc75d2f73.f135623g;
        if (c4Var.f87850c == 14 && c4Var.f87848a.f452497f.size() == 0) {
            return;
        }
        this.f284094f.c(c5303xc75d2f73);
        java.util.Iterator it = this.f284093e.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.e.c(com.p314xaae8f345.mm.ui.p2650x55bb7a46.c.Fav, com.p314xaae8f345.mm.ui.p2650x55bb7a46.d.Samll, (com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next(), 0);
        }
    }
}
