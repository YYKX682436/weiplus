package g63;

/* loaded from: classes8.dex */
public final class n implements g63.d, android.view.View.OnCreateContextMenuListener, db5.t4, android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.a f350676d;

    /* renamed from: e, reason: collision with root package name */
    public z53.i f350677e;

    /* renamed from: f, reason: collision with root package name */
    public int f350678f;

    /* renamed from: g, reason: collision with root package name */
    public int f350679g;

    public n(yz5.a callBack) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callBack, "callBack");
        this.f350676d = callBack;
    }

    public void a(android.view.View view, int i17, z53.i conv, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(conv, "conv");
        this.f350677e = conv;
        this.f350678f = i17;
        this.f350679g = i18;
        rl5.r rVar = new rl5.r(view.getContext());
        rVar.L = this;
        int i19 = com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583.f295044d;
        rVar.g(view, i17, 0L, this, this, com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583.f295044d, com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583.f295045e);
        rVar.m();
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu menu, android.view.View v17, android.view.ContextMenu.ContextMenuInfo menuInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuInfo, "menuInfo");
        z53.i iVar = this.f350677e;
        if ((iVar != null ? java.lang.Boolean.valueOf(iVar.u0()) : null) != null) {
            z53.i iVar2 = this.f350677e;
            if (iVar2 != null && iVar2.u0()) {
                menu.add(0, 3, 0, com.p314xaae8f345.mm.R.C30867xcad56011.bl9);
                return;
            }
        }
        z53.i iVar3 = this.f350677e;
        if (iVar3 != null && iVar3.f67671xa35b5abb == 0) {
            menu.add(0, 1, 0, com.p314xaae8f345.mm.R.C30867xcad56011.bla);
        } else {
            menu.add(0, 0, 0, com.p314xaae8f345.mm.R.C30867xcad56011.bl_);
        }
        menu.add(0, 3, 0, com.p314xaae8f345.mm.R.C30867xcad56011.bl9);
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f350677e = null;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuItem, "menuItem");
        java.lang.Object[] objArr = new java.lang.Object[2];
        boolean z18 = false;
        objArr[0] = java.lang.Integer.valueOf(menuItem.getItemId());
        z53.i iVar = this.f350677e;
        objArr[1] = iVar != null ? iVar.f67669xbed8694c : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameLife.ConversationOnLongClickListener", "menuItem.itemId:%d,sessionId:%s", objArr);
        z53.i iVar2 = this.f350677e;
        if (iVar2 != null) {
            int itemId = menuItem.getItemId();
            yz5.a aVar = this.f350676d;
            if (itemId == 0) {
                z53.t Ui = ((t53.m0) i95.n0.c(t53.m0.class)).Ui();
                java.lang.String field_sessionId = iVar2.f67669xbed8694c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_sessionId, "field_sessionId");
                if (Ui.y0(field_sessionId)) {
                    if (aVar != null) {
                        return;
                    }
                    return;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("GameLife.ConversationOnLongClickListener", "clearUnreadCount failed. sessionId=" + iVar2.f67669xbed8694c);
                    return;
                }
            }
            if (itemId == 1) {
                z53.t Ui2 = ((t53.m0) i95.n0.c(t53.m0.class)).Ui();
                java.lang.String field_sessionId2 = iVar2.f67669xbed8694c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_sessionId2, "field_sessionId");
                if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.a4(field_sessionId2)) {
                    z17 = true;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameLife.PluginGameLife", "check sessionId failed");
                    z17 = false;
                }
                if (z17) {
                    z53.i z07 = Ui2.z0(field_sessionId2);
                    z07.f67671xa35b5abb = 1;
                    z18 = Ui2.m145258xce0038c9(z07.f72763xa3c65b86, z07, false);
                    Ui2.mo142179xf35bbb4("single", 5, z07);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameLife.ConversationStorage", "[addUnreadCount] ret=" + z18 + " sessionId=" + field_sessionId2);
                }
                if (z18) {
                    if (aVar != null) {
                        return;
                    }
                    return;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("GameLife.ConversationOnLongClickListener", "markUnread failed. sessionId=" + iVar2.f67669xbed8694c);
                    return;
                }
            }
            if (itemId != 3) {
                return;
            }
            boolean u07 = iVar2.u0();
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.d dVar = com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.e.f149727a;
            if (u07) {
                int i18 = this.f350678f + 1;
                int i19 = this.f350679g;
                java.lang.String field_sessionId3 = iVar2.f67669xbed8694c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_sessionId3, "field_sessionId");
                dVar.e(i18, 1L, i19, field_sessionId3, 0L, "", 0L, "", iVar2.t0(), e63.a.f331350a, (r35 & 1024) != 0 ? null : null);
            } else {
                y53.m Di = ((y53.x) ((u53.y) i95.n0.c(u53.y.class))).Di(iVar2.f67668x5568d387);
                if (Di != null) {
                    int i27 = this.f350678f + 1;
                    int i28 = this.f350679g;
                    java.lang.String field_sessionId4 = iVar2.f67669xbed8694c;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_sessionId4, "field_sessionId");
                    long j17 = Di.f67426x9f600742;
                    java.lang.String field_selfUserName = iVar2.f67668x5568d387;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_selfUserName, "field_selfUserName");
                    y53.m mVar = iVar2.F;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mVar);
                    long j18 = mVar.f67426x9f600742;
                    java.lang.String field_talker = iVar2.f67670x114ef53e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_talker, "field_talker");
                    dVar.e(i27, 92L, i28, field_sessionId4, j17, field_selfUserName, j18, field_talker, iVar2.t0(), e63.a.f331350a, (r35 & 1024) != 0 ? null : null);
                }
            }
            android.view.ContextMenu.ContextMenuInfo menuInfo = menuItem.getMenuInfo();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(menuInfo, "null cannot be cast to non-null type android.widget.AdapterView.AdapterContextMenuInfo");
            android.widget.AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (android.widget.AdapterView.AdapterContextMenuInfo) menuInfo;
            boolean Bi = ((z53.q) ((u53.a0) i95.n0.c(u53.a0.class))).Bi(iVar2.f67669xbed8694c);
            if (!Bi) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("GameLife.ConversationOnLongClickListener", "longclick delete conversation fail");
            } else if (iVar2.u0()) {
                pq5.h.a().i(g63.m.f350674a).B();
            } else {
                pq5.h.a().i(new g63.l(iVar2, Bi, adapterContextMenuInfo)).B();
            }
        }
    }
}
