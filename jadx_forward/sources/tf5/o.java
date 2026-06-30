package tf5;

/* loaded from: classes11.dex */
public final class o implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final tf5.g f500539d;

    /* renamed from: e, reason: collision with root package name */
    public final int f500540e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.p2691xbb979bf4.C22342xca74f598 f500541f;

    public o(com.p314xaae8f345.mm.ui.p2690x38b72420.p2691xbb979bf4.C22342xca74f598 c22342xca74f598, tf5.g dataItem, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataItem, "dataItem");
        this.f500541f = c22342xca74f598;
        this.f500539d = dataItem;
        this.f500540e = i17;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        if (contextMenuInfo instanceof android.widget.AdapterView.AdapterContextMenuInfo) {
            tf5.g gVar = this.f500539d;
            if (gVar instanceof tf5.g) {
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = gVar.f500511d;
                boolean M = c01.e2.M(z3Var.d1());
                com.p314xaae8f345.mm.ui.p2690x38b72420.p2691xbb979bf4.C22342xca74f598 c22342xca74f598 = this.f500541f;
                int i17 = this.f500540e;
                if (M) {
                    if (contextMenu != null) {
                        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                        android.app.Activity mo7438x76847179 = c22342xca74f598.mo7438x76847179();
                        java.lang.String g27 = z3Var.g2();
                        ((ke0.e) xVar).getClass();
                        contextMenu.setHeaderTitle(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(mo7438x76847179, g27));
                    }
                    if (contextMenu != null) {
                        contextMenu.add(i17, 2, 0, com.p314xaae8f345.mm.R.C30867xcad56011.f571427eq);
                        return;
                    }
                    return;
                }
                if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.z4(z3Var.d1()) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.R3(z3Var.d1())) {
                    return;
                }
                if (contextMenu != null) {
                    le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                    android.app.Activity mo7438x768471792 = c22342xca74f598.mo7438x76847179();
                    java.lang.String g28 = z3Var.g2();
                    ((ke0.e) xVar2).getClass();
                    contextMenu.setHeaderTitle(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(mo7438x768471792, g28));
                }
                if (z3Var.r2() && z3Var.F0() != 1 && contextMenu != null) {
                    contextMenu.add(i17, 7, 0, com.p314xaae8f345.mm.R.C30867xcad56011.bf9);
                }
                if (bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20263xdc7abfaf()) != 1 || contextMenu == null) {
                    return;
                }
                contextMenu.add(i17, 8, 0, "Debug");
            }
        }
    }
}
