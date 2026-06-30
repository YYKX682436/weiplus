package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class xi implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f205902d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f205903e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.dk f205904f;

    public xi(android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.dk dkVar) {
        this.f205902d = view;
        this.f205903e = c1163xf1deaba4;
        this.f205904f = dkVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        this.f205902d.getViewTreeObserver().removeOnPreDrawListener(this);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f205903e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.dk dkVar = this.f205904f;
        java.util.Iterator it = dkVar.O6().iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            if (((so2.j5) it.next()).mo2128x1ed62e84() == dkVar.f205178v) {
                break;
            }
            i17++;
        }
        int size = dkVar.O6().size();
        if (i17 > size) {
            i17 = size;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c1163xf1deaba4, arrayList.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileUnlimitedFlowUIC$actionCallback$1$onItemRangeChanged$lambda$5$$inlined$doOnPreDraw$1", "onPreDraw", "()Z", "Undefined", "scrollToPosition", "(I)V");
        c1163xf1deaba4.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(c1163xf1deaba4, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileUnlimitedFlowUIC$actionCallback$1$onItemRangeChanged$lambda$5$$inlined$doOnPreDraw$1", "onPreDraw", "()Z", "Undefined", "scrollToPosition", "(I)V");
        return true;
    }
}
