package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public final class s4 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f281437d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.v4 f281438e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sb5.z f281439f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de f281440g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f281441h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f281442i;

    public s4(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.v4 v4Var, sb5.z zVar, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de, int i17, long j17) {
        this.f281437d = c1163xf1deaba4;
        this.f281438e = v4Var;
        this.f281439f = zVar;
        this.f281440g = c1162x665295de;
        this.f281441h = i17;
        this.f281442i = j17;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f281437d;
        if (!c1163xf1deaba4.getViewTreeObserver().isAlive()) {
            return true;
        }
        c1163xf1deaba4.getViewTreeObserver().removeOnPreDrawListener(this);
        int mo75761x118cb524 = this.f281438e.f280113d.p().mo75761x118cb524();
        java.util.ArrayList arrayList = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) this.f281439f).I.f233598o;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrayList, "getDataMap(...)");
        java.util.Iterator it = arrayList.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            if (((rd5.d) it.next()).f475787d.f526833b.m124847x74d37ac6() == this.f281442i) {
                break;
            }
            i17++;
        }
        if (i17 < 0) {
            return true;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = this.f281440g;
        int i18 = i17 + mo75761x118cb524;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(java.lang.Integer.valueOf(this.f281441h));
        arrayList2.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(c1162x665295de, arrayList2.toArray(), "com/tencent/mm/ui/chatting/component/ChattingItemMediaGroupExpandComponent$onEnterEditMode$listener$1", "onPreDraw", "()Z", "Undefined", "scrollToPositionWithOffset", "(II)V");
        c1162x665295de.P(((java.lang.Integer) arrayList2.get(0)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue());
        yj0.a.f(c1162x665295de, "com/tencent/mm/ui/chatting/component/ChattingItemMediaGroupExpandComponent$onEnterEditMode$listener$1", "onPreDraw", "()Z", "Undefined", "scrollToPositionWithOffset", "(II)V");
        return false;
    }
}
