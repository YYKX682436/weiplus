package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes5.dex */
public final class pb extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.tb f242966d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pb(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.tb tbVar) {
        super(0);
        this.f242966d = tbVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.tb tbVar = this.f242966d;
        android.app.Activity context = tbVar.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.hb hbVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.hb) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.hb.class);
        java.lang.String str = tbVar.f243103d;
        if (str == null) {
            str = "";
        }
        hbVar.getClass();
        hbVar.X6();
        android.content.Intent intent = new android.content.Intent(hbVar.m80379x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2694xe7814c81.ActivityC22353x5623e3da.class);
        intent.putExtra("change_bind_email", str);
        pf5.j0.a(intent, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.nb.class);
        pf5.j0.a(intent, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.hb.class);
        lk5.s.e(intent, true);
        android.app.Activity m80379x76847179 = hbVar.m80379x76847179();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m80379x76847179, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsEmailCgiUIC", "changeEmailAddress", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        m80379x76847179.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(m80379x76847179, "com/tencent/mm/plugin/setting/ui/setting/SettingsEmailCgiUIC", "changeEmailAddress", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return jz5.f0.f384359a;
    }
}
