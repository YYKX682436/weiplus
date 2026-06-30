package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5;

/* loaded from: classes3.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f284518d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.r f284519e;

    public l(java.util.List list, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.r rVar) {
        this.f284518d = list;
        this.f284519e = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Iterator it = this.f284518d.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.r rVar = this.f284519e;
            if (!hasNext) {
                rVar.F();
                return;
            }
            jz5.l lVar = (jz5.l) it.next();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) lVar.f384366d;
            ((java.lang.Boolean) lVar.f384367e).booleanValue();
            rVar.h(k3Var);
        }
    }
}
