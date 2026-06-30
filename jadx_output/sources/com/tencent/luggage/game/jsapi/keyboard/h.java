package com.tencent.luggage.game.jsapi.keyboard;

/* loaded from: classes7.dex */
public class h implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.game.widget.input.WAGamePanelInputEditText f47209d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f47210e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f47211f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.game.jsapi.keyboard.r f47212g;

    public h(com.tencent.luggage.game.jsapi.keyboard.r rVar, com.tencent.luggage.game.widget.input.WAGamePanelInputEditText wAGamePanelInputEditText, com.tencent.mm.plugin.appbrand.e9 e9Var, boolean z17) {
        this.f47212g = rVar;
        this.f47209d = wAGamePanelInputEditText;
        this.f47210e = e9Var;
        this.f47211f = z17;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        this.f47212g.f47253i.x(this.f47209d.getEditableText().toString(), this.f47210e);
        return this.f47211f;
    }
}
