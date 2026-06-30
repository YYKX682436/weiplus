package bl2;

/* loaded from: classes3.dex */
public final class k extends com.tencent.mm.plugin.finder.live.widget.g {

    /* renamed from: h, reason: collision with root package name */
    public r45.d22 f21717h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.jj0 f21718i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f21719m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.ting.widget.MusicView f21720n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.LinearLayout f21721o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(android.content.Context context, r45.d22 d22Var, com.tencent.mm.plugin.finder.live.plugin.jj0 musicPlugin) {
        super(context, context.getResources().getConfiguration().orientation == 2, zl2.u4.f473988d, false, 8, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(musicPlugin, "musicPlugin");
        this.f21717h = d22Var;
        this.f21718i = musicPlugin;
        this.f21719m = "Finder.FinderLiveMusicInfoPanel";
    }

    public static final void y(bl2.k kVar, int i17, boolean z17, java.lang.String str) {
        kVar.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        jSONObject.put("listen_source_type", z17 ? 1 : 2);
        jSONObject.put("base_listenid", str);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, ml2.b4.f327222d2, t17, 0L, null, null, null, null, null, 252, null);
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int j() {
        return com.tencent.mm.R.layout.dhy;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int n() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void p(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        android.widget.TextView textView = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.qgw);
        kotlin.jvm.internal.o.d(textView);
        com.tencent.mm.ui.fk.a(textView);
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.qga);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f21720n = (com.tencent.mm.plugin.ting.widget.MusicView) findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.f485660qg2);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f21721o = (android.widget.LinearLayout) findViewById2;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public boolean r() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void s() {
        a();
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void t() {
        super.t();
        a();
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void w() {
        super.w();
        z();
    }

    public final void z() {
        com.tencent.mars.xlog.Log.i(this.f21719m, "fillMusicPanel musicInfo:" + this.f21717h);
        r45.d22 d22Var = this.f21717h;
        if (d22Var != null) {
            ((if0.w) ((ff0.q) i95.n0.c(ff0.q.class))).getClass();
            r45.zs4 zs4Var = new r45.zs4();
            zs4Var.f392349d = d22Var.getString(1);
            zs4Var.f392350e = d22Var.getString(2) + "  " + no0.m.f338730a.b(d22Var.getInteger(12), ":");
            zs4Var.f392354i = true;
            zs4Var.f392356n = false;
            zs4Var.f392351f = d22Var.getString(4);
            zs4Var.f392355m = true;
            zs4Var.f392359q = true;
            zs4Var.f392360r = com.tencent.mm.R.raw.finder_live_music_info_arrow_right;
            zs4Var.f392361s = com.tencent.mm.R.color.abx;
            com.tencent.mm.plugin.ting.widget.MusicView musicView = this.f21720n;
            if (musicView == null) {
                kotlin.jvm.internal.o.o("musicView");
                throw null;
            }
            musicView.c(zs4Var);
            com.tencent.mm.plugin.ting.widget.MusicView musicView2 = this.f21720n;
            if (musicView2 == null) {
                kotlin.jvm.internal.o.o("musicView");
                throw null;
            }
            musicView2.setOnClickListener(new bl2.i(d22Var, this));
        }
        r45.d22 d22Var2 = this.f21717h;
        if (!(d22Var2 != null && dk2.q.b(d22Var2))) {
            android.widget.LinearLayout linearLayout = this.f21721o;
            if (linearLayout == null) {
                kotlin.jvm.internal.o.o("llQQMusicView");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(linearLayout, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/view/FinderLiveMusicInfoPanel", "fillMusicPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            linearLayout.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(linearLayout, "com/tencent/mm/plugin/finder/live/plugin/view/FinderLiveMusicInfoPanel", "fillMusicPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.widget.LinearLayout linearLayout2 = this.f21721o;
        if (linearLayout2 == null) {
            kotlin.jvm.internal.o.o("llQQMusicView");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(linearLayout2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/view/FinderLiveMusicInfoPanel", "fillMusicPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        linearLayout2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(linearLayout2, "com/tencent/mm/plugin/finder/live/plugin/view/FinderLiveMusicInfoPanel", "fillMusicPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.LinearLayout linearLayout3 = this.f21721o;
        if (linearLayout3 != null) {
            linearLayout3.setOnClickListener(new bl2.j(this));
        } else {
            kotlin.jvm.internal.o.o("llQQMusicView");
            throw null;
        }
    }
}
