package f93;

/* loaded from: classes11.dex */
public class a3 implements k93.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16171x51fc9384 f341822a;

    public a3(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16171x51fc9384 viewOnCreateContextMenuListenerC16171x51fc9384) {
        this.f341822a = viewOnCreateContextMenuListenerC16171x51fc9384;
    }

    @Override // k93.x
    public void T(android.view.View view, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16171x51fc9384 viewOnCreateContextMenuListenerC16171x51fc9384 = this.f341822a;
        if (viewOnCreateContextMenuListenerC16171x51fc9384.f224828z) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.d4 z17 = viewOnCreateContextMenuListenerC16171x51fc9384.E.z(i17);
        if (z17 == null || !z17.f66584x284d1882 || z17.f66585x70ce48ca != -1000000) {
            viewOnCreateContextMenuListenerC16171x51fc9384.U.g(view, i17, -1L, viewOnCreateContextMenuListenerC16171x51fc9384, viewOnCreateContextMenuListenerC16171x51fc9384, viewOnCreateContextMenuListenerC16171x51fc9384.V, viewOnCreateContextMenuListenerC16171x51fc9384.W);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelSelectUI", "onItemLongClick, is no lebal title item, position = " + i17);
    }

    @Override // k93.x
    public void U(android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16171x51fc9384 viewOnCreateContextMenuListenerC16171x51fc9384 = this.f341822a;
        viewOnCreateContextMenuListenerC16171x51fc9384.X = false;
        viewOnCreateContextMenuListenerC16171x51fc9384.startActivityForResult(intent, com.p314xaae8f345.p373xbe494963.C3727x6f6b8f94.f14514x4fe44208);
    }

    @Override // k93.x
    public void V(f93.d5 d5Var, int i17) {
        java.lang.Integer num;
        android.widget.CheckBox checkBox = d5Var.f341850h;
        if (checkBox != null) {
            checkBox.setChecked(!checkBox.isChecked());
            android.widget.CheckBox checkBox2 = d5Var.f341850h;
            boolean isChecked = checkBox2.isChecked();
            com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16171x51fc9384 viewOnCreateContextMenuListenerC16171x51fc9384 = this.f341822a;
            k93.j jVar = viewOnCreateContextMenuListenerC16171x51fc9384.E;
            if (jVar == null || i17 < 0) {
                return;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.d4 z17 = jVar.z(i17);
            if (isChecked && !viewOnCreateContextMenuListenerC16171x51fc9384.E.f387429h.isEmpty() && viewOnCreateContextMenuListenerC16171x51fc9384.E.f387429h.contains(java.lang.String.valueOf(z17.f66585x70ce48ca))) {
                checkBox2.setChecked(false);
                if (viewOnCreateContextMenuListenerC16171x51fc9384.H > 0) {
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = viewOnCreateContextMenuListenerC16171x51fc9384.mo55332x76847179();
                    int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(mo55332x76847179);
                    e4Var.d(viewOnCreateContextMenuListenerC16171x51fc9384.H);
                    e4Var.c();
                    return;
                }
                return;
            }
            if (!isChecked && !viewOnCreateContextMenuListenerC16171x51fc9384.E.f387428g.isEmpty() && viewOnCreateContextMenuListenerC16171x51fc9384.E.f387428g.contains(java.lang.String.valueOf(z17.f66585x70ce48ca))) {
                checkBox2.setChecked(true);
                if (viewOnCreateContextMenuListenerC16171x51fc9384.I > 0) {
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = viewOnCreateContextMenuListenerC16171x51fc9384.mo55332x76847179();
                    int i19 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(mo55332x768471792);
                    e4Var2.d(viewOnCreateContextMenuListenerC16171x51fc9384.I);
                    e4Var2.c();
                    return;
                }
                return;
            }
            k93.j jVar2 = viewOnCreateContextMenuListenerC16171x51fc9384.E;
            java.util.HashMap hashMap = jVar2.f387439u;
            if (!((hashMap == null || hashMap.isEmpty() || !jVar2.f387439u.containsKey(java.lang.Integer.valueOf(z17.f66585x70ce48ca)) || (num = (java.lang.Integer) jVar2.f387439u.get(java.lang.Integer.valueOf(z17.f66585x70ce48ca))) == null || num.intValue() > 0) ? false : true)) {
                if (isChecked) {
                    viewOnCreateContextMenuListenerC16171x51fc9384.c7(java.lang.String.valueOf(z17.f66585x70ce48ca));
                    return;
                } else {
                    viewOnCreateContextMenuListenerC16171x51fc9384.c(java.lang.String.valueOf(z17.f66585x70ce48ca), false, true);
                    return;
                }
            }
            checkBox2.setChecked(false);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(viewOnCreateContextMenuListenerC16171x51fc9384.mo55332x76847179());
            u1Var.g(viewOnCreateContextMenuListenerC16171x51fc9384.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ja8));
            u1Var.n(viewOnCreateContextMenuListenerC16171x51fc9384.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi));
            u1Var.q(false);
        }
    }
}
