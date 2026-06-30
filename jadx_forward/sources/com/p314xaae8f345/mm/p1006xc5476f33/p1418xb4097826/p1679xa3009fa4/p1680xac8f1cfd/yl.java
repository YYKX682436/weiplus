package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes.dex */
public final class yl implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.zl f218119d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de f218120e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f218121f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f218122g;

    public yl(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.zl zlVar, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de, int i17, int i18) {
        this.f218119d = zlVar;
        this.f218120e = c1162x665295de;
        this.f218121f = i17;
        this.f218122g = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.zl zlVar = this.f218119d;
        if (!zlVar.f218236u) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = this.f218120e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(this.f218122g));
            arrayList.add(java.lang.Integer.valueOf(this.f218121f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c1162x665295de, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalCollectionUIC$scrollToPosition$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            c1162x665295de.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(c1162x665295de, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalCollectionUIC$scrollToPosition$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
        zlVar.f218236u = true;
    }
}
