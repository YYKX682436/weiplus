package com.tencent.luggage.game.jsapi.keyboard;

/* loaded from: classes7.dex */
public class l extends al5.j2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f47231d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.game.jsapi.keyboard.r f47232e;

    public l(com.tencent.luggage.game.jsapi.keyboard.r rVar, com.tencent.mm.plugin.appbrand.e9 e9Var) {
        this.f47232e = rVar;
        this.f47231d = e9Var;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        if (com.tencent.mm.plugin.appbrand.widget.input.m5.e(editable)) {
            return;
        }
        this.f47232e.f47251g.x(editable.toString(), this.f47231d);
    }
}
