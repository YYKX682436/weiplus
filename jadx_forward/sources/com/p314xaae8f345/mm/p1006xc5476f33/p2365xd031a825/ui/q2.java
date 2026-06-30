package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes8.dex */
public class q2 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 f262114a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.r2 f262115b;

    public q2(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.r2 r2Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 c0Var) {
        this.f262115b = r2Var;
        this.f262114a = c0Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.a0
    /* renamed from: onResult */
    public void mo26363x57429edc(boolean z17, java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 c0Var = this.f262114a;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.r2 r2Var = this.f262115b;
            java.lang.String str = (java.lang.String) obj;
            r2Var.f262129d.E.m83213x765074af(str);
            if (str.equalsIgnoreCase(r2Var.f262129d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j1n))) {
                r2Var.f262129d.f261446l2 = 0;
            } else {
                r2Var.f262129d.f261446l2 = 1;
            }
            c0Var.i(r2Var.f262129d.f261446l2);
        }
        c0Var.d();
    }
}
