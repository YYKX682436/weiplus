package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public class q3 extends android.widget.LinearLayout implements r01.v {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f288662d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.LinearLayout f288663e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f288664f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.Map f288665g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f288666h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2690x38b72420.p3 f288667i;

    public q3(android.content.Context context, com.p314xaae8f345.mm.ui.p2690x38b72420.p3 p3Var) {
        super(context);
        this.f288663e = null;
        this.f288662d = context;
        this.f288667i = p3Var;
        b();
    }

    @Override // r01.v
    public void a(r01.u uVar) {
        qk.o oVar = uVar.f449787c;
        if (oVar == null) {
            return;
        }
        if (oVar.I0()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.ui.p2690x38b72420.o3(this));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EnterpriseBizView", "onEvent, not enterprise father");
        }
    }

    public void b() {
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.ui.p2690x38b72420.n3(this));
    }

    /* renamed from: getEnterpriseFriendCount */
    public int m80428x7002593a() {
        java.util.List list = this.f288664f;
        if (list == null || this.f288666h == null) {
            return 0;
        }
        return list.size() + this.f288666h.size();
    }
}
