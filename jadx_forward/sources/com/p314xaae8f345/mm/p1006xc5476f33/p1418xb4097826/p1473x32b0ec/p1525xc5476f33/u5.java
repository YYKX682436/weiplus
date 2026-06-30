package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class u5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v5 f196055d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f196056e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v5 v5Var, java.lang.String str) {
        super(1);
        this.f196055d = v5Var;
        this.f196056e = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v5 v5Var = this.f196055d;
        if (booleanValue) {
            v5Var.f196197t.mo48813x58998cd();
            android.content.Intent intent = new android.content.Intent();
            android.view.ViewGroup viewGroup = v5Var.f446856d;
            intent.setClass(viewGroup.getContext(), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14029x8a59e676.class);
            intent.putExtra("enterRealnameVerifyUI", true);
            android.content.Context context = viewGroup.getContext();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorExceptionPlugin$showFaceVerify$1", "invoke", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorExceptionPlugin$showFaceVerify$1", "invoke", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            ((ml2.j0) i95.n0.c(ml2.j0.class)).Jj(ml2.d3.f408889f, this.f196056e);
        } else {
            qo0.c.a(v5Var.f196193p, qo0.b.f446896i, null, 2, null);
        }
        return jz5.f0.f384359a;
    }
}
