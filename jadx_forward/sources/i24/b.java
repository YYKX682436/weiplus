package i24;

/* loaded from: classes4.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f369616d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2067x76e956e7.p2069x59a10c41.C17573xff4753cb f369617e;

    public b(android.widget.LinearLayout linearLayout, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2067x76e956e7.p2069x59a10c41.C17573xff4753cb c17573xff4753cb) {
        this.f369616d = linearLayout;
        this.f369617e = c17573xff4753cb;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View v17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(v17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting_new/settings/friend_privacy/privacy_sns/SettingActivityItemTimelineRecentShow$onClick$listener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        android.widget.LinearLayout linearLayout = this.f369616d;
        int childCount = linearLayout.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = linearLayout.getChildAt(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(childAt, "null cannot be cast to non-null type android.widget.TextView");
            android.widget.TextView textView = (android.widget.TextView) childAt;
            if (com.p314xaae8f345.mm.R.id.f568867ob5 != textView.getId()) {
                textView.setContentDescription(((java.lang.Object) textView.getText()) + textView.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571376db));
                textView.setCompoundDrawablesWithIntrinsicBounds(com.p314xaae8f345.mm.R.raw.f80936xc6307b2b, 0, 0, 0);
            }
        }
        android.widget.TextView textView2 = (android.widget.TextView) v17;
        textView2.setCompoundDrawablesWithIntrinsicBounds(com.p314xaae8f345.mm.R.raw.f80939xfe2298a3, 0, 0, 0);
        v17.setContentDescription(((java.lang.Object) textView2.getText()) + v17.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d_));
        r45.cb6 cb6Var = new r45.cb6();
        p94.j0 c17 = p94.w0.c();
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2067x76e956e7.p2069x59a10c41.C17573xff4753cb c17573xff4753cb = this.f369617e;
        if (c17 != null) {
            cb6Var = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.e2) p94.w0.c()).b1(c17573xff4753cb.f243476u);
        }
        if (cb6Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SettingActivityItemTimelineRecentShow", "on recent item click, userinof is null, selfName:" + c17573xff4753cb.f243476u);
            yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting_new/settings/friend_privacy/privacy_sns/SettingActivityItemTimelineRecentShow$onClick$listener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.lang.Object tag = v17.getTag();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) tag).intValue();
        if (intValue == 0) {
            if (c17573xff4753cb.f243475t == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14090, 4);
            }
            c17573xff4753cb.f243471p = false;
            c17573xff4753cb.f243472q = true;
            c17573xff4753cb.f243474s = false;
            c17573xff4753cb.f243473r = true;
        } else if (intValue == 1) {
            if (c17573xff4753cb.f243475t == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14090, 5);
            }
            c17573xff4753cb.f243471p = true;
            c17573xff4753cb.f243472q = false;
            c17573xff4753cb.f243474s = false;
            c17573xff4753cb.f243473r = true;
        } else if (intValue != 3) {
            if (c17573xff4753cb.f243475t == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14090, 6);
            }
            c17573xff4753cb.f243471p = false;
            c17573xff4753cb.f243472q = false;
            c17573xff4753cb.f243474s = false;
            c17573xff4753cb.f243473r = true;
        } else {
            c17573xff4753cb.f243471p = false;
            c17573xff4753cb.f243472q = false;
            c17573xff4753cb.f243474s = true;
            c17573xff4753cb.f243473r = true;
        }
        if (p94.w0.c() != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.e2) p94.w0.c()).K1(c17573xff4753cb.f243476u, c17573xff4753cb.f243471p, c17573xff4753cb.f243472q, c17573xff4753cb.f243473r, c17573xff4753cb.f243474s);
        }
        if (p94.w0.c() != null) {
            r45.cb6 W0 = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.e2) p94.w0.c()).W0(c17573xff4753cb.f243476u, c17573xff4753cb.f243471p, c17573xff4753cb.f243472q, c17573xff4753cb.f243473r, c17573xff4753cb.f243474s);
            if (W0 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SettingActivityItemTimelineRecentShow", "before oplog, userinof is null, selfName:" + c17573xff4753cb.f243476u);
                yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting_new/settings/friend_privacy/privacy_sns/SettingActivityItemTimelineRecentShow$onClick$listener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingActivityItemTimelineRecentShow", "before oplog, userinof is not null, selfName:" + c17573xff4753cb.f243476u);
            ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(51, W0));
        }
        v17.post(new i24.a(linearLayout, c17573xff4753cb));
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting_new/settings/friend_privacy/privacy_sns/SettingActivityItemTimelineRecentShow$onClick$listener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
