package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class o3 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14304xa96e914e f198088a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f198089b;

    public o3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14304xa96e914e c14304xa96e914e, android.content.Context context) {
        this.f198088a = c14304xa96e914e;
        this.f198089b = context;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3
    public final void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14304xa96e914e c14304xa96e914e = this.f198088a;
        if (c14304xa96e914e.f197361g) {
            yz5.q qVar = c14304xa96e914e.f197358d;
            android.content.Context context = this.f198089b;
            if (qVar != null) {
                qVar.mo147xb9724478(context, null, 0);
            }
            c14304xa96e914e.f197362h.mo48813x58998cd();
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14029x8a59e676.class);
            intent.putExtra("enterRealnameVerifyUI", true);
            android.content.Context context2 = this.f198089b;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveCommentPostRealNamePanel$init$2", "onClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context2, "com/tencent/mm/plugin/finder/live/view/FinderLiveCommentPostRealNamePanel$init$2", "onClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            ((ml2.r0) i95.n0.c(ml2.r0.class)).Dk(ml2.d4.f408895f);
        }
    }
}
