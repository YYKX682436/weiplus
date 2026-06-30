package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public final class t4 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f281494d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.v4 f281495e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sb5.z f281496f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f281497g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de f281498h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f281499i;

    public t4(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.v4 v4Var, sb5.z zVar, long j17, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de, int i17) {
        this.f281494d = c1163xf1deaba4;
        this.f281495e = v4Var;
        this.f281496f = zVar;
        this.f281497g = j17;
        this.f281498h = c1162x665295de;
        this.f281499i = i17;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f281494d;
        if (!c1163xf1deaba4.getViewTreeObserver().isAlive()) {
            return true;
        }
        c1163xf1deaba4.getViewTreeObserver().removeOnPreDrawListener(this);
        int mo75761x118cb524 = this.f281495e.f280113d.p().mo75761x118cb524();
        int H0 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) this.f281496f).H0(this.f281497g);
        if (H0 < 0) {
            return true;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = this.f281498h;
        int i17 = H0 + mo75761x118cb524;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(this.f281499i));
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c1162x665295de, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/ChattingItemMediaGroupExpandComponent$onExitEditMode$listener$1", "onPreDraw", "()Z", "Undefined", "scrollToPositionWithOffset", "(II)V");
        c1162x665295de.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.f(c1162x665295de, "com/tencent/mm/ui/chatting/component/ChattingItemMediaGroupExpandComponent$onExitEditMode$listener$1", "onPreDraw", "()Z", "Undefined", "scrollToPositionWithOffset", "(II)V");
        return false;
    }
}
