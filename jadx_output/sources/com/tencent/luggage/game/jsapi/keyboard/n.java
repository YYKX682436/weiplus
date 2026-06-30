package com.tencent.luggage.game.jsapi.keyboard;

/* loaded from: classes7.dex */
public class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.game.widget.input.WAGamePanelInputEditText f47236d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f47237e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f47238f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ie.d f47239g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ u81.f f47240h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.game.jsapi.keyboard.r f47241i;

    public n(com.tencent.luggage.game.jsapi.keyboard.r rVar, com.tencent.luggage.game.widget.input.WAGamePanelInputEditText wAGamePanelInputEditText, com.tencent.mm.plugin.appbrand.e9 e9Var, boolean z17, ie.d dVar, u81.f fVar) {
        this.f47241i = rVar;
        this.f47236d = wAGamePanelInputEditText;
        this.f47237e = e9Var;
        this.f47238f = z17;
        this.f47239g = dVar;
        this.f47240h = fVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        this.f47241i.f47253i.x(this.f47236d.getEditableText().toString(), this.f47237e);
        this.f47241i.f47251g.x(this.f47236d.getEditableText().toString(), this.f47237e);
        if (this.f47238f) {
            return;
        }
        try {
            this.f47239g.z();
            this.f47237e.getRuntime().N.c(this.f47240h);
        } catch (java.lang.Exception unused) {
        }
    }
}
