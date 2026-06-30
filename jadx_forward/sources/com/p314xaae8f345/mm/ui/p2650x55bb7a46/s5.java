package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public class s5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ot0.s0 f284194d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f284195e;

    public s5(ot0.s0 s0Var, java.lang.String str) {
        this.f284194d = s0Var;
        this.f284195e = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/ChattingItemHelper$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag();
        ot0.s0 s0Var = this.f284194d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemHelper", "on app brand(%s) button1 click", s0Var.f430308r);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625 c6113xa3727625 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625();
        java.lang.String str = s0Var.f430308r;
        am.nx nxVar = c6113xa3727625.f136390g;
        nxVar.f88999a = str;
        nxVar.f89000b = s0Var.f430309s;
        nxVar.f89001c = s0Var.f430311u;
        nxVar.f89007i = s0Var.f430310t;
        nxVar.f89011m = true;
        nxVar.f89002d = 1076;
        nxVar.f89003e = this.f284195e + ":" + erVar.c().I0() + ":" + erVar.B;
        c6113xa3727625.e();
        yj0.a.h(this, "com/tencent/mm/ui/chatting/ChattingItemHelper$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
