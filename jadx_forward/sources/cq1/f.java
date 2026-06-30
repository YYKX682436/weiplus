package cq1;

/* loaded from: classes8.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.p00 f302883d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.biz.p1284xc9e135a5.ActivityC12955x181c0197 f302884e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.r00 f302885f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dq1.b f302886g;

    public f(r45.p00 p00Var, com.p314xaae8f345.mm.p1006xc5476f33.biz.p1284xc9e135a5.ActivityC12955x181c0197 activityC12955x181c0197, r45.r00 r00Var, dq1.b bVar) {
        this.f302883d = p00Var;
        this.f302884e = activityC12955x181c0197;
        this.f302885f = r00Var;
        this.f302886g = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/biz/scheme/BizComSchIntermediateUI$initBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = this.f302883d.f464176d;
        cq1.b[] bVarArr = cq1.b.f302861d;
        com.p314xaae8f345.mm.p1006xc5476f33.biz.p1284xc9e135a5.ActivityC12955x181c0197 activityC12955x181c0197 = this.f302884e;
        if (i17 == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.biz.p1284xc9e135a5.ActivityC12955x181c0197.T6(activityC12955x181c0197, this.f302885f, this.f302886g);
        } else {
            cq1.b[] bVarArr2 = cq1.b.f302861d;
            if (i17 == 1) {
                int i18 = com.p314xaae8f345.mm.p1006xc5476f33.biz.p1284xc9e135a5.ActivityC12955x181c0197.f175405v;
                activityC12955x181c0197.a7();
            } else {
                activityC12955x181c0197.Z6();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/biz/scheme/BizComSchIntermediateUI$initBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
