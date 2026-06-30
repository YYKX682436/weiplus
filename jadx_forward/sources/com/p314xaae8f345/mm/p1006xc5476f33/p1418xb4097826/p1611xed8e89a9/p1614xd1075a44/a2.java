package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44;

/* loaded from: classes2.dex */
public final class a2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.d2 f206008d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.vr0 f206009e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f206010f;

    public a2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.d2 d2Var, r45.vr0 vr0Var, java.lang.String str) {
        this.f206008d = d2Var;
        this.f206009e = vr0Var;
        this.f206010f = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/widget/HeaderMemberWidget$handleMemberView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_member_inlet_source", 7);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.d2 d2Var = this.f206008d;
        intent.putExtra("key_self_flag", d2Var.f206047b);
        r45.vr0 vr0Var = this.f206009e;
        if (vr0Var.f469987d == 2) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).Hk(d2Var.f206046a, intent, this.f206010f, vr0Var.f469987d, vr0Var.f469988e);
        } else {
            d2Var.getClass();
            int i17 = vr0Var.f469988e;
            java.lang.String str = this.f206010f;
            boolean z17 = true;
            if (i17 != 1 && i17 != 2 && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, xy2.c.e(d2Var.f206046a))) {
                z17 = false;
            }
            if (z17) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).Gk(d2Var.f206046a, intent, str);
            } else if (vr0Var.f469988e == 0) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).Kk(d2Var.f206046a, intent, str);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/widget/HeaderMemberWidget$handleMemberView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
