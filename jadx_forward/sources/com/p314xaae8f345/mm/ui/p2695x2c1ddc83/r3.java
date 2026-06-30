package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class r3 implements android.widget.AdapterView.OnItemLongClickListener, android.view.View.OnCreateContextMenuListener, android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final yf5.j0 f289570d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ListView f289571e;

    /* renamed from: f, reason: collision with root package name */
    public final android.app.Activity f289572f;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f289575i;

    /* renamed from: m, reason: collision with root package name */
    public int f289576m;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f289573g = "";

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.l4 f289574h = null;

    /* renamed from: n, reason: collision with root package name */
    public final db5.t4 f289577n = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p3(this);

    public r3(yf5.j0 j0Var, android.widget.ListView listView, android.app.Activity activity, int[] iArr) {
        this.f289575i = new int[2];
        this.f289570d = j0Var;
        this.f289571e = listView;
        this.f289572f = activity;
        this.f289575i = iArr;
    }

    public static void a(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.r3 r3Var, java.lang.String str) {
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.L3(r3Var.f289573g)) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("view_id", str);
            hashMap.put("chat_name", r3Var.f289573g);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", hashMap, 34004);
        }
    }

    public static void b(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.r3 r3Var, boolean z17) {
        r3Var.getClass();
        long i17 = c01.z1.i();
        long j17 = z17 ? i17 | 8192 : i17 & (-8193);
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EXT_STATUS2_LONG_SYNC, java.lang.Long.valueOf(j17));
        bn0.g.f104312a.g("USERINFO_EXT_STATUS2_LONG_SYNC", j17);
        int i18 = z17 ? 1 : 2;
        r45.p53 p53Var = new r45.p53();
        p53Var.f464294d = 82;
        p53Var.f464295e = i18;
        ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationLongClickListener", "switch ext change : TXNEWS isTop open = " + z17 + " item value = " + p53Var.f464295e + " functionId = " + p53Var.f464294d);
    }

    public static void c(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.r3 r3Var, boolean z17) {
        r3Var.getClass();
        long i17 = c01.z1.i();
        long j17 = z17 ? i17 | 262144 : i17 & (-262145);
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EXT_STATUS2_LONG_SYNC, java.lang.Long.valueOf(j17));
        bn0.g.f104312a.g("USERINFO_EXT_STATUS2_LONG_SYNC", j17);
        int i18 = z17 ? 1 : 2;
        r45.p53 p53Var = new r45.p53();
        p53Var.f464294d = 84;
        p53Var.f464295e = i18;
        ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationLongClickListener", "switch ext change : isTop open = " + z17 + " item value = " + p53Var.f464295e + " functionId = " + p53Var.f464294d);
    }

    public final void d(int i17) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6664x332c394 c6664x332c394 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6664x332c394();
        c6664x332c394.f140084d = i17;
        c6664x332c394.f140085e = c6664x332c394.b("SessionName", this.f289573g, true);
        c6664x332c394.f140086f = this.f289574h.d1();
        c6664x332c394.f140087g = c01.h2.b(this.f289573g);
        if (i17 == 13 || i17 == 14) {
            c6664x332c394.f140088h = gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CONVERSATION_DISMISS_INTRO_BOOLEAN_SYNC, true) ? 1L : 2L;
        }
        c6664x332c394.k();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View.OnCreateContextMenuListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreateContextMenu(android.view.ContextMenu r9, android.view.View r10, android.view.ContextMenu.ContextMenuInfo r11) {
        /*
            Method dump skipped, instructions count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2695x2c1ddc83.r3.onCreateContextMenu(android.view.ContextMenu, android.view.View, android.view.ContextMenu$ContextMenuInfo):void");
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        yf5.w0 w0Var = (yf5.w0) this.f289570d;
        w0Var.A = false;
        w0Var.notifyDataSetChanged();
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        android.widget.ListView listView = this.f289571e;
        if (i17 < listView.getHeaderViewsCount()) {
            return true;
        }
        this.f289576m = i17 - listView.getHeaderViewsCount();
        int headerViewsCount = i17 - listView.getHeaderViewsCount();
        yf5.j0 j0Var = this.f289570d;
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 item = ((yf5.w0) j0Var).getItem(headerViewsCount);
        this.f289574h = item;
        if (item == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ConversationLongClickListener", "headercount:%d, postion:%d", java.lang.Integer.valueOf(listView.getHeaderViewsCount()), java.lang.Integer.valueOf(i17));
            return true;
        }
        if (view.getTag() instanceof yf5.n) {
            yf5.n nVar = (yf5.n) view.getTag();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationLongClickListener", "[onItemLongClick] position:%s [%s,%s]", java.lang.Integer.valueOf(i17), this.f289574h.h1(), nVar.f543459m);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(nVar.f543459m) && !java.util.Objects.equals(this.f289574h.h1(), nVar.f543459m)) {
                com.p314xaae8f345.mm.p2621x8fb0427b.l4 h17 = ((yf5.w0) j0Var).h(nVar.f543459m);
                if (h17 != null) {
                    this.f289574h = h17;
                }
            }
        }
        java.lang.String h18 = this.f289574h.h1();
        this.f289573g = h18;
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.X3(h18)) {
            return true;
        }
        rl5.r rVar = new rl5.r(this.f289572f);
        db5.t4 t4Var = this.f289577n;
        int[] iArr = this.f289575i;
        rVar.g(view, i17, j17, this, t4Var, iArr[0], iArr[1]);
        rVar.L = this;
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(this.f289573g)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14553, 1, 0, this.f289573g);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14553, 0, 0, this.f289573g);
        }
        d(100);
        if (com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c.C4966x1d004c03.f21354x4fbc8495.m42840x2061f65d()) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21526xca364659 c21526xca364659 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21526xca364659) view.findViewById(com.p314xaae8f345.mm.R.id.kbq);
            c21526xca364659.announceForAccessibility(c21526xca364659.m79231xfb85ada3());
        }
        return true;
    }
}
