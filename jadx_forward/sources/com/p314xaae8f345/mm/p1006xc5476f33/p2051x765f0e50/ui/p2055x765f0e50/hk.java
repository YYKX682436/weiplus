package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes4.dex */
public final class hk extends hg5.d {

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f242648r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f242649s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.ArrayList f242650t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17451x47a8746b activityC17451x47a8746b, android.content.Context context, java.lang.String title, java.lang.String empty, java.util.ArrayList data) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(empty, "empty");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f242648r = title;
        this.f242649s = empty;
        this.f242650t = data;
    }

    @Override // hg5.d
    public android.view.View F() {
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bj6, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return inflate;
    }

    @Override // hg5.d
    public void G() {
        super.G();
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.odf);
        if (textView != null) {
            textView.setText(this.f242648r);
        }
        java.util.ArrayList arrayList = this.f242650t;
        if (arrayList == null || arrayList.isEmpty()) {
            android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.lqa);
            if (findViewById != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalInfoPreviewUI$HalfScreenAddressDlg", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/setting/ui/setting/SettingsPersonalInfoPreviewUI$HalfScreenAddressDlg", "initContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f565761dg2);
            if (textView2 != null) {
                textView2.setText(this.f242649s);
                textView2.setVisibility(0);
            }
        } else {
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) findViewById(com.p314xaae8f345.mm.R.id.lqa);
            if (c22849x81a93d25 != null) {
                c22849x81a93d25.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(c22849x81a93d25.getContext(), 1, false));
                c22849x81a93d25.mo7960x6cab2c8d(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.fk(new in5.s() { // from class: com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoPreviewUI$HalfScreenAddressDlg$buildItemConverts$1
                    @Override // in5.s
                    /* renamed from: getItemConvert */
                    public in5.r mo43555xf2bb75ea(int type) {
                        return new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ek(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.hk.this);
                    }
                }, arrayList));
            }
        }
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.f565291bz2);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.gk(this));
        }
    }
}
