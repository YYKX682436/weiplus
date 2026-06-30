package com.tencent.luggage.game.jsapi.keyboard;

/* loaded from: classes7.dex */
public class m implements ml1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.game.widget.input.WAGamePanelInputEditText f47233a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f47234b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.game.jsapi.keyboard.r f47235c;

    public m(com.tencent.luggage.game.jsapi.keyboard.r rVar, com.tencent.luggage.game.widget.input.WAGamePanelInputEditText wAGamePanelInputEditText, com.tencent.mm.plugin.appbrand.e9 e9Var) {
        this.f47235c = rVar;
        this.f47233a = wAGamePanelInputEditText;
        this.f47234b = e9Var;
    }

    @Override // ml1.c
    public void a() {
        this.f47235c.f47251g.x(this.f47233a.getEditableText().toString(), this.f47234b);
    }
}
