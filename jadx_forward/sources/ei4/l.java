package ei4;

/* loaded from: classes11.dex */
public final class l implements yz5.q, android.view.View.OnCreateContextMenuListener, db5.t4, android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2265x2c1ddc83.ui.C18595x38eba632 f334758d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.a f334759e;

    /* renamed from: f, reason: collision with root package name */
    public hi4.a f334760f;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2265x2c1ddc83.ui.C18595x38eba632 fragment, yz5.a aVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        aVar = (i17 & 2) != 0 ? null : aVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f334758d = fragment;
        this.f334759e = aVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        android.view.View view = (android.view.View) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        hi4.a conv = (hi4.a) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(conv, "conv");
        this.f334760f = conv;
        rl5.r rVar = new rl5.r(view.getContext());
        rVar.L = this;
        rVar.g(view, intValue, 0L, this, this, com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583.f295044d, com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583.f295045e);
        rVar.m();
        hi4.k kVar = hi4.m.f363088f;
        java.lang.String field_sessionId = conv.f76582xbed8694c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_sessionId, "field_sessionId");
        kVar.d(field_sessionId, 54);
        return jz5.f0.f384359a;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu menu, android.view.View v17, android.view.ContextMenu.ContextMenuInfo menuInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuInfo, "menuInfo");
        hi4.a aVar = this.f334760f;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(aVar != null ? aVar.f76582xbed8694c : null, "textstatussayhisessionholder")) {
            return;
        }
        menu.add(0, 2, 0, com.p314xaae8f345.mm.R.C30867xcad56011.gqi);
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f334760f = null;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuItem, "menuItem");
        hi4.a aVar = this.f334760f;
        if (aVar == null || menuItem.getItemId() != 2) {
            return;
        }
        android.view.ContextMenu.ContextMenuInfo menuInfo = menuItem.getMenuInfo();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(menuInfo, "null cannot be cast to non-null type android.widget.AdapterView.AdapterContextMenuInfo");
        android.widget.AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (android.widget.AdapterView.AdapterContextMenuInfo) menuInfo;
        ni4.x xVar = ni4.x.f419309d;
        boolean mo60485xc9e4dcd4 = xVar.h().mo60485xc9e4dcd4(aVar.f72763xa3c65b86, false);
        if (mo60485xc9e4dcd4) {
            li4.d m17 = xVar.m();
            java.lang.String field_sessionId = aVar.f76582xbed8694c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_sessionId, "field_sessionId");
            m17.getClass();
            hi4.n y07 = m17.y0(field_sessionId);
            m17.f400325f.remove(field_sessionId);
            m17.f400324e.remove(y07.f76632x114ef53e + '_' + y07.f76630x1362f030);
            android.os.SystemClock.uptimeMillis();
            m17.mo49766xb06685ab((l75.f0) y07, false, com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984);
            xVar.h().mo142179xf35bbb4(aVar.f76582xbed8694c, 6, aVar);
            yz5.a aVar2 = this.f334759e;
            if (aVar2 != null) {
                aVar2.mo152xb9724478();
            }
            p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = this.f334758d.mo7430x19263085();
            if (mo7430x19263085 != null) {
                xVar.o();
                pf5.z zVar = pf5.z.f435481a;
                if (!(mo7430x19263085 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.tf) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) mo7430x19263085).a(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.tf.class)).U6(1);
                hi4.k kVar = hi4.m.f363088f;
                java.lang.String field_sessionId2 = aVar.f76582xbed8694c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_sessionId2, "field_sessionId");
                kVar.d(field_sessionId2, 55);
            }
        }
        c01.w9.h(aVar.f76582xbed8694c, new ei4.k(mo60485xc9e4dcd4, adapterContextMenuInfo));
    }
}
