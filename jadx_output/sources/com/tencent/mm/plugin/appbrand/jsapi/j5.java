package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public final class j5 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f81322a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f81323b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.d0 f81324c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f81325d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l5 f81326e;

    public j5(android.app.Activity activity, android.widget.EditText editText, com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var, int i17, com.tencent.mm.plugin.appbrand.jsapi.l5 l5Var) {
        this.f81322a = activity;
        this.f81323b = editText;
        this.f81324c = d0Var;
        this.f81325d = i17;
        this.f81326e = l5Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        java.lang.Object systemService = this.f81322a.getSystemService("input_method");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        android.widget.EditText editText = this.f81323b;
        ((android.view.inputmethod.InputMethodManager) systemService).hideSoftInputFromWindow(editText.getWindowToken(), 0);
        if (z17) {
            this.f81324c.a(this.f81325d, this.f81326e.p("ok", kz5.c1.i(new jz5.l(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, editText.getText().toString()))));
        }
        com.tencent.mars.xlog.Log.i("JsApiEditTextWithPopForm", "dialog click is ok:" + z17);
    }
}
