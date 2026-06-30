package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes5.dex */
public class sc implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f287042d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.l55 f287043e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.nc f287044f;

    public sc(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.nc ncVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, r45.l55 l55Var) {
        this.f287044f = ncVar;
        this.f287042d = f9Var;
        this.f287043e = l55Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f287044f.getClass();
        mp3.j jVar = (mp3.j) i95.n0.c(mp3.j.class);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f287042d;
        java.lang.String j17 = f9Var.j();
        ((lp3.l) jVar).getClass();
        r45.k55 e17 = bm5.d1.e(j17);
        r45.l55 Ui = ((lp3.l) ((mp3.j) i95.n0.c(mp3.j.class))).Ui(e17, this.f287043e.f460688g);
        if (Ui != null) {
            java.util.LinkedList linkedList = e17.f459919e;
            linkedList.remove(Ui);
            if (linkedList.isEmpty()) {
                c01.w9.f(f9Var.m124847x74d37ac6(), f9Var.Q0());
                return;
            }
            f9Var.d1(((lp3.l) ((mp3.j) i95.n0.c(mp3.j.class))).mj(e17));
            f9Var.m124850x7650bebc(922746929);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(f9Var.m124847x74d37ac6(), f9Var, true);
        }
    }
}
