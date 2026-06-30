package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public final class tb extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f282982d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f282983e;

    /* renamed from: f, reason: collision with root package name */
    public int f282984f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f282985g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f282986h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ub f282987i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f282988m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.a f282989n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.y0 f282990o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb(yz5.a aVar, android.widget.TextView textView, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ub ubVar, java.lang.String str, yz5.a aVar2, p3325xe03a0797.p3326xc267989b.y0 y0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f282985g = aVar;
        this.f282986h = textView;
        this.f282987i = ubVar;
        this.f282988m = str;
        this.f282989n = aVar2;
        this.f282990o = y0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.tb(this.f282985g, this.f282986h, this.f282987i, this.f282988m, this.f282989n, this.f282990o, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.tb) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179;
        java.lang.Object g17;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b;
        java.lang.Object g18;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ob obVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f282984f;
        java.lang.String str = this.f282988m;
        yz5.a aVar2 = this.f282989n;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ub ubVar = this.f282987i;
        android.widget.TextView textView = this.f282986h;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            int i18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h;
            if (!((i18 == 788529167 || i18 == 788529166) || z65.c.a())) {
                return f0Var;
            }
            boolean z17 = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2551x5025ce89.C20548x8acbc4e5()) == 1;
            java.lang.Object m17 = c01.d9.b().p().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LOCAL_SIGHT_DEBUGINFO_INT_SYNC, new java.lang.Integer(0));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m17, "null cannot be cast to non-null type kotlin.Int");
            boolean z18 = ((java.lang.Integer) m17).intValue() == 1;
            if (!z17 && !z18) {
                return f0Var;
            }
            yz5.a aVar3 = this.f282985g;
            mo55332x76847179 = (aVar3 == null || (k1Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1) aVar3.mo152xb9724478()) == null || (viewOnClickListenerC21748xb3d38e6b = k1Var.f282625g) == null) ? null : viewOnClickListenerC21748xb3d38e6b.mo55332x76847179();
            if (mo55332x76847179 == null) {
                return f0Var;
            }
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392103c;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.sb sbVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.sb(ubVar, str, null);
            this.f282982d = mo55332x76847179;
            this.f282984f = 1;
            g17 = p3325xe03a0797.p3326xc267989b.l.g(p0Var, sbVar, this);
            if (g17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ob obVar2 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ob) this.f282983e;
                mo55332x76847179 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) this.f282982d;
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                g18 = obj;
                obVar = obVar2;
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.nb nbVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.nb) g18;
                textView.setText(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ub.b(this.f282987i, mo55332x76847179, this.f282988m, obVar, nbVar, (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.mb) aVar2.mo152xb9724478()));
                if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.mb) aVar2.mo152xb9724478()).f282736a == com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.s8.f282897d && !nbVar.f282762c) {
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ub ubVar2 = this.f282987i;
                    ubVar2.f283032a = p3325xe03a0797.p3326xc267989b.l.d(this.f282990o, null, null, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.qb(this.f282985g, this.f282986h, ubVar2, mo55332x76847179, this.f282988m, obVar, this.f282989n, null), 3, null);
                }
                return f0Var;
            }
            mo55332x76847179 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) this.f282982d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            g17 = obj;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ob obVar3 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ob) g17;
        textView.setVisibility(0);
        ubVar.getClass();
        if (textView.getPaddingTop() == 0) {
            int identifier = mo55332x76847179.getResources().getIdentifier("status_bar_height", "dimen", com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f);
            textView.setPadding(0, (identifier > 0 ? mo55332x76847179.getResources().getDimensionPixelSize(identifier) : 0) + ((int) (48 * mo55332x76847179.getResources().getDisplayMetrics().density)), 0, 0);
        }
        p3325xe03a0797.p3326xc267989b.p0 p0Var2 = p3325xe03a0797.p3326xc267989b.q1.f392103c;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.rb rbVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.rb(ubVar, str, aVar2, null);
        this.f282982d = mo55332x76847179;
        this.f282983e = obVar3;
        this.f282984f = 2;
        g18 = p3325xe03a0797.p3326xc267989b.l.g(p0Var2, rbVar, this);
        if (g18 == aVar) {
            return aVar;
        }
        obVar = obVar3;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.nb nbVar2 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.nb) g18;
        textView.setText(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ub.b(this.f282987i, mo55332x76847179, this.f282988m, obVar, nbVar2, (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.mb) aVar2.mo152xb9724478()));
        if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.mb) aVar2.mo152xb9724478()).f282736a == com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.s8.f282897d) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ub ubVar22 = this.f282987i;
            ubVar22.f283032a = p3325xe03a0797.p3326xc267989b.l.d(this.f282990o, null, null, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.qb(this.f282985g, this.f282986h, ubVar22, mo55332x76847179, this.f282988m, obVar, this.f282989n, null), 3, null);
        }
        return f0Var;
    }
}
