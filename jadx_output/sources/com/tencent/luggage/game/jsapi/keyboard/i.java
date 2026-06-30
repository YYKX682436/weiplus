package com.tencent.luggage.game.jsapi.keyboard;

/* loaded from: classes7.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f47213d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f47214e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f47215f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f47216g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f47217h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ pl1.c f47218i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.game.jsapi.keyboard.b f47219m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f47220n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f47221o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f47222p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f47223q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f47224r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.game.jsapi.keyboard.r f47225s;

    public i(com.tencent.luggage.game.jsapi.keyboard.r rVar, com.tencent.mm.plugin.appbrand.e9 e9Var, java.lang.String str, int i17, boolean z17, boolean z18, pl1.c cVar, com.tencent.luggage.game.jsapi.keyboard.b bVar, boolean z19, boolean z27, boolean z28, boolean z29, int i18) {
        this.f47225s = rVar;
        this.f47213d = e9Var;
        this.f47214e = str;
        this.f47215f = i17;
        this.f47216g = z17;
        this.f47217h = z18;
        this.f47218i = cVar;
        this.f47219m = bVar;
        this.f47220n = z19;
        this.f47221o = z27;
        this.f47222p = z28;
        this.f47223q = z29;
        this.f47224r = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.page.v5 V0;
        int c17;
        boolean z17;
        ol1.o oVar;
        ol1.o oVar2;
        com.tencent.luggage.game.jsapi.keyboard.r rVar = this.f47225s;
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f47213d;
        java.lang.String str = this.f47214e;
        int i17 = this.f47215f;
        boolean z18 = this.f47216g;
        boolean z19 = this.f47217h;
        pl1.c cVar = this.f47218i;
        com.tencent.luggage.game.jsapi.keyboard.b bVar = this.f47219m;
        boolean z27 = this.f47220n;
        boolean z28 = this.f47221o;
        boolean z29 = this.f47222p;
        boolean z37 = this.f47223q;
        int i18 = this.f47224r;
        rVar.getClass();
        if (!e9Var.isRunning() || (V0 = e9Var.V0()) == null) {
            return;
        }
        float g17 = i65.a.g(V0.getF147807d());
        android.view.View contentView = V0.getContentView();
        java.util.Objects.requireNonNull(contentView);
        ie.d O = ie.d.O(contentView, z37);
        com.tencent.luggage.game.jsapi.keyboard.b bVar2 = com.tencent.luggage.game.jsapi.keyboard.b.f47205f;
        O.setCanSmileyInput(bVar2 == bVar);
        if (O.f91688u && (oVar2 = O.f91684q) != null) {
            oVar2.p(z27);
        }
        if (O.f91688u && (oVar = O.f91684q) != null) {
            oVar.r(z28);
        }
        com.tencent.luggage.game.widget.input.WAGamePanelInputEditText attachedEditText = O.getAttachedEditText();
        com.tencent.luggage.game.jsapi.keyboard.j jVar = new com.tencent.luggage.game.jsapi.keyboard.j(rVar, O, attachedEditText);
        e9Var.getRuntime().N.a(jVar);
        boolean z38 = !z18;
        attachedEditText.setSingleLine(z38);
        attachedEditText.setMaxLength(i17);
        com.tencent.mm.plugin.appbrand.widget.input.v1 g18 = com.tencent.mm.plugin.appbrand.widget.input.v1.g(attachedEditText);
        g18.f42561f = 0;
        g18.f42560e = i17;
        g18.f42556a = false;
        g18.f42562g = com.tencent.mm.ui.tools.t4.MODE_CHINESE_AS_1;
        g18.d(new com.tencent.luggage.game.jsapi.keyboard.k(rVar, attachedEditText, e9Var));
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            attachedEditText.setText("");
        } else {
            if (str.length() > i17) {
                str = str.substring(0, i17);
            }
            attachedEditText.setText(str);
            attachedEditText.setSelection(attachedEditText.getText().length());
        }
        attachedEditText.addTextChangedListener(new com.tencent.luggage.game.jsapi.keyboard.l(rVar, e9Var));
        attachedEditText.setComposingDismissedListener(new com.tencent.luggage.game.jsapi.keyboard.m(rVar, attachedEditText, e9Var));
        O.setOnConfirmClickListener(new com.tencent.luggage.game.jsapi.keyboard.n(rVar, attachedEditText, e9Var, z19, O, jVar));
        O.setOnVisibilityChangedListener(new com.tencent.luggage.game.jsapi.keyboard.o(rVar, attachedEditText, e9Var, O, g17, i18));
        O.setOnSmileyChosenListener(new com.tencent.luggage.game.jsapi.keyboard.p(rVar, attachedEditText));
        O.setOnEmoticonOperationListener(new com.tencent.luggage.game.jsapi.keyboard.q(rVar, e9Var));
        if (z18) {
            attachedEditText.setOnEditorActionListener(null);
        } else {
            attachedEditText.setOnEditorActionListener(new com.tencent.luggage.game.jsapi.keyboard.h(rVar, attachedEditText, e9Var, z19));
        }
        xi1.o a17 = e9Var.getWindowAndroid().getOrientationHandler().a();
        android.app.Activity r07 = e9Var.getRuntime().r0();
        O.setCanSmileyInput(bVar == bVar2);
        if (a17 == xi1.o.LANDSCAPE_SENSOR || a17 == xi1.o.LANDSCAPE_LOCKED || xi1.o.LANDSCAPE_LEFT == a17 || xi1.o.LANDSCAPE_RIGHT == a17) {
            int a18 = com.tencent.mm.ui.v9.a(r07);
            if (r07 == null) {
                c17 = 0;
            } else {
                nf.y yVar = nf.x.f336616b;
                c17 = yVar != null ? yVar.c(r07) : com.tencent.mm.ui.v9.b(r07);
            }
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) O.F.getLayoutParams();
            com.tencent.mars.xlog.Log.i("MicroMsg.WAGameInputPanel", "EditBar setEditText cutoutHeight(%d),leftMargin(%d).", java.lang.Integer.valueOf(c17), java.lang.Integer.valueOf(layoutParams.leftMargin));
            if (c17 > 0) {
                layoutParams.setMargins(c17, layoutParams.topMargin, layoutParams.rightMargin, layoutParams.bottomMargin);
            } else {
                layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.rightMargin, layoutParams.bottomMargin);
            }
            O.F.setLayoutParams(layoutParams);
            ie.b bVar3 = O.E;
            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) bVar3.f290952d.getLayoutParams();
            com.tencent.mars.xlog.Log.i("MicroMsg.WAGameInputPanel", "EditBar setmConfirmButtonPadding tolerate(%d),rightMargin(%d).", java.lang.Integer.valueOf(a18), java.lang.Integer.valueOf(layoutParams2.rightMargin));
            layoutParams2.setMargins(layoutParams2.leftMargin, layoutParams2.topMargin, layoutParams2.rightMargin + a18, layoutParams2.bottomMargin);
            bVar3.f290952d.setLayoutParams(layoutParams2);
        }
        pl1.c cVar2 = cVar == null ? pl1.c.DONE : cVar;
        O.getAttachedEditText().setImeOptions(cVar2.f356583d);
        O.getAttachedEditText().setSingleLine(z38);
        if (bVar == com.tencent.luggage.game.jsapi.keyboard.b.f47206g) {
            O.getAttachedEditText().setInputType(2);
            z17 = true;
        } else if (z18) {
            z17 = true;
            O.getAttachedEditText().setInputType(131073);
        } else {
            z17 = true;
            O.getAttachedEditText().setInputType(1);
        }
        O.getAttachedEditText().setFocusable(z17);
        O.getAttachedEditText().setFocusableInTouchMode(z17);
        O.I();
        int ordinal = cVar2.ordinal();
        if (ordinal == 0) {
            ((android.widget.Button) O.E.b()).setText(com.tencent.mm.R.string.a1b);
        } else if (ordinal == z17) {
            ((android.widget.Button) O.E.b()).setText(com.tencent.mm.R.string.a1e);
        } else if (ordinal == 2) {
            ((android.widget.Button) O.E.b()).setText(com.tencent.mm.R.string.a1d);
        } else if (ordinal == 3) {
            ((android.widget.Button) O.E.b()).setText(com.tencent.mm.R.string.a1c);
        } else if (ordinal == 4) {
            ((android.widget.Button) O.E.b()).setText(com.tencent.mm.R.string.a1f);
        }
        if (z29) {
            int i19 = com.tencent.mm.plugin.appbrand.widget.input.u3.D;
            O.f91693z.hideVKB();
            com.tencent.mm.plugin.appbrand.widget.input.u3.w(O);
            O.d(com.tencent.mm.plugin.appbrand.widget.input.l2.c(O.f91692y));
            O.f91687t.setSelected(true);
        }
    }
}
