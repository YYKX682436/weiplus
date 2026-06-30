package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public final class r2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f289564d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f289565e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2 f289566f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f289567g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f289568h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.l4 f289569i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(android.app.Activity activity, android.content.Intent intent, com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2 p2Var, android.view.View view, int i17, com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var) {
        super(1);
        this.f289564d = activity;
        this.f289565e = intent;
        this.f289566f = p2Var;
        this.f289567g = view;
        this.f289568h = i17;
        this.f289569i = l4Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bool);
        if (bool.booleanValue()) {
            ((zv.e2) ((bw.k) i95.n0.c(bw.k.class))).Ri(this.f289564d, this.f289565e);
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2 p2Var = this.f289566f;
            if (p2Var != null) {
                java.lang.String h17 = this.f289569i.h1();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h17, "getKey(...)");
                p2Var.b(this.f289567g, this.f289568h, h17);
            }
        }
        return jz5.f0.f384359a;
    }
}
