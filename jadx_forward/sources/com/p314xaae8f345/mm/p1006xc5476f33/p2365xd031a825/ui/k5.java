package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes11.dex */
public class k5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f261906d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f261907e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f261908f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f261909g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f261910h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f261911i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19116x82bf90f1 f261912m;

    public k5(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19116x82bf90f1 activityC19116x82bf90f1, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, java.lang.String str5) {
        this.f261912m = activityC19116x82bf90f1;
        this.f261906d = str;
        this.f261907e = str2;
        this.f261908f = str3;
        this.f261909g = str4;
        this.f261910h = i17;
        this.f261911i = str5;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoNewUI$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOrderInfoNewUI", "leadViewInfo click jump status");
        pj4.q qVar = new pj4.q();
        qVar.f436788d = this.f261906d;
        qVar.f436789e = this.f261907e;
        bi4.n1 n1Var = new bi4.n1(null);
        n1Var.f436495d = this.f261908f;
        n1Var.f436496e = qVar;
        n1Var.f436503o = java.lang.String.valueOf(8);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19116x82bf90f1 activityC19116x82bf90f1 = this.f261912m;
        g0Var.d(24498, 1, activityC19116x82bf90f1.f261565p);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p765xa4f4bf5f.C10691x3b04d9e9) ((xe0.g0) i95.n0.c(xe0.g0.class))).Ui(activityC19116x82bf90f1.mo55332x76847179(), n1Var, new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.j5(this));
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoNewUI$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
