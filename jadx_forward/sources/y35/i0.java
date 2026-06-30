package y35;

/* loaded from: classes11.dex */
public final class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19715xef2590cd f540751d;

    public i0(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19715xef2590cd c19715xef2590cd) {
        this.f540751d = c19715xef2590cd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19715xef2590cd c19715xef2590cd = this.f540751d;
        y35.j jVar = c19715xef2590cd.f272607d;
        if (jVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VerifyRecordListView", "refreshFromCloud skip, args is null");
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jVar.f540757f)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VerifyRecordListView", "refreshFromCloud skip, encryptUsername is empty");
            return;
        }
        boolean z17 = true;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(jVar.f540752a, true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.s2 s2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.s2.f235148a;
        android.content.Context context = c19715xef2590cd.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(n17);
        y35.r[] a17 = s2Var.a(context, n17, jVar.f540753b, jVar.f540757f, jVar.f540754c);
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = a17 != null ? java.lang.Integer.valueOf(a17.length) : "null";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VerifyRecordListView", "refreshFromCloud, providers = %s", objArr);
        if (a17 != null) {
            if (!(a17.length == 0)) {
                z17 = false;
            }
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VerifyRecordListView", "refreshFromCloud, no providers, hide all");
            c19715xef2590cd.c();
            c19715xef2590cd.setVisibility(8);
        } else {
            c19715xef2590cd.a(a17);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jVar.f540754c)) {
                return;
            }
            c19715xef2590cd.setVisibility(0);
        }
    }
}
