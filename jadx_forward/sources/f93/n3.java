package f93;

/* loaded from: classes11.dex */
public class n3 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f341931d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16171x51fc9384 f341932e;

    public n3(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16171x51fc9384 viewOnCreateContextMenuListenerC16171x51fc9384, java.util.ArrayList arrayList) {
        this.f341932e = viewOnCreateContextMenuListenerC16171x51fc9384;
        this.f341931d = arrayList;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        if (i17 != 0) {
            return;
        }
        int i18 = 0;
        java.util.ArrayList arrayList = this.f341931d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16171x51fc9384 viewOnCreateContextMenuListenerC16171x51fc9384 = this.f341932e;
        if (arrayList != null) {
            if (arrayList.size() > 0) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                while (i18 < arrayList.size()) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.d4 d4Var = (com.p314xaae8f345.mm.p2621x8fb0427b.d4) arrayList.get(i18);
                    if (d4Var != null) {
                        if (!arrayList2.contains(d4Var.f66585x70ce48ca + "")) {
                            arrayList2.add(d4Var.f66585x70ce48ca + "");
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16097, 2, 2, 2);
                    }
                    i18++;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16171x51fc9384.b(viewOnCreateContextMenuListenerC16171x51fc9384, arrayList2, arrayList);
                viewOnCreateContextMenuListenerC16171x51fc9384.Y = 1;
                return;
            }
            return;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        k93.j jVar = viewOnCreateContextMenuListenerC16171x51fc9384.E;
        if (jVar != null && jVar.f387427f.size() > 0) {
            while (i18 < viewOnCreateContextMenuListenerC16171x51fc9384.E.f387427f.size()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.d4 n17 = b93.r.wi().n1((java.lang.String) viewOnCreateContextMenuListenerC16171x51fc9384.E.f387427f.get(i18));
                if (n17 != null) {
                    if (!arrayList4.contains(n17.f66585x70ce48ca + "")) {
                        arrayList4.add(n17.f66585x70ce48ca + "");
                        arrayList3.add(n17);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16097, 2, 2, 2);
                }
                i18++;
            }
        }
        if (arrayList4.size() > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16171x51fc9384.b(viewOnCreateContextMenuListenerC16171x51fc9384, arrayList4, arrayList3);
        }
        viewOnCreateContextMenuListenerC16171x51fc9384.Y = 2;
    }
}
