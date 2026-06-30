package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e;

/* loaded from: classes9.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f163869d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f163870e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.C12183x2c92285e f163871f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f163872g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f163873h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 f163874i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f163875m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f163876n;

    public i(android.content.Context context, java.util.List list, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.C12183x2c92285e c12183x2c92285e, boolean z17, boolean z18, com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 c11158xe7d16ed5, int i17, java.util.Map map) {
        this.f163869d = context;
        this.f163870e = list;
        this.f163871f = c12183x2c92285e;
        this.f163872g = z17;
        this.f163873h = z18;
        this.f163874i = c11158xe7d16ed5;
        this.f163875m = i17;
        this.f163876n = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.C12183x2c92285e c12183x2c92285e = this.f163871f;
        com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 c11158xe7d16ed5 = this.f163874i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.h hVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.h(c12183x2c92285e, c11158xe7d16ed5);
        android.content.Context context = this.f163869d;
        if (context instanceof android.app.Application) {
            hVar.mo147xb9724478(2, this.f163870e, java.lang.Boolean.FALSE);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AppBrandSubscribeMsg.GetSubscribeMsgListExecutor", "a context which is Application to perform show dialog will case [UnsupportedOperationException] here");
            return;
        }
        java.util.List list = this.f163870e;
        boolean z17 = this.f163873h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.f fVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.f(z17, hVar, c12183x2c92285e, this.f163876n, list, c11158xe7d16ed5, context);
        boolean z18 = this.f163872g;
        c12183x2c92285e.getClass();
        c12183x2c92285e.f163834m = new m31.p1(context, list, fVar, z18, z17, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.j(c12183x2c92285e));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.C12183x2c92285e c12183x2c92285e2 = this.f163871f;
        m31.p1 c17 = c12183x2c92285e2.c();
        com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 c11158xe7d16ed52 = this.f163874i;
        java.lang.String str2 = c11158xe7d16ed52.f153328u;
        java.lang.String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        c17.T = str2;
        android.widget.TextView textView = c17.f404722p;
        textView.setText(str2);
        textView.setContentDescription(c17.T);
        m31.p1 c18 = c12183x2c92285e2.c();
        java.lang.String str4 = c11158xe7d16ed52.f153329v;
        if (str4 == null) {
            str4 = "";
        }
        c18.k(str4);
        m31.p1 c19 = c12183x2c92285e2.c();
        java.lang.String value = c11158xe7d16ed52.f153316f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        android.widget.TextView textView2 = c19.f404721o;
        textView2.setText(value);
        textView2.getPaint().setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        textView2.getPaint().setStrokeWidth(0.8f);
        m31.p1 c27 = c12183x2c92285e2.c();
        com.p314xaae8f345.mm.p965xc41bc71e.C11160x93f17146 c11160x93f17146 = c11158xe7d16ed52.f153321n;
        if (c11160x93f17146 != null && (str = c11160x93f17146.f153358h) != null) {
            str3 = str;
        }
        c27.N = str3;
        m31.p1 c28 = c12183x2c92285e2.c();
        java.lang.String value2 = c11158xe7d16ed52.f153315e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value2, "value");
        c28.M = value2;
        m31.p1 c29 = c12183x2c92285e2.c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c11160x93f17146);
        java.lang.String value3 = c11160x93f17146.f153354d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value3, "value");
        android.widget.TextView textView3 = c29.f404720n;
        textView3.setText(value3);
        textView3.getPaint().setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        textView3.getPaint().setStrokeWidth(0.8f);
        m31.p1 c37 = c12183x2c92285e2.c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c11160x93f17146);
        java.lang.String value4 = c11160x93f17146.f153355e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value4, "value");
        c37.f404725s.setText(value4);
        m31.p1 c38 = c12183x2c92285e2.c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c11160x93f17146);
        java.lang.String value5 = c11160x93f17146.f153356f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value5, "value");
        c38.f404724r.setText(value5);
        c12183x2c92285e2.c().V = com.p314xaae8f345.mm.R.C30861xcebc809e.cbh;
        if (this.f163875m == 2) {
            m31.p1 c39 = c12183x2c92285e2.c();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c11160x93f17146);
            c39.h(c11160x93f17146.f153357g);
            c12183x2c92285e2.c().A.setChecked(c11158xe7d16ed52.f153314d);
        }
        m31.p1 c47 = c12183x2c92285e2.c();
        c47.S = false;
        c47.f404731y.setVisibility(8);
        c12183x2c92285e2.c().L = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.g(c11158xe7d16ed52, this.f163876n);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.e eVar = c12183x2c92285e2.f163833i;
        if (eVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.q) eVar).b(c12183x2c92285e2.c());
        }
    }
}
