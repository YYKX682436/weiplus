package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes.dex */
public final class n7 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13984x21e25c61 f191861a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f191862b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f191863c;

    public n7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13984x21e25c61 activityC13984x21e25c61, java.lang.String str, long j17) {
        this.f191861a = activityC13984x21e25c61;
        this.f191862b = str;
        this.f191863c = j17;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13984x21e25c61 activityC13984x21e25c61 = this.f191861a;
        if (i17 == 0 && fVar.f152149b == 0) {
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(activityC13984x21e25c61.mo55332x76847179(), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14045x34601d2c.class);
            r45.ke2 ke2Var = new r45.ke2();
            ke2Var.set(0, ((r45.jv1) fVar.f152151d).m75941xfb821914(1));
            ke2Var.set(2, java.lang.Integer.valueOf(((r45.jv1) fVar.f152151d).m75939xb282bd08(3)));
            ke2Var.set(1, ((r45.jv1) fVar.f152151d).m75934xbce7f2f(2));
            intent.putExtra("finderlivehistoryparamvotinginfo", ke2Var.mo14344x5f01b1f6());
            intent.putExtra("finderlivedetailparamusername", this.f191862b);
            intent.putExtra("finderlivehistoryparamobjectid", this.f191863c);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC13984x21e25c61.mo55332x76847179();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(mo55332x76847179, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveAnchorCreateVoteUI$onCreate$1$1", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            mo55332x76847179.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(mo55332x76847179, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveAnchorCreateVoteUI$onCreate$1$1", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            db5.t7.g(activityC13984x21e25c61.mo55332x76847179(), activityC13984x21e25c61.mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ejg));
        }
        return jz5.f0.f384359a;
    }
}
