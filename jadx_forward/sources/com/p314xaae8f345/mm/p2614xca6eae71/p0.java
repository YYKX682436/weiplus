package com.p314xaae8f345.mm.p2614xca6eae71;

/* loaded from: classes12.dex */
public final class p0 implements com.p314xaae8f345.mm.p2614xca6eae71.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.StringBuilder f274863a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f274864b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f274865c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2614xca6eae71.q0 f274866d;

    public p0(java.lang.StringBuilder sb6, java.lang.String str, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, com.p314xaae8f345.mm.p2614xca6eae71.q0 q0Var) {
        this.f274863a = sb6;
        this.f274864b = str;
        this.f274865c = f0Var;
        this.f274866d = q0Var;
    }

    @Override // com.p314xaae8f345.mm.p2614xca6eae71.b1
    public boolean a(com.p314xaae8f345.mm.p2614xca6eae71.a1 item, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        if (item instanceof com.p314xaae8f345.mm.p2614xca6eae71.b2) {
            p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f274865c;
            int i19 = f0Var.f391649d;
            java.lang.StringBuilder sb6 = this.f274863a;
            sb6.append((java.lang.CharSequence) this.f274864b, i19, i17);
            int i27 = ((com.p314xaae8f345.mm.p2614xca6eae71.b2) item).f274753a.f274792d;
            this.f274866d.getClass();
            com.p314xaae8f345.mm.p2614xca6eae71.p pVar = com.p314xaae8f345.mm.p2614xca6eae71.m.f274842a;
            com.p314xaae8f345.mm.p2614xca6eae71.a2 a2Var = (com.p314xaae8f345.mm.p2614xca6eae71.a2) pVar.f274859b.get(i27, null);
            java.lang.String str = (java.lang.String) pVar.f274861d.get(a2Var != null ? a2Var.f274747d : 0, null);
            if (str != null) {
                sb6.append(str);
            } else {
                sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571916tg));
            }
            f0Var.f391649d = i18;
        }
        return false;
    }
}
