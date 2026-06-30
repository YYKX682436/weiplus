package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes3.dex */
public class gh implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f280636d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ah f280637e;

    public gh(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ah ahVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f280637e = ahVar;
        this.f280636d = f9Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ah ahVar = this.f280637e;
        intent.setClassName(ahVar.f280113d.g(), "com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f280636d;
        intent.putExtra("Retr_Msg_Id", f9Var.m124847x74d37ac6());
        intent.putExtra("Retr_MsgTalker", f9Var.Q0());
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b = ahVar.f280113d.f542250l;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(abstractC21611x7536149b, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/MessBoxComponent$6", "invoke", "()Lkotlin/Unit;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        abstractC21611x7536149b.mo7585xa4df9991((android.content.Intent) arrayList.get(0));
        yj0.a.f(abstractC21611x7536149b, "com/tencent/mm/ui/chatting/component/MessBoxComponent$6", "invoke", "()Lkotlin/Unit;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return null;
    }
}
