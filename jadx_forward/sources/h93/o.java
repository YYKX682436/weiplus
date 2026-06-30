package h93;

/* loaded from: classes11.dex */
public final class o extends h93.c {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f361254g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f361255h;

    /* renamed from: i, reason: collision with root package name */
    public final int f361256i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f361254g = "MicroMsg.MyLabelPanel";
        this.f361255h = jz5.h.b(new h93.n(this));
        this.f361256i = 1;
    }

    @Override // h93.c
    public int P6() {
        return this.f361256i;
    }

    @Override // h93.c
    public java.lang.String R6() {
        return this.f361254g;
    }

    @Override // h93.c
    public void S6() {
        super.S6();
        android.view.View V6 = V6();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(V6, arrayList.toArray(), "com/tencent/mm/plugin/label/ui/label/MyLabelPanel", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        V6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(V6, "com/tencent/mm/plugin/label/ui/label/MyLabelPanel", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById = V6().findViewById(com.p314xaae8f345.mm.R.id.obc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        ((android.widget.TextView) findViewById).setText(com.p314xaae8f345.mm.R.C30867xcad56011.f573910o73);
        jz5.g gVar = this.f361255h;
        java.lang.Object mo141623x754a37bb = ((jz5.n) gVar).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        android.view.View view = (android.view.View) mo141623x754a37bb;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/label/ui/label/MyLabelPanel", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/label/ui/label/MyLabelPanel", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.Object mo141623x754a37bb2 = ((jz5.n) gVar).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
        ((android.view.View) mo141623x754a37bb2).setOnClickListener(new h93.l(this));
        O6().m65210x44603e6c(true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1793xd1075a44.C16180x2cdd3130 O6 = O6();
        O6.U = com.p314xaae8f345.mm.R.C30864xbddafb2a.e3p;
        O6.V = null;
        O6.x();
        O6.postInvalidate();
        O6().m65207xa356bd1f(new h93.m(this));
    }

    @Override // h93.c
    public void T6(java.util.ArrayList selectedList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectedList, "selectedList");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Set<java.lang.String> keySet = Q6().f361243f.f420231a.keySet();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keySet, "<get-keys>(...)");
        for (java.lang.String str : keySet) {
            if (selectedList.contains(str)) {
                arrayList.add(str);
            } else {
                arrayList2.add(str);
            }
        }
        arrayList.addAll(arrayList2);
        O6().r(selectedList, arrayList);
        O6().v(this.f361228e, this.f361227d, "3", 33926);
    }

    @Override // h93.c
    public void U6(java.lang.String keyword, java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyword, "keyword");
        if (list != null) {
            android.view.View V6 = V6();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(V6, arrayList.toArray(), "com/tencent/mm/plugin/label/ui/label/MyLabelPanel", "onSearchStateChanged", "(Ljava/lang/String;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            V6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(V6, "com/tencent/mm/plugin/label/ui/label/MyLabelPanel", "onSearchStateChanged", "(Ljava/lang/String;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View V62 = V6();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(V62, arrayList2.toArray(), "com/tencent/mm/plugin/label/ui/label/MyLabelPanel", "onSearchStateChanged", "(Ljava/lang/String;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        V62.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(V62, "com/tencent/mm/plugin/label/ui/label/MyLabelPanel", "onSearchStateChanged", "(Ljava/lang/String;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public android.view.View V6() {
        android.view.View mo144222x4ff8c0f0 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.u8j);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo144222x4ff8c0f0, "findViewById(...)");
        return mo144222x4ff8c0f0;
    }

    @Override // h93.c
    /* renamed from: W6, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1793xd1075a44.C16180x2cdd3130 O6() {
        android.view.View findViewById = V6().findViewById(com.p314xaae8f345.mm.R.id.u8i);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1793xd1075a44.C16180x2cdd3130) findViewById;
    }
}
