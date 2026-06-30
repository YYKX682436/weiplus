package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public final class wn extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ho f281718d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wn(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ho hoVar) {
        super(2);
        this.f281718d = hoVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str;
        android.view.View view = (android.view.View) obj;
        android.view.MotionEvent event = (android.view.MotionEvent) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ho hoVar = this.f281718d;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.C21668xed8974f2 c21668xed8974f2 = hoVar.f280716m;
        if (c21668xed8974f2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("resultTv");
            throw null;
        }
        java.lang.String f280092n = c21668xed8974f2.getF280092n();
        android.content.Intent intent = new android.content.Intent(hoVar.f280113d.g(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21642xe60a98f.class);
        intent.addFlags(67108864);
        intent.putExtra("key_chat_text", f280092n);
        intent.putExtra("key_chat_preview_hide_toolbar", true);
        android.app.Activity g17 = hoVar.f280113d.g();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(g17, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/TranslateWhileWriteComponent", "startPreviewUI", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        g17.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(g17, "com/tencent/mm/ui/chatting/component/TranslateWhileWriteComponent", "startPreviewUI", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        db5.f.j(hoVar.f280113d.g());
        hoVar.f280727x = true;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb) ((sb5.s0) hoVar.f280113d.f542241c.a(sb5.s0.class))).f280796e;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        c19666xfd6e2f33.m75494x9cbd38c1(bool);
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
        c6980x787b3d28.p("5");
        c6980x787b3d28.q(x17);
        c6980x787b3d28.k();
        return bool;
    }
}
