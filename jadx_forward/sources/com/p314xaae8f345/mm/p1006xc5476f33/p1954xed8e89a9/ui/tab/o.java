package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab;

/* loaded from: classes11.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.e f236027d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f236028e;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.e eVar, java.util.ArrayList arrayList) {
        this.f236027d = eVar;
        this.f236028e = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.ArrayList messages = this.f236028e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(messages, "$messages");
        vr3.r rVar = (vr3.r) this.f236027d;
        rVar.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = messages.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1963x2eefaa.C16893x570516c7 c16893x570516c7 = rVar.f521178a;
            if (!hasNext) {
                ik1.h0.b(new vr3.q(c16893x570516c7, arrayList));
                return;
            } else {
                r45.e6 e6Var = (r45.e6) it.next();
                arrayList.add(new vr3.h(e6Var.f454571d, c16893x570516c7.a(e6Var.f454572e.f455564d)));
            }
        }
    }
}
