package ei4;

/* loaded from: classes11.dex */
public final class w implements yz5.q, android.view.View.OnCreateContextMenuListener, db5.t4, android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.a f334780d;

    /* renamed from: e, reason: collision with root package name */
    public hi4.e f334781e;

    public w(yz5.a aVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f334780d = (i17 & 1) != 0 ? null : aVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        android.view.View view = (android.view.View) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        hi4.e item = (hi4.e) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        this.f334781e = item;
        rl5.r rVar = new rl5.r(view.getContext());
        rVar.L = this;
        rVar.g(view, intValue, 0L, this, this, com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583.f295044d, com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583.f295045e);
        rVar.m();
        hi4.k kVar = hi4.m.f363088f;
        java.lang.String field_session_id = item.f76597x1c3513c9;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_session_id, "field_session_id");
        kVar.d(field_session_id, 106);
        return java.lang.Boolean.TRUE;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu menu, android.view.View v17, android.view.ContextMenu.ContextMenuInfo menuInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuInfo, "menuInfo");
        menu.add(0, 2, 0, com.p314xaae8f345.mm.R.C30867xcad56011.f571900t0);
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f334781e = null;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        yz5.a aVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuItem, "menuItem");
        hi4.e eVar = this.f334781e;
        if (eVar == null || menuItem.getItemId() != 2) {
            return;
        }
        hi4.k kVar = hi4.m.f363088f;
        java.lang.String field_session_id = eVar.f76597x1c3513c9;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_session_id, "field_session_id");
        kVar.d(field_session_id, 107);
        if (!ni4.x.f419309d.k().mo9951xb06685ab(eVar, new java.lang.String[0]) || (aVar = this.f334780d) == null) {
            return;
        }
    }
}
