package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class r0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f268004d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.k f268005e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f268006f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(java.util.HashMap hashMap, nw4.k kVar, nw4.y2 y2Var) {
        super(2);
        this.f268004d = hashMap;
        this.f268005e = kVar;
        this.f268006f = y2Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str = (java.lang.String) obj2;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(((java.lang.Number) obj).intValue());
        java.util.HashMap hashMap = this.f268004d;
        hashMap.put("err_code", valueOf);
        nw4.g gVar = this.f268005e.f422396d;
        nw4.y2 y2Var = this.f268006f;
        java.lang.String str2 = y2Var.f422546c;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(y2Var.f422552i);
        sb6.append(':');
        if (str == null) {
            str = "fail";
        }
        sb6.append(str);
        gVar.e(str2, sb6.toString(), hashMap);
        return jz5.f0.f384359a;
    }
}
