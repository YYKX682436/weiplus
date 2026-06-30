package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes7.dex */
public class q7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f281289d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f281290e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.n7 f281291f;

    public q7(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.n7 n7Var, boolean z17, android.content.Context context) {
        this.f281291f = n7Var;
        this.f281289d = z17;
        this.f281290e = context;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/ChattingServiceNotifyComponent$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z17 = this.f281289d;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.n7 n7Var = this.f281291f;
        if (z17) {
            android.content.Context context = this.f281290e;
            n7Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k6 k6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k6.class);
            java.lang.String str = n7Var.f281082e;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.t2) k6Var).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12663x79416297.V6(context, str, 5, null, true, null, null, null);
        } else {
            android.content.Context context2 = this.f281290e;
            n7Var.getClass();
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(context2, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2.class);
            intent.putExtra("Contact_User", n7Var.f281082e);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(context2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/component/ChattingServiceNotifyComponent", "startContactUIActivity", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(context2, "com/tencent/mm/ui/chatting/component/ChattingServiceNotifyComponent", "startContactUIActivity", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(21825, 6, n7Var.f281082e, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()), null, null, 0, 0, 0, java.lang.Integer.valueOf(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.qg.c(n7Var.f281082e)), te5.v1.f500291b);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/ChattingServiceNotifyComponent$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
