package h93;

/* loaded from: classes3.dex */
public final class q extends h93.c {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f361258g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f361258g = "MicroMsg.NotFoundPanel";
    }

    @Override // h93.c
    public int P6() {
        return 0;
    }

    @Override // h93.c
    public java.lang.String R6() {
        return this.f361258g;
    }

    @Override // h93.c
    public void S6() {
        super.S6();
        android.view.View V6 = V6();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(V6, arrayList.toArray(), "com/tencent/mm/plugin/label/ui/label/NotFoundPanel", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        V6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(V6, "com/tencent/mm/plugin/label/ui/label/NotFoundPanel", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332) V6().findViewById(com.p314xaae8f345.mm.R.id.f565439sz5)).setOnClickListener(new h93.p(this));
    }

    @Override // h93.c
    public void U6(java.lang.String keyword, java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyword, "keyword");
        if (list == null || (!list.isEmpty())) {
            android.view.View V6 = V6();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(V6, arrayList.toArray(), "com/tencent/mm/plugin/label/ui/label/NotFoundPanel", "onSearchStateChanged", "(Ljava/lang/String;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            V6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(V6, "com/tencent/mm/plugin/label/ui/label/NotFoundPanel", "onSearchStateChanged", "(Ljava/lang/String;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View V62 = V6();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(V62, arrayList2.toArray(), "com/tencent/mm/plugin/label/ui/label/NotFoundPanel", "onSearchStateChanged", "(Ljava/lang/String;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        V62.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(V62, "com/tencent/mm/plugin/label/ui/label/NotFoundPanel", "onSearchStateChanged", "(Ljava/lang/String;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.String m158362x2fec8307 = m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.o76);
        int L = r26.n0.L(m158362x2fec8307, "%s", 0, false, 6, null);
        java.lang.String substring = m158362x2fec8307.substring(0, L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
        java.lang.String substring2 = m158362x2fec8307.substring(L + 2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring2, "substring(...)");
        android.text.SpannableString spannableString = new android.text.SpannableString(substring + keyword + substring2);
        int length = substring.length();
        spannableString.setSpan(new android.text.style.ForegroundColorSpan(m158355x7444d5ad(com.p314xaae8f345.mm.R.C30859x5a72f63.f77734x48893d19)), length, keyword.length() + length, 33);
        O6().setTextColor(m158355x7444d5ad(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
        O6().setText(spannableString);
    }

    public android.view.View V6() {
        android.view.View mo144222x4ff8c0f0 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.f565438sz4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo144222x4ff8c0f0, "findViewById(...)");
        return mo144222x4ff8c0f0;
    }

    @Override // h93.c
    /* renamed from: W6, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332 O6() {
        android.view.View findViewById = V6().findViewById(com.p314xaae8f345.mm.R.id.sz6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        return (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332) findViewById;
    }
}
