package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab;

/* loaded from: classes11.dex */
public final class g4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f235863d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.s4 f235864e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f235865f;

    public g4(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.s4 s4Var, java.lang.String str) {
        this.f235863d = z17;
        this.f235864e = s4Var;
        this.f235865f = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.Integer h17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView$updateFriend$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z17 = this.f235863d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.s4 s4Var = this.f235864e;
        if (z17) {
            int i17 = s4Var.f236084d.f235985d.g() == sr3.a.f493363f ? 5 : 0;
            rv.k3 k3Var = (rv.k3) i95.n0.c(rv.k3.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = s4Var.f236086e;
            java.lang.String input = this.f235865f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(input, "input");
            java.util.regex.Pattern compile = java.util.regex.Pattern.compile("(\\d+)");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(compile, "compile(...)");
            java.util.regex.Matcher matcher = compile.matcher(input);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(matcher, "matcher(...)");
            r26.m a17 = r26.u.a(matcher, 0, input);
            int intValue = (a17 == null || (h17 = r26.h0.h((java.lang.String) ((r26.q) a17).a().get(1))) == null) ? -1 : h17.intValue();
            vw.m2 m2Var = (vw.m2) k3Var;
            m2Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            p3325xe03a0797.p3326xc267989b.l.d(m2Var.f522218e, null, null, new vw.z1(intValue, i17, context, null), 3, null);
            gr3.b bVar = gr3.b.f356380a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.m0 m0Var = s4Var.f236084d;
            bVar.b(0L, 0L, 407L, 0L, (r29 & 16) != 0 ? 0L : 0L, (r29 & 32) != 0 ? "" : null, m0Var.f236000v, (r29 & 128) != 0 ? 0 : m0Var.L, (r29 & 256) != 0 ? 0 : 0);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.m0 m0Var2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.u0) s4Var.f236082c).f236136a;
            m0Var2.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactWidgetTabBizHeaderController", "click friend also read");
            tr3.b bVar2 = new tr3.b();
            bVar2.f502963a = 2102;
            bVar2.f502964b = false;
            tr3.a.f502959a.a(bVar2);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("hide_option_menu", true);
            intent.putExtra("rawUrl", m0Var2.f235995q.f470767e.f461046m);
            intent.putExtra("useJs", true);
            intent.putExtra("geta8key_scene", 3);
            j45.l.j(m0Var2.f235989h, "webview", ".ui.tools.WebViewUI", intent, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView$updateFriend$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
