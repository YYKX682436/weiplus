package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes4.dex */
public final class lk implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17451x47a8746b f242832d;

    public lk(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17451x47a8746b activityC17451x47a8746b) {
        this.f242832d = activityC17451x47a8746b;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalInfoPreviewUI$initView$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17451x47a8746b activityC17451x47a8746b = this.f242832d;
        java.util.List<s71.b> list = activityC17451x47a8746b.f242132e;
        if (list != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
            for (s71.b bVar : list) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                if (!android.text.TextUtils.isEmpty(bVar.f485505f)) {
                    sb6.append(bVar.f485505f);
                }
                if (!android.text.TextUtils.isEmpty(bVar.f485506g)) {
                    sb6.append(" ");
                    sb6.append(bVar.f485506g);
                }
                if (!android.text.TextUtils.isEmpty(bVar.f485507h)) {
                    sb6.append(" ");
                    sb6.append(bVar.f485507h);
                }
                if (!android.text.TextUtils.isEmpty(bVar.f485513q)) {
                    sb6.append(" ");
                    sb6.append(bVar.f485513q);
                }
                if (!android.text.TextUtils.isEmpty(bVar.f485509m)) {
                    sb6.append(" ");
                    sb6.append(bVar.f485509m);
                }
                java.lang.String str = bVar.f485510n + (char) 65292 + bVar.f485511o;
                java.lang.String sb7 = sb6.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
                arrayList2.add(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ik(activityC17451x47a8746b, str, sb7, ""));
            }
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC17451x47a8746b.mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
            java.lang.String string = activityC17451x47a8746b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ipa);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            java.lang.String string2 = activityC17451x47a8746b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iwc);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.hk(activityC17451x47a8746b, mo55332x76847179, string, string2, new java.util.ArrayList(arrayList2)).show();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalInfoPreviewUI$initView$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
