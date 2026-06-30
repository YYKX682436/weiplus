package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public final class h1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.i1 f285604d;

    public h1(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.i1 i1Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.v0 v0Var) {
        this.f285604d = i1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemAppBrandNotifyMsg$AppBrandNotifyMsgMoreViewClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) view.getTag();
        int mo79416xf806b362 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.q) view.getTag(com.p314xaae8f345.mm.R.id.bhl)).mo79416xf806b362();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppBrandNotifyMsg", "AppBrandNotityMsgMoreViewClickListener onclick");
        if (f9Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingItemAppBrandNotifyMsg", "AppBrandNotityMsgMoreViewClickListener, on more view click, but msg is null.");
            yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppBrandNotifyMsg$AppBrandNotifyMsgMoreViewClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        tt0.a a17 = tt0.a.a(f9Var.j());
        java.lang.String str = a17.f503312e;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.String str2 = str == null ? "" : str;
        java.lang.String str3 = a17.f503316i;
        java.lang.String str4 = str3 == null ? "" : str3;
        java.lang.String str5 = a17.f503309b;
        java.lang.String str6 = str5 == null ? "" : str5;
        java.lang.String str7 = a17.f503310c;
        java.lang.String str8 = str7 == null ? "" : str7;
        android.content.Context context = view.getContext();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.i1 i1Var = this.f285604d;
        ab5.i iVar = new ab5.i(context, i1Var.A ? 1 : 0, a17.f503311d);
        iVar.f84482u = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g1(this, iVar, str6, str2, str8, str4, mo79416xf806b362, view, f9Var);
        iVar.e(view);
        this.f285604d.e0(7, str2, str8, str4, null, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.i1.d0(i1Var, mo79416xf806b362));
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppBrandNotifyMsg$AppBrandNotifyMsgMoreViewClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
