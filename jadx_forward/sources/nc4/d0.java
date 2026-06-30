package nc4;

/* loaded from: classes4.dex */
public final class d0 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.j {

    /* renamed from: d, reason: collision with root package name */
    public final int f417664d;

    /* renamed from: e, reason: collision with root package name */
    public final int f417665e;

    /* renamed from: f, reason: collision with root package name */
    public int f417666f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Boolean f417667g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f417668h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f417669i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f417670m;

    /* renamed from: n, reason: collision with root package name */
    public final nc4.s f417671n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f417664d = i65.a.b(m80379x76847179(), 245);
        this.f417665e = i65.a.b(m80379x76847179(), 20);
        this.f417666f = -1;
        this.f417669i = jz5.h.b(new nc4.j(this));
        this.f417670m = jz5.h.b(new nc4.l(this));
        this.f417671n = new nc4.s(this, activity);
    }

    public static final void O6(nc4.d0 d0Var, java.util.HashMap hashMap, nc4.c cVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$addEntrance", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
        d0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addEntrance", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
        hashMap.put(java.lang.Integer.valueOf(cVar.mo149391x368f3a()), cVar);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addEntrance", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$addEntrance", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
    }

    public static final /* synthetic */ java.util.LinkedHashMap P6(nc4.d0 d0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getEntranceMap", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
        java.util.LinkedHashMap R6 = d0Var.R6();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getEntranceMap", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
        return R6;
    }

    public static final /* synthetic */ int Q6(nc4.d0 d0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMaxHeight$p", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
        int i17 = d0Var.f417664d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMaxHeight$p", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
        return i17;
    }

    public final java.util.LinkedHashMap R6() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getEntranceMap", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) ((jz5.n) this.f417669i).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getEntranceMap", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
        return linkedHashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0057, code lost:
    
        if (r6 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0059, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
    
        r9 = P6(r15).entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006c, code lost:
    
        if (r9.hasNext() == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006e, code lost:
    
        r10 = (java.util.Map.Entry) r9.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007a, code lost:
    
        if ((r10.getValue() instanceof nc4.j0) == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007c, code lost:
    
        r8 = r10.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0080, code lost:
    
        if (r8 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0082, code lost:
    
        r8 = (nc4.j0) r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0091, code lost:
    
        if (r8 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0093, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0096, code lost:
    
        r9 = nc4.d.f417659h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009c, code lost:
    
        if (r9.h() != r16) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009e, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a1, code lost:
    
        if (r6 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a3, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b1, code lost:
    
        if (r16 != nc4.d.f417658g.h()) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b3, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d1, code lost:
    
        r9 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        r11 = new java.lang.Object[8];
        r11[0] = java.lang.Long.valueOf(c01.id.c());
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e1, code lost:
    
        if (r6 == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e3, code lost:
    
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e6, code lost:
    
        r11[1] = java.lang.Integer.valueOf(r6);
        r11[2] = java.lang.Integer.valueOf(r10);
        r11[3] = ca4.z0.l();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f8, code lost:
    
        if (r8 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00fa, code lost:
    
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00fb, code lost:
    
        r11[4] = java.lang.Integer.valueOf(r4);
        r11[5] = java.lang.Integer.valueOf(r0);
        r11[6] = java.lang.Integer.valueOf(r3);
        r11[7] = java.lang.Integer.valueOf(r17);
        r9.d(20838, r11);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("report", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x011f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e5, code lost:
    
        r6 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00bb, code lost:
    
        if (r16 != nc4.d.f417657f.h()) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00bd, code lost:
    
        r0 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c3, code lost:
    
        if (r16 != r9.h()) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c5, code lost:
    
        r0 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00cd, code lost:
    
        if (r16 != nc4.d.f417660i.h()) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d0, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a5, code lost:
    
        if (r10 == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a7, code lost:
    
        r10 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a9, code lost:
    
        r10 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00a0, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0095, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0085, code lost:
    
        r0 = new java.lang.NullPointerException("null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.improve.component.toolbar.SecondCutEntrance");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("report", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0090, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x005b, code lost:
    
        r6 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S6(int r16, int r17) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nc4.d0.S6(int, int):void");
    }

    public final void T6() {
        android.view.View view;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateSpringPostIconRedDotVisibility$plugin_sns_release", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
        boolean f17 = xa4.g.f();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.ToolBarUIC", "updatePostIconRedDotVisibility: " + f17);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085).mo78514x143f1b92().U0(0, f17);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x192630852, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.p314xaae8f345.mm.ui.eb E = ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x192630852).mo78514x143f1b92().E(0);
        android.widget.ImageView imageView = (E == null || (view = E.f289918k) == null) ? null : (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.d2h);
        if (f17) {
            android.view.ViewGroup.LayoutParams layoutParams = imageView != null ? imageView.getLayoutParams() : null;
            android.widget.RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams : null;
            int f18 = i65.a.f(m80379x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
            int f19 = i65.a.f(m80379x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
            if (layoutParams2 != null) {
                layoutParams2.setMargins(0, f18, f19, 0);
            }
            if (imageView != null) {
                imageView.setLayoutParams(layoutParams2);
            }
            if (imageView != null) {
                imageView.setColorFilter(i65.a.d(m80379x76847179(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23));
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("redDot ");
            sb6.append(imageView != null ? java.lang.Integer.valueOf(imageView.hashCode()) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.ToolBarUIC", sb6.toString());
        }
        if (imageView != null) {
            imageView.setVisibility(f17 ? 0 : 8);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateSpringPostIconRedDotVisibility$plugin_sns_release", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onActivityResult", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
        super.mo2273x9d4787cb(i17, i18, intent);
        java.util.Iterator it = R6().entrySet().iterator();
        while (it.hasNext()) {
            ((nc4.c) ((java.util.Map.Entry) it.next()).getValue()).mo149389x9d4787cb(i17, i18, intent);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setupOptionMenu", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085;
        abstractActivityC21394xb3d2c0cf.m78479x84f07bce(0, com.p314xaae8f345.mm.R.C30867xcad56011.j5r, com.p314xaae8f345.mm.R.raw.f79656xe6e7503d, new nc4.a0(this), new nc4.b0(this));
        abstractActivityC21394xb3d2c0cf.mo74406x9c8c0d33(new nc4.c0(abstractActivityC21394xb3d2c0cf), com.p314xaae8f345.mm.R.raw.f78352x20d6422c);
        xa4.b.f534354a.c(xa4.g.f(), "view_exp", 1);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setupOptionMenu", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setupActionBarColor", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x192630852, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x192630852;
        if (!m70939xdec9c05c()) {
            abstractActivityC21394xb3d2c0cf2.m78586xb1075be8(0.0f);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setupActionBarColor", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
        m70934x2b98e6a2().i(this.f417671n);
        if (xa4.g.f()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("markExposeRedDotForTimeLinePost", "com.tencent.mm.plugin.sns.spring.SnsActivityPostAction31314Reporter");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("report", "com.tencent.mm.plugin.sns.spring.SnsActivityPostAction31314Reporter");
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6877x5525f5a6 c6877x5525f5a6 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6877x5525f5a6();
            c6877x5525f5a6.f141966d = 1;
            c6877x5525f5a6.k();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("report", "com.tencent.mm.plugin.sns.spring.SnsActivityPostAction31314Reporter");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("markExposeRedDotForTimeLinePost", "com.tencent.mm.plugin.sns.spring.SnsActivityPostAction31314Reporter");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onRequestPermissionsResult */
    public void mo2282x953457f1(int i17, java.lang.String[] permissions, int[] grantResults) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onRequestPermissionsResult", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permissions, "permissions");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(grantResults, "grantResults");
        if (grantResults.length == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Improve.ToolBarUIC", "error requestCode:" + i17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onRequestPermissionsResult", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.ToolBarUIC", "requestCode:" + i17 + ",grantResults:" + grantResults[0]);
        if (i17 == 16) {
            if (grantResults[0] == 0) {
                p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                pf5.e.m158343xd39de650(this, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new nc4.n(this, null), 2, null);
            } else {
                int i18 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b("android.permission.CAMERA", permissions[0]) ? com.p314xaae8f345.mm.R.C30867xcad56011.hh8 : com.p314xaae8f345.mm.R.C30867xcad56011.hhn;
                if (grantResults[0] != 0) {
                    db5.e1.C(m80379x76847179(), m158362x2fec8307(i18), m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.hht), m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), false, new nc4.o(this), nc4.p.f417702d);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onRequestPermissionsResult", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
    }
}
