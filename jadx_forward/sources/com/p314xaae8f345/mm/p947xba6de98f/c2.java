package com.p314xaae8f345.mm.p947xba6de98f;

/* loaded from: classes12.dex */
public class c2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dn.m f152430d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p947xba6de98f.h2 f152431e;

    public c2(com.p314xaae8f345.mm.p947xba6de98f.h2 h2Var, dn.m mVar) {
        this.f152431e = h2Var;
        this.f152430d = mVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p947xba6de98f.h2 h2Var = this.f152431e;
        java.util.Queue queue = h2Var.f152526q;
        dn.m mVar = this.f152430d;
        ((java.util.LinkedList) queue).add(mVar.f69601xaca5bdda);
        ((java.util.HashMap) h2Var.f152527r).put(mVar.f69601xaca5bdda, mVar);
        h2Var.j(false);
    }

    /* renamed from: toString */
    public java.lang.String m48069x9616526c() {
        return super.toString() + "|addSendTask";
    }
}
