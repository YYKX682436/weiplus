package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d;

/* loaded from: classes9.dex */
public class e1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ViewOnClickListenerC19077xceb7df6f f260901d;

    public e1(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ViewOnClickListenerC19077xceb7df6f viewOnClickListenerC19077xceb7df6f) {
        this.f260901d = viewOnClickListenerC19077xceb7df6f;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/id_verify/WalletRealNameVerifyUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ViewOnClickListenerC19077xceb7df6f viewOnClickListenerC19077xceb7df6f = this.f260901d;
        linkedList.add(viewOnClickListenerC19077xceb7df6f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575032kh2));
        linkedList2.add(0);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c c19097xe6dc5b4c = viewOnClickListenerC19077xceb7df6f.f260770o;
        if (c19097xe6dc5b4c != null && c19097xe6dc5b4c.M) {
            linkedList.add(viewOnClickListenerC19077xceb7df6f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575031kh1));
            linkedList2.add(1);
        }
        db5.e1.b(this.f260901d, "", linkedList, linkedList2, "", new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.d1(this));
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/id_verify/WalletRealNameVerifyUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
