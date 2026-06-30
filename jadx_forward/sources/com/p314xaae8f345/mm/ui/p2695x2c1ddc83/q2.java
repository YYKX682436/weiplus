package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public final class q2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f289526d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f289527e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2 f289528f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f289529g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f289530h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.l4 f289531i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(android.app.Activity activity, android.content.Intent intent, com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2 p2Var, android.view.View view, int i17, com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var) {
        super(1);
        this.f289526d = activity;
        this.f289527e = intent;
        this.f289528f = p2Var;
        this.f289529g = view;
        this.f289530h = i17;
        this.f289531i = l4Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bool);
        if (bool.booleanValue()) {
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.u2.f289625a.a(this.f289526d, this.f289527e);
            o25.q.f424107a.d().clear();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizImagePreloadStrategy", "do clearQueue");
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2 p2Var = this.f289528f;
            if (p2Var != null) {
                java.lang.String h17 = this.f289531i.h1();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h17, "getKey(...)");
                p2Var.b(this.f289529g, this.f289530h, h17);
            }
        }
        return jz5.f0.f384359a;
    }
}
