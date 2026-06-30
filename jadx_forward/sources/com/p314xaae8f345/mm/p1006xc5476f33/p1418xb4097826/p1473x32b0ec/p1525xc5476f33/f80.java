package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class f80 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.i80 f194051d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.f0 f194052e;

    public f80(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.i80 i80Var, cm2.f0 f0Var) {
        this.f194051d = i80Var;
        this.f194052e = f0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveRedPacketBubble$refreshBtnStatus$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.i80 i80Var = this.f194051d;
        yz5.l lVar = i80Var.f194473g;
        if (lVar != null) {
            lVar.mo146xb9724478(this.f194052e);
        }
        android.content.Context context = i80Var.f194470d;
        db5.t7.i(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.e9k), com.p314xaae8f345.mm.R.raw.f79770xc84f57c6);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRedPacketBubble$refreshBtnStatus$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
