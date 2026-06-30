package bl2;

/* loaded from: classes3.dex */
public final class k extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g {

    /* renamed from: h, reason: collision with root package name */
    public r45.d22 f103250h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jj0 f103251i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f103252m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18734x8eb4224a f103253n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.LinearLayout f103254o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(android.content.Context context, r45.d22 d22Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jj0 musicPlugin) {
        super(context, context.getResources().getConfiguration().orientation == 2, zl2.u4.f555521d, false, 8, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicPlugin, "musicPlugin");
        this.f103250h = d22Var;
        this.f103251i = musicPlugin;
        this.f103252m = "Finder.FinderLiveMusicInfoPanel";
    }

    public static final void y(bl2.k kVar, int i17, boolean z17, java.lang.String str) {
        kVar.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        jSONObject.put("listen_source_type", z17 ? 1 : 2);
        jSONObject.put("base_listenid", str);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, ml2.b4.f408755d2, t17, 0L, null, null, null, null, null, 252, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int j() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dhy;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int n() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void p(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        android.widget.TextView textView = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.qgw);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
        com.p314xaae8f345.mm.ui.fk.a(textView);
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.qga);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f103253n = (com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18734x8eb4224a) findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.p314xaae8f345.mm.R.id.f567193qg2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f103254o = (android.widget.LinearLayout) findViewById2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public boolean r() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void s() {
        a();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void t() {
        super.t();
        a();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void w() {
        super.w();
        z();
    }

    public final void z() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f103252m, "fillMusicPanel musicInfo:" + this.f103250h);
        r45.d22 d22Var = this.f103250h;
        if (d22Var != null) {
            ((if0.w) ((ff0.q) i95.n0.c(ff0.q.class))).getClass();
            r45.zs4 zs4Var = new r45.zs4();
            zs4Var.f473882d = d22Var.m75945x2fec8307(1);
            zs4Var.f473883e = d22Var.m75945x2fec8307(2) + "  " + no0.m.f420263a.b(d22Var.m75939xb282bd08(12), ":");
            zs4Var.f473887i = true;
            zs4Var.f473889n = false;
            zs4Var.f473884f = d22Var.m75945x2fec8307(4);
            zs4Var.f473888m = true;
            zs4Var.f473892q = true;
            zs4Var.f473893r = com.p314xaae8f345.mm.R.raw.f79261xd0dbc349;
            zs4Var.f473894s = com.p314xaae8f345.mm.R.C30859x5a72f63.abx;
            com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18734x8eb4224a c18734x8eb4224a = this.f103253n;
            if (c18734x8eb4224a == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("musicView");
                throw null;
            }
            c18734x8eb4224a.c(zs4Var);
            com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18734x8eb4224a c18734x8eb4224a2 = this.f103253n;
            if (c18734x8eb4224a2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("musicView");
                throw null;
            }
            c18734x8eb4224a2.setOnClickListener(new bl2.i(d22Var, this));
        }
        r45.d22 d22Var2 = this.f103250h;
        if (!(d22Var2 != null && dk2.q.b(d22Var2))) {
            android.widget.LinearLayout linearLayout = this.f103254o;
            if (linearLayout == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("llQQMusicView");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(linearLayout, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/view/FinderLiveMusicInfoPanel", "fillMusicPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            linearLayout.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(linearLayout, "com/tencent/mm/plugin/finder/live/plugin/view/FinderLiveMusicInfoPanel", "fillMusicPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.widget.LinearLayout linearLayout2 = this.f103254o;
        if (linearLayout2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("llQQMusicView");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(linearLayout2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/view/FinderLiveMusicInfoPanel", "fillMusicPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        linearLayout2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(linearLayout2, "com/tencent/mm/plugin/finder/live/plugin/view/FinderLiveMusicInfoPanel", "fillMusicPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.LinearLayout linearLayout3 = this.f103254o;
        if (linearLayout3 != null) {
            linearLayout3.setOnClickListener(new bl2.j(this));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("llQQMusicView");
            throw null;
        }
    }
}
