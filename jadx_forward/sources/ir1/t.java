package ir1;

/* loaded from: classes11.dex */
public final class t implements ir1.w, android.view.View.OnCreateContextMenuListener, db5.t4, android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final int f375580d;

    /* renamed from: e, reason: collision with root package name */
    public hr1.e f375581e;

    public t(int i17) {
        this.f375580d = i17;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu menu, android.view.View v17, android.view.ContextMenu.ContextMenuInfo menuInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuInfo, "menuInfo");
        hr1.e eVar = this.f375581e;
        java.lang.String str = eVar != null ? eVar.f66326xbed8694c : null;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "bizfansnofiticationholder@bizfansmsg") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "bizphotofansnofiticationholder@picfansmsg")) {
            return;
        }
        boolean z17 = true;
        if ((str == null || str.length() == 0) || (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "bizfansgreetholder@bizfansmsg") && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "bizphotofansgreetholder@picfansmsg"))) {
            z17 = false;
        }
        if (z17) {
            return;
        }
        menu.add(0, 2, 0, com.p314xaae8f345.mm.R.C30867xcad56011.f571900t0);
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f375581e = null;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuItem, "menuItem");
        hr1.e eVar = this.f375581e;
        if (eVar == null || menuItem.getItemId() != 2) {
            return;
        }
        jr1.i iVar = jr1.i.f382893a;
        int i18 = this.f375580d;
        if (i18 == 5) {
            if (yq1.u0.Vi().mo60485xc9e4dcd4(eVar.f72763xa3c65b86, false)) {
                nr1.k Zi = yq1.u0.Zi();
                java.lang.String field_sessionId = eVar.f66326xbed8694c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_sessionId, "field_sessionId");
                Zi.y0(field_sessionId, false);
                yq1.u0.Vi().mo142179xf35bbb4(eVar.f66326xbed8694c, 6, eVar);
                nr1.b Ui = yq1.u0.Ui();
                hr1.a aVar = new hr1.a();
                aVar.f66213x996f7ca = eVar.f66326xbed8694c;
                Ui.mo9951xb06685ab(aVar, new java.lang.String[0]);
                java.lang.String field_talker = eVar.f66328x114ef53e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_talker, "field_talker");
                iVar.e(3, r26.n0.Z(field_talker, "@picfansmsg"), i18);
            }
        } else if (yq1.u0.Di().mo60485xc9e4dcd4(eVar.f72763xa3c65b86, false)) {
            hr1.o Ni = yq1.u0.Ni();
            java.lang.String field_sessionId2 = eVar.f66326xbed8694c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_sessionId2, "field_sessionId");
            Ni.getClass();
            hr1.m y07 = Ni.y0(field_sessionId2);
            Ni.f364894f.remove(field_sessionId2);
            Ni.f364893e.remove(y07.f66480x114ef53e + '_' + y07.f66478x1362f030);
            Ni.mo49766xb06685ab((l75.f0) y07, false, com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984);
            yq1.u0.Di().mo142179xf35bbb4(eVar.f66326xbed8694c, 6, eVar);
            hr1.c Bi = yq1.u0.Bi();
            hr1.a aVar2 = new hr1.a();
            aVar2.f66213x996f7ca = eVar.f66326xbed8694c;
            Bi.mo9951xb06685ab(aVar2, new java.lang.String[0]);
            java.lang.String field_talker2 = eVar.f66328x114ef53e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_talker2, "field_talker");
            iVar.e(3, r26.n0.Z(field_talker2, "@bizfansmsg"), i18);
        }
        c01.w9.h(eVar.f66326xbed8694c, new ir1.s());
    }
}
