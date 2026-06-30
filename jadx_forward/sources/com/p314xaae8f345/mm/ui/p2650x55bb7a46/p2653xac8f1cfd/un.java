package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public final class un implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ho f281626d;

    public un(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ho hoVar) {
        this.f281626d = hoVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/TranslateWhileWriteComponent$initControllerView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ho hoVar = this.f281626d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = ((com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) ((jz5.n) hoVar.f280717n).mo141623x754a37bb()).mo7946xf939df19();
        if (mo7946xf939df19 != null) {
            mo7946xf939df19.m8146xced61ae5();
        }
        if (hoVar.f280725v > 0) {
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb) ((sb5.s0) hoVar.f280113d.f542241c.a(sb5.s0.class))).f280796e.A0();
            hoVar.f280726w.add(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.co(hoVar));
        } else {
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2) ((jz5.n) hoVar.f280719p).mo141623x754a37bb()).C();
        }
        java.lang.String x17 = hoVar.f280113d.x();
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
        c6980x787b3d28.p("4");
        c6980x787b3d28.q(x17);
        c6980x787b3d28.k();
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/TranslateWhileWriteComponent$initControllerView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
