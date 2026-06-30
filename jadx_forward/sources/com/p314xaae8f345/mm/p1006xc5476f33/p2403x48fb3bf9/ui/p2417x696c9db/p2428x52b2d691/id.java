package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes8.dex */
public final class id implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 f267794a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.k f267795b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f267796c;

    public id(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 c0Var, nw4.k kVar, nw4.y2 y2Var) {
        this.f267794a = c0Var;
        this.f267795b = kVar;
        this.f267796c = y2Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.z
    public final void a(boolean z17, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 c0Var = this.f267794a;
        c0Var.d();
        nw4.k kVar = this.f267795b;
        nw4.y2 y2Var = this.f267796c;
        if (!z17) {
            kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":fail, cancel", null);
            return;
        }
        boolean z18 = obj instanceof java.lang.String;
        if ((!z18 && !(obj2 instanceof java.lang.String) && !c0Var.f()) || (!z18 && !(obj2 instanceof java.lang.String) && !(obj3 instanceof java.lang.String) && c0Var.f())) {
            kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":fail, result unknown error", null);
            return;
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.String");
        jSONArray.put((java.lang.String) obj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
        jSONArray.put((java.lang.String) obj2);
        if (c0Var.f()) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj3, "null cannot be cast to non-null type kotlin.String");
            jSONArray.put((java.lang.String) obj3);
        }
        org.json.JSONArray jSONArray2 = new org.json.JSONArray();
        jSONArray2.put(c0Var.b());
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22706xd568f79 c22706xd568f79 = c0Var.f293790r;
        jSONArray2.put(c22706xd568f79 != null ? c22706xd568f79.m82064x754a37bb() : 0);
        if (c0Var.f()) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22706xd568f79 c22706xd568f792 = c0Var.f293791s;
            jSONArray2.put(c22706xd568f792 != null ? c22706xd568f792.m82064x754a37bb() : 0);
        }
        java.util.HashMap hashMap = new java.util.HashMap(2);
        hashMap.put("current", jSONArray);
        hashMap.put("currentIndex", jSONArray2);
        kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":ok", hashMap);
    }
}
