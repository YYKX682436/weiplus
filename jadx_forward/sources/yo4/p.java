package yo4;

/* loaded from: classes5.dex */
public final class p extends yt3.a implements android.view.View.OnClickListener, bp4.b0, bp4.a0, bp4.c0 {

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f545811f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f545812g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ImageView f545813h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.ImageView f545814i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f545815m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f545816n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f545817o;

    /* renamed from: p, reason: collision with root package name */
    public final iu3.i f545818p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f545819q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a f545820r;

    /* renamed from: s, reason: collision with root package name */
    public final st3.k f545821s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f545822t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f545823u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f545824v;

    /* renamed from: w, reason: collision with root package name */
    public long f545825w;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.List f545826x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f545827y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(android.view.ViewGroup parent, ju3.d0 status, boolean z17) {
        super(status, null);
        java.lang.String str;
        android.view.View view;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f545811f = parent;
        this.f545812g = z17;
        android.view.View findViewById = parent.findViewById(com.p314xaae8f345.mm.R.id.d7_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById;
        this.f545813h = imageView;
        android.view.View findViewById2 = parent.findViewById(com.p314xaae8f345.mm.R.id.d7a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.widget.ImageView imageView2 = (android.widget.ImageView) findViewById2;
        this.f545814i = imageView2;
        android.view.View findViewById3 = parent.findViewById(com.p314xaae8f345.mm.R.id.d7b);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f545815m = findViewById3;
        this.f545816n = jz5.h.b(new yo4.i(this));
        android.content.Context context = parent.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        this.f545818p = new iu3.i(context);
        android.view.View findViewById4 = parent.findViewById(com.p314xaae8f345.mm.R.id.f568837o83);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f545819q = findViewById4;
        st3.k kVar = new st3.k();
        this.f545821s = kVar;
        this.f545822t = true;
        this.f545824v = true;
        this.f545825w = -1L;
        this.f545826x = new java.util.ArrayList();
        i95.m c17 = i95.n0.c(e42.e0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        boolean fj6 = ((h62.d) ((e42.e0) c17)).fj(e42.d0.clicfg_show_mediacomponent_audio, true);
        this.f545822t = fj6;
        E(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.f562462fm), null, null, -1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditAddMusicPlugin", "forceEnable " + fj6);
        imageView2.setImageDrawable(parent.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f80880xec2114a5));
        imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(parent.getContext(), com.p314xaae8f345.mm.R.raw.f79904x422938f7, -1));
        imageView.setOnClickListener(this);
        if (fj6) {
            A().mo68199x466a35c6(new yo4.d(status, this));
            A().mo68194x6c4ebec7(new yo4.e(status, this, (android.os.Bundle) ((jz5.n) kVar.f494085g).mo141623x754a37bb(), com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i0.f257147f));
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2003xde351112.InterfaceC17057x18e3a43c A = A();
            mv3.a aVar = A instanceof mv3.a ? (mv3.a) A : null;
            if (aVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EditAddMusicPlugin", "[setupMusicPickerChannels] audioPanel is not FinderMusicPickerDrawer, skip");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.AbstractC17059x115d0b14 d17 = aVar.d();
                com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2009xb4097826.p2011x373aa5.C17078xd80103da c17078xd80103da = d17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2009xb4097826.p2011x373aa5.C17078xd80103da ? (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2009xb4097826.p2011x373aa5.C17078xd80103da) d17 : null;
                if (c17078xd80103da == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EditAddMusicPlugin", "[setupMusicPickerChannels] contentView is not FinderMusicPickerComponentLayout, skip");
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditAddMusicPlugin", "[setupMusicPickerChannels] hook clip / volume channels onto pickerLayout=" + c17078xd80103da.hashCode());
                    c17078xd80103da.m68328x197106dd(yo4.j.f545771d);
                    c17078xd80103da.m68330xec0deb04(new yo4.k(this));
                    c17078xd80103da.m68329x62489705(new yo4.l(this));
                    yo4.m mVar = yo4.m.f545794d;
                    yo4.n nVar = new yo4.n(this);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.e0 e0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.e0) c17078xd80103da.b(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.e0.class);
                    if (e0Var != null) {
                        e0Var.A = mVar;
                        e0Var.B = nVar;
                        e0Var.C = null;
                        e0Var.D = 100;
                    }
                }
            }
            str = "MicroMsg.EditAddMusicPlugin";
            view = findViewById4;
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            str = "MicroMsg.EditAddMusicPlugin";
            view = findViewById4;
            yj0.a.d(findViewById3, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/MultiEditAddMusicPlugin", "<init>", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/recordvideo/plugin/parent/IRecordStatus;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/vlog/ui/MultiEditAddMusicPlugin", "<init>", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/recordvideo/plugin/parent/IRecordStatus;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        A().mo68178x928c0216(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.v0.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "get shouldShowSelectFinderVideoTooltip " + A());
        if (!A().mo68184xd58f138b()) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            android.view.View view2 = view;
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/vlog/ui/MultiEditAddMusicPlugin", "<init>", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/recordvideo/plugin/parent/IRecordStatus;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/vlog/ui/MultiEditAddMusicPlugin", "<init>", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/recordvideo/plugin/parent/IRecordStatus;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        android.view.View view3 = view;
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/vlog/ui/MultiEditAddMusicPlugin", "<init>", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/recordvideo/plugin/parent/IRecordStatus;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/vlog/ui/MultiEditAddMusicPlugin", "<init>", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/recordvideo/plugin/parent/IRecordStatus;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.postDelayed(new yo4.f(this), 5000L);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void K(yo4.p r21, ct0.b r22, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 r23, boolean r24, boolean r25, boolean r26, int r27, java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yo4.p.K(yo4.p, ct0.b, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider, boolean, boolean, boolean, int, java.lang.Object):void");
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2003xde351112.InterfaceC17057x18e3a43c A() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2003xde351112.InterfaceC17057x18e3a43c) this.f545816n.mo141623x754a37bb();
    }

    public final boolean B() {
        return A().getMuteOrigin();
    }

    public final void C() {
        A().mo68204x3720c068(false);
    }

    public final void D() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditAddMusicPlugin", "pauseMusic");
        this.f545818p.a();
        java.util.Iterator it = this.f545826x.iterator();
        if (it.hasNext()) {
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it.next());
            throw null;
        }
    }

    public final void E(java.lang.Integer num, java.lang.Integer num2, java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2003xde351112.InterfaceC17057x18e3a43c.m68299x335e6d3f(A(), num, num2, str, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.f563675b40), null, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f80881x4db40400), null, null, null, null, null, null, null, true, 8144, null);
        if (i17 != -1) {
            this.f545814i.setImageDrawable(this.f545811f.getContext().getResources().getDrawable(i17));
        }
    }

    public final void F() {
        this.f545818p.f(0L);
        java.util.Iterator it = this.f545826x.iterator();
        if (it.hasNext()) {
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it.next());
            throw null;
        }
    }

    public final void G() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("resumeMusic soundTrackType=");
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a = this.f545820r;
        sb6.append(c16997xb0aa383a != null ? java.lang.Integer.valueOf(c16997xb0aa383a.f237252p) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditAddMusicPlugin", sb6.toString());
        if (this.f545820r == null) {
            return;
        }
        this.f545818p.e();
        java.util.Iterator it = this.f545826x.iterator();
        if (it.hasNext()) {
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it.next());
            throw null;
        }
    }

    public final void H(long j17) {
        this.f545818p.f(j17);
        java.util.Iterator it = this.f545826x.iterator();
        if (it.hasNext()) {
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it.next());
            throw null;
        }
    }

    public final void I(java.lang.String editId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(editId, "editId");
        android.os.Bundle bundle = (android.os.Bundle) ((jz5.n) this.f545821s.f494085g).mo141623x754a37bb();
        if (bundle != null) {
            bundle.putString("KEY_EDIT_ID", editId);
        }
    }

    public final void J(java.util.List audioList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(audioList, "audioList");
        A().mo68195x60eb836b(audioList);
    }

    public final void L() {
        if (!A().mo68187xb9a8b747()) {
            oo4.d.f428730a.h(25496, (android.os.Bundle) ((jz5.n) this.f545821s.f494085g).mo141623x754a37bb());
        }
        A().mo68201x76500a7f(true);
    }

    public final void M(java.lang.String str) {
        if (this.f545812g) {
            android.widget.TextView textView = this.f545817o;
            android.view.ViewGroup viewGroup = this.f545811f;
            if (textView == null) {
                android.view.View findViewById = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f567583k03);
                if (findViewById != null) {
                    findViewById.setOnClickListener(new yo4.o(this));
                }
                if (findViewById != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/MultiEditAddMusicPlugin", "updateMusicTipsBar", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/vlog/ui/MultiEditAddMusicPlugin", "updateMusicTipsBar", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                this.f545817o = findViewById != null ? (android.widget.TextView) findViewById.findViewById(com.p314xaae8f345.mm.R.id.jzj) : null;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "")) {
                str = i65.a.r(viewGroup.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.lfc);
            }
            android.widget.TextView textView2 = this.f545817o;
            if (textView2 != null) {
                textView2.setText(str);
            }
            android.widget.TextView textView3 = this.f545817o;
            if (textView3 != null) {
                textView3.requestFocus();
            }
        }
    }

    @Override // bp4.b0
    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 h1Var, long j17, boolean z17) {
    }

    @Override // bp4.a0
    public void c(long j17) {
    }

    @Override // bp4.c0
    public void h(long j17, java.lang.Object obj) {
        H(j17);
    }

    @Override // bp4.a0
    public void n(bp4.c0 c0Var) {
    }

    @Override // yt3.r2
    /* renamed from: onBackPress */
    public boolean mo9064x4ceae47d() {
        if (A().mo68190x4ceae47d()) {
            return true;
        }
        A().mo68191x6761d4f();
        wt3.u uVar = wt3.v.f531037h;
        wt3.v vVar = wt3.v.f531038i;
        if (vVar == null) {
            return false;
        }
        vVar.a();
        return false;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/vlog/ui/MultiEditAddMusicPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f545824v) {
            this.f545827y = this.f545819q.getVisibility() == 0;
            android.view.View view2 = this.f545819q;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/vlog/ui/MultiEditAddMusicPlugin", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/vlog/ui/MultiEditAddMusicPlugin", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            L();
            nu3.i iVar = nu3.i.f421751a;
            nu3.i.c(iVar, "KEY_CLICK_MUSIC_COUNT_INT", 0, 2, null);
            iVar.b(6);
            iVar.d(5);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/MultiEditAddMusicPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // yt3.r2
    /* renamed from: onDetach */
    public void mo10989x3f5eee52() {
        mo11000xb01dfb57();
    }

    @Override // bp4.a0
    /* renamed from: onFinish */
    public void mo10982x42fe6352() {
    }

    @Override // yt3.r2
    /* renamed from: onPause */
    public void mo11000xb01dfb57() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditAddMusicPlugin", "pauseAudio");
        D();
    }

    @Override // yt3.r2
    /* renamed from: onRequestPermissionsResult */
    public void mo61366x953457f1(int i17, java.lang.String[] permissions, int[] grantResults) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permissions, "permissions");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(grantResults, "grantResults");
        super.mo61366x953457f1(i17, permissions, grantResults);
    }

    @Override // yt3.r2
    /* renamed from: onResume */
    public void mo11001x57429eec() {
        if (this.f545823u || !A().getWithMusic()) {
            return;
        }
        G();
    }

    @Override // bp4.c0
    /* renamed from: pause */
    public void mo10983x65825f6() {
    }

    @Override // yt3.r2
    /* renamed from: release */
    public void mo9065x41012807() {
        mo9066x6761d4f();
        this.f545820r = null;
        this.f545818p.d();
        A().mo68177x5cd39ffa();
    }

    @Override // yt3.r2
    /* renamed from: reset */
    public void mo9066x6761d4f() {
        this.f545814i.setVisibility(8);
        this.f545820r = null;
        iu3.i iVar = this.f545818p;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(iVar.f376540b, "reset music");
        kk4.v vVar = iVar.f376541c;
        if (vVar != null) {
            vVar.mo143591x360802();
        }
        kk4.v vVar2 = iVar.f376541c;
        if (vVar2 != null) {
            vVar2.mo143590x408b7293();
        }
        iVar.f376541c = null;
    }

    @Override // bp4.c0
    /* renamed from: resume */
    public void mo10984xc84dc82d() {
    }

    @Override // yt3.r2
    /* renamed from: setVisibility */
    public void mo9067x901b6914(int i17) {
        if (this.f545822t) {
            android.view.View view = this.f545815m;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/MultiEditAddMusicPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/vlog/ui/MultiEditAddMusicPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final void z() {
        st3.k kVar = this.f545821s;
        if (kVar.f494084f == st3.v.f494138d && kVar.f494083e) {
            L();
        }
    }
}
