package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes.dex */
public final class a1 implements com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f282307a;

    /* renamed from: b, reason: collision with root package name */
    public final int f282308b;

    /* renamed from: c, reason: collision with root package name */
    public final int f282309c;

    public a1(android.view.View view, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        this.f282307a = view;
        this.f282308b = i17;
        this.f282309c = i18;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.c1
    public int a() {
        android.view.View view = this.f282307a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/FlexibleHideViewItem", "compress", "()I", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/gallery/FlexibleHideViewItem", "compress", "()I", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return 0;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.c1
    /* renamed from: getMinWidth */
    public int mo79581x29d8f80a() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.c1
    /* renamed from: getPriority */
    public int mo79582x3662b71a() {
        return this.f282309c;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.c1
    /* renamed from: getWidth */
    public int mo79583x755bd410() {
        if (this.f282307a.getVisibility() == 0) {
            return this.f282308b;
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.c1
    /* renamed from: reset */
    public int mo79584x6761d4f() {
        return mo79583x755bd410();
    }
}
