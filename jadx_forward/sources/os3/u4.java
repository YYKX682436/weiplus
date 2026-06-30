package os3;

/* loaded from: classes8.dex */
public class u4 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ViewOnCreateContextMenuListenerC16941x4db497e1 f429752d;

    public u4(com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ViewOnCreateContextMenuListenerC16941x4db497e1 viewOnCreateContextMenuListenerC16941x4db497e1) {
        this.f429752d = viewOnCreateContextMenuListenerC16941x4db497e1;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ViewOnCreateContextMenuListenerC16941x4db497e1 viewOnCreateContextMenuListenerC16941x4db497e1 = this.f429752d;
        if (viewOnCreateContextMenuListenerC16941x4db497e1.f236460f == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ReadMailUI", "mailObject is null!");
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11288, 15);
        java.lang.String[] stringArray = viewOnCreateContextMenuListenerC16941x4db497e1.getResources().getStringArray(com.p314xaae8f345.mm.R.C30856x58c7259.f559543x);
        android.view.LayoutInflater.from(viewOnCreateContextMenuListenerC16941x4db497e1);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) viewOnCreateContextMenuListenerC16941x4db497e1, 1, false);
        db5.g4 g4Var = new db5.g4(viewOnCreateContextMenuListenerC16941x4db497e1);
        new db5.g4(viewOnCreateContextMenuListenerC16941x4db497e1);
        os3.p4 p4Var = new os3.p4(this, stringArray);
        os3.s4 s4Var = new os3.s4(this);
        k0Var.C = new os3.t4(this);
        g4Var.clear();
        db5.g4 g4Var2 = new db5.g4(viewOnCreateContextMenuListenerC16941x4db497e1);
        p4Var.mo887xc459429a(g4Var2);
        if (g4Var2.z()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMSubMenuHelper", "show, menu empty");
        } else {
            k0Var.f293405n = p4Var;
            k0Var.f293414s = s4Var;
            k0Var.f293387d = null;
            k0Var.G = null;
            k0Var.v();
        }
        return false;
    }
}
