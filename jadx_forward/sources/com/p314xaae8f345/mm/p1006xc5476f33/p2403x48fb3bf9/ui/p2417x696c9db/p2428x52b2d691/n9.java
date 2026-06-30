package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes7.dex */
public final class n9 implements vh0.i1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f267913a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vh0.n1 f267914b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f267915c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f267916d;

    public n9(java.lang.String str, vh0.n1 n1Var, android.content.Context context, java.lang.String str2) {
        this.f267913a = str;
        this.f267914b = n1Var;
        this.f267915c = context;
        this.f267916d = str2;
    }

    @Override // vh0.i1
    /* renamed from: onResult */
    public void mo56534x57429edc(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bool);
        if (bool.booleanValue()) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putCharSequence("override_session_id", this.f267913a);
            ((vh0.f3) this.f267914b).aj(this.f267915c, 15, this.f267916d, false, null, bundle);
        }
    }
}
