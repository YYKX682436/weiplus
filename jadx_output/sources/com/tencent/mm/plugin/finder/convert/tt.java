package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class tt implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f104645a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.ut f104646b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f104647c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.q1 f104648d;

    public tt(android.view.View view, com.tencent.mm.plugin.finder.convert.ut utVar, int i17, so2.q1 q1Var) {
        this.f104645a = view;
        this.f104646b = utVar;
        this.f104647c = i17;
        this.f104648d = q1Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        android.content.Intent intent;
        jz5.l[] lVarArr = new jz5.l[4];
        android.app.Activity a17 = q75.a.a(this.f104645a.getContext());
        java.lang.String stringExtra = (a17 == null || (intent = a17.getIntent()) == null) ? null : intent.getStringExtra("finder_username");
        if (stringExtra == null) {
            stringExtra = "";
        }
        lVarArr[0] = new jz5.l("finderuin", stringExtra);
        lVarArr[1] = new jz5.l("report_session_id", this.f104646b.f104739e);
        lVarArr[2] = new jz5.l(ya.b.INDEX, java.lang.String.valueOf(this.f104647c));
        bw5.q5 q5Var = this.f104648d.f410545d;
        java.lang.String str2 = q5Var.hasFieldNumber(50) ? q5Var.Z : "";
        lVarArr[3] = new jz5.l("action_info", str2 != null ? str2 : "");
        return kz5.c1.k(lVarArr);
    }
}
