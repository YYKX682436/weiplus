package com.tencent.luggage.game.jsapi.keyboard;

/* loaded from: classes7.dex */
public class k extends com.tencent.mm.plugin.appbrand.widget.input.s1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.game.widget.input.WAGamePanelInputEditText f47228d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f47229e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.game.jsapi.keyboard.r f47230f;

    public k(com.tencent.luggage.game.jsapi.keyboard.r rVar, com.tencent.luggage.game.widget.input.WAGamePanelInputEditText wAGamePanelInputEditText, com.tencent.mm.plugin.appbrand.e9 e9Var) {
        this.f47230f = rVar;
        this.f47228d = wAGamePanelInputEditText;
        this.f47229e = e9Var;
    }

    @Override // ck5.e
    public void w0(java.lang.String str) {
        this.f47230f.f47251g.x(this.f47228d.getEditableText().toString(), this.f47229e);
    }
}
