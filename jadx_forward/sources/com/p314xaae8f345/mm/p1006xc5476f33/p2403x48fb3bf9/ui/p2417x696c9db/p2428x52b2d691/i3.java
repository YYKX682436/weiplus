package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class i3 implements c00.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.k f267779a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f267780b;

    public i3(nw4.k kVar, nw4.y2 y2Var) {
        this.f267779a = kVar;
        this.f267780b = y2Var;
    }

    @Override // c00.n3
    public void a() {
        nw4.g gVar = this.f267779a.f422396d;
        nw4.y2 y2Var = this.f267780b;
        gVar.e(y2Var.f422546c, y2Var.f422552i + ":fail", null);
    }

    @Override // c00.n3
    public void b(org.json.JSONObject jSONObject) {
        nw4.g gVar = this.f267779a.f422396d;
        nw4.y2 y2Var = this.f267780b;
        gVar.e(y2Var.f422546c, y2Var.f422552i + ":ok", com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.j3.f267802d.e(jSONObject));
    }

    @Override // c00.n3
    public void c(c00.x2 event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
    }

    @Override // c00.n3
    public void d(org.json.JSONObject jSONObject) {
        nw4.g gVar = this.f267779a.f422396d;
        nw4.y2 y2Var = this.f267780b;
        gVar.e(y2Var.f422546c, y2Var.f422552i + ":fail", com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.j3.f267802d.e(jSONObject));
    }

    @Override // c00.n3
    /* renamed from: onCancel */
    public void mo13720x3d6f0539() {
        nw4.g gVar = this.f267779a.f422396d;
        nw4.y2 y2Var = this.f267780b;
        gVar.e(y2Var.f422546c, y2Var.f422552i + ":cancel", null);
    }
}
