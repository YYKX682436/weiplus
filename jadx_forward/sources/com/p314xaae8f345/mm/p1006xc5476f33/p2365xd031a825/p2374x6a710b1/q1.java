package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1;

/* loaded from: classes9.dex */
public class q1 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.x1 f262503d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.yt5 f262504e;

    public q1(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.x1 x1Var, r45.yt5 yt5Var) {
        this.f262503d = x1Var;
        this.f262504e = yt5Var;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/utils/WcPayViewEngineRender$2", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        this.f262503d.a(this.f262504e, new java.lang.Object[0]);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/utils/WcPayViewEngineRender$2", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }
}
