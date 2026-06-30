package h93;

/* loaded from: classes11.dex */
public final class t extends h93.c {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f361262g;

    /* renamed from: h, reason: collision with root package name */
    public final int f361263h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f361262g = "MicroMsg.SearchLabelPanel";
        this.f361263h = 2;
    }

    @Override // h93.c
    public int P6() {
        return this.f361263h;
    }

    @Override // h93.c
    public java.lang.String R6() {
        return this.f361262g;
    }

    @Override // h93.c
    public void S6() {
        super.S6();
        android.view.View findViewById = V6().findViewById(com.p314xaae8f345.mm.R.id.obc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        ((android.widget.TextView) findViewById).setText(com.p314xaae8f345.mm.R.C30867xcad56011.o77);
    }

    @Override // h93.c
    public void U6(java.lang.String keyword, java.util.List list) {
        boolean containsKey;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyword, "keyword");
        if (list == null || list.isEmpty()) {
            android.view.View V6 = V6();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(V6, arrayList.toArray(), "com/tencent/mm/plugin/label/ui/label/SearchLabelPanel", "onSearchStateChanged", "(Ljava/lang/String;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            V6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(V6, "com/tencent/mm/plugin/label/ui/label/SearchLabelPanel", "onSearchStateChanged", "(Ljava/lang/String;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View V62 = V6();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(V62, arrayList2.toArray(), "com/tencent/mm/plugin/label/ui/label/SearchLabelPanel", "onSearchStateChanged", "(Ljava/lang/String;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        V62.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(V62, "com/tencent/mm/plugin/label/ui/label/SearchLabelPanel", "onSearchStateChanged", "(Ljava/lang/String;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        O6().e();
        java.util.Iterator it = list.iterator();
        boolean z17 = false;
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            h93.k Q6 = Q6();
            if (str == null) {
                Q6.getClass();
                containsKey = false;
            } else {
                containsKey = Q6.f361241d.containsKey(str);
            }
            O6().d(str, containsKey);
            if (str.equals(keyword)) {
                z17 = true;
            }
        }
        if (z17) {
            O6().m65210x44603e6c(false);
            return;
        }
        O6().m65210x44603e6c(true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1793xd1075a44.C16180x2cdd3130 O6 = O6();
        java.lang.String string = m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.o9z, keyword);
        O6.U = com.p314xaae8f345.mm.R.C30864xbddafb2a.e3p;
        O6.V = string;
        O6.x();
        O6.postInvalidate();
        O6().m65207xa356bd1f(new h93.s(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1793xd1075a44.C16180x2cdd3130 O62 = O6();
        if (O62.P) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.MMLabelPanel", "addNeedNewLabel.");
            db5.b7 b7Var = O62.R;
            if (b7Var == null || b7Var.f309830c == null) {
                O62.x();
            }
            O62.addView(O62.R.f309830c);
        }
    }

    public android.view.View V6() {
        android.view.View mo144222x4ff8c0f0 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.u8l);
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
