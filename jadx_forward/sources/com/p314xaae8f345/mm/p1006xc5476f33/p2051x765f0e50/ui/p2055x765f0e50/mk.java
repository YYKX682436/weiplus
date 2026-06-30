package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes4.dex */
public final class mk implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17451x47a8746b f242867d;

    public mk(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17451x47a8746b activityC17451x47a8746b) {
        this.f242867d = activityC17451x47a8746b;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalInfoPreviewUI$initView$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.List y07 = e71.k.wi().y0();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(y07, 10));
        java.util.Iterator it = y07.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17451x47a8746b activityC17451x47a8746b = this.f242867d;
            if (!hasNext) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC17451x47a8746b.mo55332x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
                java.lang.String string = activityC17451x47a8746b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.isk);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                java.lang.String string2 = activityC17451x47a8746b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iwd);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.hk(activityC17451x47a8746b, mo55332x76847179, string, string2, new java.util.ArrayList(arrayList2)).show();
                yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalInfoPreviewUI$initView$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            e71.h hVar = (e71.h) it.next();
            java.lang.String field_name = hVar.f69207x225f1eb0;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_name, "field_name");
            java.lang.String field_devicetype = hVar.f69205xe7c5c6f5;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_devicetype, "field_devicetype");
            arrayList2.add(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ik(activityC17451x47a8746b, field_name, field_devicetype, k35.m1.f(activityC17451x47a8746b.mo55332x76847179(), hVar.f69204xad24a2e * 1000, true, false).toString()));
        }
    }
}
