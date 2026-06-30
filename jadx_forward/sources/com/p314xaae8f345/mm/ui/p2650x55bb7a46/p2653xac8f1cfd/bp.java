package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public final class bp implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.gp f280387d;

    public bp(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.gp gpVar) {
        this.f280387d = gpVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/VoiceTipsBubble$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.gp gpVar = this.f280387d;
        gpVar.f280658h = false;
        gpVar.dismiss();
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/VoiceTipsBubble$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
