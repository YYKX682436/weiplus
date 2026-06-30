package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4;

/* loaded from: classes.dex */
public final class j1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f267320d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f267321e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f267322f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(java.util.HashMap hashMap, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var, nw4.y2 y2Var) {
        super(2);
        this.f267320d = hashMap;
        this.f267321e = c1Var;
        this.f267322f = y2Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str = (java.lang.String) obj2;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(((java.lang.Number) obj).intValue());
        java.util.HashMap hashMap = this.f267320d;
        hashMap.put("err_code", valueOf);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        nw4.y2 y2Var = this.f267322f;
        sb6.append(y2Var.f422552i);
        sb6.append(':');
        if (str == null) {
            str = "fail";
        }
        sb6.append(str);
        this.f267321e.i5(y2Var, sb6.toString(), hashMap);
        return jz5.f0.f384359a;
    }
}
