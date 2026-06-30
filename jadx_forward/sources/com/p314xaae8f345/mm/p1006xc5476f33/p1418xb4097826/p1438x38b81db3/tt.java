package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class tt implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f186178a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ut f186179b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f186180c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.q1 f186181d;

    public tt(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ut utVar, int i17, so2.q1 q1Var) {
        this.f186178a = view;
        this.f186179b = utVar;
        this.f186180c = i17;
        this.f186181d = q1Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        android.content.Intent intent;
        jz5.l[] lVarArr = new jz5.l[4];
        android.app.Activity a17 = q75.a.a(this.f186178a.getContext());
        java.lang.String stringExtra = (a17 == null || (intent = a17.getIntent()) == null) ? null : intent.getStringExtra("finder_username");
        if (stringExtra == null) {
            stringExtra = "";
        }
        lVarArr[0] = new jz5.l("finderuin", stringExtra);
        lVarArr[1] = new jz5.l("report_session_id", this.f186179b.f186272e);
        lVarArr[2] = new jz5.l(ya.b.f77479x42930b2, java.lang.String.valueOf(this.f186180c));
        bw5.q5 q5Var = this.f186181d.f492078d;
        java.lang.String str2 = q5Var.m12793x6e095e9(50) ? q5Var.Z : "";
        lVarArr[3] = new jz5.l("action_info", str2 != null ? str2 : "");
        return kz5.c1.k(lVarArr);
    }
}
