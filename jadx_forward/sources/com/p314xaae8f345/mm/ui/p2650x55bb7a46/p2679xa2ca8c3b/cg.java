package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes11.dex */
public class cg implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f285258d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ot0.q0 f285259e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ot0.r0 f285260f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.zf f285261g;

    public cg(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.zf zfVar, int i17, ot0.q0 q0Var, ot0.r0 r0Var) {
        this.f285261g = zfVar;
        this.f285258d = i17;
        this.f285259e = q0Var;
        this.f285260f = r0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = this.f285258d == 1 ? 11 : 12;
        eq1.h hVar = eq1.h.f337345a;
        ot0.q0 q0Var = this.f285259e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 d17 = hVar.d(q0Var.f430274g, q0Var.f430273f);
        java.lang.String str = q0Var.f430274g;
        java.lang.String str2 = q0Var.f430272e;
        ot0.r0 r0Var = this.f285260f;
        hVar.g(i17, str, d17, str2, r0Var.f430111f);
        int j17 = ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).j(r0Var.f430111f);
        zq1.a0 a0Var = (zq1.a0) gm0.j1.s(zq1.a0.class);
        ((yq1.z) a0Var).s(this.f285261g.f287667s.g(), r0Var.f430111f, q0Var.f430274g, i17, j17, d17 == null ? null : d17.m76794xd0557130());
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
