package f93;

/* loaded from: classes11.dex */
public class o3 implements k93.a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f341946a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16171x51fc9384 f341947b;

    public o3(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16171x51fc9384 viewOnCreateContextMenuListenerC16171x51fc9384) {
        this.f341947b = viewOnCreateContextMenuListenerC16171x51fc9384;
    }

    @Override // k93.a
    public void a() {
        k93.j jVar = this.f341947b.E;
        if (jVar.f387438t != jVar.f387437s) {
            jVar.f387436r++;
        }
        jVar.f387438t = -1;
        jVar.f387437s = -1;
        this.f341946a = false;
    }

    @Override // k93.a
    public void b(int i17) {
    }

    @Override // k93.a
    /* renamed from: onItemSelected */
    public void mo129212xe1bd9a4d(int i17) {
        this.f341947b.E.f387438t = i17;
        if (!this.f341946a) {
            com.p314xaae8f345.mm.ui.jk.a();
        }
        this.f341946a = true;
    }

    @Override // k93.a
    /* renamed from: onMove */
    public boolean mo129213xc39cb650(int i17, int i18) {
        java.util.ArrayList arrayList;
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16171x51fc9384 viewOnCreateContextMenuListenerC16171x51fc9384 = this.f341947b;
        k93.j jVar = viewOnCreateContextMenuListenerC16171x51fc9384.E;
        jVar.f387437s = i18;
        if (i18 == 0 || (arrayList = jVar.f387426e) == null) {
            return false;
        }
        if (jVar.f387425d) {
            java.util.Collections.swap(arrayList, i17, i18);
            viewOnCreateContextMenuListenerC16171x51fc9384.E.m8150x87567217(i17, i18);
            return true;
        }
        if (!viewOnCreateContextMenuListenerC16171x51fc9384.T) {
            viewOnCreateContextMenuListenerC16171x51fc9384.T = true;
            java.lang.String string = viewOnCreateContextMenuListenerC16171x51fc9384.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.g9y);
            f93.l3 l3Var = new f93.l3(this);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = viewOnCreateContextMenuListenerC16171x51fc9384.f224825x0;
            if (j0Var == null || !j0Var.isShowing()) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(viewOnCreateContextMenuListenerC16171x51fc9384);
                u1Var.g(string);
                u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi);
                u1Var.l(new f93.p3(viewOnCreateContextMenuListenerC16171x51fc9384, l3Var));
                viewOnCreateContextMenuListenerC16171x51fc9384.f224825x0 = u1Var.f293531c;
                u1Var.q(false);
            }
        }
        return true;
    }
}
