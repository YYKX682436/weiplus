package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public final class sn implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ho f281487d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.mg f281488e;

    public sn(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ho hoVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.mg mgVar) {
        this.f281487d = hoVar;
        this.f281488e = mgVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/TranslateWhileWriteComponent$createChooseLanRecyclerView$1$1$getItemConvert$1$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = this.f281488e.f281039d;
        java.util.Map map = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ho.E;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ho hoVar = this.f281487d;
        hoVar.v0(i17);
        java.lang.String x17 = hoVar.f280113d.x();
        java.lang.String m07 = hoVar.m0();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6980x787b3d28 c6980x787b3d28 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6980x787b3d28();
        if (pn4.f1.f438638a.length() == 0) {
            str = java.util.UUID.randomUUID().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "toString(...)");
            pn4.f1.f438638a = str;
        } else {
            str = pn4.f1.f438638a;
        }
        c6980x787b3d28.r(str);
        c6980x787b3d28.f142884f = 2;
        c6980x787b3d28.p(m07);
        c6980x787b3d28.q(x17);
        c6980x787b3d28.k();
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2) ((jz5.n) hoVar.f280719p).mo141623x754a37bb()).B();
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/TranslateWhileWriteComponent$createChooseLanRecyclerView$1$1$getItemConvert$1$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
