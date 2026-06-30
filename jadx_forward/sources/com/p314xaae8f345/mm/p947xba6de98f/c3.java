package com.p314xaae8f345.mm.p947xba6de98f;

/* loaded from: classes12.dex */
public class c3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dn.o f152432d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p947xba6de98f.l3 f152433e;

    public c3(com.p314xaae8f345.mm.p947xba6de98f.l3 l3Var, dn.o oVar) {
        this.f152433e = l3Var;
        this.f152432d = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p947xba6de98f.l3 l3Var = this.f152433e;
        java.util.Queue queue = l3Var.f152594d;
        dn.o oVar = this.f152432d;
        ((java.util.LinkedList) queue).add(oVar.f69601xaca5bdda);
        ((java.util.HashMap) l3Var.f152595e).put(oVar.f69601xaca5bdda, oVar);
        l3Var.s(false);
    }
}
