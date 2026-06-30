package qb2;

/* loaded from: classes10.dex */
public final class l0 implements qb2.v, android.view.View.OnCreateContextMenuListener, db5.t4, android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.a f442766d;

    /* renamed from: e, reason: collision with root package name */
    public qb2.t f442767e;

    public l0(yz5.a callBack) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callBack, "callBack");
        this.f442766d = callBack;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu menu, android.view.View v17, android.view.ContextMenu.ContextMenuInfo menuInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuInfo, "menuInfo");
        qb2.t tVar = this.f442767e;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tVar != null ? tVar.f65866xbed8694c : null, "findersayhisessionholder")) {
            qb2.t tVar2 = this.f442767e;
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tVar2 != null ? tVar2.f65866xbed8694c : null, "finder_system_message")) {
                qb2.t tVar3 = this.f442767e;
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tVar3 != null ? tVar3.f65866xbed8694c : null, "finderaliassessionholder")) {
                    menu.add(0, 2, 0, com.p314xaae8f345.mm.R.C30867xcad56011.f571900t0);
                }
            }
        }
        qb2.t tVar4 = this.f442767e;
        java.lang.String str = tVar4 != null ? tVar4.f65864x1362f030 : null;
        if (str == null) {
            str = "";
        }
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.T3(str)) {
            qb2.t tVar5 = this.f442767e;
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tVar5 != null ? tVar5.f65866xbed8694c : null, "finderaliassessionholder")) {
                return;
            }
        }
        menu.add(0, 4, 0, com.p314xaae8f345.mm.R.C30867xcad56011.gq8);
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f442767e = null;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuItem, "menuItem");
        qb2.t tVar = this.f442767e;
        if (tVar != null) {
            int itemId = menuItem.getItemId();
            if (itemId != 2) {
                if (itemId != 4) {
                    return;
                }
                ((c61.l7) i95.n0.c(c61.l7.class)).Kj().mo60485xc9e4dcd4(tVar.f72763xa3c65b86, false);
                ((c61.l7) i95.n0.c(c61.l7.class)).Kj().mo142179xf35bbb4(tVar.f65866xbed8694c, 6, tVar);
                return;
            }
            android.view.ContextMenu.ContextMenuInfo menuInfo = menuItem.getMenuInfo();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(menuInfo, "null cannot be cast to non-null type android.widget.AdapterView.AdapterContextMenuInfo");
            android.widget.AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (android.widget.AdapterView.AdapterContextMenuInfo) menuInfo;
            java.lang.String str = tVar.f65863x13644c0a == 3 ? tVar.f65864x1362f030 : "";
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            java.lang.String field_sessionId = tVar.f65866xbed8694c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_sessionId, "field_sessionId");
            new db2.g(str, field_sessionId).l().K(new qb2.k0(tVar, this, adapterContextMenuInfo));
        }
    }
}
