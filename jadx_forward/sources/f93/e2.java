package f93;

/* loaded from: classes11.dex */
public class e2 implements k93.a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f341859a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16169x37a19e8d f341860b;

    public e2(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16169x37a19e8d viewOnCreateContextMenuListenerC16169x37a19e8d) {
        this.f341860b = viewOnCreateContextMenuListenerC16169x37a19e8d;
    }

    @Override // k93.a
    public void a() {
        k93.j jVar = this.f341860b.A;
        if (jVar.f387438t != jVar.f387437s) {
            jVar.f387436r++;
        }
        jVar.f387438t = -1;
        jVar.f387437s = -1;
        this.f341859a = false;
    }

    @Override // k93.a
    public void b(int i17) {
    }

    @Override // k93.a
    /* renamed from: onItemSelected */
    public void mo129212xe1bd9a4d(int i17) {
        this.f341860b.A.f387438t = i17;
        if (!this.f341859a) {
            com.p314xaae8f345.mm.ui.jk.a();
        }
        this.f341859a = true;
    }

    @Override // k93.a
    /* renamed from: onMove */
    public boolean mo129213xc39cb650(int i17, int i18) {
        java.util.ArrayList arrayList;
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16169x37a19e8d viewOnCreateContextMenuListenerC16169x37a19e8d = this.f341860b;
        k93.j jVar = viewOnCreateContextMenuListenerC16169x37a19e8d.A;
        jVar.f387437s = i18;
        if (i18 == 0 || (arrayList = jVar.f387426e) == null) {
            return false;
        }
        if (jVar.f387425d) {
            java.util.Collections.swap(arrayList, i17, i18);
            viewOnCreateContextMenuListenerC16169x37a19e8d.A.m8150x87567217(i17, i18);
            return true;
        }
        if (!viewOnCreateContextMenuListenerC16169x37a19e8d.I) {
            viewOnCreateContextMenuListenerC16169x37a19e8d.I = true;
            java.lang.String string = viewOnCreateContextMenuListenerC16169x37a19e8d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.g9y);
            f93.d2 d2Var = new f93.d2(this);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = viewOnCreateContextMenuListenerC16169x37a19e8d.S;
            if (j0Var == null || !j0Var.isShowing()) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(viewOnCreateContextMenuListenerC16169x37a19e8d);
                u1Var.g(string);
                u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi);
                u1Var.l(new f93.f2(viewOnCreateContextMenuListenerC16169x37a19e8d, d2Var));
                viewOnCreateContextMenuListenerC16169x37a19e8d.S = u1Var.f293531c;
                u1Var.q(false);
            }
        }
        return true;
    }
}
